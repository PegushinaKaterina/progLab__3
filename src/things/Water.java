package things;

import place.Place;

import java.util.Objects;

public class Water extends Things {
    WaterCondition waterCondition = WaterCondition.WATER;

    public Water(Place place) {
        super("Вода", place);
    }

    public WaterCondition getWaterCondition() {
        return waterCondition;
    }

    public void setWaterCondition(WaterCondition waterCondition) {
        this.waterCondition = waterCondition;
    }

    public void rise() {
        if (waterCondition == WaterCondition.JET) {
            System.out.print(waterCondition.getName() + " поднималась высоко. ");
            System.out.print(waterCondition.getName() + " рассыпалась на " + WaterCondition.DROPS.getName() + ". ");
            waterCondition = WaterCondition.DROPS;
            System.out.println(waterCondition.getName() + " падали сверху.");
        }
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Water water = (Water) anotherObject;
        return getName() == water.getName() && getPlace() == water.getPlace() && waterCondition == water.waterCondition;
    }

    @Override
    public String toString() {
        return "Water{" +
                "waterCondition=" + waterCondition +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterCondition) + super.hashCode();
    }

}
