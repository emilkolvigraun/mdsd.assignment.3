package org.xtext.assingment2.generator

import java.util.List
import java.util.ArrayList
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.HashSet

class Externals {
	
	public List<String> imports
	String content
	
	new () {
		content = ""
		imports = new ArrayList<String>()	
	}
	
	private def void importModules(){
		val set = new HashSet<String>(imports)
		if (set.contains("pow"))
			generatePow()
	}
	
	def generateFile(IFileSystemAccess2 fsa) {
		importModules()
		fsa.generateFile("src/externals/Externals.java", '''
		package externals;
		
		public class Externals {
			
		}
		''')
	}
	
	private def void generatePow(){
		
	}
}