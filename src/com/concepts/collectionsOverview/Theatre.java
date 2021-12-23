package com.concepts.collectionsOverview;

import java.util.ArrayList;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows-1);
        for(char row = 'A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row+String.format("%02d",seatNum));
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserverSeat(String seatNumber){
        Seat requestSeat = null;
        for(Seat seat:seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;;
            }
        }
    }
}
