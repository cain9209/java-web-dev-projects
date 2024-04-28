public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isSatisfied());   // prints true

        HouseCat houseCat = new HouseCat("Phillip",20);
        Cat cat = houseCat;
        HouseCat houseCat1 = (HouseCat) cat;
        System.out.println(houseCat1);
    }

}