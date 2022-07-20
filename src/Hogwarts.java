public abstract class Hogwarts {
    private String name;
    private int spellPower;
    private int transgressionDistance;

    public Hogwarts(String name, int spellPower, int transgressionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String toString() {
        return String.format("Имя %s; Сила магии %d; Расстояние трансгресии %d", name, spellPower, transgressionDistance);
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return spellPower + transgressionDistance;
    }

    public void comprareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше, чем " + hogwarts.getName());
        } else if (ability1 < ability2) {
            System.out.println(getName() + " хуже, чем " + hogwarts.getName());
        } else {
            System.out.println(getName() + " равен " + hogwarts.getName());
        }


    }
}
