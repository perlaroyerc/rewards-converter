public class RewardValue {
    public static double conversionRate = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int miles) {
        this.cashValue = miles * conversionRate;
    }

    private static int convertToMiles(double cashValue) {
        return (int)Math.round(cashValue / conversionRate);
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
       return convertToMiles(this.cashValue);
    }


}
