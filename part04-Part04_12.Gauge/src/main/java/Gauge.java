public class Gauge {

    private int value;

    public Gauge(){
        this.value = 0;
    }

    public void increase(){
        if(value<5){
            value = value + 1;
        }
    }

    public void decrease(){
        if(value > 0){
            value = value - 1;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        if(value == 5){
            return true;
        }

        return false;
    }

}
