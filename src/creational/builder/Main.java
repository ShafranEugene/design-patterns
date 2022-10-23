package creational.builder;

public class Main {
    public static void main(String[] args) {
        FreightTrain train = new FreightTrainBuilder()
                .setNetWeight(5000)
                .setOpenWagons(30)
                .setWagonWithDangerousGoods(5)
                .build();

        System.out.println(train.toString());
        //FreightTrain{netWeight=5000, openWagons=30, wagonWithDangerousGoods=5, cisterns=0, platforms=0}
    }
}
