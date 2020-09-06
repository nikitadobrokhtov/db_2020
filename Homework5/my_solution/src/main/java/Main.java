import exam_generation.Examinator;
import exam_generation.Exercise;
import lombok.SneakyThrows;

import java.util.List;

public class Main {

    @SneakyThrows
    public static void main( String[] args ){

        Examinator examinator = new Examinator();
        List<Exercise> exam = examinator.generate(10);

        for (Exercise exercise : exam) {
            exercise.checkYourKnowledge();
        }

    }
}
