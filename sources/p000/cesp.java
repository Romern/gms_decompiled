package p000;

/* renamed from: cesp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesp implements ceso {
    public static final bdyx backgroundThrottle;
    public static final bdyx flpBackgroundBatchRequestMinIntervalMs;
    public static final bdyx flpBackgroundBatchRequestMinWaitMs;
    public static final bdyx flpBackgroundRequestMinIntervalMs;
    public static final bdyx flpBackgroundThrottleWhiteListApps;
    public static final bdyx flpBackgroundWhitelistGcoreModules;
    public static final bdyx flpForcedBackgroundApps;
    public static final bdyx flpForcedBackgroundExceptHighAccuracyApps;
    public static final bdyx flpWifiConnectionThrottleEnabled;
    public static final bdyx geofenceMinimumRadiusMeters;
    public static final bdyx geofenceMinimumResponsivenessMillis;
    public static final bdyx throttledGeofenceLocationIntervalSeconds;

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
        backgroundThrottle = bdyx.m91610a(a, "background_throttle", false);
        flpBackgroundBatchRequestMinIntervalMs = bdyx.m91607a(a, "flp_background_batch_request_min_interval_ms", 0L);
        flpBackgroundBatchRequestMinWaitMs = bdyx.m91607a(a, "flp_background_batch_request_min_wait_ms", 0L);
        flpBackgroundRequestMinIntervalMs = bdyx.m91607a(a, "flp_background_request_min_interval_ms", 0L);
        flpBackgroundThrottleWhiteListApps = bdyx.m91609a(a, "flp_background_whitelist_apps", "");
        flpBackgroundWhitelistGcoreModules = bdyx.m91609a(a, "flp_background_whitelist_gcore_modules", "com.google.android.gms.location,com.google.android.gms.location.geofencing,com.google.android.gms.location__nonwearable,com.google.android.gms.location__wearable,com.google.android.gms.places,com.google.android.gms.thunderbird,com.google.android.gms.security,com.google.android.gms.tapandpay");
        flpForcedBackgroundApps = bdyx.m91609a(a, "flp_forced_background_apps", "com.google.android.gms");
        flpForcedBackgroundExceptHighAccuracyApps = bdyx.m91609a(a, "flp_forced_background_except_high_accuracy_apps", "com.google.android.googlequicksearchbox");
        flpWifiConnectionThrottleEnabled = bdyx.m91610a(a, "flp_wifi_connection_throttle_enabled", false);
        geofenceMinimumRadiusMeters = bdyx.m91607a(a, "geofence_mininum_radius", 80L);
        geofenceMinimumResponsivenessMillis = bdyx.m91607a(a, "geofence_mininum_responsiveness", 300L);
        throttledGeofenceLocationIntervalSeconds = bdyx.m91607a(a, "throttled_geofence_location_interval", 300L);
    }

    public boolean backgroundThrottle() {
        return ((Boolean) backgroundThrottle.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long flpBackgroundBatchRequestMinIntervalMs() {
        return ((Long) flpBackgroundBatchRequestMinIntervalMs.mo58455c()).longValue();
    }

    public long flpBackgroundBatchRequestMinWaitMs() {
        return ((Long) flpBackgroundBatchRequestMinWaitMs.mo58455c()).longValue();
    }

    public long flpBackgroundRequestMinIntervalMs() {
        return ((Long) flpBackgroundRequestMinIntervalMs.mo58455c()).longValue();
    }

    public String flpBackgroundThrottleWhiteListApps() {
        return (String) flpBackgroundThrottleWhiteListApps.mo58455c();
    }

    public String flpBackgroundWhitelistGcoreModules() {
        return (String) flpBackgroundWhitelistGcoreModules.mo58455c();
    }

    public String flpForcedBackgroundApps() {
        return (String) flpForcedBackgroundApps.mo58455c();
    }

    public String flpForcedBackgroundExceptHighAccuracyApps() {
        return (String) flpForcedBackgroundExceptHighAccuracyApps.mo58455c();
    }

    public boolean flpWifiConnectionThrottleEnabled() {
        return ((Boolean) flpWifiConnectionThrottleEnabled.mo58455c()).booleanValue();
    }

    public long geofenceMinimumRadiusMeters() {
        return ((Long) geofenceMinimumRadiusMeters.mo58455c()).longValue();
    }

    public long geofenceMinimumResponsivenessMillis() {
        return ((Long) geofenceMinimumResponsivenessMillis.mo58455c()).longValue();
    }

    public long throttledGeofenceLocationIntervalSeconds() {
        return ((Long) throttledGeofenceLocationIntervalSeconds.mo58455c()).longValue();
    }
}
