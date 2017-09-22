package com.company;

public class NavySoldier extends AbstractSoldier implements Fight {
    @Override
    public String speak() {
        return "Go Seals, Hooyah!";

    }

    public NavySoldier(String name, String rank, String homeTown) {
        super(name, rank, homeTown);
    }

    @Override
    public String shoot() {
        return "pew pew";
    }

    @Override
    public String jiuJitsu() {
        return "hi ya!";
    }

    @Override
    public String dropKick() {
        return "off the top ropes!";
    }
}
