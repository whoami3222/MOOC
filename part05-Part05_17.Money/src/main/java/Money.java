
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros,this.cents + addition.cents); // create a new Money object that has the correct worth
        
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }
        }

        return false;

    }


    public Money minus(Money decreaser){
         // create a new Money object that has the correct worth
        Money newMoneys = new Money(this.euros - decreaser.euros,this.cents - decreaser.cents);
        int cents = this.cents;
        int euros = this.euros;
        if(this.lessThan(decreaser)){
            newMoneys = new Money(0,0);
            return newMoneys;
        }
        if(this.cents < decreaser.cents){
            cents = cents + 100;
            cents = cents - decreaser.cents;

            euros = euros - 1;
            euros = euros - decreaser.euros;
        }else{
            cents = cents - decreaser.cents;
            euros = euros - decreaser.euros;
        }

        newMoneys = new Money(euros, cents);
        return newMoneys;

        
        }
        
        // return the new Money object
        
}


