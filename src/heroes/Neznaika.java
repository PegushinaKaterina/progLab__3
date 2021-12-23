package heroes;

import place.Place;
import things.*;

public class Neznaika extends MainHeroes implements Movable, AbleToLook {

    public Neznaika() {
        super("Незнайка", HealthStatus.HEALTHY, Mood.HAPPY, Place.MOONGARDEN);
    }

    @Override
    public void moveAround(Activity activity) {
        Place place1 = getPlace();
        if (getHealthStatus() != HealthStatus.BRUISEDLEG && activity == Activity.RUN) {
            System.out.println(getName() + activity.getName() + place1.getName());
        } else if (activity == Activity.RUN) {
            System.out.println(getName() + " не мог бежать из-за " + HealthStatus.BRUISEDLEG.getName() + " поэтому он брел по " + place1.getName());
        } else {
            System.out.println(getName() + activity.getName() + place1.getName());
        }
        setMood(Mood.TIRED);
    }

    public void looking() {
        System.out.println(getName() + " поглядывал по сторонам ");
        detect();
    }

    public void detect() {
        if (Vegetables.MOONTOMATOES.getSize() < Vegetables.EARTHTOMATOES.getSize()) {
            setMood(Mood.THOUGHTFUL);
            System.out.println(getName() + " заметил, что лунные помидоры мельче тех, к которым он привык на Земле");
        }
        if (Vegetables.MOONCUCUMBER.getSize() < Vegetables.EARTHCUCUMBER.getSize()) {
            setMood(Mood.THOUGHTFUL);
            System.out.println(getName() + " заметил, что лунные огурцы мельче тех, к которым он привык на Земле");
        }
        if (Vegetables.MOONTOMATOES.getSize() > Vegetables.EARTHTOMATOES.getSize()) {
            setMood(Mood.THOUGHTFUL);
            System.out.println(getName() + " заметил, что лунные помидоры больше тех, к которым он привык на Земле");
        }
        if (Vegetables.MOONCUCUMBER.getSize() > Vegetables.EARTHCUCUMBER.getSize()) {
            setMood(Mood.THOUGHTFUL);
            System.out.println(getName() + " заметил, что лунные огурцы больше тех, к которым он привык на Земле");
        }
    }
}
