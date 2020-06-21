package info.krogulec.sda.goodpractices.solid.srp;

public class Validator {

    public static void validateEmail(String message){
        if (message.contains("abc")){
            throw new RuntimeException("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}
