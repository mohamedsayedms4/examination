package model;

import java.util.List;

public abstract class Exam {
    protected List<Question> questions;

    protected int time ;

    public Exam(List<Question> questions, int time) {
        this.questions = questions;
        this.time = time;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public abstract void displayExam();

    @Override
    public String toString() {
        return "Exam{" +
                "questions=" + questions +
                '}';
    }
}
