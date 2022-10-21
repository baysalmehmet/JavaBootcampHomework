public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Manav urunlerim");
        Room room=new Room(8,5,4);
        System.out.println("Elma:"+room.apple+"kg");
        System.out.println("Kiraz:"+room.cherry+"kg");
        System.out.println("Armut:"+room.pear+"kg");
        System.out.println("-------------------------------------");
        System.out.println("Musterinin satin aldigi urunler");
        Sale sale=new Sale(8,5,4);
        System.out.println("Elma:"+sale.buyApple+"kg");
        System.out.println("Kiraz:"+sale.buyCherry+"kg");
        System.out.println("Armut:"+sale.buyPear+"kg");
        System.out.println("-------------------------------------");
        System.out.println("Satis isleminden sonra magazadaki Kalan urunlerim");
        System.out.println("Elma:"+sale.salesApple()+"kg");
        System.out.println("Kiraz:"+sale.salesCherry()+"kg");
        System.out.println("Armut:"+sale.salesPear()+"kg");
    }
}
