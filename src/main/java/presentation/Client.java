package presentation;

import presentation.news.Dashboard;
import presentation.news.DashboardItem;

public class Client {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        dashboard.allNews().forEach(DashboardItem::print);
    }
}
