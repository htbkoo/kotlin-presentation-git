package presentation.news.provider;

import presentation.news.model.Article;
import java.util.ArrayList;
import java.util.List;

public class FoxNews implements NewsProvider {
    private List<Article> news = new ArrayList<>();

    public FoxNews() {
        news.add(new Article("\"Real\" news", "We're going to show you \"real\" news", "R. Author"));
    }

    @Override
    public List<Article> all() {
        return news;
    }
}
