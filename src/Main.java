public class Main {
    public static void main(String[] args) {
        // Создаем массив из 15 дробных чисел
        double[] numbers = {-83.2, 55.1, -61.3, 223.5, 107.6, 491.2, -988.5, 1.8, 0.5, -2.1, 3.7, -888.6, 999.2, -1111.1, 666.4};

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        // Проходим по всем числам массива, находим первое отрицательное число и начинаем считать среднее арифметическое положительных чисел
        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                sum += number;
                count++;
            }
        }

        // Иначе выводим на экран среднее арифметическое положительных чисел, расположенных после первого отрицательного числа
        if (foundNegative) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        }
    }
}
