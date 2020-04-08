package ru.netology.domain;

public class Condition {
   private int maxTemperature=32;
    private int minTemperature=12;
    private int currentTemperature = 22;

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature)
           this.currentTemperature= currentTemperature+1;
        if (currentTemperature == maxTemperature)
            currentTemperature= currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature)
        this.currentTemperature= currentTemperature-1;
        if (currentTemperature == minTemperature)
            this.currentTemperature= currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature=currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}





