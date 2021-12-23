package heroes;

import place.Place;
import things.EnumThings;
import things.Water;
import things.WaterCondition;

public class Shorty extends Heroes {

    public Shorty(String name) {
        super(name, HealthStatus.HEALTHY, Mood.HAPPY, Place.MOONSEEDBED);
    }

    public void pour(Place place) {
        setMood(Mood.TIRED);
        System.out.println(getName() + " поливал " + place.getName());
    }

    public void direct(Water water) {
        water.setWaterCondition(WaterCondition.JET);
        System.out.println(getName() + " направлял " + WaterCondition.JET.getName() + " из " + EnumThings.HOSE.getName() + ".");
        water.rise();
    }
}
