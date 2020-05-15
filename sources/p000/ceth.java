package p000;

/* renamed from: ceth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceth implements cetg {
    public static final bdyx burstCollectionTriggerMinBatteryLevel;
    public static final bdyx burstCollectorBurstMeasurementInterval;
    public static final bdyx burstCollectorMaxBurstTimeMillis;
    public static final bdyx burstCollectorMinBatteryLevel;
    public static final bdyx burstCollectorMinIdleTimeOnBatteryMillis;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        burstCollectionTriggerMinBatteryLevel = bdyx.m91605a(a, "burst_collection_trigger_min_battery_level", 0.6d);
        burstCollectorBurstMeasurementInterval = bdyx.m91607a(a, "burst_collector_burst_measurement_interval", 12000L);
        burstCollectorMaxBurstTimeMillis = bdyx.m91607a(a, "burst_collector_max_burst_time_millis", 140000L);
        burstCollectorMinBatteryLevel = bdyx.m91605a(a, "burst_collector_min_battery_level", 0.2d);
        burstCollectorMinIdleTimeOnBatteryMillis = bdyx.m91607a(a, "burst_collector_min_idle_time_on_battery_millis", 18000000L);
    }

    public double burstCollectionTriggerMinBatteryLevel() {
        return ((Double) burstCollectionTriggerMinBatteryLevel.mo58455c()).doubleValue();
    }

    public long burstCollectorBurstMeasurementInterval() {
        return ((Long) burstCollectorBurstMeasurementInterval.mo58455c()).longValue();
    }

    public long burstCollectorMaxBurstTimeMillis() {
        return ((Long) burstCollectorMaxBurstTimeMillis.mo58455c()).longValue();
    }

    public double burstCollectorMinBatteryLevel() {
        return ((Double) burstCollectorMinBatteryLevel.mo58455c()).doubleValue();
    }

    public long burstCollectorMinIdleTimeOnBatteryMillis() {
        return ((Long) burstCollectorMinIdleTimeOnBatteryMillis.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }
}
