package p000;

/* renamed from: cewe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cewe {
    long flpSmdIntervalThresholdMs();

    double flpSmdSwitchIntervalFactor();

    long flpThrottleSmallestPriority();

    boolean flpThrottleWhenStill();

    long flpThrottleWhenStillIntervalMs();

    boolean ignoreSmdForThrottling();

    long minStillTimeMs();

    long minSyntheticSmdDeliveryMs();

    double minVehicleSpeedMps();

    long numStillLocationsThreshold();

    double sigmaScaleDistanceThreshold();

    long vehicleActivityTimeoutMs();
}
