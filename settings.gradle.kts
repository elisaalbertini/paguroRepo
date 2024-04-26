rootProject.name = "paguroRepo"
include("paguroRepo")
plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.23"
}

gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}
include("PaguroElefante")
