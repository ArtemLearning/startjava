public class VariablesTheme {

    public static void main(String[] args) {

        Item1();
        Item2();
        Item3();
        Item4();
        Item5();
        Item6();
        Item7();
        Item8();
        Item9();
        Item10();
}

        private static void Item1() {
        byte coresQuantity = 2;
        short windowsVersion = 10;
        int horizontalResolution = 1920;
        long remainMemory = 475000000;
        float myOsBundleVersion = 19042.1526f;
        double freqProcGhz = 2.42;
        char companyNameFirstLetter = 'S';
        boolean isNote = true;
        System.out.println("\nПункт 1");
        System.out.println("Количество ядер - " + coresQuantity);
        System.out.println("Версия Windows - " + windowsVersion);
        System.out.println("Разрешение по горизонтали - " + horizontalResolution);
        System.out.println("Объём занятой памяти - " + remainMemory);
        System.out.println("Версия сборки системы - " + myOsBundleVersion);
        System.out.println("Тактовая частота процессора, ГГц - " + freqProcGhz);
        System.out.println("Первая буква названия компании - " + companyNameFirstLetter);
        System.out.println("Является ли рабочий компьютер ноутбуком? - " + isNote);
        }
        
        private static void Item2() {
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;
        float discountValue = ( ( penPrice + bookPrice ) / 100 ) * discountPercent;
        float totalSum = ( penPrice + bookPrice ) - discountValue;
        System.out.println("\nПункт 2");
        System.out.println("Сумма скидки - " + discountValue + " руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + totalSum + " руб.");
        }

        private static void Item3() {
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

        private static void Item4() {
        byte byteCores = 127;
        short shortWindowsVersion = 32767;
        int intResolution = 2147483647;
        System.out.println("\nПункт 4");
        System.out.println("Начальное значение переменной типа byte - " + byteCores);
        System.out.println("Значение переменной типа byte + 1 - " + ++byteCores);
        System.out.println("Значение переменной типа byte - 1 - " + --byteCores);
        System.out.println("Начальное значение переменной типа short - " + shortWindowsVersion);
        System.out.println("Значение переменной типа short + 1 - " + ++shortWindowsVersion);
        System.out.println("Значение переменной типа short - 1 - " + --shortWindowsVersion);
        System.out.println("Начальное значение переменной типа int - " + intResolution);
        System.out.println("Значение переменной типа int + 1 - " + ++intResolution);
        System.out.println("Значение переменной типа int - 1 - " + --intResolution);
        }

        private static void Item5() {
        int two = 2;
        int five = 5;
        int swap;
        System.out.println("\nПункт 5");
        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Начальные значения переменных" + "\n" + two + "\n" + five);
        swap = two;
        two = five;
        five = swap;
        System.out.println("Конечные значения переменных" + "\n" + two + "\n" + five);
        System.out.println("\nПерестановка без помощи третьей переменной");
        System.out.println("Начальные значения переменных" + "\n" + two + "\n" + five);
        two = five + two;
        five = two - five;
        two = two - five;
        System.out.println("Конечные значения переменных" + "\n" + two + "\n" + five);
        System.out.println("\nПерестановка с помощью XOR");        
        System.out.println("Начальные значения переменных" + "\n" + two + "\n" + five);
        swap = two^five;
        two = swap^two;
        five = swap^five;
        System.out.println("Конечные значения переменных" + "\n" + two + "\n" + five);
        }

        private static void Item6() {
        char a = '#';
        char b = '&';
        char c = '@';
        char d = '^';
        char e = '_';
        System.out.println("\nПункт 6");
        System.out.println("Символ" + "\t" + "Номер в ASCII таблице");
        System.out.println(a + "\t" + (int) a);
        System.out.println(b + "\t" + (int) b);
        System.out.println(c + "\t" + (int) c);
        System.out.println(d + "\t" + (int) d);
        System.out.println(e + "\t" + (int) e);
        }

        private static void Item7() {
        int n = 123;
        int x = n / 100;
        int y = (n % 100) / 10;
        int z = (n % 100) % 10;
        System.out.println("\nПункт 7");
        System.out.println("\nЧисло N = " + n + " содержит:");
        System.out.println(x + " сотен");
        System.out.println(y + " десятков");
        System.out.println(z + " единиц");
        }

        private static void Item8() {
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

        private static void Item9() {
        int n = 345;
        int x = n / 100;
        int y = (n % 100) / 10;
        int z = (n % 100) % 10;
        System.out.println("\nПункт 9");
        System.out.println("Число N = " + n);
        System.out.println("Сумма цифр числа N = " + (x + y + z));
        System.out.println("Произведение цифр числа N = " + (x * y * z));
        }

        private static void Item10() {
        int n = 86399;
        int x = n / 3600;
        int y = (n - x * 3600) / 60;
        int z = n - ((x * 3600) + (y * 60));
        System.out.println("\nПункт 10");
        System.out.println("Количество секунд = " + n);
        System.out.println("Время = " + x + ":" + y + ":" + z);
        }
}