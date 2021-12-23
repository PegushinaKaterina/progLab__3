package heroes;

import place.Place;

public abstract class MainHeroes extends Heroes {
    public MainHeroes(String name, HealthStatus healthStatus, Mood mood, Place place) {
        super(name, healthStatus, mood, place);
    }

    public void went(Place place2) {
        Place place1 = getPlace();
        if (place2.isPossibileToGetInside()) {
            setPlace(place2);
            System.out.println(getName() + " вышел из " + place1.getName() + " в " + place2.getName());
        }
    }
}
