package com.justpark.models.parking.interfaces;

import com.justpark.models.parking.Ticket;

public interface PayementEnable{
    public default void processTicket(Ticket ticket){

    }
}