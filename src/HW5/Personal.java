package HW5;

public class Personal {
    private String fullName;  // Создаем класс сотрудникики с полями: ФИО, должность, почта, номер телефона, ЗП, возраст
    private String position;
    private String mail;
    private long phoneNumber;
    private int salary;
    private int age;

    public Personal(String fullName, String position, String mail, long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
                                       //Создаем геттер для возраста
    public int getAge() {
        return age;
    }

    public void info () {
        System.out.println("ФИО -  " + fullName + ", Должность - " + position + ", Номер телефона - " +
                "+" + phoneNumber + ", ЗП в $ - " + salary + ", Возраст - " + age);
    }
}
