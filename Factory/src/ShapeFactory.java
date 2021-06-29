public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null)return null;
        if(shapeType=="circle")return new Circle();
        if(shapeType=="square")return new Square();
        return null;
    }
}