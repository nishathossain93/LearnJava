package oops;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation nishat = new Encapsulation();

        System.out.println(nishat.getFirstName());
        System.out.println(nishat.getLastName());
        System.out.println(nishat.getAge());
        System.out.println(nishat.getSsn());


        nishat.setFirstName("Adam");
        System.out.println(nishat.getFirstName());

    }

}
