import java.util.concurrent.TimeUnit;

public class HundeDressur {
    public static void main(String[] args) {

        Hund fido = new Hund();
        Hund bello = new Hund();

        fido.gewicht = 4;
        fido.posX = 2;
        fido.posY = 4;

        bello.gewicht = 12;
        bello.posX = 3;
        bello.posY = 7;

        for (int i = 0; i < 10; i++) {
            System.out.println("Fido ist " + fido.gewicht + " kg schwer.");
            System.out.println("Bello ist " + bello.gewicht + " kg schwer.");
            fido.gibLaut();
            bello.gibLaut();

            fido.move();
            System.out.println("Fido befindet sich an der Position " + fido.posX + ":" + fido.posY);

            bello.move();
            System.out.println("Fido befindet sich an der Position " + fido.posX + ":" + fido.posY);
            System.out.println("---------------------------------------------");
            System.out.println();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
