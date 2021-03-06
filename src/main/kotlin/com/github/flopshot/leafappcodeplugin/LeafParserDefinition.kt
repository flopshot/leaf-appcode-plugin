package com.github.flopshot.leafappcodeplugin

import com.github.flopshot.leafappcodeplugin.psi.LeafFile
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class LeafParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = LeafLexerAdapter()
    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES // TODO: Don't Need
    override fun createParser(project: Project): PsiParser = LeafParser()
    override fun getFileNodeType(): IFileElementType = FILE
    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
    override fun createElement(node: ASTNode): PsiElement = LeafTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = LeafFile(viewProvider)

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(LeafTypes.COMMENT)
        val FILE = IFileElementType(LeafLanguage)
    }
}