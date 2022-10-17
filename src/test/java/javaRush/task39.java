package javaRush;

public class task39 {
    public static void main(String[] args) {
        System.out.println("Чтобы вернуть контроль над складом введите пароль:");

        if ("QWERTY".equalsIgnoreCase("qwerty")) {
            System.out.println("Контроль получен");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
