public class VariablesTheme {

    public static void main(String[] args) {

        byte coresQuantity = 2;
        short windowsVersion = 10;
        int horizontalResolution = 1920;
        long remainMemory = 475000000;
        float myOsBundleVersion = 19042.1526f;
        double freqProcGhz = 2.42;
        char companyNameFirstLetter = 'S';
        boolean isNotebook = true;

        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        System.out.println("Количество ядер - " + coresQuantity);
        System.out.println("Версия Windows - " + windowsVersion);
        System.out.println("Разрешение по горизонтали - " + horizontalResolution);
        System.out.println("Объём занятой памяти - " + remainMemory);
        System.out.println("Версия сборки системы - " + myOsBundleVersion);
        System.out.println("Тактовая частота процессора, ГГц - " + freqProcGhz);
        System.out.println("Первая буква названия компании - " + companyNameFirstLetter);
        System.out.println("Является ли рабочий компьютер ноутбуком? - " + isNotebook);

        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        float discountValue = ( ( penPrice + bookPrice ) / 100 ) * discountPercent;
        float totalSum = ( penPrice + bookPrice ) - discountValue;
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        System.out.println("Сумма скидки - " + discountValue + " руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + totalSum + " руб.");

        String str1 = "   J    a  v     v  a    ";
        String str2 = "   J   a a  v   v  a a   ";
        String str3 = "J  J  aaaaa  V V  aaaaa ";
        String str4 = " JJ  a     a  V  a     a";

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        byte testByteVar = 127;
        short testShortVar = 32767;
        int testIntVar = 2147483647;

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        System.out.println("Начальное значение переменной типа byte - " + testByteVar);
        testByteVar++;
        System.out.println("Значение переменной типа byte + 1 - " + testByteVar);
        testByteVar--;
        testByteVar--;
        System.out.println("Значение переменной типа byte - 1 - " + testByteVar);
        System.out.println("Начальное значение переменной типа short - " + testShortVar);
        testShortVar++;
        System.out.println("Значение переменной типа short + 1 - " + testShortVar);
        testShortVar--;
        testShortVar--;
        System.out.println("Значение переменной типа short - 1 - " + testShortVar);
        System.out.println("Начальное значение переменной типа int - " + testIntVar);
        testIntVar++;
        System.out.println("Значение переменной типа int + 1 - " + testIntVar);
        testIntVar = testIntVar - 2;
        System.out.println("Значение переменной типа int - 1 - " + testIntVar);

        int srcNum1 = 2;
        int srcNum2 = 5;
        int swapNum;

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("Перестановка с помощью третьей переменной");
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

        char srcCharA = '#';
        char srcCharB = '&';
        char srcCharC = '@';
        char srcCharD = '^';
        char srcCharE = '_';

        System.out.println("\n6. Вывод символов и их кодов");
        System.out.println("Символ" + "\t" + "Номер в ASCII таблице");
        System.out.println(srcCharA + "\t" + (int) srcCharA);
        System.out.println(srcCharB + "\t" + (int) srcCharB);
        System.out.println(srcCharC + "\t" + (int) srcCharC);
        System.out.println(srcCharD + "\t" + (int) srcCharD);
        System.out.println(srcCharE + "\t" + (int) srcCharE);

        int srcNum = 123;

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        System.out.println("\nЧисло N = " + srcNum + " содержит:");
        System.out.println((srcNum / 100) + " сотен");
        System.out.println(((srcNum % 100) / 10) + " десятков");
        System.out.println(((srcNum % 100) % 10) + " единиц");

        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openingBracket = '(';
        char closingBracket = ')';
        str1 = "" + space + space + space + space + slash + backslash;
        str2 = "" + space + space + space + slash + space + space + backslash;
        str3 = "" + space + space + slash + underscore +openingBracket+ space + 
                closingBracket + backslash;
        str4 = "" + space + slash + space + space + space + space + space + space +
                backslash;
        String str5 = "" + slash + underscore + underscore + underscore + slash + backslash +
                underscore + underscore + space + backslash;

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        srcNum = 345;

        System.out.println("\n9. Произведение и сумма цифр числа");
        System.out.println("Число N = " + srcNum);
        System.out.println("Сумма цифр числа N = " + ((srcNum / 100) + ((srcNum % 100) / 10) + 
                ((srcNum % 100) % 10)));
        System.out.println("Произведение цифр числа N = " + ((srcNum / 100) * 
                ((srcNum % 100) / 10) * ((srcNum % 100) % 10)));


        int initSeconds = 86399;
        System.out.println("\n10. Преобразование секунд");
        System.out.println("Количество секунд = " + initSeconds);
        System.out.println("Время = " + (initSeconds / 3600) + ":" 
                + (initSeconds % 3600 / 60) + ":" + ((initSeconds% 3600) % 60));
    }
}