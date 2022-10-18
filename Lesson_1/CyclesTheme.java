public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num2;

        if (num1 >= max) {
            min = num2;
            max = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigit= 0;

        System.out.print("Число в обратном порядке = ");
        while(num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigit += digit;
            num /= 10;
        }
        System.out.println("\nСумма цифр числа = " + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countDigits = 0;

        for (int i = 1; i < 24; i += 2) {
            countDigits++;
            System.out.printf("%3d", i);
            if (countDigits == 5) {
                countDigits = 0;
                System.out.printf("\n");
            }
        }
        for (; countDigits < 5; countDigits++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на чётность");
        num = 3141591;
        countDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 1) {
                countDigits++;
            }
            num /= 10;
        }
        if (countDigits % 2 == 0) {
            System.out.println("Количество единиц = " + countDigits + " чётное");
        } else {
            System.out.println("Количество единиц = " + countDigits + " нечётное");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int rowCount = 5;
        while (rowCount <= 5 && rowCount > 0) {
            int columnCount = 0;
            while (columnCount < rowCount) {
                System.out.print("#");
                columnCount++;
            }
            System.out.println();
            rowCount--;        
        }

        System.out.println();
        rowCount = 5;
        int columnCount = 0;
        do {
            if (rowCount % 2 == 0) {
                columnCount = 2;            
            } else if (rowCount % 3 == 0) {
                columnCount = 3;
            } else {
                columnCount = 1;
            }
            do {
                System.out.print("$");
                columnCount--;
            } while (columnCount > 0);
            System.out.println();
            rowCount--;
        } while (rowCount <= 5 && rowCount > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec\t" + "Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d\t%4c\n", i, i);
            }
        }
        for (int i=97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d\t%4c\n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int sourceNum = 1234321;
        num1 = sourceNum;
        num2 = 0;

        while(num1 > 0) {
            int digit = num1 % 10;
            num2 = (num2 * 10) + digit;
            num1 /= 10;
        }

        if (num2 == sourceNum) {
            System.out.println("Число " + sourceNum + " является палиндромом");
        } else {
            System.out.println("Число " + sourceNum + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = sourceNum = 442622;
        num1 = 0;
        num2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    num1 += (num % 10);
                    num /= 10;
                } else {
                    num2 += (num % 10);
                    num /= 10;
                }
            }
        }
        if (num1 == num2) {
            System.out.println("Число " + sourceNum + " - cчастливое");
        } else {
            System.out.println("Число " + sourceNum + " - неcчастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("   ТАБЛИЦА \t ПИФАГОРА");
        System.out.printf("   |");
        for (int i=2; i < 10 ; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n");
        for (int i=2; i < 30 ; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n");
        for (int i=2; i < 10 ; i++) {
            System.out.printf("%2d |", i);
        for (int j=2; j < 10; j++) {
            System.out.printf("%2d ", i * j);
        }
        System.out.printf("\n");
        }
    }
}