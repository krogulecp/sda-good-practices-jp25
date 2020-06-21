package info.krogulec.sda.goodpractices.solid.isp;

public class TvUser {

    public static void main(String[] args) {
        Tv tv = new BasicTv();
        tv.display();

        Tv smartTv = new SmartTv();
        smartTv.display();

        InternetReady smartTvInternetReady = new SmartTv();
        smartTvInternetReady.connectToInternet();

        SmartTv smartTv1 = new SmartTv();
    }
}
