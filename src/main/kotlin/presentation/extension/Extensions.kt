package presentation.extension

import presentation.news.DashboardItem


fun DashboardItem.compactPrint() {
    println(providerName)
    articles.forEach { println("${it.title}: ${it.content}. By ${it.author}")  }
    println()
}