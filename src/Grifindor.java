public class Grifindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;


    public Grifindor(String name, int spellPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String toString() {
        return String.format("%s, Благородство %d, Честь %d, Xрабрость %d", super.toString(), nobility, honor, courage);
    }

    private int ability() {
        return nobility + honor + courage;
    }

    public void comprareGrifindor(Grifindor grifindor) {
        int ability1 = ability();
        int ability2 = grifindor.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше, чем " + grifindor.getName());
        } else if (ability1 < ability2) {
            System.out.println(getName() + " хуже, чем " + grifindor.getName());
        } else {
            System.out.println(getName() + " равен " + grifindor.getName());
        }
    }


}
