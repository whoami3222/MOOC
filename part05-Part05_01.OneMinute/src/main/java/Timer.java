public class Timer {

    private ClockHand hundreth;
    private ClockHand seconds;


    public Timer(){
        this.hundreth = new ClockHand(100);
        this.seconds = new ClockHand(60);

    }

    public void advance(){
        this.hundreth.advance();

        if(this.hundreth.value() == 0){
            this.seconds.advance();
        }

    }

    public String toString(){
        return seconds+":"+hundreth;
    }

}
