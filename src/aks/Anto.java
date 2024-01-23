package aks;

public class Anto {
    private String име;
    private String ранг;
    private int возраст;

    public Anto(String име, String ранг, int возраст) {
        this.име = име;
        this.ранг = ранг;
        this.возраст = возраст;
    }

    public void извршиЗадача() {
        System.out.println(име + " извршува задача!");
    }

    public static void main(String[] args) {
        Anto vojnik = new Anto("Јован", "Капетан", 30);
        vojnik.извршиЗадача();
    }
}
