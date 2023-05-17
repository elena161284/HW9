public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            totalAmount =+ arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalAmount + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maximum = 0;
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей. Максимальная сумма трат за день составила " + maximum + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double averageValue = 0;
        for (int i = 0; i < arr.length; i++) {
            averageValue = averageValue + arr[i];
        }
        averageValue = averageValue / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}







