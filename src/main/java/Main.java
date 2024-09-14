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
                speed = scanner.nextInt(); // Считываем скорость автомобиля и проверяем на соответствие условию
                if (speed >= 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Неверная скорость");
                }
            }
            Car newCar = new Car(name, speed); // Создаем автомобиль
            race.setLeaderCar(newCar); // Вызываем метод проверки на лидерство автомобиля

        }
        System.out.println("Автомобиль-победитель: " + race.leaderCarName); // Вывод победителя
    }
}