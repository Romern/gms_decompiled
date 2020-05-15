package p000;

/* renamed from: cesj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesj implements cesi {
    public static final bdyx arDeepStillTransitioningEnabled;
    public static final bdyx arReportTransitionOnClientAdded;
    public static final bdyx arTransitionApplyPersonalConfidenceFilter;
    public static final bdyx arTransitionBikingWifiFilteringEnabled;
    public static final bdyx arTransitionEventLogging;
    public static final bdyx arTransitionFastVehicleexitOnfootEnabled;
    public static final bdyx arTransitionFilteringEnabled;
    public static final bdyx arTransitionHardwareSoftwareSwitchEnabled;
    public static final bdyx arTransitionVehicleBluetoothFilteringEnabled;
    public static final bdyx arTransitionVehicleBluetoothTimeoutOptimizations;
    public static final bdyx arTransitionWifiFilteringEnabled;
    public static final bdyx bikeHighConfidenceThreshold;
    public static final bdyx enableActivityTransitionDetection;
    public static final bdyx enableAdaptiveWifiSampling;
    public static final bdyx footHighConfidenceThreshold;
    public static final bdyx hardwareTransitionFilteringEnabled;
    public static final bdyx inRailVehicleConfidenceThreshold;
    public static final bdyx inVehicleConfidenceThreshold;
    public static final bdyx locationStalenessThresholdForSpeedMillis;
    public static final bdyx maxTimeVehicleExitWithConnectedBluetoothMillis;
    public static final bdyx maxTimeWithoutInCarDetectionMillis;
    public static final bdyx maxTimeWithoutInVehicleDetectionMillis;
    public static final bdyx minArThrottlingIntervalInMillis;
    public static final bdyx minBikeContinuousDetectionCount;
    public static final bdyx minContinuousTimeIntervalWithConnectedWifi;
    public static final bdyx minFootContinuousDetectionCount;
    public static final bdyx minInRailVehicleContinuousDetectionCount;
    public static final bdyx minInVehicleContinuousDetectionCount;
    public static final bdyx minInVehicleSpeed;
    public static final bdyx minOnfootConfidenceForChreResultsBikeRelabeling;
    public static final bdyx minOnfootCountForChreResultsBikeRelabeling;
    public static final bdyx minPersonalInVehicleConfidence;
    public static final bdyx minStillContinuousDetectionCount;
    public static final bdyx minStillForTransitionFromFoot;
    public static final bdyx minStillHighConfidenceContinuousDetectionCount;
    public static final bdyx minVehicleConfidenceForChreResultsBikeRelabeling;
    public static final bdyx minVehicleCountForChreResultsBikeRelabeling;
    public static final bdyx softwareActivityRecognitionTransitionEnabled;
    public static final bdyx softwareActivityRecognitionTransitionEnabledV2;
    public static final bdyx stillHighConfidenceThreshold;

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
        arDeepStillTransitioningEnabled = bdyx.m91610a(a, "ar_deep_still_transitioning_enabled", true);
        arReportTransitionOnClientAdded = bdyx.m91610a(a, "ar_report_transition_on_client_added", true);
        arTransitionApplyPersonalConfidenceFilter = bdyx.m91610a(a, "ar_transition_apply_personal_confidence_filter", true);
        arTransitionBikingWifiFilteringEnabled = bdyx.m91610a(a, "ar_transition_biking_wifi_filtering_enabled", true);
        arTransitionEventLogging = bdyx.m91610a(a, "ar_transition_event_logging", true);
        arTransitionFastVehicleexitOnfootEnabled = bdyx.m91610a(a, "ar_transition_fast_vehicleexit_onfoot_enabled", true);
        arTransitionFilteringEnabled = bdyx.m91610a(a, "ar_transition_filtering_enabled", true);
        arTransitionHardwareSoftwareSwitchEnabled = bdyx.m91610a(a, "ar_transition_hardware_software_switch_enabled", true);
        arTransitionVehicleBluetoothFilteringEnabled = bdyx.m91610a(a, "ar_transition_vehicle_bluetooth_filtering_enabled", true);
        arTransitionVehicleBluetoothTimeoutOptimizations = bdyx.m91610a(a, "ar_transition_vehicle_bluetooth_timeout_optimizations", true);
        arTransitionWifiFilteringEnabled = bdyx.m91610a(a, "ar_transition_wifi_filtering_enabled", true);
        bikeHighConfidenceThreshold = bdyx.m91607a(a, "bike_high_confidence_threshold", 75L);
        enableActivityTransitionDetection = bdyx.m91610a(a, "enable_activity_transition_detection", true);
        enableAdaptiveWifiSampling = bdyx.m91610a(a, "enable_adaptive_wifi_sampling", false);
        footHighConfidenceThreshold = bdyx.m91607a(a, "foot_high_confidence_threshold", 75L);
        hardwareTransitionFilteringEnabled = bdyx.m91610a(a, "hardware_transition_filtering_enabled", false);
        inRailVehicleConfidenceThreshold = bdyx.m91607a(a, "in_rail_vehicle_confidence_threshold", 75L);
        inVehicleConfidenceThreshold = bdyx.m91607a(a, "in_vehicle_confidence_threshold", 75L);
        locationStalenessThresholdForSpeedMillis = bdyx.m91607a(a, "location_staleness_threshold_for_speed_millis", 600000L);
        maxTimeVehicleExitWithConnectedBluetoothMillis = bdyx.m91607a(a, "max_time_vehicle_exit_with_connected_bluetooth_millis", 900000L);
        maxTimeWithoutInCarDetectionMillis = bdyx.m91607a(a, "max_time_without_in_car_detection_millis", 300000L);
        maxTimeWithoutInVehicleDetectionMillis = bdyx.m91607a(a, "max_time_without_in_vehicle_detection_millis", 900000L);
        minArThrottlingIntervalInMillis = bdyx.m91607a(a, "min_ar_throttling_interval_in_millis", 60000L);
        minBikeContinuousDetectionCount = bdyx.m91607a(a, "min_bike_continuous_detection_count", 2L);
        minContinuousTimeIntervalWithConnectedWifi = bdyx.m91607a(a, "min_continuous_time_interval_with_connected_wifi", 900000L);
        minFootContinuousDetectionCount = bdyx.m91607a(a, "min_foot_continuous_detection_count", 2L);
        minInRailVehicleContinuousDetectionCount = bdyx.m91607a(a, "min_in_rail_vehicle_continuous_detection_count", 2L);
        minInVehicleContinuousDetectionCount = bdyx.m91607a(a, "min_in_vehicle_continuous_detection_count", 2L);
        minInVehicleSpeed = bdyx.m91605a(a, "min_in_vehicle_speed", 10.0d);
        minOnfootConfidenceForChreResultsBikeRelabeling = bdyx.m91607a(a, "min_onfoot_confidence_for_chre_results_bike_relabeling", 70L);
        minOnfootCountForChreResultsBikeRelabeling = bdyx.m91607a(a, "min_onfoot_count_for_chre_results_bike_relabeling", 2L);
        minPersonalInVehicleConfidence = bdyx.m91607a(a, "min_personal_in_vehicle_confidence", 75L);
        minStillContinuousDetectionCount = bdyx.m91607a(a, "min_still_continuous_detection_count", 5L);
        minStillForTransitionFromFoot = bdyx.m91607a(a, "min_still_for_transition_from_foot", 2L);
        minStillHighConfidenceContinuousDetectionCount = bdyx.m91607a(a, "min_still_high_confidence_continuous_detection_count", 1L);
        minVehicleConfidenceForChreResultsBikeRelabeling = bdyx.m91607a(a, "min_vehicle_confidence_for_chre_results_bike_relabeling", 75L);
        minVehicleCountForChreResultsBikeRelabeling = bdyx.m91607a(a, "min_vehicle_count_for_chre_results_bike_relabeling", 2L);
        softwareActivityRecognitionTransitionEnabled = bdyx.m91610a(a, "software_activity_recognition_transition_enabled", false);
        softwareActivityRecognitionTransitionEnabledV2 = bdyx.m91610a(a, "software_activity_recognition_transition_enabled_v2", true);
        stillHighConfidenceThreshold = bdyx.m91607a(a, "still_high_confidence_threshold", 95L);
    }

    public boolean arDeepStillTransitioningEnabled() {
        return ((Boolean) arDeepStillTransitioningEnabled.mo58455c()).booleanValue();
    }

    public boolean arReportTransitionOnClientAdded() {
        return ((Boolean) arReportTransitionOnClientAdded.mo58455c()).booleanValue();
    }

    public boolean arTransitionApplyPersonalConfidenceFilter() {
        return ((Boolean) arTransitionApplyPersonalConfidenceFilter.mo58455c()).booleanValue();
    }

    public boolean arTransitionBikingWifiFilteringEnabled() {
        return ((Boolean) arTransitionBikingWifiFilteringEnabled.mo58455c()).booleanValue();
    }

    public boolean arTransitionEventLogging() {
        return ((Boolean) arTransitionEventLogging.mo58455c()).booleanValue();
    }

    public boolean arTransitionFastVehicleexitOnfootEnabled() {
        return ((Boolean) arTransitionFastVehicleexitOnfootEnabled.mo58455c()).booleanValue();
    }

    public boolean arTransitionFilteringEnabled() {
        return ((Boolean) arTransitionFilteringEnabled.mo58455c()).booleanValue();
    }

    public boolean arTransitionHardwareSoftwareSwitchEnabled() {
        return ((Boolean) arTransitionHardwareSoftwareSwitchEnabled.mo58455c()).booleanValue();
    }

    public boolean arTransitionVehicleBluetoothFilteringEnabled() {
        return ((Boolean) arTransitionVehicleBluetoothFilteringEnabled.mo58455c()).booleanValue();
    }

    public boolean arTransitionVehicleBluetoothTimeoutOptimizations() {
        return ((Boolean) arTransitionVehicleBluetoothTimeoutOptimizations.mo58455c()).booleanValue();
    }

    public boolean arTransitionWifiFilteringEnabled() {
        return ((Boolean) arTransitionWifiFilteringEnabled.mo58455c()).booleanValue();
    }

    public long bikeHighConfidenceThreshold() {
        return ((Long) bikeHighConfidenceThreshold.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityTransitionDetection() {
        return ((Boolean) enableActivityTransitionDetection.mo58455c()).booleanValue();
    }

    public boolean enableAdaptiveWifiSampling() {
        return ((Boolean) enableAdaptiveWifiSampling.mo58455c()).booleanValue();
    }

    public long footHighConfidenceThreshold() {
        return ((Long) footHighConfidenceThreshold.mo58455c()).longValue();
    }

    public boolean hardwareTransitionFilteringEnabled() {
        return ((Boolean) hardwareTransitionFilteringEnabled.mo58455c()).booleanValue();
    }

    public long inRailVehicleConfidenceThreshold() {
        return ((Long) inRailVehicleConfidenceThreshold.mo58455c()).longValue();
    }

    public long inVehicleConfidenceThreshold() {
        return ((Long) inVehicleConfidenceThreshold.mo58455c()).longValue();
    }

    public long locationStalenessThresholdForSpeedMillis() {
        return ((Long) locationStalenessThresholdForSpeedMillis.mo58455c()).longValue();
    }

    public long maxTimeVehicleExitWithConnectedBluetoothMillis() {
        return ((Long) maxTimeVehicleExitWithConnectedBluetoothMillis.mo58455c()).longValue();
    }

    public long maxTimeWithoutInCarDetectionMillis() {
        return ((Long) maxTimeWithoutInCarDetectionMillis.mo58455c()).longValue();
    }

    public long maxTimeWithoutInVehicleDetectionMillis() {
        return ((Long) maxTimeWithoutInVehicleDetectionMillis.mo58455c()).longValue();
    }

    public long minArThrottlingIntervalInMillis() {
        return ((Long) minArThrottlingIntervalInMillis.mo58455c()).longValue();
    }

    public long minBikeContinuousDetectionCount() {
        return ((Long) minBikeContinuousDetectionCount.mo58455c()).longValue();
    }

    public long minContinuousTimeIntervalWithConnectedWifi() {
        return ((Long) minContinuousTimeIntervalWithConnectedWifi.mo58455c()).longValue();
    }

    public long minFootContinuousDetectionCount() {
        return ((Long) minFootContinuousDetectionCount.mo58455c()).longValue();
    }

    public long minInRailVehicleContinuousDetectionCount() {
        return ((Long) minInRailVehicleContinuousDetectionCount.mo58455c()).longValue();
    }

    public long minInVehicleContinuousDetectionCount() {
        return ((Long) minInVehicleContinuousDetectionCount.mo58455c()).longValue();
    }

    public double minInVehicleSpeed() {
        return ((Double) minInVehicleSpeed.mo58455c()).doubleValue();
    }

    public long minOnfootConfidenceForChreResultsBikeRelabeling() {
        return ((Long) minOnfootConfidenceForChreResultsBikeRelabeling.mo58455c()).longValue();
    }

    public long minOnfootCountForChreResultsBikeRelabeling() {
        return ((Long) minOnfootCountForChreResultsBikeRelabeling.mo58455c()).longValue();
    }

    public long minPersonalInVehicleConfidence() {
        return ((Long) minPersonalInVehicleConfidence.mo58455c()).longValue();
    }

    public long minStillContinuousDetectionCount() {
        return ((Long) minStillContinuousDetectionCount.mo58455c()).longValue();
    }

    public long minStillForTransitionFromFoot() {
        return ((Long) minStillForTransitionFromFoot.mo58455c()).longValue();
    }

    public long minStillHighConfidenceContinuousDetectionCount() {
        return ((Long) minStillHighConfidenceContinuousDetectionCount.mo58455c()).longValue();
    }

    public long minVehicleConfidenceForChreResultsBikeRelabeling() {
        return ((Long) minVehicleConfidenceForChreResultsBikeRelabeling.mo58455c()).longValue();
    }

    public long minVehicleCountForChreResultsBikeRelabeling() {
        return ((Long) minVehicleCountForChreResultsBikeRelabeling.mo58455c()).longValue();
    }

    public boolean softwareActivityRecognitionTransitionEnabled() {
        return ((Boolean) softwareActivityRecognitionTransitionEnabled.mo58455c()).booleanValue();
    }

    public boolean softwareActivityRecognitionTransitionEnabledV2() {
        return ((Boolean) softwareActivityRecognitionTransitionEnabledV2.mo58455c()).booleanValue();
    }

    public long stillHighConfidenceThreshold() {
        return ((Long) stillHighConfidenceThreshold.mo58455c()).longValue();
    }
}
