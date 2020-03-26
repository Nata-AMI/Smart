package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.condition;

import static org.junit.jupiter.api.Assertions.*;

public class conditionTest {

    @Test
    public void increaseCurrentTemperature() {
        condition myCondition = new condition();
        int currentTemperature = 16;
        int maxTemperature = 27;
        if (currentTemperature < maxTemperature)
            currentTemperature = currentTemperature + 1;
        int actual = currentTemperature;
        int expected = 17;
        assertEquals(actual, expected);
    }

        @Test
        public void decreaseCurrentTemperature() {
            condition myCondition = new condition();
            int currentTemperature = 16;
            int minTemperature = 13;
            if (currentTemperature > minTemperature)
                currentTemperature = currentTemperature - 1;
            int actual = currentTemperature;
            int expected = 15;
            assertEquals(actual, expected);
    }

}

