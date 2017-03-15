package presentation.news.provider;

import presentation.news.model.Article;
import java.util.ArrayList;
import java.util.List;

public class CNN implements NewsProvider {

    private List<Article> news = new ArrayList<>();

    public CNN() {
        news.add(new Article("Fake breaking news", "Breaking news we're reporting from fake place", "F. Faker"));
        news.add(new Article("Fakers gonna fake", "Some fake stuff", "A. Rekaf"));
    }

    @Override
    public List<Article> all() {
        return news;
    }
}
