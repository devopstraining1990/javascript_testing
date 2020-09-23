package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TeamcityCourseCards_03FireFox : BuildType({
    templates(TeamcityCourseCards_Temp)
    uuid = "0dfd366f-3367-42b1-ab58-c60cbd1d428e"
    name = "02.FireFox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        snapshot(TeamcityCourseCards_Build) {
            runOnSameAgent = true
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
