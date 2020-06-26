package com.justpark.models.vechicles;

import com.justpark.models.DBObject;

//Abstract Class Have no Objects
public abstract class Vechicle extends DBObject {
    private String plateNumber;
    private String color;
    private final VechicleType type;

    public Vechicle(VechicleType type) {
        this.type = type;
    }
}

