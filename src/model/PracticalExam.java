package model;

import java.util.List;

public class PracticalExam extends Exam {

    public PracticalExam(List<Question> questions, int time) {
        super(questions, time);
    }

    @Override
    public void displayExam() {
        System.out.println("The practical exam is displayed.");
        for (Question q : questions) {
            q.displayQuestion();
            System.out.println("✔ Correct Answer: " + q.getCorrectAnswer().getAnswerText());
            System.out.println();
        }
    }


}
