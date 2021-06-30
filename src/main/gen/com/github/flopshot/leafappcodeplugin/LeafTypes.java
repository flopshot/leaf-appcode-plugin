// This is a generated file. Not intended for manual editing.
package com.github.flopshot.leafappcodeplugin;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.flopshot.leafappcodeplugin.psi.LeafElementType;
import com.github.flopshot.leafappcodeplugin.psi.LeafTokenType;
import com.github.flopshot.leafappcodeplugin.psi.impl.*;

public interface LeafTypes {

  IElementType PROPERTY = new LeafElementType("PROPERTY");

  IElementType COMMENT = new LeafTokenType("COMMENT");
  IElementType CRLF = new LeafTokenType("CRLF");
  IElementType KEY = new LeafTokenType("KEY");
  IElementType SEPARATOR = new LeafTokenType("SEPARATOR");
  IElementType VALUE = new LeafTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new LeafPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
