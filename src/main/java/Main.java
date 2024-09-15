import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race(); // Начинаем новую гонку
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля №" + (i + 1) + ":");
            String name = scanner.next(); // Считываем название нового автомобиля
            int speed;
            while (true) {
                System.out.println("Введите скорость автомобиля №" + (i + 1) + ":");
                if (scanner.hasNextInt()) { //Проверяем, что введенные данные являются числом и соответствуют условию
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250){
                        break;
                    } else {
                        System.out.println("Неверная скорость");
                    }
                } else {
                    System.out.println("Неверная скорость");
                    scanner.next(); // перевод строки для следующего ввода
                }
            }

            Car newCar = new Car(name, speed); // Создаем автомобиль
            race.setLeaderCar(newCar); // Вызываем метод проверки на лидерство автомобиля
        }
        scanner.close();
        System.out.println("Автомобиль-победитель: " + race.getLeaderCarName()); // Вывод победителя
    }
}