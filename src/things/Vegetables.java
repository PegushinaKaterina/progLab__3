package things;

public enum Vegetables {
    MOONTOMATOES("Лунные помидоры", 1),
    EARTHTOMATOES("Земные помидоры", 10),
    MOONCUCUMBER("Лунные огурцы", 1),
    EARTHCUCUMBER("Лунные огурцы", 10);

    private final String name;
    private final int size;

    Vegetables(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
