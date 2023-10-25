package com.rubnikovich.airline.service.impl;

import com.rubnikovich.airline.entity.Airline;
import com.rubnikovich.airline.service.InfoService;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.*;

public class InfoServiceImpl implements InfoService {

    public List<Airline> listFlightsDestination(List<Airline> airline, String destination) {
        List<Airline> listDestination = new ArrayList<>();
        List<String> destinations = new ArrayList<>();
        for (Airline s : airline) {
            destinations.add(s.getDestination());
        }
        for (Airline s : airline) {
            if (s.getDestination().equalsIgnoreCase(destination)) {
                listDestination.add(s);
            }
        }
        return listDestination;
    }

    public List<Airline> listFlightsGivenDay(List<Airline> airline, String day) {
        List<Airline> daysOfWeek = new ArrayList<>();
        String upperCase = day.toUpperCase();
        for (Airline s : airline) {
            if (DayOfWeek.valueOf(upperCase) == (s.getDay())) {
                daysOfWeek.add(s);
            }
        }
        Collections.sort(daysOfWeek);
        return daysOfWeek;
    }

    public List<Airline> listFlightsGivenDayAfterTime(List<Airline> airline, String day, int hour, int minute) {
        List<Airline> daysOfWeekAfterTime = new ArrayList<>();
        String upperCase = day.toUpperCase();
        LocalTime time = LocalTime.of(hour, minute);
        for (Airline s : airline) {
            if ((DayOfWeek.valueOf(upperCase) == (s.getDay())) && (s.getTimeDeparture().isAfter(time))) {
                daysOfWeekAfterTime.add(s);
            }
            Collections.sort(daysOfWeekAfterTime);
        }
//        Collections.sort(daysOfWeekAfterTime, new Comparator<Airline>() {
//            @Override
//            public int compare(Airline o1, Airline o2) {
//                if (o1.getTimeDeparture().isAfter(o2.getTimeDeparture())) {
//                    return 1;
//                } else if (o1.getTimeDeparture().isBefore(o2.getTimeDeparture())) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        return daysOfWeekAfterTime;
    }
}
