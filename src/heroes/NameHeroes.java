package heroes;

public enum NameHeroes {
    NEZNAIKA("Незнайка"),
    FIKS("Фикс"),
    FIRSTSHORTY("Первый коротышка"),
    SECONDSHORTY("Второй коротышка"),
    THIRDSHORTY("Третий коротышка");

    private final String name;

    NameHeroes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HealthStatus{" +
                "name='" + name + '\'' +
                '}';
    }

}
