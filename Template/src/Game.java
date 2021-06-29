public abstract class Game {
    abstract void initialize();
    abstract void startplay();
    abstract void endplay();

    public final void Play() {
        initialize();
        startplay();
        endplay();
    }
}
