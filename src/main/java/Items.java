public class Items {
    private String name;
    private String key;
    private int frequency;

    public Items(String name, String key, int frequency) {
        this.name = name;
        this.key = key;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void incrementFrequency(int quantity) {
        this.frequency += quantity;
    }
}