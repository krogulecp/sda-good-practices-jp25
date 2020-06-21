package info.krogulec.sda.goodpractices.solid.srp;

public class EmailValidator {

    private final String message;

    public EmailValidator(String message) {
        this.message = message;
    }

    public void validate(){
        if (message.contains("abc")){
            throw new RuntimeException("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}
