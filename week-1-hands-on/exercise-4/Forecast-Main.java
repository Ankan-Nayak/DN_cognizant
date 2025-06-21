import java.util.*;

public class ForecastMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> revenueList = new ArrayList<>();

        System.out.print("Enter number of past months: ");
        int months = sc.nextInt();

        for (int i = 0; i < months; i++) {
            System.out.print("Enter revenue for month " + (i + 1) + ": ");
            revenueList.add(sc.nextDouble());
        }

        System.out.print("Enter number of future months to forecast: ");
        int futureMonths = sc.nextInt();

        List<Double> forecast = FinancialForecast.forecast(revenueList, futureMonths);

        System.out.println("\n Financial Forecast :");
        for (int i = 0; i < forecast.size(); i++) {
            if (i < months)
                System.out.printf("Month %d (Actual): %.2f\n", i + 1, forecast.get(i));
            else
                System.out.printf("Month %d (Forecast): %.2f\n", i + 1, forecast.get(i));
        }
    }
}
