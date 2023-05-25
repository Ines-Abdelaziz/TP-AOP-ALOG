package exo1Part2;

public interface Observer {
    void onStockPriceChange(Stock stock);
    boolean isSubscribedToStock(Stock stock);
}
