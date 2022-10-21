package Entities;
public class Sales {
    ClasBusiness business=new ClasBusiness(350,270);
    ClasEconomy economy=new ClasEconomy(150,200);
    RotaAbroad abroad=new RotaAbroad(520,510);
    RotaDomestic domestic=new RotaDomestic(430,465);
    int food=70;
    public int seatA2(){
        return business.onurAirPrice+abroad.onurAirPrice+food;
    }
    public int seatA4(){
        return economy.onurAirPrice+domestic.onurAirPrice;
    }
    public int seatD1(){
        return business.pegasusPrice+abroad.onurAirPrice+food;
    }
    public int seatC2(){
        return economy.pegasusPrice+domestic.onurAirPrice;
    }
    public int seatB5(){
        return economy.pegasusPrice+domestic.onurAirPrice;
    }
    public int seatF3(){
        return economy.pegasusPrice+domestic.onurAirPrice;
    }
}
