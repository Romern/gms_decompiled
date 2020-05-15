package p000;

/* renamed from: cevy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevy implements cevx {
    public static final bdyx aaeFlpGpsForward;
    public static final bdyx analyticsEnabled;
    public static final bdyx analyticsTrackingId;
    public static final bdyx bugfixLsdAlwaysOk;
    public static final bdyx bugfixLsdReadProvider;
    public static final bdyx bugfixReferenceEscapeInFusionEngine;
    public static final bdyx bugfixReleaseClientResource;
    public static final bdyx catchSecurityException;
    public static final bdyx enablePressureInFusionEngine;
    public static final bdyx eventLogSize;
    public static final bdyx fixGlsConsentAtv;
    public static final bdyx flpAllowedDeliveryAgeMs;
    public static final bdyx flpEnableDebugLogging;
    public static final bdyx flpEnablePdrOnlyWhenScreenIsOn;
    public static final bdyx flpEnableSensorfusionLogs;
    public static final bdyx flpFusionGpsRequestTimePeriodSec;
    public static final bdyx flpFusionNearIndoorGpsSnrThreshold;
    public static final bdyx flpFusionWifiRequestTimePeriodSec;
    public static final bdyx flpHighPowerGpsPulseMs;
    public static final bdyx flpMinArScreenOfOrNoHighAccuracyIntervalMs;
    public static final bdyx flpMinArScreenOnHighAccuracyIntervalMs;
    public static final bdyx flpMinIntervalToPulseGpsMs;

    /* renamed from: flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled */
    public static final bdyx f183467x2e94cc0b;

    /* renamed from: flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled */
    public static final bdyx f183468x4ecc0320;
    public static final bdyx flpScreenOnHighAccuracyModeEnabled;
    public static final bdyx flpUsePdr;
    public static final bdyx g2kRolloverCorrection;
    public static final bdyx locationModeBufferDelayMs;
    public static final bdyx logSensorFusionOutputPosition;
    public static final bdyx minSdkForRemovalCallback;
    public static final bdyx pressureRequestMaxDurationMs;
    public static final bdyx pressureRequestMinDurationMs;
    public static final bdyx pressureSamplingIntervalUs;
    public static final bdyx removeGacUsage;
    public static final bdyx removeIndoorLevelAndFloor;
    public static final bdyx sendCallbackOnRemoval;
    public static final bdyx sensorFusionOutputPositionLogMaxBufferSize;
    public static final bdyx sensorFusionOutputPositionLogTimeWindowSec;
    public static final bdyx setWearableRequestModuleId;
    public static final bdyx supportMaxLocationAge;
    public static final bdyx uploadLocationPermission;
    public static final bdyx useAaeLocationCaching;
    public static final bdyx useFullLocationForCoarse;
    public static final bdyx useGnssStatus;
    public static final bdyx useReflectedSystemApis;

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
        aaeFlpGpsForward = bdyx.m91610a(a, "Flp__aae_flp_gps_forward", true);
        analyticsEnabled = bdyx.m91610a(a, "analytics_enabled", false);
        analyticsTrackingId = bdyx.m91609a(a, "analytics_tracking_id", "UA-44492294-1");
        bugfixLsdAlwaysOk = bdyx.m91610a(a, "Flp__bugfix_lsd_always_ok", true);
        bugfixLsdReadProvider = bdyx.m91610a(a, "Flp__bugfix_lsd_read_provider", true);
        bugfixReferenceEscapeInFusionEngine = bdyx.m91610a(a, "Flp__bugfix_reference_escape_in_fusion_engine", false);
        bugfixReleaseClientResource = bdyx.m91610a(a, "Flp__bugfix_release_client_resource", true);
        catchSecurityException = bdyx.m91610a(a, "Flp__catch_security_exception", true);
        enablePressureInFusionEngine = bdyx.m91610a(a, "Flp__enable_pressure_in_fusion_engine", false);
        eventLogSize = bdyx.m91607a(a, "flp_event_log_size", 500L);
        fixGlsConsentAtv = bdyx.m91610a(a, "Flp__fix_gls_consent_atv", true);
        flpAllowedDeliveryAgeMs = bdyx.m91607a(a, "flp_allowed_delivery_age_ms", 15000L);
        flpEnableDebugLogging = bdyx.m91610a(a, "flp_enable_debug_logging", false);
        flpEnablePdrOnlyWhenScreenIsOn = bdyx.m91610a(a, "flp_enable_pdr_only_when_screen_on", false);
        flpEnableSensorfusionLogs = bdyx.m91610a(a, "flp_enable_sensorfusion_logs", true);
        flpFusionGpsRequestTimePeriodSec = bdyx.m91607a(a, "flp_fusion_gps_request_time_period_sec", 1L);
        flpFusionNearIndoorGpsSnrThreshold = bdyx.m91607a(a, "flp_fusion_near_indoor_gps_snr_threshold", 25L);
        flpFusionWifiRequestTimePeriodSec = bdyx.m91607a(a, "flp_fusion_wifi_request_time_period_sec", 5L);
        flpHighPowerGpsPulseMs = bdyx.m91607a(a, "flp_high_power_gps_pulse_ms", 30000L);
        flpMinArScreenOfOrNoHighAccuracyIntervalMs = bdyx.m91607a(a, "flp_min_ar_screen_off_or_no_high_accuracy_interval_ms", 30000L);
        flpMinArScreenOnHighAccuracyIntervalMs = bdyx.m91607a(a, "flp_min_ar_screen_on_high_accuracy_interval_ms", 0L);
        flpMinIntervalToPulseGpsMs = bdyx.m91607a(a, "flp_min_interval_to_pulse_gps_ms", 45000L);
        f183467x2e94cc0b = bdyx.m91610a(a, "flp_particle_fusion_disable_passive_provider_controller_when_location_disabled", true);
        f183468x4ecc0320 = bdyx.m91610a(a, "flp_particle_fusion_disable_step_and_ar_provider_controller_when_location_disabled", true);
        flpScreenOnHighAccuracyModeEnabled = bdyx.m91610a(a, "flp_screen_on_high_accuracy_mode_enabled", true);
        flpUsePdr = bdyx.m91610a(a, "flp_use_pdr", true);
        g2kRolloverCorrection = bdyx.m91610a(a, "Flp__g2k_rollover_correction", false);
        locationModeBufferDelayMs = bdyx.m91607a(a, "Flp__location_mode_buffer_delay_ms", 50L);
        logSensorFusionOutputPosition = bdyx.m91610a(a, "Flp__log_sensor_fusion_output_position", false);
        minSdkForRemovalCallback = bdyx.m91607a(a, "Flp__min_sdk_for_removal_callback", 200500000L);
        pressureRequestMaxDurationMs = bdyx.m91607a(a, "Flp__pressure_request_max_duration_ms", 2000L);
        pressureRequestMinDurationMs = bdyx.m91607a(a, "Flp__pressure_request_min_duration_ms", 1000L);
        pressureSamplingIntervalUs = bdyx.m91607a(a, "Flp__pressure_sampling_interval_us", 100000L);
        removeGacUsage = bdyx.m91610a(a, "Flp__remove_gac_usage", true);
        removeIndoorLevelAndFloor = bdyx.m91610a(a, "Flp__remove_indoor_level_and_floor", false);
        sendCallbackOnRemoval = bdyx.m91610a(a, "Flp__send_callback_on_removal", false);
        sensorFusionOutputPositionLogMaxBufferSize = bdyx.m91607a(a, "Flp__sensor_fusion_output_position_log_max_buffer_size", 900L);
        sensorFusionOutputPositionLogTimeWindowSec = bdyx.m91607a(a, "Flp__sensor_fusion_output_position_log_time_window_sec", 600L);
        setWearableRequestModuleId = bdyx.m91610a(a, "Flp__set_wearable_request_module_id", true);
        supportMaxLocationAge = bdyx.m91610a(a, "Flp__support_max_location_age", false);
        uploadLocationPermission = bdyx.m91610a(a, "Flp__upload_location_permission", false);
        useAaeLocationCaching = bdyx.m91610a(a, "Flp__use_aae_location_caching", false);
        useFullLocationForCoarse = bdyx.m91610a(a, "Flp__use_full_location_for_coarse", false);
        useGnssStatus = bdyx.m91610a(a, "Flp__use_gnss_status", false);
        useReflectedSystemApis = bdyx.m91610a(a, "Flp__use_reflected_system_apis", true);
    }

    public boolean aaeFlpGpsForward() {
        return ((Boolean) aaeFlpGpsForward.mo58455c()).booleanValue();
    }

    public boolean analyticsEnabled() {
        return ((Boolean) analyticsEnabled.mo58455c()).booleanValue();
    }

    public String analyticsTrackingId() {
        return (String) analyticsTrackingId.mo58455c();
    }

    public boolean bugfixLsdAlwaysOk() {
        return ((Boolean) bugfixLsdAlwaysOk.mo58455c()).booleanValue();
    }

    public boolean bugfixLsdReadProvider() {
        return ((Boolean) bugfixLsdReadProvider.mo58455c()).booleanValue();
    }

    public boolean bugfixReferenceEscapeInFusionEngine() {
        return ((Boolean) bugfixReferenceEscapeInFusionEngine.mo58455c()).booleanValue();
    }

    public boolean bugfixReleaseClientResource() {
        return ((Boolean) bugfixReleaseClientResource.mo58455c()).booleanValue();
    }

    public boolean catchSecurityException() {
        return ((Boolean) catchSecurityException.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enablePressureInFusionEngine() {
        return ((Boolean) enablePressureInFusionEngine.mo58455c()).booleanValue();
    }

    public long eventLogSize() {
        return ((Long) eventLogSize.mo58455c()).longValue();
    }

    public boolean fixGlsConsentAtv() {
        return ((Boolean) fixGlsConsentAtv.mo58455c()).booleanValue();
    }

    public long flpAllowedDeliveryAgeMs() {
        return ((Long) flpAllowedDeliveryAgeMs.mo58455c()).longValue();
    }

    public boolean flpEnableDebugLogging() {
        return ((Boolean) flpEnableDebugLogging.mo58455c()).booleanValue();
    }

    public boolean flpEnablePdrOnlyWhenScreenIsOn() {
        return ((Boolean) flpEnablePdrOnlyWhenScreenIsOn.mo58455c()).booleanValue();
    }

    public boolean flpEnableSensorfusionLogs() {
        return ((Boolean) flpEnableSensorfusionLogs.mo58455c()).booleanValue();
    }

    public long flpFusionGpsRequestTimePeriodSec() {
        return ((Long) flpFusionGpsRequestTimePeriodSec.mo58455c()).longValue();
    }

    public long flpFusionNearIndoorGpsSnrThreshold() {
        return ((Long) flpFusionNearIndoorGpsSnrThreshold.mo58455c()).longValue();
    }

    public long flpFusionWifiRequestTimePeriodSec() {
        return ((Long) flpFusionWifiRequestTimePeriodSec.mo58455c()).longValue();
    }

    public long flpHighPowerGpsPulseMs() {
        return ((Long) flpHighPowerGpsPulseMs.mo58455c()).longValue();
    }

    public long flpMinArScreenOfOrNoHighAccuracyIntervalMs() {
        return ((Long) flpMinArScreenOfOrNoHighAccuracyIntervalMs.mo58455c()).longValue();
    }

    public long flpMinArScreenOnHighAccuracyIntervalMs() {
        return ((Long) flpMinArScreenOnHighAccuracyIntervalMs.mo58455c()).longValue();
    }

    public long flpMinIntervalToPulseGpsMs() {
        return ((Long) flpMinIntervalToPulseGpsMs.mo58455c()).longValue();
    }

    /* renamed from: flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled */
    public boolean mo80284x2e94cc0b() {
        return ((Boolean) f183467x2e94cc0b.mo58455c()).booleanValue();
    }

    /* renamed from: flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled */
    public boolean mo80261x4ecc0320() {
        return ((Boolean) f183468x4ecc0320.mo58455c()).booleanValue();
    }

    public boolean flpScreenOnHighAccuracyModeEnabled() {
        return ((Boolean) flpScreenOnHighAccuracyModeEnabled.mo58455c()).booleanValue();
    }

    public boolean flpUsePdr() {
        return ((Boolean) flpUsePdr.mo58455c()).booleanValue();
    }

    public boolean g2kRolloverCorrection() {
        return ((Boolean) g2kRolloverCorrection.mo58455c()).booleanValue();
    }

    public long locationModeBufferDelayMs() {
        return ((Long) locationModeBufferDelayMs.mo58455c()).longValue();
    }

    public boolean logSensorFusionOutputPosition() {
        return ((Boolean) logSensorFusionOutputPosition.mo58455c()).booleanValue();
    }

    public long minSdkForRemovalCallback() {
        return ((Long) minSdkForRemovalCallback.mo58455c()).longValue();
    }

    public long pressureRequestMaxDurationMs() {
        return ((Long) pressureRequestMaxDurationMs.mo58455c()).longValue();
    }

    public long pressureRequestMinDurationMs() {
        return ((Long) pressureRequestMinDurationMs.mo58455c()).longValue();
    }

    public long pressureSamplingIntervalUs() {
        return ((Long) pressureSamplingIntervalUs.mo58455c()).longValue();
    }

    public boolean removeGacUsage() {
        return ((Boolean) removeGacUsage.mo58455c()).booleanValue();
    }

    public boolean removeIndoorLevelAndFloor() {
        return ((Boolean) removeIndoorLevelAndFloor.mo58455c()).booleanValue();
    }

    public boolean sendCallbackOnRemoval() {
        return ((Boolean) sendCallbackOnRemoval.mo58455c()).booleanValue();
    }

    public long sensorFusionOutputPositionLogMaxBufferSize() {
        return ((Long) sensorFusionOutputPositionLogMaxBufferSize.mo58455c()).longValue();
    }

    public long sensorFusionOutputPositionLogTimeWindowSec() {
        return ((Long) sensorFusionOutputPositionLogTimeWindowSec.mo58455c()).longValue();
    }

    public boolean setWearableRequestModuleId() {
        return ((Boolean) setWearableRequestModuleId.mo58455c()).booleanValue();
    }

    public boolean supportMaxLocationAge() {
        return ((Boolean) supportMaxLocationAge.mo58455c()).booleanValue();
    }

    public boolean uploadLocationPermission() {
        return ((Boolean) uploadLocationPermission.mo58455c()).booleanValue();
    }

    public boolean useAaeLocationCaching() {
        return ((Boolean) useAaeLocationCaching.mo58455c()).booleanValue();
    }

    public boolean useFullLocationForCoarse() {
        return ((Boolean) useFullLocationForCoarse.mo58455c()).booleanValue();
    }

    public boolean useGnssStatus() {
        return ((Boolean) useGnssStatus.mo58455c()).booleanValue();
    }

    public boolean useReflectedSystemApis() {
        return ((Boolean) useReflectedSystemApis.mo58455c()).booleanValue();
    }
}
