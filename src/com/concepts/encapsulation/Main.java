package com.concepts.encapsulation;

public class Main {

    public static void main(String[] args){
        Player player = new Player();
        player.name = "Ram";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = "+player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health = "+player.healthRemaining());
    }
}
