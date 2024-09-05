//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class main {

        public static String permission(int age, int temperature) {
            if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
                return "Можно идти гулять";
            } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
                return "Можно идти гулять";
            } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
                return "Можно идти гулять";
            } else {
                return "Оставайтесь дома";
            }
        }

        // Метод для генерации случайного возраста
        public static int generateRandomAge() {
            // Генерируем случайный возраст от 1 до 100
            return (int) (Math.random() * 100) + 1;
        }

        public static void main(String[] args) {
            // Вызов метода permission с различными входными данными
            System.out.println(permission(generateRandomAge(), 10));
            System.out.println(permission(generateRandomAge(), -5));
            System.out.println(permission(generateRandomAge(), 25));
            System.out.println(permission(generateRandomAge(), 0));
            System.out.println(permission(generateRandomAge(), 30));
        }
    }
}