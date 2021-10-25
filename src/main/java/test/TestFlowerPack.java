package test;

import FlowerStore.Flower;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestFlowerPack {
    FlowerPack pack;
    Flower rose;

    @Before
    public void init() {
        rose = new Flower(FlowerType.Rose,   2, 30, Color.red);
        pack = new FlowerPack(rose, 101);
    }

    @Test
    public void testToString() {
        Assert.assertEquals(pack.toString(), "{flower: {type: Rose, sepal length: 2.0, " +
                "price: 30.0, color: [r=255,g=0,b=0]}, number: 101}");
    }
}
