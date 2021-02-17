package packages;

public class DummyClass {

    static String name = "Sami";


    public static void main(String[] args) {
        System.out.println(Phone.color);

    }

    public void printPhoneColor(){

        //Creating an object of class "Phone"
        //declaration      //initialization
        Phone iPhone = new Phone();

        iPhone.color = "Black";
        iPhone.isSmartPhone = true;
        iPhone.maufacturer = "Apple";
        iPhone.memory = 512;
        iPhone.size = 9.6;


    }






}