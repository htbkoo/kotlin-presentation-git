package presentation.news;

import presentation.news.model.Article;
import presentation.news.provider.CNN;
import presentation.news.provider.FoxNews;
import presentation.news.provider.NewsProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dashboard {
    Map<String, NewsProvider> providers = new HashMap<>();

    public Dashboard() {
        providers.put("CNN", new CNN());
        providers.put("FoxNews", new FoxNews());
    }

    public List<DashboardItem> allNews() {
        return providers
                .entrySet()
                .stream()
                .map(newsProviderEntry -> {
                    List<Article> articles = newsProviderEntry.getValue().all();
                    String providerName = newsProviderEntry.getKey();

                    return new DashboardItem(providerName, articles);
                })
                .collect(Collectors.toList());
    }
}
