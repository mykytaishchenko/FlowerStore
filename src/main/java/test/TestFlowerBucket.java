package test;

import FlowerStore.Flower;
import FlowerStore.FlowerBucket;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestFlowerBucket {
    Flower rose;
    FlowerPack pack;
    FlowerBucket bucket;

    @Before
    public void init() {
        rose = new Flower(FlowerType.Rose,   2, 30, Color.red);
        pack = new FlowerPack(rose, 101);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(bucket.getPacks().size(), 0);
        bucket.add(pack);
        Assert.assertEquals(bucket.getPacks().size(), 1);
    }
}
