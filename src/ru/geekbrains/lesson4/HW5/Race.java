package ru.geekbrains.lesson4.HW5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stage;

    public ArrayList<Stage> getStages() {
        return stage;
    }

    public Race(Stage ... stages){
        this.stage = new ArrayList<>(Arrays.asList(stages));
    }
}
