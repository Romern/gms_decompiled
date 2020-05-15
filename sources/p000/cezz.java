package p000;

/* renamed from: cezz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezz implements cezy {
    public static final bdyx enableFixBufferSize;
    public static final bdyx seismicAccelAdaptiveThreshold;
    public static final bdyx seismicAccelAngles;
    public static final bdyx seismicAccelDetectOutlierAccel;
    public static final bdyx seismicAccelDetectSpikes;
    public static final bdyx seismicAccelEpochProportion;
    public static final bdyx seismicAccelFilterInputFactor;
    public static final bdyx seismicAccelFilterOutlierAccel;
    public static final bdyx seismicAccelFilterSpikes;
    public static final bdyx seismicAccelFrequency;
    public static final bdyx seismicAccelFrequencyMax;
    public static final bdyx seismicAccelFrequencyMin;
    public static final bdyx seismicAccelIndividualAdaptiveThreshold;
    public static final bdyx seismicAccelMaxVarianceThresholdM2s4;
    public static final bdyx seismicAccelMeanDiffThreshold;
    public static final bdyx seismicAccelMinVarianceThresholdM2s4;
    public static final bdyx seismicAccelOutlierAccelThreshold;
    public static final bdyx seismicAccelRejectNoisyDetectionSession;
    public static final bdyx seismicAccelReportAngles;
    public static final bdyx seismicAccelResamplingRate;
    public static final bdyx seismicAccelShortenEpoch;
    public static final bdyx seismicAccelSpikeDurationSeconds;
    public static final bdyx seismicAccelSpikeThreshold;
    public static final bdyx seismicAccelVarianceFilterAlpha;
    public static final bdyx seismicAccelVarianceThreshold;
    public static final bdyx seismicAccelVarianceThresholdFactor;
    public static final bdyx seismicAccelVarianceThresholdNoisySessionM2s4;
    public static final bdyx seismicAnglesFilterAlpha;
    public static final bdyx seismicAnglesThresholdDegrees;
    public static final bdyx seismicCollectClockSkew;
    public static final bdyx seismicDataCollection;
    public static final bdyx seismicDataCollectionBroad;
    public static final bdyx seismicDataCollectionCircles;
    public static final bdyx seismicDebugBypassBattery;
    public static final bdyx seismicDebugBypassMotion;
    public static final bdyx seismicDebugLog;
    public static final bdyx seismicDebugNotification;
    public static final bdyx seismicDetectorTimeoutMillis;
    public static final bdyx seismicDeviceTypePrecision;
    public static final bdyx seismicDisableForSupervised;
    public static final bdyx seismicEnableGls;
    public static final bdyx seismicEnableStartupDelay;
    public static final bdyx seismicEnableVibratorAccess;
    public static final bdyx seismicEventDetectionIntervalMillis;
    public static final bdyx seismicEventDetectionWindowMillis;
    public static final bdyx seismicEventReportingWindowMillis;
    public static final bdyx seismicEventThrottlingPeriodMillis;
    public static final bdyx seismicFilterActiveVibe;
    public static final bdyx seismicFilterActiveVibeIntervalMs;
    public static final bdyx seismicHeartbeatEnableS2CellReporting;
    public static final bdyx seismicHeartbeatIntervalAllowanceMillis;
    public static final bdyx seismicHeartbeatIntervalMillis;
    public static final bdyx seismicHeartbeatS2CellLevel;
    public static final bdyx seismicLocationFastestIntervalMillis;
    public static final bdyx seismicLocationPassiveIntervalMillis;
    public static final bdyx seismicMaxStartupDelayMillis;
    public static final bdyx seismicMinBatteryPercent;
    public static final bdyx seismicMinStartupDelayMillis;
    public static final bdyx seismicOffsetRefreshIntervalMillis;
    public static final bdyx seismicPowerCheckerPeriodMillis;
    public static final bdyx seismicRefactor201906;
    public static final bdyx seismicReportActiveVibe;
    public static final bdyx seismicRequireGoogleAccount;
    public static final bdyx seismicRunningPickupRecency;
    public static final bdyx seismicScreenStateUse;
    public static final bdyx seismicSendSessionFinish;
    public static final bdyx seismicSendSessionHeartbeat;
    public static final bdyx seismicSendSessionStart;
    public static final bdyx seismicShakeThrottlerConfig;
    public static final bdyx seismicUseNewLocationApi;
    public static final bdyx seismicUsePersistentThrottler;

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
        enableFixBufferSize = bdyx.m91610a(a, "enable_fix_buffer_size", false);
        seismicAccelAdaptiveThreshold = bdyx.m91610a(a, "seismic_accel_adaptive_threshold", false);
        seismicAccelAngles = bdyx.m91610a(a, "seismic_accel_angles", false);
        seismicAccelDetectOutlierAccel = bdyx.m91610a(a, "seismic_accel_detect_outlier_accel", false);
        seismicAccelDetectSpikes = bdyx.m91610a(a, "seismic_accel_detect_spikes", false);
        seismicAccelEpochProportion = bdyx.m91605a(a, "seismic_accel_epoch_proportion", 0.6d);
        seismicAccelFilterInputFactor = bdyx.m91605a(a, "seismic_accel_filter_input_factor", 2.0d);
        seismicAccelFilterOutlierAccel = bdyx.m91610a(a, "seismic_filter_outlier_accel", false);
        seismicAccelFilterSpikes = bdyx.m91610a(a, "seismic_filter_spike", false);
        seismicAccelFrequency = bdyx.m91607a(a, "seismic_accel_frequency", 20L);
        seismicAccelFrequencyMax = bdyx.m91607a(a, "seismic_accel_frequency_max", 60L);
        seismicAccelFrequencyMin = bdyx.m91607a(a, "seismic_accel_frequency_min", 10L);
        seismicAccelIndividualAdaptiveThreshold = bdyx.m91610a(a, "seismic_accel_individual_adaptive_threshold", false);
        seismicAccelMaxVarianceThresholdM2s4 = bdyx.m91605a(a, "seismic_accel_max_variance_threshold_m2s4", 0.3d);
        seismicAccelMeanDiffThreshold = bdyx.m91605a(a, "seismic_accel_mean_diff_threshold", 0.1d);
        seismicAccelMinVarianceThresholdM2s4 = bdyx.m91605a(a, "seismic_accel_min_variance_threshold_m2s4", 0.00125d);
        seismicAccelOutlierAccelThreshold = bdyx.m91605a(a, "seismic_accel_outlier_accel_threshold", 200.0d);
        seismicAccelRejectNoisyDetectionSession = bdyx.m91610a(a, "seismic_accel_reject_noisy_detection_session", false);
        seismicAccelReportAngles = bdyx.m91610a(a, "seismic_accel_report_angles", false);
        seismicAccelResamplingRate = bdyx.m91607a(a, "seismic_accel_resampling_rate", 64L);
        seismicAccelShortenEpoch = bdyx.m91610a(a, "seismic_accel_shorten_epoch", false);
        seismicAccelSpikeDurationSeconds = bdyx.m91605a(a, "seismic_accel_spike_duration_seconds", 0.1d);
        seismicAccelSpikeThreshold = bdyx.m91605a(a, "seismic_accel_spike_threshold", 0.2d);
        seismicAccelVarianceFilterAlpha = bdyx.m91605a(a, "seismic_accel_variance_filter_alpha", 0.005d);
        seismicAccelVarianceThreshold = bdyx.m91605a(a, "seismic_accel_variance_threshold", 0.1d);
        seismicAccelVarianceThresholdFactor = bdyx.m91605a(a, "seismic_accel_variance_threshold_factor", 5.0d);
        seismicAccelVarianceThresholdNoisySessionM2s4 = bdyx.m91605a(a, "seismic_accel_variance_threshold_noisy_session_m2s4", 0.29d);
        seismicAnglesFilterAlpha = bdyx.m91605a(a, "seismic_angles_filter_alpha", 0.075d);
        seismicAnglesThresholdDegrees = bdyx.m91605a(a, "seismic_angles_threshold_degrees", 30.0d);
        seismicCollectClockSkew = bdyx.m91610a(a, "seismic_collect_clock_skew", false);
        seismicDataCollection = bdyx.m91610a(a, "seismic_data_collection", false);
        seismicDataCollectionBroad = bdyx.m91610a(a, "seismic_data_collection_broad", false);
        seismicDataCollectionCircles = bdyx.m91609a(a, "seismic_data_collection_circles", "");
        seismicDebugBypassBattery = bdyx.m91610a(a, "seismic_debug_bypass_battery", false);
        seismicDebugBypassMotion = bdyx.m91610a(a, "seismic_debug_bypass_motion", false);
        seismicDebugLog = bdyx.m91610a(a, "seismic_debug_log", false);
        seismicDebugNotification = bdyx.m91610a(a, "seismic_debug_notification", false);
        seismicDetectorTimeoutMillis = bdyx.m91607a(a, "seismic_detector_timeout_millis", 200L);
        seismicDeviceTypePrecision = bdyx.m91607a(a, "seismic_device_type_precision", 1L);
        seismicDisableForSupervised = bdyx.m91610a(a, "seismic_disable_for_supervised", false);
        seismicEnableGls = bdyx.m91610a(a, "seismic_enable_gls", false);
        seismicEnableStartupDelay = bdyx.m91610a(a, "seismic_enable_startup_delay", false);
        seismicEnableVibratorAccess = bdyx.m91610a(a, "seismic_enable_vibrator_access", false);
        seismicEventDetectionIntervalMillis = bdyx.m91607a(a, "seismic_event_detection_interval_millis", 500L);
        seismicEventDetectionWindowMillis = bdyx.m91607a(a, "seismic_event_detection_window_millis", 1000L);
        seismicEventReportingWindowMillis = bdyx.m91607a(a, "seismic_event_reporting_window_millis", 10000L);
        seismicEventThrottlingPeriodMillis = bdyx.m91607a(a, "seismic_event_throttling_period_millis", 180000L);
        seismicFilterActiveVibe = bdyx.m91610a(a, "seismic_filter_active_vibe", false);
        seismicFilterActiveVibeIntervalMs = bdyx.m91607a(a, "seismic_filter_active_vibe_interval", 30000L);
        seismicHeartbeatEnableS2CellReporting = bdyx.m91610a(a, "seismic_heartbeat_enable_s2_cell_reporting", false);
        seismicHeartbeatIntervalAllowanceMillis = bdyx.m91607a(a, "seismic_heartbeat_interval_allowance_millis", 60000L);
        seismicHeartbeatIntervalMillis = bdyx.m91607a(a, "seismic_heartbeat_interval_millis", 3600000L);
        seismicHeartbeatS2CellLevel = bdyx.m91607a(a, "seismic_heartbeat_s2_cell_level", 11L);
        seismicLocationFastestIntervalMillis = bdyx.m91607a(a, "seismic_location_fastest_interval_millis", 300000L);
        seismicLocationPassiveIntervalMillis = bdyx.m91607a(a, "seismic_location_passive_interval_millis", 600000L);
        seismicMaxStartupDelayMillis = bdyx.m91607a(a, "seismic_max_startup_delay_millis", 240000L);
        seismicMinBatteryPercent = bdyx.m91607a(a, "seismic_min_battery_percent", 87L);
        seismicMinStartupDelayMillis = bdyx.m91607a(a, "seismic_min_startup_delay_millis", 60000L);
        seismicOffsetRefreshIntervalMillis = bdyx.m91607a(a, "seismic_offset_refresh_interval_millis", 600000L);
        seismicPowerCheckerPeriodMillis = bdyx.m91607a(a, "seismic_power_checker_period_millis", 1800000L);
        seismicRefactor201906 = bdyx.m91610a(a, "seismic_refactor_201906", false);
        seismicReportActiveVibe = bdyx.m91610a(a, "seismic_report_active_vibe", false);
        seismicRequireGoogleAccount = bdyx.m91610a(a, "seismic_require_google_account", false);
        seismicRunningPickupRecency = bdyx.m91607a(a, "seismic_running_pickup_recency", 100L);
        seismicScreenStateUse = bdyx.m91607a(a, "seismic_screen_state_use", 0L);
        seismicSendSessionFinish = bdyx.m91610a(a, "seismic_send_session_finish", false);
        seismicSendSessionHeartbeat = bdyx.m91610a(a, "seismic_send_session_heartbeat", false);
        seismicSendSessionStart = bdyx.m91610a(a, "seismic_send_session_start", false);
        seismicShakeThrottlerConfig = bdyx.m91609a(a, "seismic_shake_throttler_config", "120:1,300:2,86400:20");
        seismicUseNewLocationApi = bdyx.m91610a(a, "seismic_use_new_location_api", false);
        seismicUsePersistentThrottler = bdyx.m91610a(a, "seismic_use_persistent_throttler", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableFixBufferSize() {
        return ((Boolean) enableFixBufferSize.mo58455c()).booleanValue();
    }

    public boolean seismicAccelAdaptiveThreshold() {
        return ((Boolean) seismicAccelAdaptiveThreshold.mo58455c()).booleanValue();
    }

    public boolean seismicAccelAngles() {
        return ((Boolean) seismicAccelAngles.mo58455c()).booleanValue();
    }

    public boolean seismicAccelDetectOutlierAccel() {
        return ((Boolean) seismicAccelDetectOutlierAccel.mo58455c()).booleanValue();
    }

    public boolean seismicAccelDetectSpikes() {
        return ((Boolean) seismicAccelDetectSpikes.mo58455c()).booleanValue();
    }

    public double seismicAccelEpochProportion() {
        return ((Double) seismicAccelEpochProportion.mo58455c()).doubleValue();
    }

    public double seismicAccelFilterInputFactor() {
        return ((Double) seismicAccelFilterInputFactor.mo58455c()).doubleValue();
    }

    public boolean seismicAccelFilterOutlierAccel() {
        return ((Boolean) seismicAccelFilterOutlierAccel.mo58455c()).booleanValue();
    }

    public boolean seismicAccelFilterSpikes() {
        return ((Boolean) seismicAccelFilterSpikes.mo58455c()).booleanValue();
    }

    public long seismicAccelFrequency() {
        return ((Long) seismicAccelFrequency.mo58455c()).longValue();
    }

    public long seismicAccelFrequencyMax() {
        return ((Long) seismicAccelFrequencyMax.mo58455c()).longValue();
    }

    public long seismicAccelFrequencyMin() {
        return ((Long) seismicAccelFrequencyMin.mo58455c()).longValue();
    }

    public boolean seismicAccelIndividualAdaptiveThreshold() {
        return ((Boolean) seismicAccelIndividualAdaptiveThreshold.mo58455c()).booleanValue();
    }

    public double seismicAccelMaxVarianceThresholdM2s4() {
        return ((Double) seismicAccelMaxVarianceThresholdM2s4.mo58455c()).doubleValue();
    }

    public double seismicAccelMeanDiffThreshold() {
        return ((Double) seismicAccelMeanDiffThreshold.mo58455c()).doubleValue();
    }

    public double seismicAccelMinVarianceThresholdM2s4() {
        return ((Double) seismicAccelMinVarianceThresholdM2s4.mo58455c()).doubleValue();
    }

    public double seismicAccelOutlierAccelThreshold() {
        return ((Double) seismicAccelOutlierAccelThreshold.mo58455c()).doubleValue();
    }

    public boolean seismicAccelRejectNoisyDetectionSession() {
        return ((Boolean) seismicAccelRejectNoisyDetectionSession.mo58455c()).booleanValue();
    }

    public boolean seismicAccelReportAngles() {
        return ((Boolean) seismicAccelReportAngles.mo58455c()).booleanValue();
    }

    public long seismicAccelResamplingRate() {
        return ((Long) seismicAccelResamplingRate.mo58455c()).longValue();
    }

    public boolean seismicAccelShortenEpoch() {
        return ((Boolean) seismicAccelShortenEpoch.mo58455c()).booleanValue();
    }

    public double seismicAccelSpikeDurationSeconds() {
        return ((Double) seismicAccelSpikeDurationSeconds.mo58455c()).doubleValue();
    }

    public double seismicAccelSpikeThreshold() {
        return ((Double) seismicAccelSpikeThreshold.mo58455c()).doubleValue();
    }

    public double seismicAccelVarianceFilterAlpha() {
        return ((Double) seismicAccelVarianceFilterAlpha.mo58455c()).doubleValue();
    }

    public double seismicAccelVarianceThreshold() {
        return ((Double) seismicAccelVarianceThreshold.mo58455c()).doubleValue();
    }

    public double seismicAccelVarianceThresholdFactor() {
        return ((Double) seismicAccelVarianceThresholdFactor.mo58455c()).doubleValue();
    }

    public double seismicAccelVarianceThresholdNoisySessionM2s4() {
        return ((Double) seismicAccelVarianceThresholdNoisySessionM2s4.mo58455c()).doubleValue();
    }

    public double seismicAnglesFilterAlpha() {
        return ((Double) seismicAnglesFilterAlpha.mo58455c()).doubleValue();
    }

    public double seismicAnglesThresholdDegrees() {
        return ((Double) seismicAnglesThresholdDegrees.mo58455c()).doubleValue();
    }

    public boolean seismicCollectClockSkew() {
        return ((Boolean) seismicCollectClockSkew.mo58455c()).booleanValue();
    }

    public boolean seismicDataCollection() {
        return ((Boolean) seismicDataCollection.mo58455c()).booleanValue();
    }

    public boolean seismicDataCollectionBroad() {
        return ((Boolean) seismicDataCollectionBroad.mo58455c()).booleanValue();
    }

    public String seismicDataCollectionCircles() {
        return (String) seismicDataCollectionCircles.mo58455c();
    }

    public boolean seismicDebugBypassBattery() {
        return ((Boolean) seismicDebugBypassBattery.mo58455c()).booleanValue();
    }

    public boolean seismicDebugBypassMotion() {
        return ((Boolean) seismicDebugBypassMotion.mo58455c()).booleanValue();
    }

    public boolean seismicDebugLog() {
        return ((Boolean) seismicDebugLog.mo58455c()).booleanValue();
    }

    public boolean seismicDebugNotification() {
        return ((Boolean) seismicDebugNotification.mo58455c()).booleanValue();
    }

    public long seismicDetectorTimeoutMillis() {
        return ((Long) seismicDetectorTimeoutMillis.mo58455c()).longValue();
    }

    public long seismicDeviceTypePrecision() {
        return ((Long) seismicDeviceTypePrecision.mo58455c()).longValue();
    }

    public boolean seismicDisableForSupervised() {
        return ((Boolean) seismicDisableForSupervised.mo58455c()).booleanValue();
    }

    public boolean seismicEnableGls() {
        return ((Boolean) seismicEnableGls.mo58455c()).booleanValue();
    }

    public boolean seismicEnableStartupDelay() {
        return ((Boolean) seismicEnableStartupDelay.mo58455c()).booleanValue();
    }

    public boolean seismicEnableVibratorAccess() {
        return ((Boolean) seismicEnableVibratorAccess.mo58455c()).booleanValue();
    }

    public long seismicEventDetectionIntervalMillis() {
        return ((Long) seismicEventDetectionIntervalMillis.mo58455c()).longValue();
    }

    public long seismicEventDetectionWindowMillis() {
        return ((Long) seismicEventDetectionWindowMillis.mo58455c()).longValue();
    }

    public long seismicEventReportingWindowMillis() {
        return ((Long) seismicEventReportingWindowMillis.mo58455c()).longValue();
    }

    public long seismicEventThrottlingPeriodMillis() {
        return ((Long) seismicEventThrottlingPeriodMillis.mo58455c()).longValue();
    }

    public boolean seismicFilterActiveVibe() {
        return ((Boolean) seismicFilterActiveVibe.mo58455c()).booleanValue();
    }

    public long seismicFilterActiveVibeIntervalMs() {
        return ((Long) seismicFilterActiveVibeIntervalMs.mo58455c()).longValue();
    }

    public boolean seismicHeartbeatEnableS2CellReporting() {
        return ((Boolean) seismicHeartbeatEnableS2CellReporting.mo58455c()).booleanValue();
    }

    public long seismicHeartbeatIntervalAllowanceMillis() {
        return ((Long) seismicHeartbeatIntervalAllowanceMillis.mo58455c()).longValue();
    }

    public long seismicHeartbeatIntervalMillis() {
        return ((Long) seismicHeartbeatIntervalMillis.mo58455c()).longValue();
    }

    public long seismicHeartbeatS2CellLevel() {
        return ((Long) seismicHeartbeatS2CellLevel.mo58455c()).longValue();
    }

    public long seismicLocationFastestIntervalMillis() {
        return ((Long) seismicLocationFastestIntervalMillis.mo58455c()).longValue();
    }

    public long seismicLocationPassiveIntervalMillis() {
        return ((Long) seismicLocationPassiveIntervalMillis.mo58455c()).longValue();
    }

    public long seismicMaxStartupDelayMillis() {
        return ((Long) seismicMaxStartupDelayMillis.mo58455c()).longValue();
    }

    public long seismicMinBatteryPercent() {
        return ((Long) seismicMinBatteryPercent.mo58455c()).longValue();
    }

    public long seismicMinStartupDelayMillis() {
        return ((Long) seismicMinStartupDelayMillis.mo58455c()).longValue();
    }

    public long seismicOffsetRefreshIntervalMillis() {
        return ((Long) seismicOffsetRefreshIntervalMillis.mo58455c()).longValue();
    }

    public long seismicPowerCheckerPeriodMillis() {
        return ((Long) seismicPowerCheckerPeriodMillis.mo58455c()).longValue();
    }

    public boolean seismicRefactor201906() {
        return ((Boolean) seismicRefactor201906.mo58455c()).booleanValue();
    }

    public boolean seismicReportActiveVibe() {
        return ((Boolean) seismicReportActiveVibe.mo58455c()).booleanValue();
    }

    public boolean seismicRequireGoogleAccount() {
        return ((Boolean) seismicRequireGoogleAccount.mo58455c()).booleanValue();
    }

    public long seismicRunningPickupRecency() {
        return ((Long) seismicRunningPickupRecency.mo58455c()).longValue();
    }

    public long seismicScreenStateUse() {
        return ((Long) seismicScreenStateUse.mo58455c()).longValue();
    }

    public boolean seismicSendSessionFinish() {
        return ((Boolean) seismicSendSessionFinish.mo58455c()).booleanValue();
    }

    public boolean seismicSendSessionHeartbeat() {
        return ((Boolean) seismicSendSessionHeartbeat.mo58455c()).booleanValue();
    }

    public boolean seismicSendSessionStart() {
        return ((Boolean) seismicSendSessionStart.mo58455c()).booleanValue();
    }

    public String seismicShakeThrottlerConfig() {
        return (String) seismicShakeThrottlerConfig.mo58455c();
    }

    public boolean seismicUseNewLocationApi() {
        return ((Boolean) seismicUseNewLocationApi.mo58455c()).booleanValue();
    }

    public boolean seismicUsePersistentThrottler() {
        return ((Boolean) seismicUsePersistentThrottler.mo58455c()).booleanValue();
    }
}
