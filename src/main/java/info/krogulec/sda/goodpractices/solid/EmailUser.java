package info.krogulec.sda.goodpractices.solid;

public class EmailUser {

    public static void main(String[] args) {
        Email email = new Email();
        email.setFrom("a@gmail.com");
        email.setTo("b@gmail.com");
        email.setSubject("subj");
        email.setMessage("msg");

        Validator.validateEmail(email.getMessage());

        new EmailSender(email).send();
    }
}
