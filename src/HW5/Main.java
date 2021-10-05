package HW5;

public class Main {

    /**
     * 1)Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * 2)Конструктор класса должен заполнять эти поля при создании объекта;
     * 3)Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * 4)Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет; Пример: ```
     * Person [] persArray = new Person [ 5 ]; // Сначала объявляем массив объектов,
     * persArray [ 0 ] = new Person ( "Ivanov Ivan" , "Engineer" , " ivivan@mailbox.com " , "892312312" , 30000 ,30 ); // потом для каждой ячейки массива задаем объект
     * persArray [ 1 ] = new Person (...);
     * ...
     * persArray [ 4 ] = new Person (...);
     */

    public static void main(String[] args) {
        Personal[] personal = new Personal[5];
        personal [0] = new Personal("Иванов Иван", "Менеджер", "ctoto@mail.ru", 48723276299L, 1300, 48);
        personal [1] = new Personal("Сергеев Иван", "Менеджер", "ctoto@mail.ru", 48723276299L, 1300, 52);
        personal [2] = new Personal("Владимирович Иван", "Менеджер", "ctoto@mail.ru", 48723276299L, 1300, 26);
        personal [3] = new Personal("Михайлович Иван", "Менеджер", "ctoto@mail.ru", 48723276299L, 1300, 54);
        personal [4] = new Personal("Юрьевич Иван", "Менеджер", "ctoto@mail.ru", 48723276299L, 1300, 21);
        for (int i = 0; i < personal.length; i++) {
            if (personal[i].getAge() > 40) {
                personal[i].info();
            }
        }

    }
}
