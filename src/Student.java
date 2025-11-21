public class Student { // класс студента
    private String name; // атрибут имени студента
    private double totalScore; // атрибут общего балла студента за вес экзамены
    private double averageScore; // атрибут среднего балла студента за все экзамены
    private double quizCount; // атрибут общего числа сданных студентом экзаменов

    public Student(String studentName) { // конструктор студента
        this.name = studentName;
        this.totalScore = 0;
        this.averageScore = 0;
        this.quizCount = 0;
    }

    public String getName() { // функция получения имени студента
        return this.name;
    }

    public void addQuiz(int quizScore) { // функция добавления экзамена
        this.totalScore += quizScore;
        this.quizCount += 1;
    }

    public double getTotalScore() { // функция получения общего балла студента за все экзамены
        return this.totalScore;
    }

    public double getAverageScore() { // функция получения среднего балла студента за все экзамены
        this.averageScore = (double)(this.totalScore / this.quizCount); //расчёт среднего балла с учётом типа данных
        return this.averageScore;
    }
}
