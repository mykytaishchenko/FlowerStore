package FlowerStore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class FlowerPack {
    Flower flower;
    int number;

    public double getPrice() {
        return (this.flower.getPrice() * this.number);
    }

    @Override
    public String toString() {
        return "{flower: " + flower.toString() + ", number: " + number + "}";
    }
}
