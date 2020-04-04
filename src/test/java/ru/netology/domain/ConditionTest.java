package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Condition;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionTest {

    @Test
    public void increaseCurrentTemperature() {
        Condition myCondition = new Condition();
        int currentTemperature = 16;
        int maxTemperature = 27;
        if (currentTemperature < maxTemperature)
            currentTemperature = +1;
        int actual = currentTemperature;
        int expected = 17;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseCurrentTemperature() {
        Condition myCondition = new Condition();
        int currentTemperature = 16;
        int minTemperature = 13;
        if (currentTemperature > minTemperature)
            currentTemperature = - 1;
        int actual = currentTemperature;
        int expected = 15;
        assertEquals(actual, expected);
    }

}

