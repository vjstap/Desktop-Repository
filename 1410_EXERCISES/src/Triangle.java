public class Triangle{
    //Fields
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        //Constructor that takes input values
        if(isTriangle(side1, side2, side3)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else{
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }
    }
    //Default constructor with default value 1 to provide a valid triangle
    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    //Getter method for side1
    public double getSide1(){
        return side1;
    }
    //Getter method for side2
    public double getSide2(){
        return side2;
    }
    //Getter method for side3
    public double getSide3(){
        return side3;
    }
    //Method to determine whether provided sides can make a triangle
    private boolean isTriangle(double side1, double side2, double side3){
        //Checks if sides are greater than 0
        if(side1 > 0 && side2 > 0 && side3 > 0){
            return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        } else{
            //If sides are 0 or less then provided sides aren't a triangle
            return false;
        }
    }
    //Method to determine whether triangle is equilateral
    public boolean isEquilateral(){
        return side1 == side2 && side2 == side3;
    }
    //Method to determine whether triangle is right
    public boolean isRight(){
        double hypotenuse = Math.max(side1, Math.max(side2, side3));
        double leg1, leg2;
        //Checks if each side is hypotenuse and assigns remaining sides to each leg
        if (hypotenuse == side1){
            leg1 = side2;
            leg2 = side3;
        } else if (hypotenuse == side2){
            leg1 = side1;
            leg2 = side3;
        } else {
            leg1 = side1;
            leg2 = side2;
        }
        //Returns the hypotenuse^2 - (leg1^2 + leg2^2)
        return Math.abs((hypotenuse * hypotenuse) - ((leg1 * leg1) + (leg2 * leg2))) < .1;
    }
}
