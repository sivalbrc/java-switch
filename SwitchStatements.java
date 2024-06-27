package com.traningmug.java;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        int productPrice;
        productPrice=3000;
        int discount;
        int discountPercentage;
        Scanner sc = new Scanner(System.in);

        char membership ;
        membership = 'D';
        String brand ;
        brand = "Apple";
        switch (brand){
            case "Apple":
            if(membership == 'D' ){
                discountPercentage = 20;

            } else if (membership == 'G' ) {
                discountPercentage = 15;

            } else if (membership=='S' ) {
                discountPercentage=10;

            }else {
                discountPercentage=5;
            }
            break;
            case "REDMI":
                if(membership == 'D' )
                    discountPercentage = 20;

                 else if (membership == 'G' )
                    discountPercentage = 15;

                 else if (membership=='S' )
                    discountPercentage=10;

                else {
                    discountPercentage=5;
                }
                break;
            default:discountPercentage=5;
        }
        discount=productPrice * discountPercentage/100;
        System.out.println("Discount $ :" +discount);
        System.out.println("Finall Price $ :"+(productPrice-discount));

    }
}
