public class Hund {

    int gewicht, posX, posY;

    void gibLaut(int anzahl){
        for (int i = 0; i < anzahl; i++) {
            gibLautNachGewicht();
        }
    }

    void gibLautNachGewicht(){
        if (gewicht < 5) {
            System.out.println("Kl\u00e4ff");
        }
        else {
            System.out.println("Wuff");
        }
    }

    void move(){
        posX++;
        posY++;
    }

}
