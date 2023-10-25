package com.rubnikovich.airline.entity;


import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline implements Comparable<Airline> {

    private String destination;
    private String idFlight;
    private String typeAirplane;
    private LocalTime timeDeparture;
    private DayOfWeek day;

    public Airline() {
    }

    public Airline(String destination, String flightId, String typeAirplane, LocalTime timeDeparture, DayOfWeek day) {
        this.destination = destination;
        this.idFlight = flightId;
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
        return idFlight;
    }

    public void setFlightId(String flightId) {
        this.idFlight = flightId;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(LocalTime timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airline { ");
        sb.append("[destination - ").append(destination).append(']');
        sb.append(" [flightId - ").append(idFlight).append(']');
        sb.append(" [typeAirplane - ").append(typeAirplane).append(']');
        sb.append(" [timeDeparture - ").append(timeDeparture).append(']');
        sb.append(" [day - ").append(day).append(']');
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public int compareTo(Airline o) {
        if (this.getTimeDeparture().isAfter(o.getTimeDeparture())) {
            return 1;
        } else if (this.getTimeDeparture().isBefore(o.getTimeDeparture())) {
            return -1;
        } else {
            return 0;
        }
    }
}


