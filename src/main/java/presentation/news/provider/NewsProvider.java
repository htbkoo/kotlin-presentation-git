package presentation.news.provider;

import presentation.news.model.Article;
import java.util.List;

public interface NewsProvider {
    List<Article> all();
}
