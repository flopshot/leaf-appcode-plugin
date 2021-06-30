package com.github.flopshot.leafappcodeplugin

import com.intellij.lexer.FlexAdapter

class LeafLexerAdapter : FlexAdapter(LeafLexer(null))
