package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class MenuSolution {
        private Date lastUpdated;
        private ArrayList<ManuItemSolution> menuItems = new ArrayList<>();

        public void addMenuItem(MenuItem item){
            this.menuItems.add(item);
        }
//        public MenuSolution(Date d, ArrayList<MenuItem> i) {
//            this.lastUpdated = d;
//            this.items = i;
//        }

        public void setLastUpdated(Date lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public void setItems(ArrayList<MenuItem> items) {
            this.items = items;
        }

        public Date getLastUpdated() {
            return lastUpdated;
        }

        public void removeMenuItem(String itemName){
            MenuItem toBeRemoved = null;
            for(MenuItem item: this.menuItems){
                if(item.getName().equalsIgnoreCase(itemName.toLowerCase());
                    toBeRemoved = item;
            }

        }
        if(toBeRemoved != null){
            this.menuItems.remove(toBeRemoved);
    }
}
