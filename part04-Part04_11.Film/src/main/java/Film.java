public class Film {

    private String name = "";
    private int ageRating = 0;

    public Film(String filmName, int filmAgeRating) {
        //TODO Auto-generated constructor stub
        this.ageRating = filmAgeRating;
        this.name = filmName;
    }

    public String name(){
        return name;
    }

    public int ageRating(){
        return ageRating;
    }

}
