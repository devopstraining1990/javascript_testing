package TeamcityCourseCards.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TeamcityCourseCards_02Chrome : BuildType({
    templates(TeamcityCourseCards_Temp)
    uuid = "acc4c314-63da-4cc8-a4b0-ea178ea83e47"
    name = "02.Chrome"

    params {
        param("Browser", "PhantomJS")
    }

    dependencies {
        snapshot(TeamcityCourseCards_Build) {
            runOnSameAgent = true
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
