package Practice_Project_10_2;

public class Circle implements Shape{
    private double _radius;

    private String _borderColor;
    private String _fillColor;

    public String GetBorderColor(){
        return _borderColor;
    }

    public String GetFillColor(){
        return _fillColor;
    }

    public Circle(double radius, String borderColor, String fillColor){
        _radius = radius;

        _borderColor = borderColor;
        _fillColor = fillColor;
    }


    @Override
    public double GetPerimeter() {
        return 2 * _radius;
    }

    @Override
    public double GetArea() {
        return _radius * _radius;
    }
}
