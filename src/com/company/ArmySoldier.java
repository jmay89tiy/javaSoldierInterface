package com.company;

public class ArmySoldier extends AbstractSoldier implements Fight {

    public String speak() {
        return "Army Strong!";
    }


    @Override
    public String shoot() {
        return "boom boom";
    }

    @Override
    public String jiuJitsu() {
        return "wrist lock!";
    }

    @Override
    public String dropKick() {
        return "double kick!";
    }

    public ArmySoldier(String name, String rank, String homeTown) {
        super(name, rank, homeTown);
    }
}
