package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.condition;

import static org.junit.jupiter.api.Assertions.*;

public class conditionTest {

    @Test
    public void increaseCurrentTemperature() {
        condition myCondition = new condition();
        int currentTemperature = 16;
        int maxTemperature = 27;
        int actual = int increaseCurrentTemperature(currentTemperature);
        int expected = 17;
        assertEquals(actual,expected);

    }

}

