package com.github.flopshot.leafappcodeplugin

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class LeafFileType private constructor() : LanguageFileType(LeafLanguage) {
    override fun getName() = "Leaf File"
    override fun getDescription() = "Leaf language file"
    override fun getDefaultExtension() = "leaf"
    override fun getIcon(): Icon = LeafIcon.FILE

    companion object {
        val INSTANCE: LeafFileType = LeafFileType()
    }
}

object LeafLanguage : Language("Leaf")
