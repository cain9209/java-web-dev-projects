package org.launchcode;

public class Appetizers {

    private String appetizer;
    private int calories;
    private double price;

    private int rating;

    Appetizers(String appetizer,int calories, Double price, Integer rating){
        this.setAppetizer(appetizer);
        this.setCalories(calories);
        this.setPrice(price);
        this.setRating(rating);
    }

    public String getAppetizer() {
        return appetizer;
    }
    public int getCalories(){
        return calories;
    }
    public double getPrice() {
        return price;
    }
    public int getRating(){
        return rating;
    }
    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }
    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
