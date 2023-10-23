package com.rubnikovich.airline.main;

import com.rubnikovich.airline.entity.Airline;
import com.rubnikovich.airline.reader.AirReader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception { //fixme
        AirReader airReader = new AirReader();
        List<String> list = airReader.readFile();
        List<Airline> listAirline = new ArrayList<>();

        for (int i = 2; i < list.size(); i++) {
            String[] arr = list.get(i).split("\\s+");
            Airline airline = new Airline();
            airline.setFlightId(arr[1]);
            airline.setDestination(arr[2]);
            airline.setTypeAirplane(arr[3]);
//            airline.setTimeDeparture(arr[4]); //fixme
//            airline.setDay(arr[5]); //fixme
            listAirline.add(airline);
        }
        for (Airline s : listAirline) {
            System.out.println(s);
        }
    }
}
