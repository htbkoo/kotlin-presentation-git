package presentation

import presentation.extension.compactPrint
import presentation.news.Dashboard


class KotlinClient {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val dashboard = Dashboard()

            dashboard.allNews().forEach { it.compactPrint() }
        }
    }
}