package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TeamcityCourseCards_Build : BuildType({
    templates(TeamcityCourseCards_Temp)
    uuid = "a82b892c-e34e-4dad-b4c2-964f75575dcb"
    name = "01.Fast Tests"
})
