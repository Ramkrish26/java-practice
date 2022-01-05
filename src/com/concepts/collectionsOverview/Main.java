package com.concepts.collectionsOverview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Vetri", 8,12);
//        theatre.getSeats();

        if(theatre.reserverSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }

        if(theatre.reserverSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("Boo",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        System.out.println("Price list");
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list)
            System.out.print(" "+seat.getSeatNumber() + " " +seat.getPrice());
        System.out.println();
        System.out.println("=======================================");
    }
}
