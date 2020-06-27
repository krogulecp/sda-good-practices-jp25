package info.krogulec.sda.goodpractices.designpatterns.builder;

public class PersonUser {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .setName("Jan")
                .setSurname("Kowalski")
                .setAge(22)
                .build();

        new Person.Builder()
                .build();
    }
}
