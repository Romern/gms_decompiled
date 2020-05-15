package p000;

/* renamed from: cerx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cerx implements cerw {
    public static final bdyx inVehicleOffBodyCountThreshold;
    public static final bdyx inVehicleOffBodyCountThresholdForBatching;
    public static final bdyx offBodyDetectionAngularThreshold;
    public static final bdyx offBodyDetectionEnergyThreshold;
    public static final bdyx offBodyDetectionLowerAngularThreshold;
    public static final bdyx offBodyDetectionUpperAngularThreshold;
    public static final bdyx offBodyEligibleApps;
    public static final bdyx watchHardwareOffBodyEnabled;

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
        inVehicleOffBodyCountThreshold = bdyx.m91607a(a, "in_vehicle_off_body_count_threshold", 1L);
        inVehicleOffBodyCountThresholdForBatching = bdyx.m91607a(a, "in_vehicle_off_body_count_threshold_for_batching", 3L);
        offBodyDetectionAngularThreshold = bdyx.m91605a(a, "off_body_detection_angular_threshold", 0.075d);
        offBodyDetectionEnergyThreshold = bdyx.m91605a(a, "off_body_detection_energy_threshold", 50.0d);
        offBodyDetectionLowerAngularThreshold = bdyx.m91605a(a, "off_body_detection_lower_angular_threshold", 0.075d);
        offBodyDetectionUpperAngularThreshold = bdyx.m91605a(a, "off_body_detection_upper_angular_threshold", 0.075d);
        offBodyEligibleApps = bdyx.m91609a(a, "off_body_eligible_apps", "com.google.android.wearable.app,com.google.android.wearable.ambient,com.google.android.apps.wearable.settings");
        watchHardwareOffBodyEnabled = bdyx.m91610a(a, "watch_hardware_off_body_enabled", true);
    }

    public boolean compiled() {
        return true;
    }

    public long inVehicleOffBodyCountThreshold() {
        return ((Long) inVehicleOffBodyCountThreshold.mo58455c()).longValue();
    }

    public long inVehicleOffBodyCountThresholdForBatching() {
        return ((Long) inVehicleOffBodyCountThresholdForBatching.mo58455c()).longValue();
    }

    public double offBodyDetectionAngularThreshold() {
        return ((Double) offBodyDetectionAngularThreshold.mo58455c()).doubleValue();
    }

    public double offBodyDetectionEnergyThreshold() {
        return ((Double) offBodyDetectionEnergyThreshold.mo58455c()).doubleValue();
    }

    public double offBodyDetectionLowerAngularThreshold() {
        return ((Double) offBodyDetectionLowerAngularThreshold.mo58455c()).doubleValue();
    }

    public double offBodyDetectionUpperAngularThreshold() {
        return ((Double) offBodyDetectionUpperAngularThreshold.mo58455c()).doubleValue();
    }

    public String offBodyEligibleApps() {
        return (String) offBodyEligibleApps.mo58455c();
    }

    public boolean watchHardwareOffBodyEnabled() {
        return ((Boolean) watchHardwareOffBodyEnabled.mo58455c()).booleanValue();
    }
}
