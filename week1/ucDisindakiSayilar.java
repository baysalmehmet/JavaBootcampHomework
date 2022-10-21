public class ucDisindakiSayilar {
    public static void main(String[] args) {
        
        //200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
        int total=0;
        for (int i = 200; i <500 ; i++) {
            if (i%3!=0){
                total+=i;
            }
        }
        System.out.print(total);
    }
}
