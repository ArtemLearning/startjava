public class WolfTest {
    
    public static void main(String[] args) {
    Wolf akella = new Wolf();
    akella.name = "Акелла";
    akella.color = "Палевый";
    
    System.out.println(akella.color + " " + akella.name + " " + akella.sit());
    if (akella.hunt()) {
        akella.howl();
    }
    }
}