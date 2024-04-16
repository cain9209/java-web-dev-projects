package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;

// added static to access fields outside of this class, we can leave the setter methods due to not needing to use Final //
public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<>();
  private String restaurantName;
  private String restaurantDescription;
    // string builder //
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


    public Menu() {

    }

    public  String addItem(MenuItem menuSteak) {
        return addItem(menuSteak);
    }

    public void addMenuItem(MenuItem newItem) {
        menuItems.add(newItem);
    }

    public void removeMenuItem(int indexOfMenuItem) {
        menuItems.remove(indexOfMenuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }


    public Menu(ArrayList<MenuItem> menuItems, LocalDate lastUpdated,
                String restaurantName, String restaurantDescription) {
        this.menuItems = menuItems;
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;


    }




        }





