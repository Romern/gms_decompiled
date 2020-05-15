package p000;

/* renamed from: ceua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceua implements cetz {
    public static final bdyx chreArAccelIntervalNs;
    public static final bdyx chreArAggregateWindowMillis;
    public static final bdyx chreArClockCheckTimeoutMs;
    public static final bdyx chreArClockDriftToResyncMs;
    public static final bdyx chreArDebugLogEnabled;
    public static final bdyx chreArDisallowDisable;
    public static final bdyx chreArEnabled;
    public static final bdyx chreArMajorityVoteWindowMillis;
    public static final bdyx chreArModel;
    public static final bdyx chreArTimeoutToIdleMs;
    public static final bdyx chreArTransitionMinVersion;
    public static final bdyx chreArTransitionMinVersionAbms;
    public static final bdyx chreArVersionToEnableRoadRailVehicle;
    public static final bdyx enableChreArBluetoothFiltering;
    public static final bdyx enableChreArWifiFiltering;
    public static final bdyx enableChreResultsBikeRelabeling;
    public static final bdyx legacyHardwareArNoOpEnabled;
    public static final bdyx numConsecutiveStillsToIdle;

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
        chreArAccelIntervalNs = bdyx.m91607a(a, "chre_ar_accel_interval_ns", 20000000L);
        chreArAggregateWindowMillis = bdyx.m91607a(a, "chre_ar_aggregate_window_millis", 20000L);
        chreArClockCheckTimeoutMs = bdyx.m91607a(a, "chre_ar_clock_check_timeout_ms", 600000L);
        chreArClockDriftToResyncMs = bdyx.m91607a(a, "chre_ar_clock_drift_to_resync_ms", 1500L);
        chreArDebugLogEnabled = bdyx.m91610a(a, "chre_ar_debug_log_enabled", false);
        chreArDisallowDisable = bdyx.m91610a(a, "chre_ar_disallow_disable", true);
        chreArEnabled = bdyx.m91610a(a, "chre_ar_enabled", true);
        chreArMajorityVoteWindowMillis = bdyx.m91607a(a, "chre_ar_majority_vote_window_millis", 60000L);
        chreArModel = bdyx.m91607a(a, "chre_ar_model", 4L);
        chreArTimeoutToIdleMs = bdyx.m91607a(a, "chre_ar_timeout_to_idle_ms", 120000L);
        chreArTransitionMinVersion = bdyx.m91607a(a, "chre_ar_transition_min_version", 131077L);
        chreArTransitionMinVersionAbms = bdyx.m91607a(a, "chre_ar_transition_min_version_abms", 65792L);
        chreArVersionToEnableRoadRailVehicle = bdyx.m91607a(a, "chre_ar_version_to_enable_road_rail_vehicle", 196608L);
        enableChreArBluetoothFiltering = bdyx.m91610a(a, "enable_chre_ar_bluetooth_filtering", false);
        enableChreArWifiFiltering = bdyx.m91610a(a, "enable_chre_ar_wifi_filtering", false);
        enableChreResultsBikeRelabeling = bdyx.m91610a(a, "enable_chre_results_bike_relabeling", false);
        legacyHardwareArNoOpEnabled = bdyx.m91610a(a, "legacy_hardware_ar_no_op_enabled", true);
        numConsecutiveStillsToIdle = bdyx.m91607a(a, "num_consecutive_stills_to_idle", 10L);
    }

    public long chreArAccelIntervalNs() {
        return ((Long) chreArAccelIntervalNs.mo58455c()).longValue();
    }

    public long chreArAggregateWindowMillis() {
        return ((Long) chreArAggregateWindowMillis.mo58455c()).longValue();
    }

    public long chreArClockCheckTimeoutMs() {
        return ((Long) chreArClockCheckTimeoutMs.mo58455c()).longValue();
    }

    public long chreArClockDriftToResyncMs() {
        return ((Long) chreArClockDriftToResyncMs.mo58455c()).longValue();
    }

    public boolean chreArDebugLogEnabled() {
        return ((Boolean) chreArDebugLogEnabled.mo58455c()).booleanValue();
    }

    public boolean chreArDisallowDisable() {
        return ((Boolean) chreArDisallowDisable.mo58455c()).booleanValue();
    }

    public boolean chreArEnabled() {
        return ((Boolean) chreArEnabled.mo58455c()).booleanValue();
    }

    public long chreArMajorityVoteWindowMillis() {
        return ((Long) chreArMajorityVoteWindowMillis.mo58455c()).longValue();
    }

    public long chreArModel() {
        return ((Long) chreArModel.mo58455c()).longValue();
    }

    public long chreArTimeoutToIdleMs() {
        return ((Long) chreArTimeoutToIdleMs.mo58455c()).longValue();
    }

    public long chreArTransitionMinVersion() {
        return ((Long) chreArTransitionMinVersion.mo58455c()).longValue();
    }

    public long chreArTransitionMinVersionAbms() {
        return ((Long) chreArTransitionMinVersionAbms.mo58455c()).longValue();
    }

    public long chreArVersionToEnableRoadRailVehicle() {
        return ((Long) chreArVersionToEnableRoadRailVehicle.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableChreArBluetoothFiltering() {
        return ((Boolean) enableChreArBluetoothFiltering.mo58455c()).booleanValue();
    }

    public boolean enableChreArWifiFiltering() {
        return ((Boolean) enableChreArWifiFiltering.mo58455c()).booleanValue();
    }

    public boolean enableChreResultsBikeRelabeling() {
        return ((Boolean) enableChreResultsBikeRelabeling.mo58455c()).booleanValue();
    }

    public boolean legacyHardwareArNoOpEnabled() {
        return ((Boolean) legacyHardwareArNoOpEnabled.mo58455c()).booleanValue();
    }

    public long numConsecutiveStillsToIdle() {
        return ((Long) numConsecutiveStillsToIdle.mo58455c()).longValue();
    }
}
