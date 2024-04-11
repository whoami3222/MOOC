import java.util.ArrayList;

public class Suitcase {

    private int weight;
    private ArrayList<Item> items;

    public Suitcase(int weight){
        this.weight = weight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int count = 0;
        for (Item item2 : items) {
            count = count + item2.getWeight();
        }

        if(count + item.getWeight() <= this.weight){
            items.add(item);
        }   
    }

    public String toString(){
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        if(items.isEmpty()){
            return "no items(0 kg)";
        }

        if(items.size() == 1){
        return items.size() + " item"+"("+ currentWeight +" kg)";

        }
        return items.size() + " items"+"("+ currentWeight +" kg)";
    }

   

    public int totalWeight(){
        int count = 0;
        for (Item item2 : items) {
            count = count + item2.getWeight();
        } 
        return count;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = new Item(null, 0);
        for (Item item : items) {
            if(item.getWeight()>heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;

    }


    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
