// This is a generated file. Not intended for manual editing.
package com.github.flopshot.leafappcodeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.flopshot.leafappcodeplugin.LeafTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.flopshot.leafappcodeplugin.psi.*;

public class LeafPropertyImpl extends ASTWrapperPsiElement implements LeafProperty {

  public LeafPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LeafVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LeafVisitor) accept((LeafVisitor)visitor);
    else super.accept(visitor);
  }

}
