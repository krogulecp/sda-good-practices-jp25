package info.krogulec.sda.goodpractices.solid;

public class EmailSender {
    private final Email email;

    public EmailSender(Email email) {
        this.email = email;
    }

    public void send() {
        System.out.println("sending email...");
    }
}
