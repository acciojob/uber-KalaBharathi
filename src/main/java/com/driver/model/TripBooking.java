package com.driver.model;

import javax.persistence.*;

@Entity
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;
    private int bill;
    @ManyToOne
    @JoinColumn
    public Driver driver;

    public TripBooking() {
    }

    @ManyToOne
    @JoinColumn
    public Customer customer;


    public TripBooking( String fromLocation, String toString, int distanceInKm, TripStatus tripStatus, int bill) {
        this.fromLocation = fromLocation;
        this.toLocation = toString;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
        this.bill = bill;
    }


    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toString) {
        this.toLocation = toString;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public int getTripBooking() {
        return tripBookingId;
    }

    public void setTripBooking(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
