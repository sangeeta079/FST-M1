package Activities;

public class Activity1 {
    public static void main(String[] args){
        Car Tiago = new Car();
        Tiago.sColor = "Black";
        Tiago.iMake = 2014;
        Tiago.sTransmission = "Manual";

        Tiago.displayCharacteristics();
        Tiago.accelerate();
        Tiago.brake();

    }

}
