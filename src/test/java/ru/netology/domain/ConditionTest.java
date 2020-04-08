package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Condition;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionTest {

    @Test
    public void increaseCurrentTemperature() {
        Condition myCondition = new Condition();
        myCondition.setCurrentTemperature(16);
        myCondition.increaseCurrentTemperature();
        assertEquals(17, myCondition.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Condition myCondition = new Condition();
        myCondition.setCurrentTemperature(16);
        myCondition.decreaseCurrentTemperature();
        assertEquals(15, myCondition.getCurrentTemperature());
    }
}

