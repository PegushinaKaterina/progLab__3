package things;

import heroes.HealthStatus;
import heroes.Heroes;
import place.Place;
import things.Things;

public class Trap extends Things {
    public Trap() {
        super("Капкан", Place.MOONGARDEN);
    }

    public void сatch(Heroes hero) {
        hero.setHealthStatus(HealthStatus.BRUISEDLEG);
    }
}
