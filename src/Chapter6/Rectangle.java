package Chapter6;

public class Rectangle {
   private double lenght;
   private double width;

        //CONSTRUCTOR
    public Rectangle(){
        lenght = 0;
        width = 0;
    }

    public Rectangle(double lenght, double width){
        this.lenght = lenght; // can be set this way
        setWidth(width);  // or can be set this way. these are only different where to demo alternative.
    }


    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getwidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }



    public double CalculatePerimeter(){
        return (2 * lenght)+(2 * width);
    }
    public double calculateArea(){
        return lenght * width;
    }
}
