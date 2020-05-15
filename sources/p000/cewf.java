package p000;

/* renamed from: cewf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cewf implements cewe {
    public static final bdyx flpMinDistanceMeters;
    public static final bdyx flpSmdIntervalThresholdMs;
    public static final bdyx flpSmdSwitchIntervalFactor;
    public static final bdyx flpThrottleSmallestDisplacementMeters;
    public static final bdyx flpThrottleSmallestPriority;
    public static final bdyx flpThrottleWhenStill;
    public static final bdyx flpThrottleWhenStillIntervalMs;
    public static final bdyx ignoreSmdForThrottling;
    public static final bdyx minStillTimeMs;
    public static final bdyx minSyntheticSmdDeliveryMs;
    public static final bdyx minVehicleSpeedMps;
    public static final bdyx numStillLocationsThreshold;
    public static final bdyx sigmaScaleDistanceThreshold;
    public static final bdyx vehicleActivityTimeoutMs;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        flpMinDistanceMeters = bdyx.m91605a(a, "flp_min_distance_meters", 5.0d);
        flpSmdIntervalThresholdMs = bdyx.m91607a(a, "flp_smd_interval_threshold_ms", 360000L);
        flpSmdSwitchIntervalFactor = bdyx.m91605a(a, "flp_smd_switch_interval_factor", 1.0d);
        flpThrottleSmallestDisplacementMeters = bdyx.m91605a(a, "flp_throttle_smallest_displacement_meters", 10.0d);
        flpThrottleSmallestPriority = bdyx.m91607a(a, "flp_throttle_smallest_priority", 102L);
        flpThrottleWhenStill = bdyx.m91610a(a, "flp_throttle_when_still", true);
        flpThrottleWhenStillIntervalMs = bdyx.m91607a(a, "flp_throttle_when_still_interval_ms", 720000L);
        ignoreSmdForThrottling = bdyx.m91610a(a, "ignore_smd_for_throttling", false);
        minStillTimeMs = bdyx.m91607a(a, "min_still_time_ms", 1200000L);
        minSyntheticSmdDeliveryMs = bdyx.m91607a(a, "min_synthetic_smd_delivery", 5000L);
        minVehicleSpeedMps = bdyx.m91605a(a, "min_vehicle_speed_mps", 12.0d);
        numStillLocationsThreshold = bdyx.m91607a(a, "num_still_locations_threshold", 2L);
        sigmaScaleDistanceThreshold = bdyx.m91605a(a, "sigma_scale_distance_threshold", 0.5d);
        vehicleActivityTimeoutMs = bdyx.m91607a(a, "vehicle_activity_timeout_ms", 300000L);
    }

    public boolean compiled() {
        return true;
    }

    public double flpMinDistanceMeters() {
        return ((Double) flpMinDistanceMeters.mo58455c()).doubleValue();
    }

    public long flpSmdIntervalThresholdMs() {
        return ((Long) flpSmdIntervalThresholdMs.mo58455c()).longValue();
    }

    public double flpSmdSwitchIntervalFactor() {
        return ((Double) flpSmdSwitchIntervalFactor.mo58455c()).doubleValue();
    }

    public double flpThrottleSmallestDisplacementMeters() {
        return ((Double) flpThrottleSmallestDisplacementMeters.mo58455c()).doubleValue();
    }

    public long flpThrottleSmallestPriority() {
        return ((Long) flpThrottleSmallestPriority.mo58455c()).longValue();
    }

    public boolean flpThrottleWhenStill() {
        return ((Boolean) flpThrottleWhenStill.mo58455c()).booleanValue();
    }

    public long flpThrottleWhenStillIntervalMs() {
        return ((Long) flpThrottleWhenStillIntervalMs.mo58455c()).longValue();
    }

    public boolean ignoreSmdForThrottling() {
        return ((Boolean) ignoreSmdForThrottling.mo58455c()).booleanValue();
    }

    public long minStillTimeMs() {
        return ((Long) minStillTimeMs.mo58455c()).longValue();
    }

    public long minSyntheticSmdDeliveryMs() {
        return ((Long) minSyntheticSmdDeliveryMs.mo58455c()).longValue();
    }

    public double minVehicleSpeedMps() {
        return ((Double) minVehicleSpeedMps.mo58455c()).doubleValue();
    }

    public long numStillLocationsThreshold() {
        return ((Long) numStillLocationsThreshold.mo58455c()).longValue();
    }

    public double sigmaScaleDistanceThreshold() {
        return ((Double) sigmaScaleDistanceThreshold.mo58455c()).doubleValue();
    }

    public long vehicleActivityTimeoutMs() {
        return ((Long) vehicleActivityTimeoutMs.mo58455c()).longValue();
    }
}
