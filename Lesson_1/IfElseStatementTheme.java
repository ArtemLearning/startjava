public class IfElseStatementTheme {

    public static void main(String[] args) {
    printItem1();
    printItem2();
    printItem3();
    printItem4();
    printItem5();
    printItem6();
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
            System.out.println("Первое число " + srcNum1 + " больше второго числа " + srcNum2);
        } else if (srcNum1 < srcNum2) {
            System.out.println("Второе число " + srcNum2 + " больше первого числа " + srcNum1);
        } else {
            System.out.println("Числа " + srcNum1 + " и " + srcNum2 + "равны");
        }
    }
    
    public static void printItem3() {
        int anyNumber = 33;

        System.out.println("\n3. Работа с числом");
        switch(anyNumber) {
        case 0:
            System.out.println("Число " + anyNumber + " пустое");
            break;
        default:
            if (anyNumber > 0) {
                System.out.println("Число " + anyNumber + " положительное");
            } else {
                System.out.println("Число " + anyNumber + " отрицательное");
            }

            if ((anyNumber % 2) == 0) {
                System.out.println("Число " + anyNumber + " чётное");
            } else {
                System.out.println("Число " + anyNumber + " нечётное");
            }
        }
    }

    public static void printItem4() {
        int srcNum1 = 432;
        int srcNum2 = 162;
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        System.out.println("Число 1 = " + srcNum1 + "\nЧисло 2 = " + srcNum2);
        if (getHundreds(srcNum1) == getHundreds(srcNum2)) {
            System.out.println("Одинаковая цифра " + getHundreds(srcNum1) + 
                " в сотнях");
        }

        if (getTens(srcNum1) == getTens(srcNum2)) {
            System.out.println("Одинаковая цифра " + getTens(srcNum1) + 
                " в десятках");
        }

        if (getUnits(srcNum1) == getUnits(srcNum2)) {
            System.out.println("Одинаковая цифра " + getUnits(srcNum1) + 
                " в единицах");
        }
    }

    public static void printItem5() {
        char testCharVar = '\u0057';
        
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        switch(testCharVar) {
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
            System.out.println("Символ " + testCharVar + " - это число");
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
            System.out.println("Символ " + testCharVar + " - это маленькая буква");
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
            System.out.println("Символ " + testCharVar + " - это большая буква");
            break;
        default: 
            System.out.println("Символ " + testCharVar + " - это не буква и не число");
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
        System.out.println("Начисленные проценты = " + percent);
        System.out.println("Итоговая сумма = " + (sum + percent));
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