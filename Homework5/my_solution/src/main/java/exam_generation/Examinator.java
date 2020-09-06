package exam_generation;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import random_util.RandomUtil;
import types_of_exercises.ExercisesType;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Examinator {

    private boolean defaultConfiguration = true;
    //private boolean defaultValue = true;
    private int upperEdge = 10;
    private final Reflections scanner = new Reflections("types_of_exercises");
    private final List<Class<? extends ExercisesType>> typesOfExercises = new ArrayList<>(scanner.getSubTypesOf(ExercisesType.class));


    private void setDefaultConfiguration() {
        defaultConfiguration = Boolean.parseBoolean(JOptionPane.showInputDialog(
                "Do you want to configure exercises manually?" + "\n" + "Write true or false."
        ));
    }

    private void setUpperEdge() {
        upperEdge = Integer.parseInt(JOptionPane.showInputDialog(
                "Set the upper Edge"
        ));
    }

    private StringBuilder stringGenerator() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < typesOfExercises.size(); i++) {
            str.append("Index: ").append(i).append(" | ").append(typesOfExercises.get(i)).append("\n");
        }
        return str;
    }

    private int chooseTypeOfExercise() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "You should choose the exercises you want to see in your exam \n" +
                        "Enter the appropriate indices. \n" +
                        "When you are finished, please, enter -1 \n\n" +
                        stringGenerator()
        ));
    }

    @SneakyThrows
    private List<Class<? extends ExercisesType>> chooseTypesOfExercises() {

        int index = chooseTypeOfExercise();
        List<Class<? extends ExercisesType>> listOfChosenExercises = new ArrayList<>();

        while (index != -1) {
            if (index >= typesOfExercises.size() || index < -1) {
                //throw UnsupportedOperationException;
                //here I should throw something but I can't for some reasons...
                System.exit(-200);
            } else {
                listOfChosenExercises.add(typesOfExercises.get(index));
                index = chooseTypeOfExercise();
            }
        }
        return listOfChosenExercises;
    }

    @SneakyThrows
    public List<Exercise> generate( int amount ) {

        List<Exercise> exercises = new ArrayList<>();

        List<Class<? extends ExercisesType>> typesOfExercisesWhichToGenerate =
                chooseTypesOfExercises();

        setDefaultConfiguration();

        if (defaultConfiguration) {
            setUpperEdge();
        }


        for (int i = 0; i < amount; i++) {
            exercises.add(
                    RandomUtil.randomItem(typesOfExercisesWhichToGenerate)
                            .getDeclaredConstructor()
                            .newInstance()
                            .generateExercise(upperEdge)
            );
        }


        return exercises;
    }
}
