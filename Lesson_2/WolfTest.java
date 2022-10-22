public class WolfTest {
    
    public static void main(String[] args) {
        Wolf akella = new Wolf();

        akella.setName("Акелла");
        akella.setColor("Серый");
        System.out.println(akella.getColor() + " " + akella.getName() + " " + akella.sit());

        if (akella.hunt()) {
            akella.howl();
        }

        akella.setIsMale(true);
        if (akella.getIsMale()) {
            System.out.println(akella.getName() + " - самец");
        } else {
            System.out.println(akella.getName() + " - самка");
        }

        akella.setName("Акеллы");
        akella.setAge(3);
        System.out.println("Возраст " + akella.getName() + " = " + akella.getAge());
        akella.setWeight(25);
        System.out.println("Вес " + akella.getName() + " = " + akella.getWeight());
        System.out.println("Цвет " + akella.getName() + " - " + akella.getColor());
    }
}