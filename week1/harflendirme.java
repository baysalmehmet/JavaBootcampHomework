import java.util.Scanner;
public class harflendirme {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            //Kullanıcıdan 0-100 arası değer alınıyor.
            System.out.print("Luften aldiginiz puani yaziniz:");
            int pn= scan.nextInt();

            // Alınan değer ile if koşulu kullanılarak ekrana harf karşılığı yazılıyor.
            if (0<pn && 35>pn){
                System.out.print("Puaniniz:" + pn + " Harf karsiligi:FF");
            } else if (35<=pn && 50>pn) {
                System.out.print("Puaniniz:" + pn + " Harf karsiligi:DC");
            } else if (50<=pn && 70>pn) {
                System.out.print("Puaniniz:" + pn + " Harf karsiligi:BB");
            } else if (70<=pn && 100>=pn){
                System.out.print("Puaniniz:" + pn + " Harf karsiligi:AA");
            }else{
                System.out.print("Lutfen 0-100 arasi deger giriniz!!!");
            }
        }
    }
