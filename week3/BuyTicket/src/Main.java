import Entities.Sales;
import Interface.OnurAir;
import Interface.Pegasus;
public class Main {
    public static void main(String[] args) {
        OnurAir onurAir=new OnurAir("OnurAir","A2","Business","Almanya");
        OnurAir onurAir1=new OnurAir("OnurAir","A4","Ekonomi","Edirne");
        Pegasus pegasus=new Pegasus("Pegasus","D1","Business","Ingiltere");
        Pegasus pegasus1=new Pegasus("Pegasus","C2","Ekonomi","Antalya");
        Pegasus pegasus2=new Pegasus("Pegasus","B5","Ekonomi","Bursa");
        Pegasus pegasus3=new Pegasus("Pegasus","F3","Ekonomi","Izmir");
        Sales sales=new Sales();
    }
}