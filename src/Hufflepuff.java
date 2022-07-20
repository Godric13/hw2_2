public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int spellPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, spellPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        return String.format("%s, Трудолюбие %d, Верность %d, Честь %d", super.toString(), hardworking, loyal, honest);
    }

    private int ability() {
        return hardworking + loyal + honest;
    }

    public void comprareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше, чем " + hufflepuff.getName());
        } else if (ability1 < ability2) {
            System.out.println(getName() + " хуже, чем " + hufflepuff.getName());
        } else {
            System.out.println(getName() + " равен " + hufflepuff.getName());
        }
    }
}
