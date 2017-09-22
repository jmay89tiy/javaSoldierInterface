package com.company;

public class MarineSoldiers extends AbstractSoldier implements BombExtended {
    @Override
    public String speak() {
        return "oohrah!";
    }

    public MarineSoldiers(String name, String rank, String homeTown) {
        super(name, rank, homeTown);
    }

    @Override
    public String shoot() {
        return "bang bang!";
    }

    @Override
    public String jiuJitsu() {
        return "headlock";
    }

    @Override
    public String dropKick() {
        return "devil dog kick";
    }

    @Override
    public String blowUp() {
        return "boom! you dead";
    }
}
