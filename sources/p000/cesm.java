package p000;

/* renamed from: cesm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesm implements cesl {
    public static final bdyx chreArAudioDiagnosticsLog;
    public static final bdyx chreArAudioEnableAudioBasedCarExit;
    public static final bdyx chreArAudioEnableAudioFusion;
    public static final bdyx chreArAudioMinAudioCarClassificationConfidence;
    public static final bdyx chreArAudioMinAudioNoncarClassificationConfidence;
    public static final bdyx chreArAudioMinBufferedMotionClassificationsCar;
    public static final bdyx chreArAudioMinBufferedMotionClassificationsOnfoot;
    public static final bdyx chreArAudioMinBufferedMotionClassificationsStill;
    public static final bdyx chreArAudioMinContinuousAudioClassificationsCar;
    public static final bdyx chreArAudioMinContinuousAudioClassificationsNoncar;
    public static final bdyx chreArAudioMinContinuousMotionClassificationsBicycle;
    public static final bdyx chreArAudioMinContinuousMotionClassificationsCar;
    public static final bdyx chreArAudioMinContinuousMotionClassificationsOnfoot;
    public static final bdyx chreArAudioMinContinuousMotionClassificationsStill;
    public static final bdyx chreArAudioMinMotionBicycleClassificationConfidence;
    public static final bdyx chreArAudioMinMotionCarClassificationConfidence;
    public static final bdyx chreArAudioMinMotionOnfootClassificationConfidence;
    public static final bdyx chreArAudioMinMotionStillClassificationConfidence;
    public static final bdyx chreArAudioMinPressurePeakSpikeBackDelta;
    public static final bdyx chreArAudioMinPressurePeakSpikeThreshold;
    public static final bdyx chreArAudioTimeIntervalThresholdForPressurePeakMillis;
    public static final bdyx chreArAudioVerbose;
    public static final bdyx chreArDeepStillIntervalExitMillis;
    public static final bdyx chreArEnableMultimodalModelBasedExitTransition;
    public static final bdyx chreArMaxLastVehicleDetectionIntervalForAllStillMillis;
    public static final bdyx chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis;
    public static final bdyx chreArOnfootRecencyTimeIntervalMillis;
    public static final bdyx enableActivityRecognitionMode;
    public static final bdyx enableAudioChreWifiFiltering;
    public static final bdyx enableCarExitOnIdle;
    public static final bdyx enableConnectedWifiFilterAudioFusion;
    public static final bdyx enableDrivingDndExitWithAudioFusion;
    public static final bdyx enableDrivingDndWithAudioFusion;
    public static final bdyx enableDrivingDndWithRoadRail;
    public static final bdyx firstPartyAudioEnabledPackageWhitelist;
    public static final bdyx flexAudioFusion;
    public static final bdyx onlyRelyOnCarTransitionStateMachine;
    public static final bdyx zeroPartyAudioEnabledTagWhitelist;

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
        chreArAudioDiagnosticsLog = bdyx.m91610a(a, "chre_ar_audio_diagnostics_log", true);
        chreArAudioEnableAudioBasedCarExit = bdyx.m91610a(a, "chre_ar_audio_enable_audio_based_car_exit", true);
        chreArAudioEnableAudioFusion = bdyx.m91610a(a, "chre_ar_audio_enable_audio_fusion", false);
        chreArAudioMinAudioCarClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_audio_car_classification_confidence", 0.85d);
        chreArAudioMinAudioNoncarClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_audio_noncar_classification_confidence", 0.9d);
        chreArAudioMinBufferedMotionClassificationsCar = bdyx.m91607a(a, "chre_ar_audio_min_buffered_motion_classifications_car", 5L);
        chreArAudioMinBufferedMotionClassificationsOnfoot = bdyx.m91607a(a, "chre_ar_audio_min_buffered_motion_classifications_onfoot", 5L);
        chreArAudioMinBufferedMotionClassificationsStill = bdyx.m91607a(a, "chre_ar_audio_min_buffered_motion_classifications_still", 5L);
        chreArAudioMinContinuousAudioClassificationsCar = bdyx.m91607a(a, "chre_ar_audio_min_continuous_audio_classifications_car", 2L);
        chreArAudioMinContinuousAudioClassificationsNoncar = bdyx.m91607a(a, "chre_ar_audio_min_continuous_audio_classifications_noncar", 5L);
        chreArAudioMinContinuousMotionClassificationsBicycle = bdyx.m91607a(a, "chre_ar_audio_min_continuous_motion_classifications_bicycle", 8L);
        chreArAudioMinContinuousMotionClassificationsCar = bdyx.m91607a(a, "chre_ar_audio_min_continuous_motion_classifications_car", 0L);
        chreArAudioMinContinuousMotionClassificationsOnfoot = bdyx.m91607a(a, "chre_ar_audio_min_continuous_motion_classifications_onfoot", 2L);
        chreArAudioMinContinuousMotionClassificationsStill = bdyx.m91607a(a, "chre_ar_audio_min_continuous_motion_classifications_still", 3L);
        chreArAudioMinMotionBicycleClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_motion_bicycle_classification_confidence", 0.8d);
        chreArAudioMinMotionCarClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_motion_car_classification_confidence", 0.8d);
        chreArAudioMinMotionOnfootClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_motion_onfoot_classification_confidence", 0.8d);
        chreArAudioMinMotionStillClassificationConfidence = bdyx.m91605a(a, "chre_ar_audio_min_motion_still_classification_confidence", 0.8d);
        chreArAudioMinPressurePeakSpikeBackDelta = bdyx.m91605a(a, "chre_ar_audio_min_pressure_peak_spike_back_delta", 0.1d);
        chreArAudioMinPressurePeakSpikeThreshold = bdyx.m91605a(a, "chre_ar_audio_min_pressure_peak_spike_threshold", 5.0d);
        chreArAudioTimeIntervalThresholdForPressurePeakMillis = bdyx.m91607a(a, "chre_ar_audio_time_interval_threshold_for_pressure_peak_millis", 1000L);
        chreArAudioVerbose = bdyx.m91610a(a, "chre_ar_audio_verbose", false);
        chreArDeepStillIntervalExitMillis = bdyx.m91607a(a, "chre_ar_deep_still_interval_exit_millis", 600000L);
        chreArEnableMultimodalModelBasedExitTransition = bdyx.m91610a(a, "chre_ar_enable_multimodal_model_based_exit_transition", false);
        chreArMaxLastVehicleDetectionIntervalForAllStillMillis = bdyx.m91607a(a, "chre_ar_max_last_vehicle_detection_interval_for_all_still_millis", 600000L);
        chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis = bdyx.m91607a(a, "chre_ar_max_last_vehicle_detection_interval_for_other_transition_millis", 600000L);
        chreArOnfootRecencyTimeIntervalMillis = bdyx.m91607a(a, "chre_ar_onfoot_recency_time_interval_millis", 10000L);
        enableActivityRecognitionMode = bdyx.m91610a(a, "enable_activity_recognition_mode", false);
        enableAudioChreWifiFiltering = bdyx.m91610a(a, "enable_audio_chre_wifi_filtering", true);
        enableCarExitOnIdle = bdyx.m91610a(a, "enable_car_exit_on_idle", true);
        enableConnectedWifiFilterAudioFusion = bdyx.m91610a(a, "enable_connected_wifi_filter_audio_fusion", false);
        enableDrivingDndExitWithAudioFusion = bdyx.m91610a(a, "enable_driving_dnd_exit_with_audio_fusion", true);
        enableDrivingDndWithAudioFusion = bdyx.m91610a(a, "enable_driving_dnd_with_audio_fusion", false);
        enableDrivingDndWithRoadRail = bdyx.m91610a(a, "enable_driving_dnd_with_road_rail", false);
        firstPartyAudioEnabledPackageWhitelist = bdyx.m91609a(a, "first_party_audio_enabled_package_whitelist", "com.google.android.gms.samples.location.activity.firstparty;");
        flexAudioFusion = bdyx.m91607a(a, "flex_audio_fusion", 0L);
        onlyRelyOnCarTransitionStateMachine = bdyx.m91610a(a, "only_rely_on_car_transition_state_machine", false);
        zeroPartyAudioEnabledTagWhitelist = bdyx.m91609a(a, "zero_party_audio_enabled_tag_whitelist", "ardnd;DrivingMode;");
    }

    public boolean chreArAudioDiagnosticsLog() {
        return ((Boolean) chreArAudioDiagnosticsLog.mo58455c()).booleanValue();
    }

    public boolean chreArAudioEnableAudioBasedCarExit() {
        return ((Boolean) chreArAudioEnableAudioBasedCarExit.mo58455c()).booleanValue();
    }

    public boolean chreArAudioEnableAudioFusion() {
        return ((Boolean) chreArAudioEnableAudioFusion.mo58455c()).booleanValue();
    }

    public double chreArAudioMinAudioCarClassificationConfidence() {
        return ((Double) chreArAudioMinAudioCarClassificationConfidence.mo58455c()).doubleValue();
    }

    public double chreArAudioMinAudioNoncarClassificationConfidence() {
        return ((Double) chreArAudioMinAudioNoncarClassificationConfidence.mo58455c()).doubleValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsCar() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsCar.mo58455c()).longValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsOnfoot() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsOnfoot.mo58455c()).longValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsStill() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsStill.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousAudioClassificationsCar() {
        return ((Long) chreArAudioMinContinuousAudioClassificationsCar.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousAudioClassificationsNoncar() {
        return ((Long) chreArAudioMinContinuousAudioClassificationsNoncar.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsBicycle() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsBicycle.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsCar() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsCar.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsOnfoot() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsOnfoot.mo58455c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsStill() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsStill.mo58455c()).longValue();
    }

    public double chreArAudioMinMotionBicycleClassificationConfidence() {
        return ((Double) chreArAudioMinMotionBicycleClassificationConfidence.mo58455c()).doubleValue();
    }

    public double chreArAudioMinMotionCarClassificationConfidence() {
        return ((Double) chreArAudioMinMotionCarClassificationConfidence.mo58455c()).doubleValue();
    }

    public double chreArAudioMinMotionOnfootClassificationConfidence() {
        return ((Double) chreArAudioMinMotionOnfootClassificationConfidence.mo58455c()).doubleValue();
    }

    public double chreArAudioMinMotionStillClassificationConfidence() {
        return ((Double) chreArAudioMinMotionStillClassificationConfidence.mo58455c()).doubleValue();
    }

    public double chreArAudioMinPressurePeakSpikeBackDelta() {
        return ((Double) chreArAudioMinPressurePeakSpikeBackDelta.mo58455c()).doubleValue();
    }

    public double chreArAudioMinPressurePeakSpikeThreshold() {
        return ((Double) chreArAudioMinPressurePeakSpikeThreshold.mo58455c()).doubleValue();
    }

    public long chreArAudioTimeIntervalThresholdForPressurePeakMillis() {
        return ((Long) chreArAudioTimeIntervalThresholdForPressurePeakMillis.mo58455c()).longValue();
    }

    public boolean chreArAudioVerbose() {
        return ((Boolean) chreArAudioVerbose.mo58455c()).booleanValue();
    }

    public long chreArDeepStillIntervalExitMillis() {
        return ((Long) chreArDeepStillIntervalExitMillis.mo58455c()).longValue();
    }

    public boolean chreArEnableMultimodalModelBasedExitTransition() {
        return ((Boolean) chreArEnableMultimodalModelBasedExitTransition.mo58455c()).booleanValue();
    }

    public long chreArMaxLastVehicleDetectionIntervalForAllStillMillis() {
        return ((Long) chreArMaxLastVehicleDetectionIntervalForAllStillMillis.mo58455c()).longValue();
    }

    public long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis() {
        return ((Long) chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis.mo58455c()).longValue();
    }

    public long chreArOnfootRecencyTimeIntervalMillis() {
        return ((Long) chreArOnfootRecencyTimeIntervalMillis.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityRecognitionMode() {
        return ((Boolean) enableActivityRecognitionMode.mo58455c()).booleanValue();
    }

    public boolean enableAudioChreWifiFiltering() {
        return ((Boolean) enableAudioChreWifiFiltering.mo58455c()).booleanValue();
    }

    public boolean enableCarExitOnIdle() {
        return ((Boolean) enableCarExitOnIdle.mo58455c()).booleanValue();
    }

    public boolean enableConnectedWifiFilterAudioFusion() {
        return ((Boolean) enableConnectedWifiFilterAudioFusion.mo58455c()).booleanValue();
    }

    public boolean enableDrivingDndExitWithAudioFusion() {
        return ((Boolean) enableDrivingDndExitWithAudioFusion.mo58455c()).booleanValue();
    }

    public boolean enableDrivingDndWithAudioFusion() {
        return ((Boolean) enableDrivingDndWithAudioFusion.mo58455c()).booleanValue();
    }

    public boolean enableDrivingDndWithRoadRail() {
        return ((Boolean) enableDrivingDndWithRoadRail.mo58455c()).booleanValue();
    }

    public String firstPartyAudioEnabledPackageWhitelist() {
        return (String) firstPartyAudioEnabledPackageWhitelist.mo58455c();
    }

    public long flexAudioFusion() {
        return ((Long) flexAudioFusion.mo58455c()).longValue();
    }

    public boolean onlyRelyOnCarTransitionStateMachine() {
        return ((Boolean) onlyRelyOnCarTransitionStateMachine.mo58455c()).booleanValue();
    }

    public String zeroPartyAudioEnabledTagWhitelist() {
        return (String) zeroPartyAudioEnabledTagWhitelist.mo58455c();
    }
}
