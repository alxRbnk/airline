package com.rubnikovich.airline.entity;

import java.sql.Time;

public class Airline {
    private String destination;
    private String flightId;
    private String typeAirplane;
    private Time timeDeparture;
    private DaysWeek day;

    public Airline() {
    }

    public Airline(String destination, String flightId, String typeAirplane, Time timeDeparture, DaysWeek day) {
        this.destination = destination;
        this.flightId = flightId;
        this.typeAirplane = typeAirplane;
        this.timeDeparture = timeDeparture;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public Time getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(Time timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public DaysWeek getDay() {
        return day;
    }

    public void setDay(DaysWeek day) {
        this.day = day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airline{");
        sb.append("destination='").append(destination).append('\'');
        sb.append(", flightId='").append(flightId).append('\'');
        sb.append(", typeAirplane='").append(typeAirplane).append('\'');
        sb.append(", timeDeparture=").append(timeDeparture);
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
}


