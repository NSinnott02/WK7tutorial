package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total=0;
        System.out.println("Enter a number: ");
        while(in.hasNextDouble())
        {
            total += in.nextDouble();
            count++;
            System.out.println("Enter next number or Q to quit: ");
        }

        double average = total/count;
        System.out.println("Average is: "+ average);
        int tempF = 212;

        double tempC = 9/5 * (tempF-32);
        System.out.println("Celsius: "+tempC);

    }
}
