public class Sale extends Product implements ISales{
    //Müşterinin aldığı ürünler.
    int buyApple=1;
    int buyPear=2;
    int buyCherry=4;

    public Sale(int apple, int cherry, int pear) {
        super(apple, cherry, pear);
    }

    //Kurallar
    @Override
    public int salesApple() throws Exception {
        int result=apple-buyApple;
        if (result>0)
            return result;
        else
            throw new Exception("Magazadaki urunler maalesef alacaginiz miktarda degil");
    }

    @Override
    public int salesCherry() throws Exception {
        int result=cherry-buyCherry;
        if (result>0)
            return result;
        else
            throw new Exception("Magazadaki urunler maalesef alacaginiz miktarda degil");
    }

    @Override
    public int salesPear() throws Exception {
        int result=pear-buyPear;
        if (result>0)
            return result;
        else
            throw new Exception("Magazadaki urunler maalesef alacaginiz miktarda degil");
    }
}
