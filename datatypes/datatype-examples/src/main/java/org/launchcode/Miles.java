package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?: ");
        Double numMiles = input.nextDouble();

        System.out.println("How much gas have you consumed in gallons?: ");
        Double numGallons = input.nextDouble();

        Double numMilesPerGallon = numMiles / numGallons;
        System.out.println("Your miles per gallon is " + numMilesPerGallon);
    }



}
