package exo1;

interface Observer {

    void onStockPriceChange(Stock stock);
    boolean isSubscribedToStock(Stock stock);
  
  }