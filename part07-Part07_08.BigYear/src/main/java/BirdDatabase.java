import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase(){
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }

    public void addObservation(String name){
        for (Bird bird : birds) {
            if(bird.getName().equals(name)){
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAllBirds(){
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird(String name){
        for (Bird bird : birds) {
            if(bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
