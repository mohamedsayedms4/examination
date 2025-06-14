# 📝 Exam Management System

A simple **Java SE** project that models an exam system with multiple question types, exam types, and a clean structure that follows **SOLID principles**.

---

## 📌 Features

- ✅ Supports **MCQ (Multiple Choice Questions)** and **True/False** questions.
- 🧪 Supports two exam types:
  - `FinalExam` → Displays total marks and correct answers.
  - `PracticalExam` → Displays only questions and correct answers.
- 🧠 Uses abstraction, inheritance, and interfaces to separate concerns.
- 📦 Follows SOLID principles for better code maintainability.

---

## 🗂️ Project Structure

```
src/
├── main/
│   └── Main.java                  # Entry point
├── model/
│   ├── Answer.java                # Represents an answer option
│   ├── Question.java              # Abstract base for all questions
│   ├── MCQQuestion.java           # Multiple choice question
│   ├── TrueFalseQuestion.java     # True/False question
│   ├── Exam.java                  # Abstract base for exams
│   ├── FinalExam.java             # Final exam implementation
│   ├── PracticalExam.java         # Practical exam implementation
│   └── Subject.java               # Represents a subject and its exam
├── service/
│   ├── ExamService.java           # Interface for exam service
│   └── ExamServiceImpl.java       # Concrete exam execution logic
```

---

## 🚀 How to Run

1. Clone the repository.
2. Open the project in any Java IDE (e.g., IntelliJ, Eclipse).
3. Create your exam and questions inside `Main.java`.
4. Run `Main` to simulate an exam display.

---

## 🧾 Sample Output

```
The final exam is displayed.
MCQ: Q1  Mark: 5
What is 2 + 2?
1: 3
2: 4
3: 5
✔ Correct Answer: 4

True/False: Q2  Mark: 3
Java is platform-independent.
1: True
2: False
✔ Correct Answer: True

Total Mark: 8
```

---

## 📐 SOLID Principles Used

| Principle                   | Applied In |
|----------------------------|------------|
| ✅ Single Responsibility   | Each class has one clear job. |
| ✅ Open/Closed             | New types of questions/exams can be added without modifying existing ones. |
| ✅ Liskov Substitution     | All child classes (`FinalExam`, `PracticalExam`) can be used as `Exam`. |
| ✅ Interface Segregation   | `ExamService` only includes required methods. |
| ✅ Dependency Inversion    | `Main` depends on `ExamService` interface, not implementation. |

---

## 💡 Future Improvements

- Add student interaction to input answers and evaluate performance.
- Use file I/O or a database to store questions and results.
- Add a GUI using **JavaFX** or **Swing**.
- Localize the system (Arabic/English toggle).

---

## 👨‍💻 Author

- **Name**: Mohamed  
- **Language**: Java SE  
- **Year**: 2025

---

> 🎯 _Educational project for learning OOP, abstraction, and clean architecture in Java._
