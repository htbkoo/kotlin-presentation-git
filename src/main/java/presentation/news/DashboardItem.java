package presentation.news;

import presentation.news.model.Article;
import java.util.List;

public class DashboardItem {
    private final String providerName;
    private final List<Article> articles;

    public DashboardItem(String providerName, List<Article> articles) {
        this.providerName = providerName;
        this.articles = articles;
    }

    public String getProviderName() {
        return providerName;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println(providerName);
        System.out.println("----------------");
        for (Article article : articles) {
            System.out.println(article.getTitle());
            System.out.println(article.getContent());
            System.out.println("By " + article.getAuthor());
            System.out.println("\n");
        }
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("\n");
    }

}
