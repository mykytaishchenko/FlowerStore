package FlowerStore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.Objects;


@AllArgsConstructor @Getter @Setter
public class Flower {
    FlowerType type;
    private double sepalLength, price;
    private Color color;

    @Override
    public String toString() {
        String str = "";
        switch (type) {
            case Rose:
                str = "{type: Rose, ";
                break;
            case Tulip:
                str = "{type: Tulip, ";
                break;
            case Chamomile:
                str = "{type: Chamomile, ";
                break;
        }
        str += "sepal length: " + sepalLength + ", price: " + price + ", color: " +
                color.toString().replaceFirst("java.awt.Color", "") + "}";
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flower)) return false;
        return Objects.equals(this.toString(), o.toString());
    }
}