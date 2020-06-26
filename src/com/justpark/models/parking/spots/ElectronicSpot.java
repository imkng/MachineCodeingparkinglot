package com.justpark.models.parking.spots;

import com.justpark.models.electronics.ChargingPannel;

public class ElectronicSpot extends Spot {
    private ChargingPannel chargingPannel;
    public ElectronicSpot() {
        super(SpotType.ELECTRIC);
    }
}
