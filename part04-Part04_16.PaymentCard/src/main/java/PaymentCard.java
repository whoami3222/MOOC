public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (balance - 2.6>=0) {
            balance = balance - 2.6;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if (balance - 4.6 >= 0) {
            balance = balance - 4.6;  
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount > 0) {
            balance = balance + amount;
        }

        if(balance > 150){
            balance = 150;
        }
    }

}
