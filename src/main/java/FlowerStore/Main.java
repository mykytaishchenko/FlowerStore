package FlowerStore;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(FlowerType.Rose, 2, 30, Color.red);
        Flower rose2 = new Flower(FlowerType.Rose, 2, 30, Color.red);

        System.out.println(rose.equals(rose2));

        System.out.println(rose);

        FlowerPack pack = new FlowerPack(rose, 101);
        System.out.println(pack);

        FlowerBucket bucket = new FlowerBucket();
        bucket.add(pack);
        bucket.add(pack);
        System.out.println(bucket.getPacks().size());

    }
}

