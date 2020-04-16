package org.xtext.assingment2.ui

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.xtext.assingment2.generator.MathinterpreterGenerator
import org.xtext.assingment2.mathinterpreter.MathExpression

class HoverProvider extends DefaultEObjectHoverProvider {  
	val mathinterpreter = new MathinterpreterGenerator()
	
	override getHoverInfoAsHtml(EObject o) {    
		
		if (o instanceof MathExpression){
			val mexp = o as MathExpression
			
			try {
				return 	'''
							<p>
								interpretation: <b>«mathinterpreter.compile(mexp)»</b>
							</p>
						'''					
				
			}
			catch (Exception e) {
				return 	'''
							<p>
								class: <b>«o.class»</b>
							</p>
						'''		
			}
		}
	}
}