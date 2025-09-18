package com.assignment1;

public class TemperatureConverter {

    public double fahrenheitToCelcius(double temp) {
        double celcius = (temp - 32.0) * 5.0 / 9.0;
        return celcius;
    }

    public double celciusToFahrenheit(double temp) {
        double fahrenheit = (temp * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double temp){
        if (temp <= -40.0 || temp >= 50.0) {
            return true;
        } else {
            return false;
        }
    }

    public double kelvinToCelcius(double temp){
        double celcius = temp - 273.15;
        return celcius;
    }
}
