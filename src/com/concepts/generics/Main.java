package com.concepts.generics;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> barca = new Team<>("Barca");
        barca.addPlayer(joe);
//        barca.addPlayer(pat);
//        barca.addPlayer(beckham);

        System.out.println(barca.numPlayers());
    }
}
