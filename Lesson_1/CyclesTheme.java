public class CyclesTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int odds = 0;
        int evens = 0;

        do {
            if (i % 2 == 0) {
                evens = evens + i;
            } else {
                odds = odds + i;
            }
        i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evens + 
            ", а нечетных = " + odds);

    System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
    int testVar1 = 10;
    int testVar2 = 5;
    int testVar3 = -1;
    int min = 0;
    int max = 0;

    if (testVar1 >= testVar2 ) {
        max = testVar1;
        min = testVar2;
    } else {
        max = testVar2;
        min = testVar1;
    }
    if (max < testVar3) {
        max = testVar3;
    }
    if (min > testVar3) {
        min = testVar3;
    }
    for (i = max; i >= min; i--) {
        System.out.print(i + " ");
    }

    System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
    int testVar = 1234;
    int thousands = 0;
    int hundreds = 0;
    int tens = 0;
    int units = 0;

    while(testVar > 0) {
        thousands = testVar / 1000;
        hundreds = (testVar % 1000) / 100;
        tens = ((testVar % 1000) % 100) / 10;
        units = ((testVar % 1000) % 100) % 10;
        testVar = testVar - (thousands * 1000 + hundreds * 100 + tens * 10 + units);
        }
    System.out.println("Число в обратном порядке = " + units + "" + tens + "" + hundreds + 
        "" + thousands);
    System.out.println("Сумма цифр числа = " + (thousands + hundreds + tens + units));

    System.out.println("\n4. Вывод чисел на консоль в несколько строк");
    max = 24;
    int iterator = 0;
    String outputFormat;

    for (i =1; i < 24; i = i + 2) {
        if (iterator == 5)  {
            outputFormat = "%n%2d ";
            iterator = 1;
        } else {
            iterator++;
            outputFormat = "%2d ";
        }
        System.out.printf(outputFormat, i);
    }
    do {
        System.out.printf("%2d ", 0);
        iterator++;
    } while (iterator < 5);

    }
}