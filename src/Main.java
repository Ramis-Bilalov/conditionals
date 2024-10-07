import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // Задача 1

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Задача 1. Введите свой возраст: ");
        String value = reader.readLine();            // считывание значения с клавиатуры
        int age = Integer.parseInt(value);          // преобразование строки в число

        boolean ifAgeOlder18 = age >= 18;

        if (ifAgeOlder18) {
            System.out.println("Вам 18 или более лет");
        } else {
            System.out.println("Вам меньше 18-ти лет");
        }

        // Задача 2

        System.out.print("\nЗадача 2. Введите температуру на сегодня: ");
        String temperatureValue = reader.readLine();            // считывание значения с клавиатуры
        int temperature = Integer.parseInt(temperatureValue);          // преобразование строки в число

        boolean ifTemperatureLower = temperature <= 5;

        if (ifTemperatureLower) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3

        System.out.print("\nЗадача 3. Введите вашу скорость: ");
        String speedValue = reader.readLine();            // считывание значения с клавиатуры
        int speed = Integer.parseInt(speedValue);          // преобразование строки в число

        boolean ifSpeedLower = speed <= 60;

        if (ifSpeedLower) {
            System.out.println("Ваша скорость " + speed + "км/ч, можно ездить спокойно");
        } else {
            System.out.println("Ваша скорость " + speed + "км/ч, придется заплатить штраф");
        }

        // Задача 4

        System.out.print("\nЗадача 4. Введите ваш возраст для учреждений: ");
        String ageForEducation = reader.readLine();                     // считывание возраста с клавиатуры
        int newAgeValue = Integer.parseInt(ageForEducation);            // преобразование строки в число

        boolean ifKindergarten = (newAgeValue <= 6 && newAgeValue >= 2);
        boolean ifSchoolStudent = (newAgeValue <= 17 && newAgeValue >= 7);
        boolean ifUniversityStudent = (newAgeValue <= 24 && newAgeValue >= 18);
        boolean ifWorker = (newAgeValue > 24);

        if (ifKindergarten) {
            System.out.println("Ваш возраст равен " + newAgeValue + " годам, вам нужно ходить в садик.");
        }
        if (ifSchoolStudent) {
            System.out.println("Ваш возраст равен " + newAgeValue + " годам, вам нужно ходить в школу.");
        }
        if (ifUniversityStudent) {
            System.out.println("Ваш возраст равен " + newAgeValue + " годам, вам нужно ходить в университет.");
        }
        if (ifWorker) {
            System.out.println("Ваш возраст равен " + newAgeValue + " годам, вам нужно ходить на работу.");
        }

        // Задача 5

        System.out.print("\nЗадача 5. Возраст ребенка для аттракционов: ");
        String ageForAttraction = reader.readLine();                     // считывание возраста для аттракционов с клавиатуры
        int ageForAttr = Integer.parseInt(ageForAttraction);            // преобразование строки в число

        boolean childLower5 = (ageForAttr <= 5);
        boolean childLower14 = (ageForAttr <= 14 && ageForAttr > 5);
        boolean childOlder14 = (ageForAttr > 14);

        if (childLower5) {
            System.out.println("Возраст ребенка равен " + ageForAttr + " годам, ему нельзя кататься на аттракционе.");
        }
        if (childLower14) {
            System.out.println("Возраст ребенка равен " + ageForAttr + " годам, ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childOlder14) {
            System.out.println("Возраст ребенка равен " + ageForAttr + " годам, ему можно кататься на аттракционе без сопровождения взрослых.");
        }

        // Задача 6

        System.out.print("\nЗадача 6. Количество людей, желающих сесть в вагон: ");
        String carriageValue = reader.readLine();                     // считывание возраста для аттракционов с клавиатуры
        int carriageCapacity = Integer.parseInt(carriageValue);       // преобразование строки в число

        boolean condition = carriageCapacity <= 102;
        int trainCarriageCapacity = 102;
        int extraPassengers;

        if (condition) {
            System.out.println("Желающих сесть в вагон " + carriageCapacity + " человек, стоячих и сидячих мест достаточно");
        } else {
            extraPassengers = carriageCapacity - trainCarriageCapacity;
            System.out.println("Желающих сесть в вагон " + carriageCapacity + " человек, места не хватит " + extraPassengers + " пассажирам.");
        }

        // Задача 7
        // В этой задаче не применил ввод с клавиатуры, задача понятна и на этом примере

        int one = 1;
        int two = 2;
        int three = 3;

        boolean firstCondition = (one > two && one > three);
        boolean secondCondition = (two > one && two > three);

        System.out.print("\nЗадача 7. ");

        if (firstCondition) {
            System.out.println("Значение one большее.");
        } else if (secondCondition) {
            System.out.println("Значение two большее.");
        } else {
            System.out.println("Значение three большее.");
        }
    }
}