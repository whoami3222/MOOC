public class Debt {

    private double balance = 0;
    private double interestRate = 0;


    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(balance);
    }


    public void waitOneYear(){
        balance = balance * interestRate;
    }

}
