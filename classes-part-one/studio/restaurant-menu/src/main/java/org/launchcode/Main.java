package org.launchcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // We need to establish a list of our K value pair information related to the computers in the example//
        ArrayList<HashMap<String,String>> computerProducts = new ArrayList<>();

        // Products added to the computerProducts catalog for easy access when called upon //
        HashMap computer1 = new HashMap<>();
        computer1.put("name","laptop");
        computer1.put("storage Capacity","1T");
        computer1.put("Brand","Dell");
        computerProducts.add(computer1);

        HashMap computer2 = new HashMap();
        computer2.put("name","Desktop");
        computer2.put("storage Capacity","2T");
        computer2.put("Brand","Apple");
        computerProducts.add(computer2);


        HashMap computer3 = new HashMap();
        computer3.put("name","Server");
        computer3.put("storage Capacity","100T");
        computer3.put("Brand","Google Server System");
        computerProducts.add(computer3);
        //.add method has now stored the information in the arraylist computer products for all three devices //

// loop through the product catalog to print the information that was stored with in the Arraylist.
        System.out.println("Product Catalog:");
        for(HashMap<String,String> product :computerProducts){
            System.out.println(product.containsValue("Apple"));
        }


        }
    }





