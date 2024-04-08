package org.launchcode;

public class Deserts {
    private String deserts;
    private int calories;
    private double price;
    private int rating;

    Deserts(String deserts, int calories, Double price, Integer rating) {
        this.setDeserts(deserts);
        this.setCalories(calories);
        this.setPrice(price);
        this.setRating(rating);
    }
    public String getDeserts() {
        return deserts;
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
    public void setDeserts(String deserts) {
        this.deserts = deserts;
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