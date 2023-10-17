package main.map.Ordering;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    private Map<LocalDate, Event> agenda;

    public Agenda() {
        this.agenda = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String mainStageAtr){
        Event event = new Event(name, mainStageAtr);
        agenda.put(date, event);
    }

    public void showAgenda(){
        Map<LocalDate, Event> events = new TreeMap<>();
        System.out.println(agenda);
    }

    public void getNextEvent(){
        LocalDate localDate = LocalDate.now();
        Map<LocalDate, Event> events = new TreeMap<>(agenda);

        for (Map.Entry<LocalDate, Event> entry : events.entrySet()){
            if (entry.getKey().isEqual(localDate) || entry.getKey().isAfter(localDate)){
                System.out.println("O proximo evendo na agenda é " + entry.getValue() + ". Acontecerá na data " + entry.getKey() + ".");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Agenda agenda1 = new Agenda();

        agenda1.addEvent(LocalDate.of(2023,11,15), "Feriado", "Show de Rock");
        agenda1.addEvent(LocalDate.of(2023,12,25), "Natal", "Pré natal");
        agenda1.addEvent(LocalDate.of(2023,12,31), "Reveillon", "Reveillon");

        agenda1.showAgenda();

        agenda1.getNextEvent();
    }
}
