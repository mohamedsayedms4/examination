import model.*;
import service.ExamService;
import service.ExamServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Answer[] mcqAnswers = {
                new Answer("1", 1),
                new Answer("2", 2),
                new Answer("3", 3)
        };
        Question mcq = new MCQQuestion(
                "Math Q1",
                "What is 1 + 1?",
                5,
                mcqAnswers,
                mcqAnswers[1] // correct answer is "2"
        );

        Answer[] tfAnswers = {
                new Answer("True", 1),
                new Answer("False", 2)
        };

        Question tf = new TrueFalseQuestion(
                "Geo Q1",
                "The Earth is flat.",
                3,
                tfAnswers,
                tfAnswers[1], // correct: "False"
                false
        );

        List<Question> questions = new ArrayList<>();
        questions.add(mcq);
        questions.add(tf);

        Exam exam = new FinalExam(questions, 45);
        Subject subject = new Subject(1001, "General Knowledge", exam);

        ExamService examService = new ExamServiceImpl();
        System.out.println("====== Welcome to " + subject.getSubjectName() + " Exam ======");
        examService.startExam(subject.getExam());
    }
}
