public class MicrowaveOven { // класс микроволновой печи
    private int time;
    private int level;

    public MicrowaveOven() { // конструктор микроволновой печи
        this.time = 0;
        this.level = 1;
    }

    public int getTime() { // функция получения заданного времени в микроволновой печи
        return this.time;
    }

    public int getLevel() { // функция получения заданного уровня в микроволновой печи
        return this.level;
    }

    public void buttonOne() { // кнопка 1: добавление времени
        this.time += 30;
    }

    public void buttonTwo() { // кнопка 2: смена уровня в микроволновой печи
        if (this.level == 1) {
            this.level = 2;
        } else {
            this.level = 1;
        }
    }

    public void buttonThree() { //кнопка 3: сброс заданных настроек
        this.time = 0;
        this.level = 1;
    }

    public void buttonFour() { //кнопка 4: запуск микроволновой печи с выводом настроек
        if (this.time == 0) {
            System.out.println("Запустить микроволновую печь нельзя!");
        } else {
            System.out.println("Разогрев на " + getTime() + " секунд на уровне " + getLevel() + ".");
        }
    }
}
