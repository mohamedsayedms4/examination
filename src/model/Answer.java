package model;

public class Answer {
    private String answerText;
    private int answerId;

    public Answer(String answerText, int answerId) {
        this.answerText = answerText;
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
}
