package info.krogulec.sda.goodpractices.designpatterns.decorator;

public class BookUser {

    public static void main(String[] args) {

        Book basicBook = new BasicBook();
        System.out.println("Result: " + basicBook.describe());

        Book scienceBook = new ScienceBookDecorator(basicBook);
        System.out.println("Result II: " + scienceBook.describe());

        Book fancyBook = new FictionBookDecorator(scienceBook);
        System.out.println("Result III: " + fancyBook.describe());

        Book p = new ScienceBookDecorator(new FictionBookDecorator(new BasicBook()));
    }
}
