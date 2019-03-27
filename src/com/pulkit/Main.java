package com.pulkit;

import java.util.*;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


        List<Integer> ints = new ArrayList<Integer>();

        while(true){
            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();

                ints.add(number);
            }

            if(isInt == false){
                System.out.println("Oops!Invalid output");
                break;
            }scanner.nextLine();
        }scanner.close();
        System.out.println("\nThe largest number you entered is \n"+Collections.max(ints));
        System.out.println("\nThe smallest number you entered is \n"+Collections.min(ints));


    }}

