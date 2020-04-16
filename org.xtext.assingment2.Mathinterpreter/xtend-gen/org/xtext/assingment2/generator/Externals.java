package org.xtext.assingment2.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class Externals {
  public List<String> imports;
  
  private String content;
  
  public Externals() {
    this.content = "";
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.imports = _arrayList;
  }
  
  private void importModules() {
    final HashSet<String> set = new HashSet<String>(this.imports);
    boolean _contains = set.contains("pow");
    if (_contains) {
      this.generatePow();
    }
  }
  
  public void generateFile(final IFileSystemAccess2 fsa) {
    this.importModules();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package externals;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Externals {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("src/externals/Externals.java", _builder);
  }
  
  private void generatePow() {
  }
}
