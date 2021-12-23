package heroes;

public enum HealthStatus {
    BRUISEDLEG("Ушибленная нога"),
    HEALTHY("Здоровый");

    private final String name;

    HealthStatus(String name) {
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
