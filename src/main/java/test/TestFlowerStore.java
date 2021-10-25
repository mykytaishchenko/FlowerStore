package test;

import FlowerStore.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;

public class TestFlowerStore {
    FlowerPack pack1, pack2;
    Flower rose;
    FlowerBucket bucket;
    Store store;

    @Before
    public void init() {
        rose = new Flower(FlowerType.Rose,   2, 30, Color.red);

        pack1 = new FlowerPack(rose, 101);
        pack2 = new FlowerPack(rose, 2);

        bucket = new FlowerBucket();
        bucket.add(pack1);
        bucket.add(pack2);

        store = new Store();
        store.add(bucket);
    }

    @Test
    public void testSearch() {
        Assert.assertEquals(store.search(rose).size(), 2);
        Assert.assertEquals(store.search(new Flower(FlowerType.Tulip, 1, 1, Color.yellow)).size(), 0);
    }
}
