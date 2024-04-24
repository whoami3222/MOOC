import java.util.Scanner;

public class Container {

    private int storage;

    public Container(){
        
    }

    public int contains(){
        return storage;
    }

    public void add(int amount){
        if(amount > 0 ){
            this.storage += amount;
        }

        if(this.storage > 100){
            this.storage = 100;
        }
    }

    public void remove(int amount){
        if(amount > 0){
            this.storage -= amount;
        }
        if(this.storage < 0){
            this.storage = 0;
        }
    }

    public String toString(){
        return this.storage+"/100";
    }



}
