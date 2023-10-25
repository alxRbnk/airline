package com.rubnikovich.airline.service;

import com.rubnikovich.airline.entity.Airline;

import java.util.List;

public interface InfoService {

    List<Airline> listFlightsDestination(List<Airline> airline, String city);

    List<Airline> listFlightsGivenDay(List<Airline> airline, String day);

    List<Airline> listFlightsGivenDayAfterTime(List<Airline> airline, String day, int hour, int minute);
}
