package com.rubnikovich.airline.creator;

import com.rubnikovich.airline.entity.Airline;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Creator {

    public List<Airline> createAirlines(List<String> listString) {
        List<Airline> listAirline = new ArrayList<>();
        for (int i = 2; i < listString.size(); i++) {
            String[] arr = listString.get(i).split("\\s+");
            Airline airline = new Airline();
            airline.setFlightId(arr[1]);
            airline.setDestination(arr[2]);
            airline.setTypeAirplane(arr[3]);
            airline.setTimeDeparture(LocalTime.parse(arr[4]));
            airline.setDay(DayOfWeek.of(Integer.parseInt(arr[5])));
            listAirline.add(airline);
        }
        return listAirline;
    }
}

