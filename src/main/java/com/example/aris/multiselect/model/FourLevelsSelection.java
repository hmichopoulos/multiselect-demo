package com.example.aris.multiselect.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haris on 24/2/2016.
 */
public class FourLevelsSelection {

    private List<String> levelOne = new ArrayList<>();
    private List<String> levelTwo = new ArrayList<>();
    private List<String> levelThree = new ArrayList<>();
    private List<String> levelFour = new ArrayList<>();

    public FourLevelsSelection() {
    }

    public List<String> getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(List<String> levelOne) {
        this.levelOne = levelOne;
    }

    public List<String> getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(List<String> levelTwo) {
        this.levelTwo = levelTwo;
    }

    public List<String> getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(List<String> levelThree) {
        this.levelThree = levelThree;
    }

    public List<String> getLevelFour() {
        return levelFour;
    }

    public void setLevelFour(List<String> levelFour) {
        this.levelFour = levelFour;
    }
}
