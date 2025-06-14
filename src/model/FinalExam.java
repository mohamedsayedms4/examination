package model;

import java.util.List;
import java.util.Observable;

public class FinalExam extends Exam {

    public FinalExam(List<Question> questions, int time) {
        super(questions, time);
    }

    @Override
    public void displayExam() {
        System.out.println("The final exam is displayed.");
        int totalMArk = 0;
        for (Question q : questions) {
            q.displayQuestion();
            totalMArk = totalMArk + q.getMark();
            System.out.println("✔ Correct Answer: " + q.getCorrectAnswer().getAnswerText());
            System.out.println();
        }
        System.out.println("Total Mark: " + totalMArk);
    }
}
