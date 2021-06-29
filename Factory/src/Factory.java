public class Factory {
    public static void main(String[] args) {
        ShapeFactory sh = new ShapeFactory();

        // actually creating an object of Circle Class without directly calling the Circle Class
        Shape shape1 = sh.getShape("circle");
        shape1.draw();

        Shape shape2 = sh.getShape("square");
        shape2.draw();
    }
}
