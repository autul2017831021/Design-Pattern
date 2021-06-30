public class Main {
    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Directory music = new Directory("Music");
        Directory megadeth = new Directory("Megadeth");
        Directory metallica = new Directory("Metallica");
        Directory rust_in_piece = new Directory("Rust in Piece");
        Directory peace_sells = new Directory("Peace Sells but Who's Buying");

        /// Creating Directory for Megadeth
        File s1 = new File("Holy Wars....");
        File s2 = new File("Tornado of Souls");
        File s3 = new File("Hanger 18");

        File s4 = new File("The Conjuring");
        File s5 = new File("Wake Up Dead");
        File s6 = new File("Good Mourning");

        rust_in_piece.add(s1);
        rust_in_piece.add(s2);
        rust_in_piece.add(s3);

        peace_sells.add(s3);
        peace_sells.add(s4);
        peace_sells.add(s5);

        megadeth.add(peace_sells);
        megadeth.add(rust_in_piece);

        megadeth.ls();

        /// Done Creating Directory for Megadeth


        File t1 = new File("Jump in the fire");
        File t2 = new File("Harvester of sorrow");
        File t3 = new File("My friend of misery");

        metallica.add(t1);
        metallica.add(t2);
        metallica.add(t3);

        metallica.ls();

    }
}
