package com.company;

public abstract class AbstractSoldier {


    //fields
    public String name;
    public String rank;
    public String homeTown;

    //getters
    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getHomeTown() {
        return homeTown;
    }




    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }




    //constructor
    public AbstractSoldier(String name, String rank, String homeTown) {
        this.name = name;
        this.rank = rank;
        this.homeTown = homeTown;
    }

    //methods

    public String sleep(){
        return "a soldier snores";

    }

    public String patrol(){
        return "a soldier trudges through the jungle";
    }

    public String eat(){
        return "a soldier chews threw an MRE";
    }


    // abstract class in super class
    public abstract String speak();


}
