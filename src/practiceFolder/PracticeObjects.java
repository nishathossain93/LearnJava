package practiceFolder;

public class PracticeObjects {

    double screenSize;
    String color;
    String manufacturer;
    static int ram;

    void displayOn(){
        System.out.println("Power is On");

    }

    void speaker(){
        System.out.println("Music sound quality is good");
    }

    public static void main(String[] args) {
        PracticeObjects laptop = new PracticeObjects();

        PracticeObjects.ram = 8;

        laptop.color = "white";
        laptop.manufacturer = "Acer";
        laptop.screenSize = 15.6;





    }


}

