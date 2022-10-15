public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte coresQuantity = 2;
        short windowsVersion = 10;
        int horizontalResolution = 1920;
        long remainMemory = 475000000;
        float myOsBundleVersion = 19042.1526f;
        double freqCpuGhz = 2.42;
        char companyNameFirstLetter = 'S';
        boolean isNotebook = true;

        System.out.println("Количество ядер - " + coresQuantity);
        System.out.println("Версия Windows - " + windowsVersion);
        System.out.println("Разрешение по горизонтали - " + horizontalResolution);
        System.out.println("Объём занятой памяти - " + remainMemory);
        System.out.println("Версия сборки системы - " + myOsBundleVersion);
        System.out.println("Тактовая частота процессора, ГГц - " + freqCpuGhz);
        System.out.println("Первая буква названия компании - " + companyNameFirstLetter);
        System.out.println("Является ли рабочий компьютер ноутбуком? - " + isNotebook);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        float amountDiscount = ((penPrice + bookPrice) / 100) * discountPercent;
        float discountPrice = (penPrice + bookPrice) - amountDiscount;

        System.out.println("Сумма скидки - " + amountDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + discountPrice + " руб.");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        String str1 = "   J    a  v     v  a    ";
        String str2 = "   J   a a  v   v  a a   ";
        String str3 = "J  J  aaaaa  V V  aaaaa ";
        String str4 = " JJ  a     a  V  a     a";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;

        System.out.println("Начальное значение переменной типа byte - " + byteMax);
        System.out.println("Значение переменной типа byte + 1 - " + ++byteMax);
        byteMax = 127;
        System.out.println("Значение переменной типа byte - 1 - " + --byteMax);
        System.out.println("Начальное значение переменной типа short - " + shortMax);
        System.out.println("Значение переменной типа short + 1 - " + ++shortMax);
        shortMax = 32767;
        System.out.println("Значение переменной типа short - 1 - " + --shortMax);
        System.out.println("Начальное значение переменной типа int - " + intMax);
        System.out.println("Значение переменной типа int + 1 - " + ++intMax);
        intMax = 2147483647;
        System.out.println("Значение переменной типа int - 1 - " + --intMax);

        System.out.println("\n5. Перестановка значений переменных");
        int srcNum1 = 2;
        int srcNum2 = 5;
        int buffer = srcNum1;

        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        srcNum1 = srcNum2;
        srcNum2 = buffer;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        System.out.println("\nПерестановка без помощи третьей переменной");
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        srcNum1 += srcNum2;
        srcNum2 = srcNum1 - srcNum2;
        srcNum1 -= srcNum2;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        System.out.println("\nПерестановка с помощью XOR");        
        System.out.println("Начальные значения переменных\n" + srcNum1 + "\n" + srcNum2);
        srcNum1 ^= srcNum2;
        srcNum2 ^= srcNum1;
        srcNum1 ^= buffer;
        System.out.println("Конечные значения переменных\n" + srcNum1 + "\n" + srcNum2);

        System.out.println("\n6. Вывод символов и их кодов");
        char charA = '#';
        char charB = '&';
        char charC = '@';
        char charD = '^';
        char charE = '_';

        System.out.println("Символ\t" + "Номер в ASCII таблице");
        System.out.println(charA + "\t" + (int) charA);
        System.out.println(charB + "\t" + (int) charB);
        System.out.println(charC + "\t" + (int) charC);
        System.out.println(charD + "\t" + (int) charD);
        System.out.println(charE + "\t" + (int) charE);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;

        System.out.println("\nЧисло N = " + srcNum + " содержит:");
        System.out.println((srcNum / 100) + " сотен");
        System.out.println(((srcNum % 100) / 10) + " десятков");
        System.out.println((srcNum % 10) + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openingBracket = '(';
        char closingBracket = ')';

        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underscore +openingBracket+ space + 
                closingBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space +
                backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + 
                slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        srcNum = 345;
        int hundreds = srcNum / 100;
        int tens = ((srcNum % 100) / 10);
        int ones = srcNum % 10;

        System.out.println("Число N = " + srcNum);
        System.out.println("Сумма цифр числа N = " + (hundreds + tens + ones));
        System.out.println("Произведение цифр числа N = " + (hundreds * tens * ones));

        System.out.println("\n10. Преобразование секунд");
        int initSeconds = 86399;
        
        System.out.println("Количество секунд = " + initSeconds);
        System.out.println("Время = " + (initSeconds / 3600) + ":" 
                + (initSeconds % 3600 / 60) + ":" + (initSeconds % 60));
    }
}