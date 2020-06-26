package com.justpark.models.vechicles;

public class ELECTRIC extends Vechicle {
    public ELECTRIC(VechicleType type) {
        super(VechicleType.ELECTRIC);
    }

    public static class Car extends Vechicle {
        public Car() {
            super(VechicleType.CAR);
        }
    }
}
