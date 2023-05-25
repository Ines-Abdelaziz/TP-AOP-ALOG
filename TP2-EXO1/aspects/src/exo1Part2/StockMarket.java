package exo1Part2;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private List<Stock> stocks = new ArrayList<>();
    private static StockMarket instance;
  
    public void addClient(Client client) {
      observers.add(client);
    }
  
    public void addStock(Stock stock) {
      stocks.add(stock);
    }
    public List<Observer> getObservers() {
      return observers;
    }
    public void notifyClientsOfStockPriceChange(Stock stock) {
      //verify if the client is subscribed to the stock
      for (Observer observer : observers) {
        if (observer.isSubscribedToStock(stock)) {
          observer.onStockPriceChange(stock);
        }
      }
    }

    
    public static StockMarket getInstance() {
      if (instance == null) {
        instance = new StockMarket();
      }
      return instance;
    }
   
}