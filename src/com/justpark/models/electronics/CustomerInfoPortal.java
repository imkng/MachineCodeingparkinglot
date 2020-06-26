package com.justpark.models.electronics;

import com.justpark.models.parking.Ticket;
import com.justpark.models.parking.interfaces.PayementEnable;

public class CustomerInfoPortal extends Electronics implements PayementEnable {
    @Override
    public void processTicket(Ticket ticket){

    }
}
