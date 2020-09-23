package TeamcityCourseCards

import TeamcityCourseCards.buildTypes.*
import TeamcityCourseCards.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "5dd8ab94-3aa6-408d-9e0c-668e761dd5f2"
    id("TeamcityCourseCards")
    parentId("_Root")
    name = "Teamcity Course Cards"

    vcsRoot(TeamcityCourseCards_HttpsGithubComDevopstraining1990teamcityCourseCardsRefsHeadsMaster)

    buildType(TeamcityCourseCards_03DeployToStage)
    buildType(TeamcityCourseCards_02Chrome)
    buildType(TeamcityCourseCards_Build)
    buildType(TeamcityCourseCards_03FireFox)

    template(TeamcityCourseCards_Temp)
    template(TeamcityCourseCards_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "TeamcityCourseCards_HttpsGithubComDevopstraining1990javascriptTesting"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
            param("useRelativeIds", "true")
        }
    }
})
