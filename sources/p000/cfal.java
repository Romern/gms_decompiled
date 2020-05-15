package p000;

/* renamed from: cfal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfal implements cfak {
    public static final bdyx forceSensorCollectionUpload;
    public static final bdyx isSensorCollectionEnabled;
    public static final bdyx isSensorCollectionSizeLimited;
    public static final bdyx maxSensorTraceSizeBytes;
    public static final bdyx sensorCollectionSizeLimitedPackages;
    public static final bdyx sensorCollectionWifiScanDelayMs;

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
        forceSensorCollectionUpload = bdyx.m91610a(a, "force_sensor_collection_upload", true);
        isSensorCollectionEnabled = bdyx.m91610a(a, "is_sensor_collection_enabled", true);
        isSensorCollectionSizeLimited = bdyx.m91610a(a, "is_sensor_collection_size_limited", true);
        maxSensorTraceSizeBytes = bdyx.m91607a(a, "max_sensor_trace_size_bytes", 10000000L);
        sensorCollectionSizeLimitedPackages = bdyx.m91609a(a, "sensor_collection_size_limited_packages", "com.google.android.gms");
        sensorCollectionWifiScanDelayMs = bdyx.m91607a(a, "sensor_collection_wifi_scan_delay_ms", 2000L);
    }

    public boolean compiled() {
        return true;
    }

    public boolean forceSensorCollectionUpload() {
        return ((Boolean) forceSensorCollectionUpload.mo58455c()).booleanValue();
    }

    public boolean isSensorCollectionEnabled() {
        return ((Boolean) isSensorCollectionEnabled.mo58455c()).booleanValue();
    }

    public boolean isSensorCollectionSizeLimited() {
        return ((Boolean) isSensorCollectionSizeLimited.mo58455c()).booleanValue();
    }

    public long maxSensorTraceSizeBytes() {
        return ((Long) maxSensorTraceSizeBytes.mo58455c()).longValue();
    }

    public String sensorCollectionSizeLimitedPackages() {
        return (String) sensorCollectionSizeLimitedPackages.mo58455c();
    }

    public long sensorCollectionWifiScanDelayMs() {
        return ((Long) sensorCollectionWifiScanDelayMs.mo58455c()).longValue();
    }
}
