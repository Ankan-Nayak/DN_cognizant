import java.util.*;
public class FinancialForecast {

    public static double calculateAverageGrowth(List<Double> data) {
        double totalGrowth = 0.0;
        for (int i = 1; i < data.size(); i++) {
            totalGrowth += (data.get(i) - data.get(i - 1)) / data.get(i - 1);
        }
        return totalGrowth / (data.size() - 1);
    }

    public static List<Double> forecast(List<Double> pastData, int monthsToForecast) {
        List<Double> allData = new ArrayList<>(pastData);
        double lastValue = pastData.get(pastData.size() - 1);
        double avgGrowthRate = calculateAverageGrowth(pastData);

        for (int i = 0; i < monthsToForecast; i++) {
            lastValue = lastValue * (1 + avgGrowthRate);
            allData.add(lastValue);
        }

        return allData;
    }
}


