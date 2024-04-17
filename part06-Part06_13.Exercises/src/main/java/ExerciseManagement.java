
import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exerciseName) {
        this.exercises.add(new Exercise(exerciseName));
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exerciseName)) {
                ex.setCompleted(true);
                break; // Exit loop once exercise is found
            }
        }
    }

    public boolean isCompleted(String exerciseName) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exerciseName)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
