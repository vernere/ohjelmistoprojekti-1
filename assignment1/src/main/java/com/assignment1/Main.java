package com.assignment1;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();
        
        System.out.println("Temperature Converter");
        System.out.println("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Select conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Celsius");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.printf("%.2f°C = %.2f°F\n", temperature, converter.celciusToFahrenheit(temperature));
                break;
            case 2:
                System.out.printf("%.2f°F = %.2f°C\n", temperature, converter.fahrenheitToCelcius(temperature));
                break;
            case 3:
                System.out.printf("%.2fK = %.2f°C\n", temperature, converter.kelvinToCelcius(temperature));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        if (converter.isExtremeTemperature(temperature)) {
            System.out.println("Warning: This is an extreme temperature!");
        }
        
        scanner.close();
    }
}