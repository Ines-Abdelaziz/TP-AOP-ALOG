package exo1;

public class Main {
    public static void main(String[] args) {

        // Create a stock market.
        StockMarket stockMarket = StockMarket.getInstance();
    
        // Create two clients.
        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");
    
        // Add the clients to the stock market.
        stockMarket.addClient(client1);
        stockMarket.addClient(client2);
    
        // Create  stocks.
        Stock stock1 = new Stock("AAPL", 100);
        Stock stock2 = new Stock("GOOG", 200);
         
        // Add the stock to the stock market.
        stockMarket.addStock(stock1);
        stockMarket.addStock(stock2);
        // Subscribe clients to  stocks.
        client1.subscribeToStock(stock1);
        client1.subscribeToStock(stock2);
        client2.subscribeToStock(stock2);
      
    
        // Change the price of the stock.
        stock1.setPrice(200);
        stock2.setPrice(300);
    
        
      }
}
