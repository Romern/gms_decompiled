package p000;

/* renamed from: cevk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevk implements cevj {
    public static final bdyx alertExperimentCheckinIntervalMillis;
    public static final bdyx alwaysCheckStaleFile;
    public static final bdyx broadAvailability;
    public static final bdyx bugfix154041665;
    public static final bdyx connectionlessTimeoutSeconds;
    public static final bdyx disableForSupervised;
    public static final bdyx enable;
    public static final bdyx enableAlertExperimentCheckin;
    public static final bdyx enableConnectivityReporting;
    public static final bdyx enableNotificationLatencyReporting;
    public static final bdyx enableNotificationReceiver;
    public static final bdyx enableOperatorReporting;
    public static final bdyx enablePbe;
    public static final bdyx enableRegionSupplier;
    public static final bdyx enabledAreas;
    public static final bdyx locationFastestIntervalMillis;
    public static final bdyx locationIntervalMillis;
    public static final bdyx maxDataStalenessMillis;
    public static final bdyx notificationLogBaseOffsetMillis;
    public static final bdyx notificationLogWindowMillis;
    public static final bdyx numSupplementalRegions;
    public static final bdyx regionLevel;
    public static final bdyx regionSupplierIntervalMillis;
    public static final bdyx useConnectionlessUlrCheck;
    public static final bdyx useFileStorage;
    public static final bdyx useNativeThread;
    public static final bdyx useNewLocationApi;
    public static final bdyx useUlrState;

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
        alertExperimentCheckinIntervalMillis = bdyx.m91607a(a, "Ealert__alert_experiment_checkin_interval_millis", 3600000L);
        alwaysCheckStaleFile = bdyx.m91610a(a, "Ealert__always_check_stale_file", false);
        broadAvailability = bdyx.m91610a(a, "Ealert__broad_availability", false);
        bugfix154041665 = bdyx.m91610a(a, "Ealert__bugfix154041665", true);
        connectionlessTimeoutSeconds = bdyx.m91607a(a, "Ealert__connectionless_timeout_seconds", 5L);
        disableForSupervised = bdyx.m91610a(a, "Ealert__disable_for_supervised", false);
        enable = bdyx.m91610a(a, "Ealert__enable", false);
        enableAlertExperimentCheckin = bdyx.m91610a(a, "Ealert__enable_alert_experiment_checkin", false);
        enableConnectivityReporting = bdyx.m91610a(a, "Ealert__enable_connectivity_reporting", true);
        enableNotificationLatencyReporting = bdyx.m91610a(a, "Ealert__enable_notification_latency_reporting", false);
        enableNotificationReceiver = bdyx.m91610a(a, "Ealert__enable_notification_receiver", false);
        enableOperatorReporting = bdyx.m91610a(a, "Ealert__enable_operator_reporting", true);
        enablePbe = bdyx.m91610a(a, "Ealert__enable_pbe", false);
        enableRegionSupplier = bdyx.m91610a(a, "Ealert__enable_region_supplier", false);
        enabledAreas = bdyx.m91609a(a, "Ealert__enabled_areas", "");
        locationFastestIntervalMillis = bdyx.m91607a(a, "Ealert__location_fastest_interval_millis", 300000L);
        locationIntervalMillis = bdyx.m91607a(a, "Ealert__location_interval_millis", 1800000L);
        maxDataStalenessMillis = bdyx.m91607a(a, "Ealert__max_data_staleness_millis", 604800000L);
        notificationLogBaseOffsetMillis = bdyx.m91607a(a, "Ealert__notification_log_base_offset_millis", 300000L);
        notificationLogWindowMillis = bdyx.m91607a(a, "Ealert__notification_log_window_millis", 1200000L);
        numSupplementalRegions = bdyx.m91607a(a, "Ealert__num_supplemental_regions", 3L);
        regionLevel = bdyx.m91607a(a, "Ealert__region_level", 8L);
        regionSupplierIntervalMillis = bdyx.m91607a(a, "Ealert__region_supplier_interval_millis", 1800000L);
        useConnectionlessUlrCheck = bdyx.m91610a(a, "Ealert__use_connectionless_ulr_check", true);
        useFileStorage = bdyx.m91610a(a, "Ealert__use_file_storage", false);
        useNativeThread = bdyx.m91610a(a, "Ealert__use_native_thread", false);
        useNewLocationApi = bdyx.m91610a(a, "Ealert__use_new_location_api", false);
        useUlrState = bdyx.m91610a(a, "Ealert__use_ulr_state", true);
    }

    public long alertExperimentCheckinIntervalMillis() {
        return ((Long) alertExperimentCheckinIntervalMillis.mo58455c()).longValue();
    }

    public boolean alwaysCheckStaleFile() {
        return ((Boolean) alwaysCheckStaleFile.mo58455c()).booleanValue();
    }

    public boolean broadAvailability() {
        return ((Boolean) broadAvailability.mo58455c()).booleanValue();
    }

    public boolean bugfix154041665() {
        return ((Boolean) bugfix154041665.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long connectionlessTimeoutSeconds() {
        return ((Long) connectionlessTimeoutSeconds.mo58455c()).longValue();
    }

    public boolean disableForSupervised() {
        return ((Boolean) disableForSupervised.mo58455c()).booleanValue();
    }

    public boolean enable() {
        return ((Boolean) enable.mo58455c()).booleanValue();
    }

    public boolean enableAlertExperimentCheckin() {
        return ((Boolean) enableAlertExperimentCheckin.mo58455c()).booleanValue();
    }

    public boolean enableConnectivityReporting() {
        return ((Boolean) enableConnectivityReporting.mo58455c()).booleanValue();
    }

    public boolean enableNotificationLatencyReporting() {
        return ((Boolean) enableNotificationLatencyReporting.mo58455c()).booleanValue();
    }

    public boolean enableNotificationReceiver() {
        return ((Boolean) enableNotificationReceiver.mo58455c()).booleanValue();
    }

    public boolean enableOperatorReporting() {
        return ((Boolean) enableOperatorReporting.mo58455c()).booleanValue();
    }

    public boolean enablePbe() {
        return ((Boolean) enablePbe.mo58455c()).booleanValue();
    }

    public boolean enableRegionSupplier() {
        return ((Boolean) enableRegionSupplier.mo58455c()).booleanValue();
    }

    public String enabledAreas() {
        return (String) enabledAreas.mo58455c();
    }

    public long locationFastestIntervalMillis() {
        return ((Long) locationFastestIntervalMillis.mo58455c()).longValue();
    }

    public long locationIntervalMillis() {
        return ((Long) locationIntervalMillis.mo58455c()).longValue();
    }

    public long maxDataStalenessMillis() {
        return ((Long) maxDataStalenessMillis.mo58455c()).longValue();
    }

    public long notificationLogBaseOffsetMillis() {
        return ((Long) notificationLogBaseOffsetMillis.mo58455c()).longValue();
    }

    public long notificationLogWindowMillis() {
        return ((Long) notificationLogWindowMillis.mo58455c()).longValue();
    }

    public long numSupplementalRegions() {
        return ((Long) numSupplementalRegions.mo58455c()).longValue();
    }

    public long regionLevel() {
        return ((Long) regionLevel.mo58455c()).longValue();
    }

    public long regionSupplierIntervalMillis() {
        return ((Long) regionSupplierIntervalMillis.mo58455c()).longValue();
    }

    public boolean useConnectionlessUlrCheck() {
        return ((Boolean) useConnectionlessUlrCheck.mo58455c()).booleanValue();
    }

    public boolean useFileStorage() {
        return ((Boolean) useFileStorage.mo58455c()).booleanValue();
    }

    public boolean useNativeThread() {
        return ((Boolean) useNativeThread.mo58455c()).booleanValue();
    }

    public boolean useNewLocationApi() {
        return ((Boolean) useNewLocationApi.mo58455c()).booleanValue();
    }

    public boolean useUlrState() {
        return ((Boolean) useUlrState.mo58455c()).booleanValue();
    }
}
