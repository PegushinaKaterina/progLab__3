package things;

import place.Place;

import java.util.Objects;

public abstract class Things {
    private String name;
    private Place place;

    public Things(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Things{" +
                "name='" + name + '\'' +
                ", place=" + place +
                '}';
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Things things = (Things) anotherObject;
        return name == things.name && place == things.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place);
    }
}
