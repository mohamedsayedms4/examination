package service;

import model.Exam;

public class ExamServiceImpl implements ExamService{

    @Override
    public void startExam(Exam exam) {
        exam.displayExam();
    }
}
