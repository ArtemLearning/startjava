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

    System.out.println("\n2 Вывод чисел в интервале (min и max) в порядке убывания");
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


    }
}