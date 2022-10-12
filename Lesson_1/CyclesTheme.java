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

    System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
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

    System.out.println("\n\n5. Проверка количества единиц на четность");
    testVar = 3141591;
    int digit;
    iterator = 0;

    while (testVar > 0) {
        digit = testVar % 10;
        if (digit == 1) {
            iterator++;
        }
        testVar = testVar / 10;
    }
    if (iterator % 2 == 0) {
        System.out.println("Количество единиц = " + iterator + " чётное");
    } else {
        System.out.println("Количество единиц = " + iterator + " нечётное");
    }

    System.out.println("\n6. Отображение фигур в консоли\n");
    int j;
    for (i = 0; i < 5; i++ ) {
        for (j=0; j < 10; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    System.out.print("\n");
    i = 5;
    while (i <= 5 && i > 0) {
        j = 0;
        while (j < i) {
            System.out.print("#");
            j++;
        }
        System.out.print("\n");
        i--;        
    }

    System.out.print("\n");
    i = 5;
    do {
        if (i % 2 == 0) {
            j = 2;            
        } else if (i % 3 == 0) {
            j = 3;
        } else {
            j = 1;
        }
        do {
            System.out.print("$");
            j--;
        } while (j > 0);
        System.out.print("\n");
        i--;
    } while (i <= 5 && i > 0);

    System.out.println("\n7. Отображение ASCII-символов");
    char digitAsText;
    System.out.println("Dec\t" + "Char");
    for (i = 0; i <= 47; i++) {
        if (i % 2 != 0) {
            digitAsText = (char) i;
            System.out.printf("%3d\t%4c\n",i,digitAsText);
        }
    }
    for (i=97 ;i < 123; i++ ) {
        if (i % 2 == 0) {
            digitAsText = (char) i;
            System.out.printf("%3d\t%4c\n",i,digitAsText);
        }
    }

    System.out.println("\n8. Проверка, является ли число палиндромом");
    testVar2 = testVar1 = 1234321;
    int digit1 = 0;
    int digit2 = 0;
    int digit3 = 0;
    int digit4 = 0;
    int digit5 = 0;
    int digit6 = 0;
    int digit7 = 0;

    iterator = 0;
    while (testVar1 > 0) {
        switch (iterator) {
            case 0: {
                digit7 = testVar1 % 10;
            }
            case 1:{
                digit6 = testVar1 % 10;
            }
            case 2:{
                digit5 = testVar1 % 10;
            }         
            case 3:{
                digit4 = testVar1 % 10;
            }
            case 4:{
                digit3 = testVar1 % 10;
            }
            case 5:{
                digit2 = testVar1 % 10;
            }
            case 6:{
                digit1 = testVar1 % 10;
            }
        }
                testVar1 = testVar1 / 10;
                iterator++;
    }
    if (digit1 == digit7 && digit2 == digit6 && digit3 == digit5) {
        System.out.println("Число " + testVar2 + " является палиндромом");
    } else {
        System.out.println("Число " + testVar2 + " не является палиндромом");
    }

    System.out.println("\n9. Определение, является ли число счастливым");
    testVar1 = testVar = 442622;

    iterator = 0;
    while (testVar > 0) {
        switch (iterator) {
            case 0: {
                digit6 = testVar % 10;
            }
            case 1:{
                digit5 = testVar % 10;
            }
            case 2:{
                digit4 = testVar % 10;
            }         
            case 3:{
                digit3 = testVar % 10;
            }
            case 4:{
                digit2 = testVar % 10;
            }
            case 5:{
                digit1 = testVar % 10;
            }
        }
                testVar = testVar / 10;
                iterator++;
    }
        System.out.println("Сумма цифр " + digit1 + "" + digit2 + "" + digit3 + " = " + 
            (digit1 + digit2 + digit3));
        System.out.println("Сумма цифр " + digit4 + "" + digit5 + "" + digit6 + " = " + 
            (digit4 + digit5 + digit6));

    if (digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
        System.out.println("Число " + testVar1 + " - cчастливое");
    } else {
        System.out.println("Число " + testVar1 + " - неcчастливое");
    }

    System.out.println("\n10. Вывод таблицы умножения Пифагора");
    System.out.println("\t\tТАБЛИЦА \t ПИФАГОРА");
    System.out.printf("  |\t");
    for (i=2; i < 10 ; i++) {
    System.out.printf("%2d\t", i);
    }
    System.out.printf("\n");
    System.out.println("-------------------------------------------------------------------");
    for (i=2; i < 10 ; i++) {
        System.out.printf("%2d\t", i);
        for (j=2; j < 10; j++) {
            System.out.printf("%2d\t", i * j);
        }
        System.out.printf("\n");
    }

    }
}