package com.rubnikovich.airline.main;

import com.rubnikovich.airline.creator.Creator;
import com.rubnikovich.airline.entity.Airline;
import com.rubnikovich.airline.reader.AirReader;
import com.rubnikovich.airline.service.InfoService;
import com.rubnikovich.airline.service.impl.InfoServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        AirReader fileInfo = new AirReader();
        List<String> listStringFile = fileInfo.readFile("src/main/resources/doc.txt");

        Creator createAirlines = new Creator();
        List<Airline> airlines = createAirlines.createAirlines(listStringFile);

        InfoService info = new InfoServiceImpl();
        List<Airline> listFlightsDestination = info.listFlightsDestination(airlines, "London");
        List<Airline> listFlightsGivenDay = info.listFlightsGivenDay(airlines, "Friday");

        List<Airline> listFlightsGivenDayAfterTime = info.listFlightsGivenDayAfterTime(airlines, "Friday", 00, 00);
        for (Airline s : listFlightsGivenDayAfterTime) {
            System.out.println(s);
        }
    }
}
