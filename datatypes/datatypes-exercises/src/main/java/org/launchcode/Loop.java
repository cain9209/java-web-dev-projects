package org.launchcode;

public class Loop {
public static void main(String[]agrs){
    int nums[]={1111,111111,111111,222222,11111};

    for(int i :nums){
        System.out.println(i);
        if( i == 222222){
            System.out.println("hooray");
        } else {
            System.out.println("Depression");
        }
    }
}
}
