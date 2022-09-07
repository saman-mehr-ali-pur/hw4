public class CreditCard {
    private int serial;
    private int balance;

    public CreditCard(int serial, int balance) {
        this.serial = serial;
        this.balance = balance;
    }


    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return String.format("Serial: %d \n Balance %f",this.serial,this.balance);
    }
}
