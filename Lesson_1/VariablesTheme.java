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



    }
}