public class Item {

    String name;
    String identifier;

    public Item(String identifier,String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return identifier;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Item)){
            return false;
        }

        Item comparedItem = (Item) compared;

        if(this.identifier.equals(comparedItem.identifier) && this.name.equals(comparedItem.name)){
            return true;
        }

        return false;
    }
}
