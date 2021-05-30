package com.github.flopshot.leafappcodeplugin.services

import com.github.flopshot.leafappcodeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
