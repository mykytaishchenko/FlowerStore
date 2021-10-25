package FlowerStore;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor @Getter
public class FlowerBucket {
    List<FlowerPack> packs;

    public double getPrice() {
        int price = 0;
        for (FlowerPack pack : packs) price += pack.getPrice();
        return price;
    }

    public void add(FlowerPack newPack) {
        packs.add(newPack);
    }

    public FlowerBucket() {
        packs = new ArrayList<FlowerPack>();
    }
}
