public class Cube {

    private int volume;
    private int length;

    public Cube(int edgeLength){
        this.length = edgeLength;

    }

    public int volume(){

        volume = length*length*length;

        return volume;

    }

    public String toString(){
        volume();
        return "The length of the edge is "+length+" and the volume "+volume;

    }



}
