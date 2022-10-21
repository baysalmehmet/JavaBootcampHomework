public class Car {
    String CarClass;
    String CarColor;
    int CarAge;
    String CarBaggageCapacity;

    private int dayRental=5;
    private int monthRental=1;

    public int getDayRental() {
        return (dayRental * 300)-(CarAge*2);
    }

    public int getMonthRental() {
        return (monthRental * 750)-(CarAge*10);
    }

}
