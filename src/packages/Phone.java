package packages;

import org.w3c.dom.ls.LSOutput;

public class Phone {

// A class is a blueprint
// Every class ahs 2 things
//         1 - States ex: A phone is a manufacture of Samsung/Apple
//         2 - Behaviors ex: phone can make a call, take a photo

    // STATES
    public static String color = "blue";
    String maufacturer;
    double size;
    int memory;
    boolean isSmartPhone;

    //Constructor - Every class has a default constructor
    //Constructors help us construct/build an object of that class

    public Phone(){

    }



    //call
    public void makeCall(){
        System.out.println("Making a Call");
    }

    //text
    public void sendText(){
        System.out.println("Texting...");
    }

    //picture
    public void takePicture(){
        System.out.println("Take a Picture");
    }

}


    // For a non-static variable/method, you must create an object of that class, in order to call it from a static method
    // For a static variable or method, we do not need to create an object to call it. We can just reference it using the class name.








