package restaurant;

public class Restaurant {
    public static void main (String[] args){
        ManuItemSolution corndog = new MenuItem("corndog", 2.99, "something");
        ManuItemSolution = new MenuItem("pizza", 8.99, "something else");

        MenuSolution menu = new Menu();
        menu.addMenuItem(corndog);
        menu.addMenuItem(pizza);

        for (MenuItem item : menu.getMenuItems()){
            System.out.println(item.getName());
        }
        menu.removeMenuItem("pizza");

        for(MenuItem item: menu.getMenuItems()){
            System.out.println(item.getName());
        }
    }
}
