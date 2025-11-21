public class Person { // класс человека
    private String name; // атрибут имени
    private String friendsNames; // атрибут списка имени

    public Person(String name) { // конструктор человека
        this.name = name;
        this.friendsNames = "";
    }

    public String getName() { // функция получения имени человека
        return this.name;
    }

    public void befriend(Person p) { // функция добавления человека в список друзей
        this.friendsNames += p.name + " ";
    }

    public void unfriend(Person p) { // функция удаления человека из списка друзей
        if (this.friendsNames.contains(p.name)) { // если имя человека есть в списке друзей, то...
            if (this.friendsNames.startsWith(p.name)) { // ...если с него список начинается, то заменить его на пустое выражение...
                this.friendsNames = this.friendsNames.replace(p.name + " ", "");
            } else { // ...иначе седлать то же самое в любом другом месте списка
                this.friendsNames = this.friendsNames.replace(p.name + " ", "");
            }
        } else { // в обратном случае указать на невозможность выполнения функции
            System.out.println("Данныого человека нет в списке друзей.");
        }
    }

    public String getFriendsNames() { // функция получения списка друзей человека
        return friendsNames;
    }
}
