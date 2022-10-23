package creational.builder;

public class FreightTrain {
    private final int netWeight;

    private final int openWagons;
    private final int wagonWithDangerousGoods;
    private final int cisterns;
    private final int platforms;

    public FreightTrain(int netWeight, int openWagons, int wagonWithDangerousGoods, int cisterns, int platforms) {
        this.netWeight = netWeight;
        this.openWagons = openWagons;
        this.wagonWithDangerousGoods = wagonWithDangerousGoods;
        this.cisterns = cisterns;
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "FreightTrain{" +
                "netWeight=" + netWeight +
                ", openWagons=" + openWagons +
                ", wagonWithDangerousGoods=" + wagonWithDangerousGoods +
                ", cisterns=" + cisterns +
                ", platforms=" + platforms +
                '}';
    }
}
