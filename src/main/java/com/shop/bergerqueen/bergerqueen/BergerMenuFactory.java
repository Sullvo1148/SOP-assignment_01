package com.shop.bergerqueen.bergerqueen;

public class BergerMenuFactory {
    public static final Menu[] MENU = new Menu[]{
            new Menu("Set good day Mrs", "1 big mac and 1 soda", new Berger[]{
                    new Berger(1),
                    new Berger(11),
            }, 129),
            new Menu("Set good day sir", "1 Double layer and 1 soda.", new Berger[]{
                    new Berger(2),
                    new Berger(11),
            }, 169),
            new Menu("Set cheese lover", "1 Cheese berger and 1 soda.", new Berger[]{
                    new Berger(3),
                    new Berger(11),
            }, 199),
            new Menu("Set large cheese lover", "1 Double cheese berger and 1 soda.", new Berger[]{
                    new Berger(4),
                    new Berger(11),
            }, 239),
            new Menu("Set vegan", "1 vegetarian Berger and 1 soda.", new Berger[]{
                    new Berger(5),
                    new Berger(11),
            }, 199),
            new Menu("Set good kids", "1 Surprise meal and 1 Milk shake.", new Berger[]{
                    new Berger(6),
                    new Berger(7),
            }, 189),
            new Menu("Soda", "29 bath if not in set menu", new Berger[]{
                    new Berger(8),
                    new Berger(9),
                    new Berger(10),
            }, 29),
            new Menu("Milk Shake", "49 bath if not in set menu", new Berger[]{
                    new Berger(7),
            }, 49),
    };

    public static Menu getMenu(int menu) {
        return MENU[menu];
    }

    public static Menu[] getMenuList() {
        return MENU;
    }

}



