package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object TeamcityCourseCards_Temp : Template({
    uuid = "db35ab59-3a6a-41d4-b285-720677a576dd"
    name = "TEMP"

    publishArtifacts = PublishMode.SUCCESSFUL

    params {
        param("Browser", "PhantomJS")
    }

    vcs {
        root(TeamcityCourseCards.vcsRoots.TeamcityCourseCards_HttpsGithubComDevopstraining1990teamcityCourseCardsRefsHeadsMaster)
    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_4"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Test"
            id = "RUNNER_5"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
