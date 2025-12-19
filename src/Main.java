public class Main {
    public static void main(String[] args) {
        System.out.println("Задача P3.3: Шарик.");

        Balloon testBalloon = new Balloon(); // создание шарика
        System.out.println("Текущие показатели шарика:");
        System.out.println("Радиус: " + testBalloon.getRadius()); // получение данных о шарике
        System.out.println("Объём: " + testBalloon.getVolume());

        testBalloon.inflate(3); // надувание шарика на определённое число
        System.out.println("Объём после надувания: " + testBalloon.getVolume()); // вычисление и вывод

        System.out.println("Задача P3.5: Микроволновая печь.");

        MicrowaveOven testOven = new MicrowaveOven(); // создание микроволоновой печи
        System.out.println("Текущие показатели печи:");
        System.out.println("Заданное время: " + testOven.getTime()); // получение данных о печи
        System.out.println("Уровень: " + testOven.getLevel());

        testOven.addTime(); // заданное время: 60 секунд
        testOven.addTime();
        testOven.buttonTwo(); // заданный уровень: 2
        testOven.buttonFour(); // запуск микроволновой печи
        testOven.buttonThree(); // сброс настроек

        System.out.println("Задача P3.6: Человек и друзья.");
        Person testPerson = new Person("Богдан"); // создание нескольких объектов класса Person
        Person personOne = new Person("Виталий");
        Person personTwo = new Person("Сергей");

        System.out.println("Текущий список друзей у testPerson:"); // вывод пустого списка друзей у testPerson
        System.out.println(testPerson.getFriendsNames());

        testPerson.befriend(personOne); // запись друзей для testPerson
        testPerson.befriend(personTwo);
        System.out.println("Имя testPerson: " + testPerson.getName()); // вывод списка друзей testPerson с его именем
        System.out.println("Текущий список друзей у testPerson: " + testPerson.getFriendsNames());

        testPerson.unfriend(personOne); // удаление одного друга из списка друзей
        System.out.println("Текущий список друзей у testPerson: " + testPerson.getFriendsNames()); // повторный вывод списка друзей у testPerson

        System.out.println("Задача P3.8: Студент и средний балл за экзамены.");
        Student testStudent = new Student("Алексей"); // создание студента Алексея
        System.out.println("Имя студента: " + testStudent.getName()); // вывод имени студента

        testStudent.addQuiz(4); // заполнение оценок Алексея за экзамены
        testStudent.addQuiz(5);
        testStudent.addQuiz(5);

        System.out.println("Общий балл за экзамены: " + testStudent.getTotalScore()); // вывод общего балла Алексея
        System.out.println("Средний балл за экзамены: " + testStudent.getAverageScore()); // вывод среднего балла Алексея //
    }
}