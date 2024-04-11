package org.launchcode;
import java.util.Date;
import java.util.HashMap;

public  class MenuItem {

 private    double price;
 private String description;
 private String category;
 private boolean isNew;
 private String name;
 private Date dateAdded;

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

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public MenuItem(double price, String description,
                    String category, boolean isNew, String name, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
        this.dateAdded = dateAdded;



    }
}




