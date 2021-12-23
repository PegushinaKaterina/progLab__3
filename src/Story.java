import heroes.*;
import place.Place;
import things.Trap;
import things.Water;

public class Story {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika();
        Fiks fiks = new Fiks();
        Shorty fisrtShorty = new Shorty("Первый коротышка");
        Shorty secondShorty = new Shorty("Второй коротышка");
        Shorty thirdShorty = new Shorty("Третий коротышка");
        Water water = new Water(Place.MOONSEEDBED);
        Trap trap = new Trap();
        trap.сatch(neznaika);
        fiks.setMood(Mood.SENTIMENT);
        neznaika.moveAround(Activity.RUN);
        fiks.moveAround(Activity.GO);
        neznaika.went(Place.MOONSEEDBED);
        fiks.went(Place.MOONSEEDBED);
        neznaika.moveAround(Activity.WALKED);
        fiks.moveAround(Activity.WALKED);
        neznaika.looking();
        fisrtShorty.pour(Place.MOONGARDEN);
        secondShorty.pour(Place.MOONSEEDBED);
        thirdShorty.direct(water);
    }
}
