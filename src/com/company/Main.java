package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
//        String firstName,lastName;
//        System.out.println("plz enter first name");
//        firstName=sc.nextLine();
//        System.out.println("plz enter last name");
//        lastName=sc.nextLine();
//        System.out.println(nameGenerator(firstName,lastName));


        int number_1,number_2;
        System.out.println("plz enter number 1");
        number_1=sc.nextInt();
        System.out.println("plz enter number 2");
        number_2=sc.nextInt();
        System.out.println(sum(number_1,number_2));


    }

    public static String nameGenerator(String firstName,String lastName){

        String fullName=firstName+" "+lastName;
        return fullName;
    }

    public static int sum(int number_1,int number_2){
        int sum=number_1+number_2;

        return sum;
    }
}
