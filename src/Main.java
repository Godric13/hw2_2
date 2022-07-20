public class Main {
    public static void main(String[] args) {
        Grifindor harry = new Grifindor("Harry", 10, 10, 12, 13, 44);
        Grifindor germiona = new Grifindor("Germiona", 14, 15, 16, 17, 18);
        Hufflepuff studentHufflepuff = new Hufflepuff("studentHufflepuff", 10, 5, 21,22, 23);
        Ravenclaws studentRavenclaws = new Ravenclaws("studentRavenclaws", 11, 15, 16, 17, 18, 21);
        Slytherin studentSlytherin = new Slytherin("studentSlytherin", 10, 10, 16, 17, 18, 22, 22);

        harry.print();
        germiona.print();
        studentHufflepuff.print();
        studentRavenclaws.print();
        studentSlytherin.print();

        harry.comprareGrifindor(germiona);
        harry.comprareHogwarts(germiona);
        harry.comprareHogwarts(studentHufflepuff);
        harry.comprareHogwarts(studentSlytherin);


    }
}