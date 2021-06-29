public class Template {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.Play();

        game = new Football();
        game.Play();
    }
}
