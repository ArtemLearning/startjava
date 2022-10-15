public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 32;
        boolean isMale = false;
        float height = 1.92f;
        char firstLetter = "Maxine".charAt(0);

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
        if (firstLetter == 'M') {
            System.out.println("Предложить именную ложку на букву М");
        } else if (firstLetter == 'I') {
            System.out.println("Предложить именную футболку");
        } else {
            System.out.println("Предложить общие вещи");
        }

        System.out.println("\n2. Поиск max и min числа");
        int srcNum1 = 13;
        int srcNum2 = 11;

        if (srcNum1 > srcNum2) {
            System.out.println("Первое число " +
                srcNum1 + " больше второго числа " + srcNum2);
        } else if (srcNum1 < srcNum2) {
            System.out.println("Второе число " + srcNum2 + " больше первого числа " + srcNum1);
        } else {
            System.out.println("Числа " + srcNum1 + " и " + srcNum2 + "равны");
        }

        System.out.println("\n3. Работа с числом");
        int anyNumber = 65;

        if (anyNumber == 0) {
            System.out.println("Число " + anyNumber + " пустое");
        } else { 
            if (anyNumber > 0) {
                System.out.println("Число " + anyNumber + " положительное");
            } else if (anyNumber < 0) {
                System.out.println("Число " + anyNumber + " отрицательное");
            }
            if (anyNumber % 2 == 0) {
                System.out.println("Число " + anyNumber + " чётное");
            } else {
                System.out.println("Число " + anyNumber + " нечётное");
            }        
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        srcNum1 = 432;
        srcNum2 = 162;

        System.out.println("Число 1 = " + srcNum1 + "\nЧисло 2 = " + srcNum2);
        if ((srcNum1 / 100) == (srcNum2 / 100)) {
            System.out.println("Одинаковая цифра " + (srcNum1 / 100) + " в сотнях");
        }
        if (((srcNum1 % 100) / 10) == ((srcNum2 % 100) / 10)) { 
            System.out.println("Одинаковая цифра " + ((srcNum1 % 100) / 10) + " в десятках");
        }
        if ((srcNum1 % 10) == (srcNum2 % 10)) {
            System.out.println("Одинаковая цифра " + (srcNum1 % 10) + " в единицах");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char testCharVar = '\u0057';

        if(testCharVar >= '0' && testCharVar <= '9') {
            System.out.println("Символ " + testCharVar + " - это цифра");
        } else if (testCharVar >= 'a' && testCharVar <= 'z') {
            System.out.println("Символ " + testCharVar + " - это маленькая буква");
        } else if (testCharVar >= 'A' && testCharVar <= 'Z') {
            System.out.println("Символ " + testCharVar + " - это большая буква");
        } else {
            System.out.println("Символ " + testCharVar + " - это не буква и не цифра");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        float sum = 300000f;
        float percent;

        if (sum <= 100000) {
            percent = sum * 0.05f;
        } else if (sum > 100000 && sum <= 300000) {
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

        System.out.println("Оценка\t" + "Предмет");
        System.out.println(historyMark + "\tИстория");
        System.out.println(developmentMark + "\tПрограммирование");
        middleMark = (historyMark + developmentMark) / 2;
        System.out.println("Средний балл оценок - " + middleMark);
        middlePercent = (historyPercent + developmentPercent) / 2;
        System.out.println("Средний процент - " + middlePercent + "%");

        System.out.println("\n8. Расчет прибыли");
        int rentPrice = 5000;
        int productPrimeCost = 9000;
        int productCost = 13000;
        int yearPrice;
        char sign = ' ';

        yearPrice = (productCost * 12) - ((productPrimeCost * 12) + (rentPrice * 12));
        if (yearPrice > 0) {
            sign = '+'; 
        }
        System.out.println("Прибыль за год: " + sign + yearPrice);

        System.out.println("\n9. Подсчет количества банкнот");
        int cashNeeded = 567;
        int hundreds;
        int tens;
        int ones;

        hundreds = cashNeeded / 100;
        tens = (cashNeeded % 100) / 10;
        ones = (cashNeeded % 100) % 10;
    
        if (tens > 5) {
            ones = ones + (tens - 5) * 10;
            tens = 5;
        }

        System.out.println("Номинал \t" + "Количество");
        System.out.println("Сотни   \t" + hundreds);
        System.out.println("Десятки \t" + tens);
        System.out.println("Единицы \t" + ones);
        System.out.println("Исходная сумма = " + ((hundreds * 100) + (tens * 10) + ones));
        }
}