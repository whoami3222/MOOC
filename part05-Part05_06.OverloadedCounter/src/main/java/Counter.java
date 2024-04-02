public class Counter {

    private int count;

    public Counter(int startValue){
        this.count = startValue;
    }

    public Counter(){
        this(0);

    }

    public int value(){
        return count;
    }

    public void increase(){
        count = count + 1;
    }

    public void decrease(){
        count = count - 1;
    }

    public void increase(int increaseBy){
        if(increaseBy>0){
            count = count + increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy>0){
            count = count - decreaseBy;
        }
    }
}
