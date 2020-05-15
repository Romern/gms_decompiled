package p000;

/* renamed from: biva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biva implements bxvp {
    SENSOR_LOCATION(1),
    SENSOR_COMPASS(2),
    SENSOR_SPEED(3),
    SENSOR_RPM(4),
    SENSOR_ODOMETER(5),
    SENSOR_FUEL(6),
    SENSOR_PARKING_BRAKE(7),
    SENSOR_GEAR(8),
    SENSOR_OBDII_DIAGNOSTIC_CODE(9),
    SENSOR_NIGHT_MODE(10),
    SENSOR_ENVIRONMENT_DATA(11),
    SENSOR_HVAC_DATA(12),
    SENSOR_DRIVING_STATUS_DATA(13),
    SENSOR_DEAD_RECKONING_DATA(14),
    SENSOR_PASSENGER_DATA(15),
    SENSOR_DOOR_DATA(16),
    SENSOR_LIGHT_DATA(17),
    SENSOR_TIRE_PRESSURE_DATA(18),
    SENSOR_ACCELEROMETER_DATA(19),
    SENSOR_GYROSCOPE_DATA(20),
    SENSOR_GPS_SATELLITE_DATA(21),
    SENSOR_TOLL_CARD(22);
    

    /* renamed from: w */
    public final int f121920w;

    private biva(int i) {
        this.f121920w = i;
    }

    /* renamed from: a */
    public static biva m102863a(int i) {
        switch (i) {
            case 1:
                return SENSOR_LOCATION;
            case 2:
                return SENSOR_COMPASS;
            case 3:
                return SENSOR_SPEED;
            case 4:
                return SENSOR_RPM;
            case 5:
                return SENSOR_ODOMETER;
            case 6:
                return SENSOR_FUEL;
            case 7:
                return SENSOR_PARKING_BRAKE;
            case 8:
                return SENSOR_GEAR;
            case 9:
                return SENSOR_OBDII_DIAGNOSTIC_CODE;
            case 10:
                return SENSOR_NIGHT_MODE;
            case 11:
                return SENSOR_ENVIRONMENT_DATA;
            case 12:
                return SENSOR_HVAC_DATA;
            case 13:
                return SENSOR_DRIVING_STATUS_DATA;
            case 14:
                return SENSOR_DEAD_RECKONING_DATA;
            case 15:
                return SENSOR_PASSENGER_DATA;
            case 16:
                return SENSOR_DOOR_DATA;
            case 17:
                return SENSOR_LIGHT_DATA;
            case 18:
                return SENSOR_TIRE_PRESSURE_DATA;
            case 19:
                return SENSOR_ACCELEROMETER_DATA;
            case 20:
                return SENSOR_GYROSCOPE_DATA;
            case 21:
                return SENSOR_GPS_SATELLITE_DATA;
            case 22:
                return SENSOR_TOLL_CARD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102864b() {
        return biuz.f121896a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121920w;
    }

    public final String toString() {
        return Integer.toString(this.f121920w);
    }
}
