package model;

public  abstract class  Question {
    protected String header;
    protected String body;
    protected Integer mark ;

    protected Answer[] answers;
    protected Answer correctAnswer;


    public Question(String header, String body, Integer mark, Answer[] answers, Answer correctAnswer) {
        this.header = header;
        this.body = body;
        this.mark = mark;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public abstract void displayQuestion();


}
