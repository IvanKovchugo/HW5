package HW5;

public class Main {


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
