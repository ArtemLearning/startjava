public class WolfTest {
    
    public static void main(String[] args) {
    
    Wolf akella = new Wolf();
    akella.name = "Акелла";
    System.out.println(akella.name + " " + akella.sit());
    if (akella.hunt()) {
        akella.howl();
    }
    }
}