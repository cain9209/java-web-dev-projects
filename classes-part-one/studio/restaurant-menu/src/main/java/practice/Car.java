package practice;

public class Car extends Main {
    private String vin;
    private int year;
    private String model;
    private String make;
   private Boolean carIsCool = false;
    private Boolean wouldBy = false;
// create the constructor for the car class //
    public Car(String vin, int year, String model, String make, Boolean carIsCool, Boolean wouldBy) {
        this.vin = vin;
        this.year = year;
        this.model = model;
        this.make = make;
        this.carIsCool = carIsCool;
        this.wouldBy = wouldBy;
    }

    // Get and set private data for main class //
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Boolean getWouldBy() {
        return wouldBy;
    }

    public void setWouldBy(Boolean wouldBy) {
        this.wouldBy = wouldBy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Boolean getCarIsCool() {
        return carIsCool;
    }

    public void setCarIsCool(Boolean carIsCool) {
        this.carIsCool = carIsCool;
    }

    }



