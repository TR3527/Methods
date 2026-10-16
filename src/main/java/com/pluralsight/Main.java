package com.pluralsight;


import java.util.Scanner;

public class Main {

    //(public static void)Access modifier in all files outside of class
    //Static means without instantiating an object
    //void means there is no result that a method expects back

   static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

       // System.out.println("Coding is so cool!");

        System.out.println("What is your name");
        String name = read.nextLine();
        message(name);

        System.out.println("What is your age?");
        int age = read.nextInt();

        //message("Sama");
       // message("Jofre");
        calculateHowManyYearsLeftToWork(name,age);

        read.close();


    }
    //new method below
    public static void message(String name){
        System.out.println("Hi " + name);
    }
    public static void calculateHowManyYearsLeftToWork(String name,int age){
       //local variable below
        int retirementAge = 67;
        int years = retirementAge - age;
        System.out.println(name + ", You still need to work " + years + " more years!");


    }
}
