package com.github.flopshot.leafappcodeplugin.psi

import com.github.flopshot.leafappcodeplugin.LeafFileType
import com.github.flopshot.leafappcodeplugin.LeafLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class LeafFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, LeafLanguage) {
  override fun getFileType(): FileType = LeafFileType.INSTANCE
  override fun toString(): String = "Leaf File"
}
