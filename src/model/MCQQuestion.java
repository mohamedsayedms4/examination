package model;

import java.util.List;

public class MCQQuestion extends Question {


    public MCQQuestion(String header, String body, Integer mark, Answer[] answers, Answer correctAnswer) {
        super(header, body, mark, answers, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.print("MCQ: " + header);
        System.out.println("  Mark: " + mark);

        System.out.println(body);

        for (Answer a : answers) {
            System.out.println(a.getAnswerId() + ": " + a.getAnswerText());
        }

        System.out.println("---------------------------------------");
    }
}
