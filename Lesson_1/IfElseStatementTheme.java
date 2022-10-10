public class IfElseStatementTheme {

    public static void main(String[] args) {
        printItem1();
        printItem2();
        printItem3();
        printItem4();
        printItem5();
        printItem6();
        printItem7();
        printItem8();
        printItem9();
    }

    public static void printItem1() {
        int age = 32;
        boolean isMale = false;
        float height = 1.92f;
        System.out.println("\n1. Перевод псевдокода на язык Java");
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
    }

    public static void printItem2() {
        int srcNum1 = 13;
        int srcNum2 = 11;
        System.out.println("\n2. Поиск max и min числа");
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
    }

    public static void printItem3() {
        int anyNumber = 33;
        System.out.println("\n3. Работа с числом");
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
    }

    public static void printItem4() {
        int srcNum1 = 432;
        int srcNum2 = 162;
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        System.out.println("Число 1 = " + srcNum1 +
            "\nЧисло 2 = " + srcNum2);
        if (getHundreds(srcNum1) == getHundreds(
                srcNum2)) {
            System.out.println("Одинаковая цифра "
                + getHundreds(srcNum1) +
                " в сотнях");
        }
        if (getTens(srcNum1) == getTens(srcNum2)) {
            System.out.println("Одинаковая цифра "
                + getTens(srcNum1) +
                " в десятках");
        }
        if (getUnits(srcNum1) == getUnits(srcNum2)) {
            System.out.println("Одинаковая цифра "
                + getUnits(srcNum1) +
                " в единицах");
        }
    }

    public static void printItem5() {
        char testCharVar = '\u0057';
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
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
    }

    public static void printItem6() {
        float sum = 300000f;
        float percent;
        
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        
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
    }

    public static void printItem7() {
        int historyPercent = 59;
        int developmentPercent = 91;
        int historyMark;
        int developmentMark;
        int middleMark;
        int middlePercent;
        

        System.out.println("\n7. Определение оценки по предметам");
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
    }

    public static void printItem8() {
        int rentPrice = 5000;
        int productPrimeCost = 9000;
        int productCost = 13000;
        int yearPrice;
        char sign = ' ';

        System.out.println("\n8. Расчет прибыли");
        rentPrice = rentPrice * 12;
        productPrimeCost = productPrimeCost * 12;
        productCost = productCost * 12;
        yearPrice = productCost - (productPrimeCost + rentPrice);
        if (yearPrice > 0) {
            sign = '+'; 
        }
        System.out.println("Прибыль за год: " + sign + yearPrice);
    }

    public static void printItem9() {
    int cashNeeded = 567;
    int hundreds;
    int tens;
    int units;

    System.out.println("\n9. Подсчет количества банкнот");
    hundreds = getHundreds(cashNeeded);
    tens = getTens(cashNeeded);
    units = getUnits(cashNeeded);
    
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
    

    private static int getHundreds(int number) {
        return number / 100;
    }

    private static int getTens(int number) {
        return (number % 100) / 10;
    }

    private static int getUnits(int number) {
        return (number % 100) % 10;
    }

}