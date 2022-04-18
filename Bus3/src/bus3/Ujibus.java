package bus3;
import bus3.Bus3;
public class Ujibus {
    public static void main(String[] args) {
        Bus3 busMini=new Bus3 (10);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.getAverage(77);
}
}
