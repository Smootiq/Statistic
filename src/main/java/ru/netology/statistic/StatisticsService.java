package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = current_max_index;
        return current_max;
    }
    public long findMin(long[] incomes) {
        long current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = current_min_index;
        return current_min;
    }
}