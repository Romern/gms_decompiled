package p000;

/* renamed from: cesg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesg implements cesf {
    public static final bdyx aaeRelabelArResultsAsVehicle;
    public static final bdyx activityLowPowerModeEnabled;
    public static final bdyx activityPowerSaveModeMinIntervalMillis;
    public static final bdyx allowInstantAlarm;
    public static final bdyx arBatchingApiLatencyFixRollback;
    public static final bdyx arDisallowActivityDetectionDisable;
    public static final bdyx arWakeupAlignToMinute;
    public static final bdyx collectBluetoothInVehicleDeviceClassification;
    public static final bdyx downSampleArIntervalMs;
    public static final bdyx emulateHardwareActivityRecognitionFlush;
    public static final bdyx enableActivityRecognitionClearcutLogging;
    public static final bdyx enableActivityRecognitionThrottling;
    public static final bdyx enableAppImportanceListener;
    public static final bdyx enableBluetoothInVehicle;
    public static final bdyx enableBluetoothInVehicleLowLatency;
    public static final bdyx enableGmmBluetoothMetrics;
    public static final bdyx enableGmmHistoryTracker;
    public static final bdyx minArIntervalMs;
    public static final bdyx mockActivityType;
    public static final bdyx motionClearsDeepStillState;
    public static final bdyx registerPowerConnectionBroadcasts;
    public static final bdyx relabelActivityWhenWifiConnected;
    public static final bdyx sensorBatchingEnabled;
    public static final bdyx sensorBatchingFlushTimeoutMillis;
    public static final bdyx sensorBatchingNonwearableMaxPeriodMillis;
    public static final bdyx sensorBatchingOnWatchEnabled;
    public static final bdyx sensorBatchingProbDelayConst;
    public static final bdyx sensorBatchingProbMin;
    public static final bdyx significantMotionEnabled;
    public static final bdyx trackActivityPowerModeTimeProb;
    public static final bdyx userDomain;
    public static final bdyx wakeUpTiltDetectorEnabled;
    public static final bdyx wristTiltEnabled;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        aaeRelabelArResultsAsVehicle = bdyx.m91610a(a, "aae_relabel_ar_results_as_vehicle", true);
        activityLowPowerModeEnabled = bdyx.m91610a(a, "activity_low_power_mode_enabled", true);
        activityPowerSaveModeMinIntervalMillis = bdyx.m91607a(a, "activity_power_save_mode_min_interval_millis", 300000L);
        allowInstantAlarm = bdyx.m91610a(a, "allow_instant_alarm", false);
        arBatchingApiLatencyFixRollback = bdyx.m91610a(a, "ar_batching_api_latency_fix_rollback", false);
        arDisallowActivityDetectionDisable = bdyx.m91610a(a, "ar_disallow_activity_detection_disable", true);
        arWakeupAlignToMinute = bdyx.m91610a(a, "ar_wakeup_align_to_minute", true);
        collectBluetoothInVehicleDeviceClassification = bdyx.m91610a(a, "collect_bluetooth_in_vehicle_device_classification", false);
        downSampleArIntervalMs = bdyx.m91607a(a, "down_sample_ar_interval_ms", 120000L);
        emulateHardwareActivityRecognitionFlush = bdyx.m91610a(a, "emulate_hardware_activity_recognition_flush", false);
        enableActivityRecognitionClearcutLogging = bdyx.m91610a(a, "enable_activity_recognition_clearcut_logging", true);
        enableActivityRecognitionThrottling = bdyx.m91610a(a, "enable_activity_recognition_throttling", false);
        enableAppImportanceListener = bdyx.m91610a(a, "enable_app_importance_listener", false);
        enableBluetoothInVehicle = bdyx.m91610a(a, "enable_bluetooth_in_vehicle", true);
        enableBluetoothInVehicleLowLatency = bdyx.m91610a(a, "enable_bluetooth_in_vehicle_low_latency", true);
        enableGmmBluetoothMetrics = bdyx.m91610a(a, "enable_gmm_bluetooth_metrics", false);
        enableGmmHistoryTracker = bdyx.m91610a(a, "enable_gmm_history_tracker", false);
        minArIntervalMs = bdyx.m91607a(a, "min_ar_interval_ms", 60000L);
        mockActivityType = bdyx.m91609a(a, "mock_activity_type", "");
        motionClearsDeepStillState = bdyx.m91610a(a, "motion_clears_deep_still_state", false);
        registerPowerConnectionBroadcasts = bdyx.m91610a(a, "register_power_connection_broadcasts", true);
        relabelActivityWhenWifiConnected = bdyx.m91610a(a, "relabel_activity_when_wifi_connected", true);
        sensorBatchingEnabled = bdyx.m91610a(a, "sensor_batching_enabled", false);
        sensorBatchingFlushTimeoutMillis = bdyx.m91607a(a, "sensor_batching_flush_timeout_millis", 200L);
        sensorBatchingNonwearableMaxPeriodMillis = bdyx.m91607a(a, "sensor_batching_max_period", 240000L);
        sensorBatchingOnWatchEnabled = bdyx.m91610a(a, "sensor_batching_on_watch_enabled", true);
        sensorBatchingProbDelayConst = bdyx.m91605a(a, "sensor_batching_prob_decay_const", 0.8d);
        sensorBatchingProbMin = bdyx.m91605a(a, "sensor_batching_prob_min", 0.01d);
        significantMotionEnabled = bdyx.m91610a(a, "significant_motion_enabled", true);
        trackActivityPowerModeTimeProb = bdyx.m91605a(a, "track_activity_power_mode_time_prob", 0.00390625d);
        userDomain = bdyx.m91609a(a, "user_domain", "");
        wakeUpTiltDetectorEnabled = bdyx.m91610a(a, "wake_up_tilt_detector_enabled", true);
        wristTiltEnabled = bdyx.m91610a(a, "wrist_tilt_enabled", true);
    }

    public boolean aaeRelabelArResultsAsVehicle() {
        return ((Boolean) aaeRelabelArResultsAsVehicle.mo58455c()).booleanValue();
    }

    public boolean activityLowPowerModeEnabled() {
        return ((Boolean) activityLowPowerModeEnabled.mo58455c()).booleanValue();
    }

    public long activityPowerSaveModeMinIntervalMillis() {
        return ((Long) activityPowerSaveModeMinIntervalMillis.mo58455c()).longValue();
    }

    public boolean allowInstantAlarm() {
        return ((Boolean) allowInstantAlarm.mo58455c()).booleanValue();
    }

    public boolean arBatchingApiLatencyFixRollback() {
        return ((Boolean) arBatchingApiLatencyFixRollback.mo58455c()).booleanValue();
    }

    public boolean arDisallowActivityDetectionDisable() {
        return ((Boolean) arDisallowActivityDetectionDisable.mo58455c()).booleanValue();
    }

    public boolean arWakeupAlignToMinute() {
        return ((Boolean) arWakeupAlignToMinute.mo58455c()).booleanValue();
    }

    public boolean collectBluetoothInVehicleDeviceClassification() {
        return ((Boolean) collectBluetoothInVehicleDeviceClassification.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long downSampleArIntervalMs() {
        return ((Long) downSampleArIntervalMs.mo58455c()).longValue();
    }

    public boolean emulateHardwareActivityRecognitionFlush() {
        return ((Boolean) emulateHardwareActivityRecognitionFlush.mo58455c()).booleanValue();
    }

    public boolean enableActivityRecognitionClearcutLogging() {
        return ((Boolean) enableActivityRecognitionClearcutLogging.mo58455c()).booleanValue();
    }

    public boolean enableActivityRecognitionThrottling() {
        return ((Boolean) enableActivityRecognitionThrottling.mo58455c()).booleanValue();
    }

    public boolean enableAppImportanceListener() {
        return ((Boolean) enableAppImportanceListener.mo58455c()).booleanValue();
    }

    public boolean enableBluetoothInVehicle() {
        return ((Boolean) enableBluetoothInVehicle.mo58455c()).booleanValue();
    }

    public boolean enableBluetoothInVehicleLowLatency() {
        return ((Boolean) enableBluetoothInVehicleLowLatency.mo58455c()).booleanValue();
    }

    public boolean enableGmmBluetoothMetrics() {
        return ((Boolean) enableGmmBluetoothMetrics.mo58455c()).booleanValue();
    }

    public boolean enableGmmHistoryTracker() {
        return ((Boolean) enableGmmHistoryTracker.mo58455c()).booleanValue();
    }

    public long minArIntervalMs() {
        return ((Long) minArIntervalMs.mo58455c()).longValue();
    }

    public String mockActivityType() {
        return (String) mockActivityType.mo58455c();
    }

    public boolean motionClearsDeepStillState() {
        return ((Boolean) motionClearsDeepStillState.mo58455c()).booleanValue();
    }

    public boolean registerPowerConnectionBroadcasts() {
        return ((Boolean) registerPowerConnectionBroadcasts.mo58455c()).booleanValue();
    }

    public boolean relabelActivityWhenWifiConnected() {
        return ((Boolean) relabelActivityWhenWifiConnected.mo58455c()).booleanValue();
    }

    public boolean sensorBatchingEnabled() {
        return ((Boolean) sensorBatchingEnabled.mo58455c()).booleanValue();
    }

    public long sensorBatchingFlushTimeoutMillis() {
        return ((Long) sensorBatchingFlushTimeoutMillis.mo58455c()).longValue();
    }

    public long sensorBatchingNonwearableMaxPeriodMillis() {
        return ((Long) sensorBatchingNonwearableMaxPeriodMillis.mo58455c()).longValue();
    }

    public boolean sensorBatchingOnWatchEnabled() {
        return ((Boolean) sensorBatchingOnWatchEnabled.mo58455c()).booleanValue();
    }

    public double sensorBatchingProbDelayConst() {
        return ((Double) sensorBatchingProbDelayConst.mo58455c()).doubleValue();
    }

    public double sensorBatchingProbMin() {
        return ((Double) sensorBatchingProbMin.mo58455c()).doubleValue();
    }

    public boolean significantMotionEnabled() {
        return ((Boolean) significantMotionEnabled.mo58455c()).booleanValue();
    }

    public double trackActivityPowerModeTimeProb() {
        return ((Double) trackActivityPowerModeTimeProb.mo58455c()).doubleValue();
    }

    public String userDomain() {
        return (String) userDomain.mo58455c();
    }

    public boolean wakeUpTiltDetectorEnabled() {
        return ((Boolean) wakeUpTiltDetectorEnabled.mo58455c()).booleanValue();
    }

    public boolean wristTiltEnabled() {
        return ((Boolean) wristTiltEnabled.mo58455c()).booleanValue();
    }
}
