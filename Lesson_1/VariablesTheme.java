public class VariablesTheme {

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
        printItem10();
}

        private static void printItem1() {
        byte coresQuantity = 2;
        short windowsVersion = 10;
        int horizontalResolution = 1920;
        long remainMemory = 475000000;
        float myOsBundleVersion = 19042.1526f;
        double freqProcGhz = 2.42;
        char companyNameFirstLetter = 'S';
        boolean isNotebook = true;

        System.out.println("\nПункт 1");
        System.out.println("Количество ядер - " + coresQuantity);
        System.out.println("Версия Windows - " + windowsVersion);
        System.out.println("Разрешение по горизонтали - " + horizontalResolution);
        System.out.println("Объём занятой памяти - " + remainMemory);
        System.out.println("Версия сборки системы - " + myOsBundleVersion);
        System.out.println("Тактовая частота процессора, ГГц - " + freqProcGhz);
        System.out.println("Первая буква названия компании - " + companyNameFirstLetter);
        System.out.println("Является ли рабочий компьютер ноутбуком? - " + isNotebook);
        }
        
        private static void printItem2() {
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        float discountValue = ( ( penPrice + bookPrice ) / 100 ) * discountPercent;
        float totalSum = ( penPrice + bookPrice ) - discountValue;
        
        System.out.println("\nПункт 2");
        System.out.println("Сумма скидки - " + discountValue + " руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + totalSum + " руб.");
        }

        private static void printItem3() {
        String str1 = "   J    a  v     v  a    ";
        String str2 = "   J   a a  v   v  a a   ";
        String str3 = "J  J  aaaaa  V V  aaaaa ";
        String str4 = " JJ  a     a  V  a     a";

        System.out.println("\nПункт 3");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        }

        private static void printItem4() {
        byte testByteVar = 127;
        short testShortVar = 32767;
        int testIntVar = 2147483647;

        System.out.println("\nПункт 4");
        System.out.println("Начальное значение переменной типа byte - " + testByteVar);
        System.out.println("Значение переменной типа byte + 1 - " +
                incrementByteValue(testByteVar));
        System.out.println("Значение переменной типа byte - 1 - " + 
                decrementByteValue(testByteVar));
        System.out.println("Начальное значение переменной типа short - " + testShortVar);
        System.out.println("Значение переменной типа short + 1 - " + 
                incrementShortValue(testShortVar));
        System.out.println("Значение переменной типа short - 1 - " + 
                decrementShortValue(testShortVar));
        System.out.println("Начальное значение переменной типа int - " + testIntVar);
        System.out.println("Значение переменной типа int + 1 - " + 
                incrementIntValue(testIntVar));
        System.out.println("Значение переменной типа int - 1 - " + 
                decrementIntValue(testIntVar));
        }

        private static void printItem5() {
        int srcNum1 = 2;
        int srcNum2 = 5;
        int swapNum;

        System.out.println("\nПункт 5");
        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        swapNum = srcNum1;
        srcNum1 = srcNum2;
        srcNum2 = swapNum;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        System.out.println("\nПерестановка без помощи третьей переменной");
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        srcNum1 = srcNum2 + srcNum1;
        srcNum2 = srcNum1 - srcNum2;
        srcNum1 = srcNum1 - srcNum2;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        System.out.println("\nПерестановка с помощью XOR");        
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        swapNum = srcNum1^srcNum2;
        srcNum1 = swapNum^srcNum1;
        srcNum2 = swapNum^srcNum2;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        }

        private static void printItem6() {
        char srcCharA = '#';
        char srcCharB = '&';
        char srcCharC = '@';
        char srcCharD = '^';
        char srcCharE = '_';

        System.out.println("\nПункт 6");
        System.out.println("Символ" + "\t" + "Номер в ASCII таблице");
        System.out.println(srcCharA + "\t" + (int) srcCharA);
        System.out.println(srcCharB + "\t" + (int) srcCharB);
        System.out.println(srcCharC + "\t" + (int) srcCharC);
        System.out.println(srcCharD + "\t" + (int) srcCharD);
        System.out.println(srcCharE + "\t" + (int) srcCharE);
        }

        private static void printItem7() {
        int srcNum = 123;

        System.out.println("\nПункт 7");
        System.out.println("\nЧисло N = " + srcNum + " содержит:");
        System.out.println(getHundreds(srcNum) + " сотен");
        System.out.println(getTens(srcNum) + " десятков");
        System.out.println(getUnits(srcNum) + " единиц");
        }

        private static void printItem8() {
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openingBracket = '(';
        char closingBracket = ')';
        String str1 = "" + space + space + space + space + slash + backslash;
        String str2 = "" + space + space + space + slash + space + space + backslash;
        String str3 = "" + space + space + slash + underscore +openingBracket+ space + 
                closingBracket + backslash;
        String str4 = "" + space + slash + space + space + space + space + space + space +
                backslash;
        String str5 = "" + slash + underscore + underscore + underscore + slash + backslash +
                underscore + underscore + space + backslash;

        System.out.println("\nПункт 8");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        }

        private static void printItem9() {
        int srcNum = 345;

        System.out.println("\nПункт 9");
        System.out.println("Число N = " + srcNum);
        System.out.println("Сумма цифр числа N = " + (getHundreds(srcNum) + getTens(srcNum) + 
                getUnits(srcNum)));
        System.out.println("Произведение цифр числа N = " + (getHundreds(srcNum) * 
                getTens(srcNum) * getUnits(srcNum)));
        }

        private static void printItem10() {
        int initSeconds = 86399;

        System.out.println("\nПункт 10");
        System.out.println("Количество секунд = " + initSeconds);
        System.out.println("Время = " + getHours(initSeconds) + ":" 
                + getMinutes(initSeconds) + ":" + getSeconds(initSeconds));
        }

        private static byte incrementByteValue(byte value) {
            return ++value;
        }

        private static byte decrementByteValue(byte value) {
            return --value;
        }

        private static short incrementShortValue(short value) {
            return ++value;
        }

        private static short decrementShortValue(short value) {
            return --value;
        }

        private static int incrementIntValue(int value) {
            return ++value;
        }

        private static int decrementIntValue(int value) {
            return --value;
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

        private static int getHours(int seconds) {
            return seconds / 3600;
        }

        private static int getMinutes(int seconds) {
            return seconds % 3600 / 60;
        }
        
        private static int getSeconds(int seconds) {
            return (seconds % 3600) % 60;
        }        
}