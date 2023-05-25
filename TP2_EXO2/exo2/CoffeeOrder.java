package exo2;
import java.util.ArrayList;
import java.util.List;
    public class CoffeeOrder {

        private String type;
        private double price;
        private List<Addon> addons;
    
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
    
        public List<Addon> getAddons() {
            return addons;
        }
      

    
        public void addAddon(Addon addon) {
            //add the name of the addon to the list of addons
            addons.add(addon);
            this.price += addon.getPrice();
        }
    
        public void removeAddon(String name) {
            for (Addon addon : addons) {
                if (addon.getName().equals(name)) {
                    addons.remove(addon);
                    price -= addon.getPrice();
                    break;
                }
            }
        }
        //print order details
        public void printOrderDetails() {
            System.out.println("Order details:");
            System.out.println("Type: " + type);
            System.out.println("Price: " + price);
            //print list of addons names in same line separated by comma
            System.out.print("Addons: ");
            for (Addon addon : addons) {
                System.out.print(addon.getName() + ", ");
            }
            System.out.println('\n');
           
        }
    
    }

