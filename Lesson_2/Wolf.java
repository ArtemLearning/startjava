public class Wolf {
    boolean isMale;
    String name;
    int weight;
    int age;
    String color;

    String walk() {
        return "идёт";
    }

    String sit() {
        return "сидит";
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void howl() {
        System.out.println(name + " воет");
    }

    boolean hunt() {
        System.out.println(name + " охотится");
        return true;
    }
}