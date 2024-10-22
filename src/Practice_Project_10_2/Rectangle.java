package Practice_Project_10_2;

public class Rectangle implements Shape{
    private double _width;
    private double _height;

    private String _borderColor;
    private String _fillColor;

    public String GetBorderColor(){
        return _borderColor;
    }

    public String GetFillColor(){
        return _fillColor;
    }

    public Rectangle(double width, double height, String borderColor, String fillColor) {
        _width = width;
        _height = height;

        _borderColor = borderColor;
        _fillColor = fillColor;
    }

    @Override
    public double GetPerimeter() {
        return 2 * (_width + _height);
    }

    @Override
    public double GetArea() {
        return _width * _height;
    }
}
