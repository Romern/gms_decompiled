package p000;

/* renamed from: cesv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesv implements cesu {
    public static final bdyx autoStopCollectEnabled;
    public static final bdyx autoStopCollectSecs;
    public static final bdyx clearcutLoggingExtensionEnabled;
    public static final bdyx clearcutSamplingRate;
    public static final bdyx conveyGatingOffHysteresisEnabled;
    public static final bdyx deliverFopDataNotStartedOnFopReset;
    public static final bdyx flpBluePixelBatchMaxTimeDeltaForLocationElementNanos;
    public static final bdyx flpBluePixelBatchMinBearingElements;
    public static final bdyx flpBluePixelBatchMinDurationNs;
    public static final bdyx flpBluePixelBatchMinLocationElements;
    public static final bdyx flpBluePixelBatchMinStepElements;
    public static final bdyx flpBluePixelBatchQueueMaxSize;
    public static final bdyx flpBluePixelClearcutLoggingEnabled;
    public static final bdyx flpBluePixelEarliestSupportedVersion;
    public static final bdyx flpBluePixelIgnorePreProdVersions;
    public static final bdyx flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs;
    public static final bdyx flpBluePixelNanoAppActivityGated;
    public static final bdyx flpBluePixelNanoAppGnssBatchIntervalMs;
    public static final bdyx flpBluePixelNanoAppGnssStreamIntervalMs;
    public static final bdyx flpBluePixelNanoAppMaxBatchingNs;
    public static final bdyx flpBluePixelNanoAppWifiBatchIntervalMs;
    public static final bdyx flpBluePixelNanoAppWifiStreamIntervalMs;
    public static final bdyx flpBluePixelOverruleIntervalNanos;
    public static final bdyx flpBluePixelProcessorTimeoutWindowNlpCallbackNs;
    public static final bdyx flpEnableBluePixel;
    public static final bdyx fopEnableBluePixel;
    public static final bdyx fopIaGcoreConfigIndex;
    public static final bdyx fopIaUseGcoreConfig;
    public static final bdyx gatingOffHysteresisNanos;
    public static final bdyx maximumStartedMinutes;
    public static final bdyx nlpEnableComputeWifiLocations;
    public static final bdyx requestQueueMaxSize;
    public static final bdyx requestQueueTimeoutMs;
    public static final bdyx restrictClearcutToCheckboxConsent;
    public static final bdyx useGeoMagneticField;
    public static final bdyx windowStartedHrs;

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
        autoStopCollectEnabled = bdyx.m91610a(a, "BluePixel__auto_stop_collect_enabled", true);
        autoStopCollectSecs = bdyx.m91607a(a, "BluePixel__auto_stop_collect_secs", 43200L);
        clearcutLoggingExtensionEnabled = bdyx.m91610a(a, "BluePixel__clearcut_logging_extension_enabled", false);
        clearcutSamplingRate = bdyx.m91605a(a, "BluePixel__clearcut_sampling_rate", 1.0d);
        conveyGatingOffHysteresisEnabled = bdyx.m91610a(a, "BluePixel__convey_gating_off_hysteresis_enabled", false);
        deliverFopDataNotStartedOnFopReset = bdyx.m91610a(a, "BluePixel__deliver_fop_data_not_started_on_fop_reset", false);
        flpBluePixelBatchMaxTimeDeltaForLocationElementNanos = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_max_time_delta_for_location_element_nanos", 12000000000L);
        flpBluePixelBatchMinBearingElements = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_min_bearing_elements", 2L);
        flpBluePixelBatchMinDurationNs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_min_duration_ns", 6000000000L);
        flpBluePixelBatchMinLocationElements = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_min_location_elements", 1L);
        flpBluePixelBatchMinStepElements = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_min_step_elements", 1L);
        flpBluePixelBatchQueueMaxSize = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_batch_queue_max_size", 500L);
        flpBluePixelClearcutLoggingEnabled = bdyx.m91610a(a, "BluePixel__flp_blue_pixel_clearcut_logging_enabled", true);
        flpBluePixelEarliestSupportedVersion = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_earliest_supported_version", 14L);
        flpBluePixelIgnorePreProdVersions = bdyx.m91610a(a, "BluePixel__flp_blue_pixel_ignore_pre_prod_versions", true);
        flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_instant_location_delivery_max_time_delta_ns", 1000000000L);
        flpBluePixelNanoAppActivityGated = bdyx.m91610a(a, "BluePixel__flp_blue_pixel_nano_app_activity_gated", true);
        flpBluePixelNanoAppGnssBatchIntervalMs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_nano_app_gnss_batch_interval_ms", 8000L);
        flpBluePixelNanoAppGnssStreamIntervalMs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_nano_app_gnss_stream_interval_ms", 1000L);
        flpBluePixelNanoAppMaxBatchingNs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_nano_app_max_batching_ns", 30000000000L);
        flpBluePixelNanoAppWifiBatchIntervalMs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_nano_app_wifi_batch_interval_ms", 7500L);
        flpBluePixelNanoAppWifiStreamIntervalMs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_nano_app_wifi_stream_interval_ms", 5000L);
        flpBluePixelOverruleIntervalNanos = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_overrule_interval_nanos", 10000000000L);
        flpBluePixelProcessorTimeoutWindowNlpCallbackNs = bdyx.m91607a(a, "BluePixel__flp_blue_pixel_processor_timeout_window_nlp_callback_ns", 200000000L);
        flpEnableBluePixel = bdyx.m91610a(a, "BluePixel__flp_enable_blue_pixel", false);
        fopEnableBluePixel = bdyx.m91610a(a, "BluePixel__fop_enable_blue_pixel", false);
        fopIaGcoreConfigIndex = bdyx.m91607a(a, "BluePixel__fop_ia_gcore_config_index", 6L);
        fopIaUseGcoreConfig = bdyx.m91610a(a, "BluePixel__fop_ia_use_gcore_config", false);
        gatingOffHysteresisNanos = bdyx.m91607a(a, "BluePixel__gating_off_hysteresis_nanos", 20000000000L);
        maximumStartedMinutes = bdyx.m91607a(a, "BluePixel__maximum_started_minutes", 150L);
        nlpEnableComputeWifiLocations = bdyx.m91610a(a, "BluePixel__nlp_enable_compute_wifi_locations", false);
        requestQueueMaxSize = bdyx.m91607a(a, "BluePixel__request_queue_max_size", 100L);
        requestQueueTimeoutMs = bdyx.m91607a(a, "BluePixel__request_queue_timeout_ms", 10000L);
        restrictClearcutToCheckboxConsent = bdyx.m91610a(a, "BluePixel__restrict_clearcut_to_checkbox_consent", false);
        useGeoMagneticField = bdyx.m91610a(a, "BluePixel__use_geo_magnetic_field", false);
        windowStartedHrs = bdyx.m91607a(a, "BluePixel__window_started_hrs", 24L);
    }

    public boolean autoStopCollectEnabled() {
        return ((Boolean) autoStopCollectEnabled.mo58455c()).booleanValue();
    }

    public long autoStopCollectSecs() {
        return ((Long) autoStopCollectSecs.mo58455c()).longValue();
    }

    public boolean clearcutLoggingExtensionEnabled() {
        return ((Boolean) clearcutLoggingExtensionEnabled.mo58455c()).booleanValue();
    }

    public double clearcutSamplingRate() {
        return ((Double) clearcutSamplingRate.mo58455c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean conveyGatingOffHysteresisEnabled() {
        return ((Boolean) conveyGatingOffHysteresisEnabled.mo58455c()).booleanValue();
    }

    public boolean deliverFopDataNotStartedOnFopReset() {
        return ((Boolean) deliverFopDataNotStartedOnFopReset.mo58455c()).booleanValue();
    }

    public long flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() {
        return ((Long) flpBluePixelBatchMaxTimeDeltaForLocationElementNanos.mo58455c()).longValue();
    }

    public long flpBluePixelBatchMinBearingElements() {
        return ((Long) flpBluePixelBatchMinBearingElements.mo58455c()).longValue();
    }

    public long flpBluePixelBatchMinDurationNs() {
        return ((Long) flpBluePixelBatchMinDurationNs.mo58455c()).longValue();
    }

    public long flpBluePixelBatchMinLocationElements() {
        return ((Long) flpBluePixelBatchMinLocationElements.mo58455c()).longValue();
    }

    public long flpBluePixelBatchMinStepElements() {
        return ((Long) flpBluePixelBatchMinStepElements.mo58455c()).longValue();
    }

    public long flpBluePixelBatchQueueMaxSize() {
        return ((Long) flpBluePixelBatchQueueMaxSize.mo58455c()).longValue();
    }

    public boolean flpBluePixelClearcutLoggingEnabled() {
        return ((Boolean) flpBluePixelClearcutLoggingEnabled.mo58455c()).booleanValue();
    }

    public long flpBluePixelEarliestSupportedVersion() {
        return ((Long) flpBluePixelEarliestSupportedVersion.mo58455c()).longValue();
    }

    public boolean flpBluePixelIgnorePreProdVersions() {
        return ((Boolean) flpBluePixelIgnorePreProdVersions.mo58455c()).booleanValue();
    }

    public long flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs() {
        return ((Long) flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs.mo58455c()).longValue();
    }

    public boolean flpBluePixelNanoAppActivityGated() {
        return ((Boolean) flpBluePixelNanoAppActivityGated.mo58455c()).booleanValue();
    }

    public long flpBluePixelNanoAppGnssBatchIntervalMs() {
        return ((Long) flpBluePixelNanoAppGnssBatchIntervalMs.mo58455c()).longValue();
    }

    public long flpBluePixelNanoAppGnssStreamIntervalMs() {
        return ((Long) flpBluePixelNanoAppGnssStreamIntervalMs.mo58455c()).longValue();
    }

    public long flpBluePixelNanoAppMaxBatchingNs() {
        return ((Long) flpBluePixelNanoAppMaxBatchingNs.mo58455c()).longValue();
    }

    public long flpBluePixelNanoAppWifiBatchIntervalMs() {
        return ((Long) flpBluePixelNanoAppWifiBatchIntervalMs.mo58455c()).longValue();
    }

    public long flpBluePixelNanoAppWifiStreamIntervalMs() {
        return ((Long) flpBluePixelNanoAppWifiStreamIntervalMs.mo58455c()).longValue();
    }

    public long flpBluePixelOverruleIntervalNanos() {
        return ((Long) flpBluePixelOverruleIntervalNanos.mo58455c()).longValue();
    }

    public long flpBluePixelProcessorTimeoutWindowNlpCallbackNs() {
        return ((Long) flpBluePixelProcessorTimeoutWindowNlpCallbackNs.mo58455c()).longValue();
    }

    public boolean flpEnableBluePixel() {
        return ((Boolean) flpEnableBluePixel.mo58455c()).booleanValue();
    }

    public boolean fopEnableBluePixel() {
        return ((Boolean) fopEnableBluePixel.mo58455c()).booleanValue();
    }

    public long fopIaGcoreConfigIndex() {
        return ((Long) fopIaGcoreConfigIndex.mo58455c()).longValue();
    }

    public boolean fopIaUseGcoreConfig() {
        return ((Boolean) fopIaUseGcoreConfig.mo58455c()).booleanValue();
    }

    public long gatingOffHysteresisNanos() {
        return ((Long) gatingOffHysteresisNanos.mo58455c()).longValue();
    }

    public long maximumStartedMinutes() {
        return ((Long) maximumStartedMinutes.mo58455c()).longValue();
    }

    public boolean nlpEnableComputeWifiLocations() {
        return ((Boolean) nlpEnableComputeWifiLocations.mo58455c()).booleanValue();
    }

    public long requestQueueMaxSize() {
        return ((Long) requestQueueMaxSize.mo58455c()).longValue();
    }

    public long requestQueueTimeoutMs() {
        return ((Long) requestQueueTimeoutMs.mo58455c()).longValue();
    }

    public boolean restrictClearcutToCheckboxConsent() {
        return ((Boolean) restrictClearcutToCheckboxConsent.mo58455c()).booleanValue();
    }

    public boolean useGeoMagneticField() {
        return ((Boolean) useGeoMagneticField.mo58455c()).booleanValue();
    }

    public long windowStartedHrs() {
        return ((Long) windowStartedHrs.mo58455c()).longValue();
    }
}
