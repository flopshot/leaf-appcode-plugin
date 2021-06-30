package com.github.flopshot.leafappcodeplugin.psi

import com.github.flopshot.leafappcodeplugin.LeafLanguage
import com.intellij.psi.tree.IElementType

class LeafElementType(debugName: String) : IElementType(debugName, LeafLanguage) {
    override fun toString(): String {
        return "LeafTokenType.${super.toString()}"
    }
}