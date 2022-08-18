package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.setItemName("chocolate cake");
        menuItem.setPrice(3.00);
        menuItem.setDescription("our signature chocolate cake with a scoop of chocolate ice cream");
        menuItem.setCategory();
        menuItem.setIsNew(false);
        menuItem.setDateUpdate(5.12);

    }
}
