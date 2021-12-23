package heroes;

public enum Activity {
    RUN(" бежал по "),
    GO(" шел по"),
    WALKED(" зашагал вдоль ");

    private String name;

    Activity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                '}';
    }
}
