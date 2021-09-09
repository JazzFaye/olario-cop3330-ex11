/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main (String[] args){
        Scanner money = new Scanner(System.in); //Scanner to obtain input from the user

        System.out.println("How many euros are you exchanging? ");
        String eu = money.nextLine();   //Reads input from the user
        double EU = Double.parseDouble(eu); //Converts input from String to double

        System.out.println("What is the exchange rate? ");
        String exchange = money.nextLine(); //Reads input from the user
        double rate = Double.parseDouble(exchange); //Converts input from String to double

        double dollars = EU * rate; //Formula to get the value in dollars

        //To display the number of euros and the exchange rate
        System.out.printf("%.0f euros at an exchange rate of %.4f is", EU,rate);
        System.out.printf("\n%.2f U.S. dollars", dollars);  //Display the answer in dollars
    }
}

