package Interface;

public class Ticket {
    private String companyName;
    private String emptySeat;
    private String clas;
    private String rota;

    public Ticket(String companyName, String emptySeat, String clas, String rota) {
        this.companyName = companyName;
        this.emptySeat = emptySeat;
        this.clas = clas;
        this.rota = rota;
    }

}
