package info.krogulec.sda.goodpractices.grasp.creator;

public class Phone {
    private final Camera camera;
    private final Screen screen;

    public Phone(double megapixels, double size) {
        this.camera = new Camera(megapixels);
        this.screen = new Screen(size);
    }
}
