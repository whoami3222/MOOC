public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        int numberCount = 0;
        int numberSum = 0;        

        this.count = numberCount;
        this.sum = numberSum;
    }

    public void addNumber(int number) {
        // write code here
        count = count + 1;
        sum = sum + number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        // write code here
        return sum;
    }

    public double average() {
        // write code here
        double avg = (double)sum/count;

        if(count == 0){
            return avg = 0;
        }
        
        return avg;

    }
}