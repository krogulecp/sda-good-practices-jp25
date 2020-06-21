package info.krogulec.sda.goodpractices.solid;

public class Email {
    private String from;
    private String to;
    private String subject;
    private String message;

    public void send() {
        System.out.println("sending email...");
    }

    public void validate(){
        if (message.contains("abc")){
            throw new RuntimeException("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
