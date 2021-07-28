public class Part1 {
    /**
     * Epam Training center
    1. Basics of software code development
     */

    // Линейный программы
    // 1. Найдите значение функции
    public static void task_1(int a, int b, int c) {
        System.out.println("z = " + ((a - 3) * b / 2) + c);
    }

    // 2. Вычислить значение выражения по формуле
    // (все переменные принимают действительные числа)
    public static void task_2(int a, int b, int c) {
        System.out.println("Значение выражения: " + (
                (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2))
        );
    }

    // 3. Вычислить значение выражения по формуле
    // (все переменные принимают действительные числа)
    public static void task_3(int x, int y) {
        System.out.println((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
    }

    // 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    // Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void task_4(double time) {
        double part1 = time / 1000;
        double part2 = (int) (time * 1000 % 1000);
        System.out.printf("%.3f", part1 + part2);
    }

    // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    // Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
    public static void task_5(int time) {
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 3600 % 60;
        System.out.printf("%02dч %02dмин %02dс", hour, minute, second);
    }

    // 6. Для данной области составить линейную программу, которая печатает true, если точка
    // с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
    public static boolean task_6(int x, int y) {
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) ||
                (y <= 0 && y >= -3 && x >= -4 && x <= 4) && (x != 0 && y != -1)) {
            return true;
        }
        return false;
    }

    // 1. Даны два угла треугольника (в градусах).
    // Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    public static void isExistTriangle(int firstAngle, int secondAngle) {
        int sum = firstAngle + secondAngle;
        if (sum >= 180) {
            System.out.println("Треугольник с углами " + firstAngle + " и " + secondAngle + " градусов не существует");
        } else if (180 - sum == 90) {
            System.out.println("Треугольник с углами " + firstAngle + " и " + secondAngle + " градусов - прямоугольный");
        } else {
            System.out.println("Треугольник с углами " + firstAngle + " и " + secondAngle + " градусов существует");
        }
    }
    
    // 2. Найти max{min(a, b), min(c, d)}.
    public static int findMaxBetweenTwoMin(int a, int b, int c, int d) {
        int firstMin = (a < b) ? a : b;
        int secondMin = (c < d) ? c : d;
        if (firstMin > secondMin) {
            return firstMin;
        }
        return secondMin;
    }


    // 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    // Определить, будут ли они расположены на одной прямой.



    // 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.
    


    public static void main(String[] args) {

        // Линейный программы
        // Задание 6
        System.out.println("Задание №6");
        System.out.println("Expect: false -> " + task_6(0, -1));
        System.out.println("Expect: false -> " + task_6(3, 2));
        System.out.println("Expect: true -> " + task_6(0, 2));
        System.out.println("Expect: true -> " + task_6(-2, -3));

        // Ветвления
        // Задание 1
        System.out.println("\nВетвления");
        System.out.println("Задание №1");
        isExistTriangle(90, 90);
        isExistTriangle(60, 60);
        isExistTriangle(30, 60);

        System.out.println("Задание №2");
        System.out.println(findMaxBetweenTwoMin(1, 2, 3, 4));
        System.out.println(findMaxBetweenTwoMin(9, 8, 7, 6));
    }
}
