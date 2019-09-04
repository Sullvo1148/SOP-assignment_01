package com.shop.bergerqueen.bergerqueen;

public class Berger {
    private int id;
    private String berger;
    private static final String[] ALL_BERGER = new String[] {
            "",
            "Big mec",
            "Double layer",
            "Cheese berger",
            "Double cheese berger",
            "Vegetarian Berger",
            "Surprise meal",
            "Milk shake",
            "Coca cola",
            "Sprite",
            "Root beer",
            "Soda water",

    };

    public Berger(int berger) {
        this.id = berger;
        this.berger = getBergerName(berger);
    }

    public int getId() {
        return id;
    }

    public String getBerger() {
        return berger;
    }

    private static String getBergerName(int id) {
        return Berger.ALL_BERGER[id];
    }

    public void setBerger(int berger) {
        if (berger < 0 || berger >= Berger.ALL_BERGER.length) {
            this.id = 0;
            this.berger = getBergerName(0);
        } else {
            this.id = berger;
            this.berger = getBergerName(berger);
        }
    }
}
