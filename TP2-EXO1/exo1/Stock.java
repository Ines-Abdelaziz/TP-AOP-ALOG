package exo1;

public class Stock {
  private String symbol;
  private double price;

  public Stock(String symbol, double price) {
    this.symbol = symbol;
    this.price = price;
  }

  public void setPrice(double price) {
    this.price = price;
    notifyObservers();
  }

  public double getPrice() {
    return price;
  }
  public String getSymbol() {
    return symbol;
  }
  private void notifyObservers() {
    for (Observer observer : StockMarket.getInstance().getObservers()) {
      if (observer.isSubscribedToStock(this)) {
        observer.onStockPriceChange(this);
      }
    }
  }
}
