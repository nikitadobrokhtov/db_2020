package types_of_exercises;

import exam_generation.Exercise;
import exam_generation.Operator;
import random_util.RandomUtil;

public class ExerciseDivide implements ExercisesType {
    @Override
    public Exercise generateExercise( int upperEdge ) {
        double firstNumber = RandomUtil.getIntBetween(0, upperEdge);
        double secondNumber = RandomUtil.getIntBetween(0, upperEdge);
        Operator operator = Operator.DIVIDE;
        double answer = firstNumber / secondNumber;
        return new Exercise(firstNumber, secondNumber, answer, operator);
    }
}
