package ultraemojicombat;

public class Main {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];

        l [0] = new Lutador ("prettyBoy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l [1] = new Lutador("putScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l [2] = new Lutador("snapShadow", "Eua", 35, 1.65f, 80.9f, 12, 2, 1);
        l [3] = new Lutador("deadCode", "Austria", 28, 1.93f, 81.6f, 13, 0, 2);
        l [4] = new Lutador("ufoCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l [5] = new Lutador("nerdArd", "Eua", 30, 1.81f, 105.7f, 12, 2, 4);



        Luta UEC01 = new Luta();
        UEC01.marcarluta(l[1], l[5]);
        UEC01.lutar();
    }
}