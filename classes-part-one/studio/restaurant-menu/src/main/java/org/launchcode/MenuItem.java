package org.launchcode;
import java.util.HashMap;
// LocalDate 	Represents a date (year, month, day (yyyy-MM-dd))

public  class MenuItem {

 private double price;
 private String description;
 private String category;
 private static boolean isNew;
 private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", name='" + name + '\'' +
                '}';
    }

    public MenuItem(double price, String description,
                    String category, boolean isNew, String name) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;



    }
}




