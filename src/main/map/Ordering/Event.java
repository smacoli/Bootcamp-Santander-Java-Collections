package main.map.Ordering;

public class Event {
    private String name;
    private String mainStage;

    public Event(String name, String mainStage) {
        this.name = name;
        this.mainStage = mainStage;
    }

    public String getName() {
        return name;
    }

    public String getMainStage() {
        return mainStage;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", mainStage='" + mainStage + '\'' +
                '}';
    }
}
