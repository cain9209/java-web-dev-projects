package org.launchcode;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

     Appetizers appetizers = new Appetizers("Calamari",750,25.00,9);
     MainEntre mainEntre = new MainEntre("Pasta Primavera",1200,35.00,8);
     Deserts deserts = new Deserts("Creme Brulee",750,15.00,9);


        System.out.println("Our menu tonight will include: " + appetizers.getAppetizer() + ":" +mainEntre.getMainCourse()+": and "+deserts.getDeserts());
        System.out.println("For those of you that are concerned about dietary restrictions, the "+mainEntre.getMainCourse()+" contains "+ mainEntre.getCalories()+ " calories");

    }

}