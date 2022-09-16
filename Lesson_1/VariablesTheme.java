public class VariablesTheme
{

    public static void main(String[] args)
    {
        System.out.println("Пункт 1");

        byte    byteCores = 2;
        short   shortWindowsVersion = 10;
        int     intResolution = 1920;
        long    longMemory = 475000000;
        float   floatOSBundle = 19042.1526f;
        double  doubleProcGHz = 2.42;
        char    charCompanyNameFirstLetter = 'S';
        boolean boolIsNote = true;

        System.out.println("Количество ядер - " + byteCores);
        System.out.println("Версия Windows - " + shortWindowsVersion);
        System.out.println("Разрешение по горизонтали - " + intResolution);
        System.out.println("Объём занятой памяти - " + longMemory);
        System.out.println("Версия сборки системы - " + floatOSBundle);
        System.out.println("Тактовая частота процессора, ГГц - " + doubleProcGHz);
        System.out.println("Первая буква названия компании - " + charCompanyNameFirstLetter);
        System.out.println("Является ли рабочий компьютер ноутбуком? - " + boolIsNote);


        System.out.println("\nПункт 2");

        int penPrice = 100;
        int bookPrice = 200;
        int discountPercent = 11;

        float disountValue = ( ( penPrice + bookPrice ) / 100 ) * discountPercent;
        System.out.println("Сумма скидки - " + disountValue + " руб.");
        float totalSum = ( penPrice + bookPrice ) - disountValue;
        System.out.println("Общая стоимость товаров со скидкой - " + totalSum + " руб.");


        System.out.println("\nПункт 3");

        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");


        System.out.println("\nПункт 4");
        byteCores = 127;
        shortWindowsVersion = 32767;
        intResolution = 2147483647;

        System.out.println("Начальное значение переменной типа byte - " + byteCores);
        byteCores += 1;
        System.out.println("Значение переменной типа byte + 1 - " + byteCores);
        byteCores -= 1;
        System.out.println("Значение переменной типа byte - 1 - " + byteCores);

        System.out.println("Начальное значение переменной типа short - " + shortWindowsVersion);
        shortWindowsVersion += 1;
        System.out.println("Значение переменной типа short + 1 - " + shortWindowsVersion);
        shortWindowsVersion -= 1;
        System.out.println("Значение переменной типа short - 1 - " + shortWindowsVersion);

        System.out.println("Начальное значение переменной типа int - " + intResolution);
        intResolution += 1;
        System.out.println("Значение переменной типа int + 1 - " + intResolution);
        intResolution -= 1;
        System.out.println("Значение переменной типа int - 1 - " + intResolution);                
    }
}