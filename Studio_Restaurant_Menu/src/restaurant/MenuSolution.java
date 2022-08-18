package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class MenuSolution {
        private Date lastUpdated;
        private ArrayList<MenuItemSolution> items;

        public Menu(Date d, ArrayList<MenuItem> i) {
            this.lastUpdated = d;
            this.items = i;
        }

        public void setLastUpdated(Date lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public void setItems(ArrayList<MenuItem> items) {
            this.items = items;
        }

        public Date getLastUpdated() {
            return lastUpdated;
        }

        public ArrayList<MenuItem> getItems() {
            return items;
        }
    }
}
