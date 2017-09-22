package com.company;

public interface Fight {
    String shoot();
    String jiuJitsu();
    String dropKick();

    default String shooter() {
        return "Shot yo head off";
    }

}
