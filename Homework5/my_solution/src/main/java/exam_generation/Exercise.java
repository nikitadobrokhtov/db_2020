package exam_generation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private double a;
    private double b;
    private double answer;
    private Operator operator;

    public void checkYourKnowledge() {
        double studentAnswer = Double.parseDouble(JOptionPane.showInputDialog(a + " "
                + operator.getSign() + " " + b +" = ?"));
        if (studentAnswer == answer){
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is wrong! The correct one is: " + answer);
        }
    }
}
