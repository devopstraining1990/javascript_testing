package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TeamcityCourseCards_03DeployToStage : BuildType({
    uuid = "02ceec01-12ce-4c79-bc67-1a3f06bc7eb4"
    name = "03.DeployToStage"

    vcs {
        root(TeamcityCourseCards.vcsRoots.TeamcityCourseCards_HttpsGithubComDevopstraining1990teamcityCourseCardsRefsHeadsMaster)
    }

    dependencies {
        snapshot(TeamcityCourseCards_02Chrome) {
        }
        snapshot(TeamcityCourseCards_03FireFox) {
        }
    }
})
