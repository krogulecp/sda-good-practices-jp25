package info.krogulec.sda.goodpractices.solid.isp;

public class SmartTv implements Tv,InternetReady {
    @Override
    public void display() {
        System.out.println("Smart Tv displays");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Smart Tv connects to internet");
    }
}
