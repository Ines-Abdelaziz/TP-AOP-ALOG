package aspects;
import java.util.ArrayList;
import java.util.List;
    public class CoffeeOrder {

        private String type;
        private double price;
        private List<AddO> addons;
    
        public CoffeeOrder(String type, double price) {
            this.type = type;
            this.price = price;
            this.addons = new ArrayList<>();
        }
    
        public String getType() {
            return type;
        }
    
        public double getPrice() {
            return price;
        }
        //set price
        public void setPrice(double price) {
            this.price = price;
        }
    
        public List<AddO> getAddons() {
            return addons;
        }
      

    
        public void addAddon(AddO addon) {
         
        }
    
        public void removeAddon(String name) {
          
        }
        //print order details
        public void printOrderDetails() {
            System.out.println("Order details:");
            System.out.println("Type: " + type);
            System.out.println("Price: " + price);
            //print list of addons names in same line separated by comma
            System.out.print("Addons: ");
            for (AddO addon : addons) {
                System.out.print(addon.getName() + ", ");
            }
            System.out.println('\n');
           
        }
    
}


