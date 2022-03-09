package epam.javatutor.module4.task8;

public class Customer {

    private int id;
    private String FIO;
    private String address;
    private int numberCard;
    private int numberBankingAccount;

    public Customer(int id, String FIO, String address, int numberCard, int numberBankingAccount) {
        this.id = id;
        this.FIO = FIO;
        this.address = address;
        this.numberCard = numberCard;
        this.numberBankingAccount = numberBankingAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public int getNumberBankingAccount() {
        return numberBankingAccount;
    }

    public void setNumberBankingAccount(int numberBankingAccount) {
        this.numberBankingAccount = numberBankingAccount;
    }

    @Override
    public String toString() {
        return "Customer information {" +
                "id: " + id +
                ", Last name, first name: " + FIO  +
                ", Address of residence: " + address  +
                ", Number card: " + numberCard +
                ", Number banking account: " + numberBankingAccount +
                '}';
    }
}