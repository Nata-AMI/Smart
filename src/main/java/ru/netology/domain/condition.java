package ru.netology;

public class condition {
    int maxTemperature;
    int currentTemperature;

       public  void increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature < maxTemperature)
            currentTemperature = currentTemperature + 1;
    }

}



