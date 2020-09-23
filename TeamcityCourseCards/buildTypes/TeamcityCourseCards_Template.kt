package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object TeamcityCourseCards_Template : Template({
    uuid = "76f66632-2c89-4239-b183-ecc957002a3f"
    name = "Template"

    publishArtifacts = PublishMode.SUCCESSFUL

    vcs {
        root(TeamcityCourseCards.vcsRoots.TeamcityCourseCards_HttpsGithubComDevopstraining1990teamcityCourseCardsRefsHeadsMaster)
    }

    steps {
        script {
            name = "Install"
            id = "RUNNER_4"
            scriptContent = "npm install"
        }
        script {
            name = "test"
            id = "RUNNER_5"
            scriptContent = "npm test -- --single-run --browsers PhantomJS --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
