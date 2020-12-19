package d19.d2;

import java.util.Random;

public class World {

    public static void main(String[] args) {


        World world = new World();
        world.genesis();
        System.out.println("Viso sukurta zmoniu =  " + Man.getSkaitliukas());
    }

    private void genesis() {
        Random random = new Random();


// imituojame nezinoma skaiciu zmoniu sukurimo
        for (int i = 0; i < random.nextInt(1000000); i++) {
            new Man();
        }

        System.out.println("Viso sukurta zmoniu =  " + Man.skaitliukas);
    }


}
