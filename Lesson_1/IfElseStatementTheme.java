public class IfElseStatementTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 32;
        boolean isMale = false;
        float height = 1.92f;

        if (age > 20) {
            System.out.println("Уже можно покупать алкоголь");
        } else {
            System.out.println("Алкоголь покупать запрещено");
        }
        if (!isMale) {
            System.out.println("Предложить ювелирные украшения");
        } else {
            System.out.println("Предложить электронику");
        }
        if (height < 1.80) {
            System.out.println("Предложить футбольный мяч");
        } else {
            System.out.println("Предложить баскетбольный мяч");
        }
        if ("Maxine".charAt(0) == 'M') {
            System.out.println("Предложить именную ложку на букву М");
        } else if ("Maxine".charAt(0) == 'I') {
            System.out.println("Предложить именную футболку");
        } else {
            System.out.println("Предложить общие вещи");
        }

        System.out.println("\n2. Поиск max и min числа");
        int srcNum1 = 13;
        int srcNum2 = 11;

        if (srcNum1 > srcNum2) {
            System.out.println("Первое число " +
                srcNum1 + " больше второго числа "
                + srcNum2);
        } else if (srcNum1 < srcNum2) {
            System.out.println("Второе число " +
                srcNum2 + " больше первого числа "
                + srcNum1);
        } else {
            System.out.println("Числа " + srcNum1 +
                " и " + srcNum2 + "равны");
        }


        System.out.println("\n3. Работа с числом");
        int anyNumber = 33;

        switch (anyNumber) {
            case 0:
                System.out.println("Число " + anyNumber +
                    " пустое");
                break;
            default:
                if (anyNumber > 0) {
                    System.out.println("Число " + anyNumber +
                        " положительное");
                } else {
                    System.out.println("Число " + anyNumber +
                        " отрицательное");
                }
                if ((anyNumber % 2) == 0) {
                    System.out.println("Число " + anyNumber +
                        " чётное");
                } else {
                    System.out.println("Число " + anyNumber +
                        " нечётное");
                }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        srcNum1 = 432;
        srcNum2 = 162;

        System.out.println("Число 1 = " + srcNum1 +
            "\nЧисло 2 = " + srcNum2);
        if ((srcNum1 / 100) == (srcNum2 / 100)) {
            System.out.println("Одинаковая цифра "
                + (srcNum1 / 100) +
                " в сотнях");
        }
        if (((srcNum1 % 100) / 10) == ((srcNum2 % 100) / 10)) {
            System.out.println("Одинаковая цифра "
                + ((srcNum1 % 100) / 10) +
                " в десятках");
        }
        if (((srcNum1 % 100) % 10) == ((srcNum2 % 100) % 10)) {
            System.out.println("Одинаковая цифра "
                + ((srcNum1 % 100) % 10) +
                " в единицах");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");

        char testCharVar = '\u0057';

        switch (testCharVar) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("Символ " + testCharVar +
                    " - это число");
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Символ " + testCharVar +
                    " - это маленькая буква");
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("Символ " + testCharVar +
                    " - это большая буква");
                break;
            default:
                System.out.println("Символ " + testCharVar +
                    " - это не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        float sum = 300000f;
        float percent;

        if (sum <= 100000) {
            percent = sum * 0.05f;
        } else if (sum > 100000 || sum <= 300000) {
            percent = sum * 0.07f;
        } else {
            percent = sum * 0.1f;
        }

        System.out.println("Сумма = " + sum);
        System.out.println("Начисленные проценты = "
            + percent);
        System.out.println("Итоговая сумма = "
            + (sum + percent));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int developmentPercent = 91;
        int historyMark;
        int developmentMark;
        int middleMark;
        int middlePercent;

        middlePercent = (historyPercent + developmentPercent) / 2;

        if (historyPercent <= 60) {
            historyMark = 2;
        } else if (historyPercent > 60 && historyPercent < 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent < 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }

        if (developmentPercent <= 60) {
            developmentMark = 2;
        } else if (developmentPercent > 60 && developmentPercent < 73) {
            developmentMark = 3;
        } else if (developmentPercent > 73 && developmentPercent < 91) {
            developmentMark = 4;
        } else {
            developmentMark = 5;
        }

        middleMark = (historyMark + developmentMark) / 2;
        System.out.println("Оценка\t" + "Предмет");
        System.out.println(historyMark + "\tИстория");
        System.out.println(developmentMark + "\tПрограммирование");
        System.out.println("Средний балл оценок - " + middleMark);
        System.out.println("Средний процент - " + middlePercent);

        System.out.println("\n8. Расчет прибыли");
        int rentPrice = 5000;
        int productPrimeCost = 9000;
        int productCost = 13000;
        int yearPrice;
        char sign = ' ';

        rentPrice = rentPrice * 12;
        productPrimeCost = productPrimeCost * 12;
        productCost = productCost * 12;
        yearPrice = productCost - (productPrimeCost + rentPrice);
        if (yearPrice > 0) {
            sign = '+'; 
        }
        System.out.println("Прибыль за год: " + sign + yearPrice);

    System.out.println("\n9. Подсчет количества банкнот");
    int cashNeeded = 567;
    int hundreds;
    int tens;
    int units;

    hundreds = cashNeeded / 100;
    tens = (cashNeeded % 100) / 10;
    units = (cashNeeded % 100) % 10;
    
    if (tens > 5) {
        units = units + (tens - 5) * 10;
        tens = 5;
    }
    System.out.println("Номинал \t" + "Количество");
    System.out.println("Сотни   \t" + hundreds);
    System.out.println("Десятки \t" + tens);
    System.out.println("Единицы \t" + units);
    System.out.println("Исходная сумма = " + ((hundreds * 100) + (tens * 10) + units));
    }
    
}