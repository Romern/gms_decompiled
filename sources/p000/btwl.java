package p000;

/* renamed from: btwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btwl implements bxvp {
    SENSOR_TYPE_UNSPECIFIED(0),
    SENSOR_TYPE_ACCELEROMETER_MPS2(1),
    SENSOR_TYPE_GYROSCOPE_RPS(2),
    SENSOR_TYPE_MAGNETOMETER_UT(3),
    SENSOR_TYPE_IMU_TEMPERATURE_C(4),
    SENSOR_TYPE_BAROMETER_HPA(5),
    SENSOR_TYPE_WIFI_M(6),
    SENSOR_TYPE_VELOCITY_MPS(7),
    SENSOR_TYPE_POSITION_M(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f152723k;

    private btwl(int i) {
        this.f152723k = i;
    }

    /* renamed from: a */
    public static btwl m118952a(int i) {
        switch (i) {
            case 0:
                return SENSOR_TYPE_UNSPECIFIED;
            case 1:
                return SENSOR_TYPE_ACCELEROMETER_MPS2;
            case 2:
                return SENSOR_TYPE_GYROSCOPE_RPS;
            case 3:
                return SENSOR_TYPE_MAGNETOMETER_UT;
            case 4:
                return SENSOR_TYPE_IMU_TEMPERATURE_C;
            case 5:
                return SENSOR_TYPE_BAROMETER_HPA;
            case 6:
                return SENSOR_TYPE_WIFI_M;
            case 7:
                return SENSOR_TYPE_VELOCITY_MPS;
            case 8:
                return SENSOR_TYPE_POSITION_M;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f152723k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
