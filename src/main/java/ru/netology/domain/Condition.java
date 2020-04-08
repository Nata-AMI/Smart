package ru.netology.domain;

public class Condition {
   private int maxTemperature=32;
    private int minTemperature=17;
    private int currentTemperature = 22;

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature=currentTemperature;
    }

    public void increaseCurrentTemperature(int currentTemperature) {
        this.currentTemperature=currentTemperature+1;
    }
    public void decreaseCurrentTemperature(int currentTemperature) {
        this.currentTemperature=currentTemperature-1;
    }
}





