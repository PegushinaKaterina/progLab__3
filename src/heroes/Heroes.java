package heroes;

import place.Place;

import java.util.Objects;

public abstract class Heroes {
    private String name;
    private HealthStatus healthStatus;
    private Mood mood;
    private Place place;


    public Heroes(String name, HealthStatus healthStatus, Mood mood, Place place) {
        this.name = name;
        this.place = place;
        this.healthStatus = healthStatus;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", healthStatus=" + healthStatus +
                ", mood=" + mood +
                ", place=" + place +
                '}';
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Heroes heroes = (Heroes) anotherObject;
        return name == heroes.name && healthStatus == heroes.healthStatus && mood == heroes.mood && place == heroes.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, healthStatus, mood, place);
    }
}
