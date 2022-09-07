public class Account {
    private int AccountId;
    private CreditCard creditCard;

    public Account(int accountId, CreditCard creditCard) {
        AccountId = accountId;
        this.creditCard = creditCard;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String toString(){
        return String.format("AccountID: %d \n Credit Card : %s",this.AccountId,this.creditCard);
    }
}
