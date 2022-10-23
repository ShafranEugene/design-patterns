package creational.builder;

public class FreightTrainBuilder {
    private int netWeight;
    private int openWagons;
    private int wagonWithDangerousGoods;
    private int cisterns;
    private int platforms;

    public FreightTrain build(){
        return new FreightTrain(netWeight,openWagons,wagonWithDangerousGoods,cisterns,platforms);
    }

    public FreightTrainBuilder setNetWeight(int netWeight) {
        this.netWeight = netWeight;
        return this;
    }

    public FreightTrainBuilder setOpenWagons(int openWagons) {
        this.openWagons = openWagons;
        return this;
    }

    public FreightTrainBuilder setWagonWithDangerousGoods(int wagonWithDangerousGoods) {
        this.wagonWithDangerousGoods = wagonWithDangerousGoods;
        return this;
    }

    public FreightTrainBuilder setCisterns(int cisterns) {
        this.cisterns = cisterns;
        return this;
    }

    public FreightTrainBuilder setPlatforms(int platforms) {
        this.platforms = platforms;
        return this;
    }

}
