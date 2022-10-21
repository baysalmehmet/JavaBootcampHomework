import java.util.Random;
public class rastgeleSayi {
    public static void main(String[] args) {
        /**
         0 ile 500 aralığında ve
         Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
         50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
         */

        Random rndm = new Random();

        for (int i = 1; i <100000 ; i++) {
            int sayi=rndm.nextInt(500);
            if (sayi>=50 && sayi<=100){
                System.out.print("sayi:" +sayi+ " " +i+ ".secimde buldu ");
                break;
            }
        }
    }
}
