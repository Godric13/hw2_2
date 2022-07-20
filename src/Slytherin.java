public class Slytherin extends Hogwarts {
    private int cunning;
    private int susceptibility;
    private int inaccessibility;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String name, int spellPower, int transgressionDistance, int cunning, int susceptibility, int inaccessibility, int resourcefulness, int lustForPower) {
        super(name, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.susceptibility = susceptibility;
        this.inaccessibility = inaccessibility;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getSusceptibility() {
        return susceptibility;
    }

    public void setSusceptibility(int susceptibility) {
        this.susceptibility = susceptibility;
    }

    public int getInaccessibility() {
        return inaccessibility;
    }

    public void setInaccessibility(int inaccessibility) {
        this.inaccessibility = inaccessibility;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return String.format("%s, Хитрость %d, Решительность %d, Амбициозность %d, Находчивость %d, Жажда влдасти %d", super.toString(), cunning, susceptibility, inaccessibility, resourcefulness, lustForPower);
    }

    private int ability() {
        return cunning + susceptibility + inaccessibility + resourcefulness + lustForPower;
    }

    public void comprareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше, чем " + slytherin.getName());
        } else if (ability1 < ability2) {
            System.out.println(getName() + " хуже, чем " + slytherin.getName());
        } else {
            System.out.println(getName() + " равен " + slytherin.getName());
        }
    }
}

