package things;

public enum WaterCondition {
    WATER("Вода"),
    JET("Струя"),
    DROPS("Капли");

    private final String name;

    WaterCondition(String name) {
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
