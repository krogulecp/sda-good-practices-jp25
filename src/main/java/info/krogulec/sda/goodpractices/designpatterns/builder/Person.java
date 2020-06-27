package info.krogulec.sda.goodpractices.designpatterns.builder;


public class Person {

    private String name;
    private String surname;
    private int age;
    private String bloodType;
    private String hairColor;
    private String sex;

    private Person(){}

    static class Builder{
        private Person person = new Person();

        public Builder setName(String name) {
            person.name = name;
            return this;
        }

        public Builder setSurname(String surname){
            person.surname = surname;
            return this;
        }

        public Builder setAge(int age){
            person.age = age;
            return this;
        }

        public Builder setBloodType(String bloodType){
            person.bloodType = bloodType;
            return this;
        }

        public Builder setHairColor(String hairColor) {
            person.hairColor = hairColor;
            return this;
        }

        public Builder setSex(String sex){
            person.sex = sex;
            return this;
        }

        public Person build(){
            return person;
        }
    }


}
