package org.launchcode;

public class MainEntre {

    private String mainCourse;
    private int calories;
    private double price;

    private int rating;
    MainEntre(String mainCourse,int calories, Double price, Integer rating){
        this.setMainCourse(mainCourse);
        this.setCalories(calories);
        this.setPrice(price);
        this.setRating(rating);
    }
    public String getMainCourse() {
        return mainCourse;
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
    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
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
