package things;

public enum EnumThings {
    BROOMSTICK("Метла"),
    PUMP("Насос"),
    HOSE("Брандспойт");

    private final String name;

    EnumThings(String name) {
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
