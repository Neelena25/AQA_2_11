package Practice_Project_10_2;

public class Triangle implements Shape{
    private double _side1;
    private double _side2;
    private double _side3;

    private String _borderColor;
    private String _fillColor;

    public String GetBorderColor(){
        return _borderColor;
    }

    public String GetFillColor(){
        return _fillColor;
    }

    public Triangle(double side1, double side2, double side3, String borderColor, String fillColor){
        _side1 = side1;
        _side2 = side2;
        _side3 = side3;

        _borderColor = borderColor;
        _fillColor = fillColor;
    }

    @Override
    public double GetPerimeter() {
        return _side1 + _side2 + _side3;
    }

    @Override
    public double GetArea() {
        double s = GetPerimeter() / 2;
        return Math.sqrt(s * (s - _side1) * (s - _side2) * (s - _side3));
    }
}
