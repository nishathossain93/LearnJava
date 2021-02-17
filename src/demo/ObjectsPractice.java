package demo;

public class ObjectsPractice {

    String manufacturer;
    String model;
    int numOfWheels;
    int horsepower;
    static String typeOfVehicle;


    void turnLeft(){
        System.out.println("Turning Left");
    }

    void turnRight(){
        System.out.println("Turning Right");
    }

    void accelerate(){
        System.out.println("Accelerating");

    }
    void brake(){
        System.out.println("Braking");
    }

    public static void main(String[] args) {
        ObjectsPractice hondaAccord = new ObjectsPractice();
        ObjectsPractice nissanMaxima = new ObjectsPractice();

       // new ObjectsPractice().accelerate();
       // hondaAccord.turnRight();


        hondaAccord.manufacturer = "Honda";
        hondaAccord.model = "Accord";
        hondaAccord.numOfWheels = 4;
        hondaAccord.horsepower = 180;
        ObjectsPractice.typeOfVehicle = "motorcycle";
        ObjectsPractice.typeOfVehicle = "car";


        nissanMaxima.manufacturer = "Nissan";
        nissanMaxima.model = "Maxima";
        nissanMaxima.numOfWheels = 4;
        nissanMaxima.horsepower = 185;

//        System.out.println(hondaAccord.manufacturer);
//        System.out.println(nissanMaxima.manufacturer);
//
//        hondaAccord.accelerate();
//        hondaAccord.brake();

        System.out.println(hondaAccord);
        System.out.println(nissanMaxima);


    }
}

