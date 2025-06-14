package model;

public class Subject {
    private int subjectId;
    private String subjectName;
    private Exam exam;

    public Subject(int subjectId, String subjectName, Exam exam) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.exam = exam;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
