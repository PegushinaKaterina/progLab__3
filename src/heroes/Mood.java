package heroes;

public enum Mood {
    SENTIMENT("Сердитый"),
    HAPPY("Счастливый"),
    SAD("Грустный"),
    TIRED("Уставший"),
    THOUGHTFUL("Задумчивый");


    private final String name;

    Mood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HealthStatus{" +
                "name='" + name + '\'' +
                '}';
    }
}
