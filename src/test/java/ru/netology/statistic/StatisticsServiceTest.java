package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax( incomesInBillions );
        assertEquals( expected, actual );
    }

    @Test
    void shouldlength() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.findMax( incomesInBillions );
        long maxValue = incomesInBillions[0];
        long expected = 12;
        for (int i = 1; i < incomesInBillions.length; i++) {
            if (incomesInBillions[i] > maxValue) {
                maxValue = incomesInBillions[i];
                expected = i + 1;
            }
        }
        assertEquals(expected, actual);
    }

    @Test
    void shouldfindMaxlimit() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 19};
        long expected = 19;
        long actual = service.findMax(incomesInBillions);


        assertEquals(expected, actual);
    }
}