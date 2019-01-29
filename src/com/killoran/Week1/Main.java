//Johnny Gilbert 1/29/19 Exercise 3
package com.killoran.Week1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double farenheit = 0;
        while (farenheit != -420) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("What temperature would you like to convert to celsius");
            String f = userInput.nextLine();
            farenheit = Double.parseDouble(f);
            if (farenheit == -420) {
                break;
            } else {
                calc(farenheit);

            }
        }
    }


        public static void calc(double farenheit){
            double celsius = (farenheit-32) * 5 / 9;
            screen(celsius);

        }

        public static void screen(double celsius){
            System.out.println("Your value in celsius is " + celsius);
        }

    }
