package Entities;
public class ClasBusiness extends PriceManager implements IFood{
    public ClasBusiness(int pegasusPrice, int onurAirPrice) {
        super(pegasusPrice, onurAirPrice);

    }
    @Override
    public boolean food() {
        return true;
    }
}
