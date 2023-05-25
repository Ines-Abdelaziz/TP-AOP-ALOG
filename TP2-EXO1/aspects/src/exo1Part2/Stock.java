package exo1Part2;

public class Stock {
  private String symbol;
  private double price;

  public Stock(String symbol, double price) {
    this.symbol = symbol;
    this.price = price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }
  public String getSymbol() {
    return symbol;
  }
  
}
