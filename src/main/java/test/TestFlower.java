package test;

import FlowerStore.Flower;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class TestFlower {
    Flower rose;

    @Before
    public void init() {
        rose = new Flower(FlowerType.Rose,   2, 30, Color.red);
    }

    @Test
    public void testToString() {
        Assert.assertEquals(rose.toString(), "{type: Rose, sepal length: 2.0, price: 30.0, color: [r=255,g=0,b=0]}");
    }
}
