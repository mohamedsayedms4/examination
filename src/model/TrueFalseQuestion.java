package model;

public class TrueFalseQuestion extends Question {

    private boolean correctAnswer;

    public TrueFalseQuestion(String header, String body, Integer mark, Answer[] answers, Answer correctAnswer, boolean correctAnswer1) {
        super(header, body, mark, answers, correctAnswer);
        this.correctAnswer = correctAnswer1;
    }

    @Override
    public void displayQuestion() {
        System.out.print("True/False: " + header);
        System.out.println("  Mark: " + mark);

        System.out.println(body);
        for (Answer a : answers) {
            System.out.println(a.getAnswerId() + ": " + a.getAnswerText());
        }

        System.out.println("-----------------------------");
    }
}
