import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Arac Kiralama Sistemi");

        Car toyotaCorolla= new Car();
        toyotaCorolla.CarClass="Sedan";
        toyotaCorolla.CarAge=3;
        toyotaCorolla.CarBaggageCapacity="400Litre";
        toyotaCorolla.CarColor="White";
        toyotaCorolla.getDayRental();
        toyotaCorolla.getMonthRental();

        Car volkswagenGolf= new Car();
        volkswagenGolf.CarClass="Hatchback";
        volkswagenGolf.CarAge=2;
        volkswagenGolf.CarBaggageCapacity="340Litre";
        volkswagenGolf.CarColor="Red";
        volkswagenGolf.getDayRental();

        Car landRover = new Car();
        landRover.CarClass="Suv";
        landRover.CarAge=4;
        landRover.CarBaggageCapacity="430Litre";
        landRover.CarColor="Black";
        landRover.getDayRental();
        landRover.getMonthRental();

        Scanner scan=new Scanner(System.in);
        System.out.print("Sisteme giris bireysel ise 1/ Sirket ise 2 yaziniz: ");
        int a = scan.nextInt();
        if (a==1){
            System.out.println("Volkswagen Golf");
            System.out.println("Araba sinifi: "+ volkswagenGolf.CarClass);
            System.out.println("Arabanin yasi: "+ volkswagenGolf.CarAge);
            System.out.println("Arabanin bagaj kapasitesi: "+ volkswagenGolf.CarBaggageCapacity);
            System.out.println("Arabanin rengi: "+ volkswagenGolf.CarColor);
            System.out.println("Arabanin kiralama bedeli (5 Gunluk): "+ volkswagenGolf.getDayRental());

        } else if (a==2) {
            System.out.println("Toyota Corolla");
            System.out.println("Araba sinifi: "+ toyotaCorolla.CarClass);
            System.out.println("Arabanin yasi: "+ toyotaCorolla.CarAge);
            System.out.println("Arabanin bagaj kapasitesi: "+ toyotaCorolla.CarBaggageCapacity);
            System.out.println("Arabanin rengi: "+ toyotaCorolla.CarColor);
            System.out.println("Arabanin kiralama bedeli (5 Gunluk): "+ toyotaCorolla.getDayRental());
            System.out.println("Arabanin kiralama bedeli (1 Aylik)"+ toyotaCorolla.getMonthRental());
            System.out.println("------------------------------------------------------------");

            System.out.println("Land Rover");
            System.out.println("Araba sinifi: "+ landRover.CarClass);
            System.out.println("Arabanin yasi: "+ landRover.CarAge);
            System.out.println("Arabanin bagaj kapasitesi: "+ landRover.CarBaggageCapacity);
            System.out.println("Arabanin rengi: "+ landRover.CarColor);
            System.out.println("Arabanin kiralama bedeli (5 Gunluk): "+ landRover.getDayRental());
            System.out.println("Arabanin kiralama bedeli (1 Aylik):"+ landRover.getMonthRental());
            System.out.println("------------------------------------------------------------");

            System.out.println("Volkswagen Golf");
            System.out.println("Araba sinifi: "+ volkswagenGolf.CarClass);
            System.out.println("Arabanin yasi: "+ volkswagenGolf.CarAge);
            System.out.println("Arabanin bagaj kapasitesi: "+ volkswagenGolf.CarBaggageCapacity);
            System.out.println("Arabanin rengi: "+ volkswagenGolf.CarColor);
            System.out.println("Arabanin kiralama bedeli (5 Gunluk): "+ volkswagenGolf.getDayRental());

        }else {
            System.out.println("Yanlis secenek");
        }
    }
}
