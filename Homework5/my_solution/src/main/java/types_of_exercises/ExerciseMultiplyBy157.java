package types_of_exercises;

import exam_generation.Exercise;
import exam_generation.Operator;
import lombok.NoArgsConstructor;
import random_util.RandomUtil;

@NoArgsConstructor
public class ExerciseMultiplyBy157 implements ExercisesType {
    @Override
    public Exercise generateExercise( int upperEdge ) {
        double firstNumber = RandomUtil.getIntBetween(0, upperEdge);
        double secondNumber = 157.0;
        Operator operator = Operator.MULTIPLY;
        double answer = firstNumber * secondNumber;
        return new Exercise(firstNumber, secondNumber, answer, operator);
    }
}
