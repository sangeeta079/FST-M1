package Activities;

public class Car {
    String sColor;
    String sTransmission;
    int iMake;
    int iTyres;
    int iDoors;

    // Contractor
    Car(){
        iTyres = 4;
        iDoors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("Color of the car: "+ sColor);
        System.out.println("Make of the Car: " + iMake);
        System.out.println("Number of Doors: "+ iDoors);
        System.out.println("Number of Tyres: "+ iTyres);
        System.out.println("Transmission of the Car: "+ sTransmission);
    }

    public void accelerate(){
       System.out.println("Car is moving forward.");
    }

    public void brake(){
        System.out.println("Car has stopped.");
    }

}
