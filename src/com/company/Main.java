package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MarineSoldiers marine = new MarineSoldiers("SteveThePirate", "General", "Cfield");
        System.out.println("a marine detonates a bomb! You're blown to smitherines! " + marine.blowUp());
        System.out.println("a marine sharpshooter sends one down range, and hits you between the eyes! " + marine.shooter());
        System.out.println("a marine is here, watch as " + marine.sleep());
        System.out.println("a marine is here patrolling, watch as " + marine.patrol());
        System.out.println("a marine is so hungry, watch as " + marine.eat());
        System.out.println("a marine attempts to put you in a " + marine.jiuJitsu());
        System.out.println("a marine lunges at you with a " + marine.dropKick());
        System.out.println("a marine says " + marine.speak());

        ArmySoldier army = new ArmySoldier("Bill", "Technician", "Beaufort");
        System.out.println("an Army man pulls the trigger! You are sniped from afar!" + army.shooter());
        System.out.println("an Army man is exhausted after a march " + army.sleep());
        System.out.println("an Army man patrols the path, " + army.patrol());
        System.out.println("an army man rifles through the mess hall, " + army.eat());
        System.out.println("an army man reaches for a " + army.jiuJitsu());
        System.out.println("an army man races towards you with a " + army.dropKick());
        System.out.println("an army man yells " + army.speak());

        NavySoldier navy = new NavySoldier("Killer", "seargeant", "hell");
        System.out.println("a navy seal is the last thing you see as a sniper round tears through you, " + navy.shooter());
        System.out.println("a navy seal is exhausted after saving the world from terrorism, " + navy.sleep());
        System.out.println("a navy seal moves effortlessly through the background, " + navy.patrol());
        System.out.println("a navy seal could clear out 2 buffets he's so hungry, " + navy.eat());
        System.out.println("a navy seal goes for a " + navy.jiuJitsu());
        System.out.println("a navy seal teleports on top of you to perform an acrobatic move like " + navy.dropKick());
        System.out.println("a navy seal yodels " + navy.speak());



    }





}


