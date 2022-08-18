package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private ArrayList<String> category = new ArrayList<>();
    private boolean isNew = false;
    private double dateUpdated;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public void setDateUpdate(double dateUpdated){
        this.dateUpdated = dateUpdated;
    }

}
