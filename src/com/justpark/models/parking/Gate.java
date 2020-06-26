package com.justpark.models.parking;

import com.justpark.models.AutoExitpannel;
import com.justpark.models.DBObject;
import com.justpark.models.accounts.Attendent;
import com.justpark.models.parking.interfaces.PayementEnable;

public abstract class Gate extends DBObject implements PayementEnable {


    private GateType type;
    private Attendent attendent;
    private AutoExitpannel exitpannel;
    private String gateName;//Gate2E,mainGAte
    void open(){

    }
    void close(){

    }
    void getTicket(){

    }
    @Override
    public void processTicket(Ticket ticket){

    }
}
