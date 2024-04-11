import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>(); 
    }




    public void addSuitcase(Suitcase suitcase){
        
        int count = 0;
        for (Suitcase s : suitcases) {
            count = count + s.totalWeight();
        }

        if(count + suitcase.totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
        }   
    }

    public String toString(){
        int count = 0;
        for (Suitcase s : suitcases) {
            count = count + s.totalWeight();
        }
        return suitcases.size() + " suitcases"+ "("+count+" kg)";
        
    }

    public void printItems(){
    
        for (Suitcase suitcase : suitcases) {
           suitcase.printItems();
            
        }
    }
}
