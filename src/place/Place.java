package place;

public enum Place {
    MOONSEEDBED("Лунная грядка", true),
    EARTHSEDBED("Грядка на Земле", true),
    MOONGARDEN("Лунный сад", true),
    FIKSSHOULDER("Плечо Фикса", false),
    ;

    private final boolean possibleToGetInside;
    private final String name;

    Place(String name, boolean possibileToGetInside) {
        this.name = name;
        this.possibleToGetInside = possibileToGetInside;
    }

    public boolean isPossibileToGetInside() {
        return this.possibleToGetInside;
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
