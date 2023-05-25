package exo1;
import java.util.ArrayList;
import java.util.List;


public class Client implements Observer{
    
  private String name;
  private List<Stock> subscribedStocks = new ArrayList<>();

  public Client(String name) {
    this.name = name;
  }

  public void subscribeToStock(Stock stock) {
    subscribedStocks.add(stock);
  }

  public void unsubscribeFromStock(Stock stock) {
    subscribedStocks.remove(stock);
  }

  @Override
  public void onStockPriceChange(Stock stock) {
    System.out.println(name + " received stock price change for " + stock.getSymbol() + ". New price is " + stock.getPrice());
  }
  @Override
  public boolean isSubscribedToStock(Stock stock) {
    return subscribedStocks.contains(stock);
  }

}
