public class asalSayilarinToplami {
    public static void main(String[] args) {

        //3 ile 100 arasında asal sayıların toplamını bulan program.
        int total=12;
        for (int i = 3; i <100 ; i++) {
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                total +=i;
            }
        }
        System.out.print(total);
    }
}
