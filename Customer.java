public class Customer {

    private String name ;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double calCustomerBalance(){
        return this.account.getCreditCard().getBalance();
    }

    public String toString(){
        return String.format("Name: %s \n Account: %s",this.name,this.account);
    }
}
