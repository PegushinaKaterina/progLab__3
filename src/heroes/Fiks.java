package heroes;

import place.Place;

public class Fiks extends MainHeroes implements Movable {

    public Fiks() {
        super("Фикс", HealthStatus.HEALTHY, Mood.HAPPY, Place.MOONGARDEN);
    }

    @Override
    public void moveAround(Activity activity) {
        Place place1 = getPlace();
        if (getMood() == Mood.SENTIMENT) {
            System.out.print("Cердито сопя, ");
        }
        setMood(Mood.TIRED);
        System.out.println(getName() + activity.getName() + place1.getName());
    }


}
