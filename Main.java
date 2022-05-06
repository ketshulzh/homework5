package Homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  If22◦
// Даны координаты точки, не лежащей на координатных осях OX и OY.
        // Определить номер координатной четверти, в которой находится данная точка.
        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Первая четверть");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Вторая четверть");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Третья четверть");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Четвертая четверть");
        }
        */

        // If23. Даны целочисленные координаты трех вершин прямоугольника, стороны
        // которого параллельны координатным осям. Найти координаты его четвертой вершины
     /*
   Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int x4 = 0;
        int y4 = 0;
        if (x2 == x3) {
            x4 = x1;
        }
        else if (x3 == x1) {
            x4 = x2;
        }
        else if (x1 == x2) {
            x4 = x3;
        }

        if (y2 == y3) {
            y4 = y1;
        }
        else if (y3 == y1) {
            y4 = y2;
        }
        else if (y1 == y2) {
            y4 = y3;
        }
        System.out.println(x4 + "; " + y4);
   */
        // If24. Для данного вещественного x найти значение следующей функции f, принимающей вещественные значения:
        // f (x) = 2·sin(x), если x > 0,
        //     6 − x, если x ≤ 0.
        /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double f = 0;
if (x > 0) {
    f = 2 * Math.sin(x);
}
else if (x <= 0) {
    f = 6 - x;
}
        System.out.println(f);
         */
//If25. Для данного целого x найти значение следующей функции f, принимающей значения целого типа:
//f (x) = 2·x, если x < −2 или x > 2,
//−3·x, в противном случае.
       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int f;
        if (x < -2 || x > 2) {
            f = 2*x;
        }
        else {
            f = -3*x;
        }
        System.out.println(f);
*/
       /* If26◦
 Для данного вещественного x найти значение следующей функции f,
                принимающей вещественные значения:
−x, если x ≤ 0,
                f (x) = x
        2
                , если 0 < x < 2,
                4, если x ≥ 2.*/
/*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int f = 0;
        if (x <= 0) {
            f = -x;
        }
        else if (x > 0 && x < 2) {
            f = x * x;
        }
        else if (x >= 2) {
            f = 4;
        }
        System.out.println(f);

 */

        // If27. Для данного вещественного x найти значение следующей функции f,
        //принимающей значения целого типа:
        //0, если x < 0,
        //f (x) = 1, если x принадлежит [0, 1), [2, 3), . . . ,
        //−1, если x принадлежит [1, 2), [3, 4), .
        /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int f = 0;
        if (x<0) {
            f = 0;
        }

        else if (x%2 == 0) {
            f = 1;
        }
        else {
            f = -1;
        }
        System.out.println(f);
*/
        //If28. Дан номер года (положительное целое число). Определить количество
        //дней в этом году, учитывая, что обычный год насчитывает 365 дней, а
        //високосный — 366 дней. Високосным считается год, делящийся на 4, за
        //исключением тех годов, которые делятся на 100 и не делятся на 400
        //(например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000
        //— являются).
        /*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

         if  (x%4 == 0 && x%100 == 0 && x%400 != 0) {
            System.out.println("365");
        }

        else {
            System.out.println("366");
        }

         */
//If29. Дано целое число. Вывести его строку-описание вида «отрицательное
//четное число», «нулевое число», «положительное нечетное число» и т. д.
/*
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x < 0) {
            System.out.println("Отрицательное");
        } else if (x == 0) {
            System.out.println("Нулевое");
        } else if (x > 0) {
            System.out.println("Положительное");
        }
        if (x % 2 == 0 && x != 0 ) {
            System.out.println("четное");
        }
        else if (x % 2 != 0 && x != 0) {
            System.out.println("нечетное");}
            System.out.println("число");
*/
        //If30. Дано целое число, лежащее в диапазоне 1–999. Вывести его строкуописание вида «четное двузначное число», «нечетное трехзначное число»
        //и т. д.
       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 2 == 0 && x != 0 ) {
            System.out.println("четное");
        }
        else if (x % 2 != 0 && x != 0) {
            System.out.println("нечетное");}
        if (x>=1 && x<10) {
            System.out.println("однозначное");
        }
        else if (x>=10 && x<=99) {
            System.out.println("двузначное");
        }
        else if (x>=100 && x<=999) {
            System.out.println("трехзначное");
        }
        System.out.println("число");
    }
}
