package p000;

/* renamed from: cewi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cewi implements cewh {
    public static final bdyx fopEnableInertialAnchorOrientationEngineV2;
    public static final bdyx fopEventLogsSetClientFixEnable;
    public static final bdyx fopInertialAnchorConfigurationIndex;
    public static final bdyx fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex;
    public static final bdyx fopInertialAnchorUseDeclinationBugfix119882623;
    public static final bdyx fopInertialAnchorUseHeadingUncertaintyModelConfig;
    public static final bdyx fopInertialAnchorUseNanBugfix120491249;
    public static final bdyx fopInertialAnchorUseStatefulLogging;
    public static final bdyx fopLogCollectionPeriodMs;
    public static final bdyx fopLogSamplingRate;
    public static final bdyx fopLogsCheckConsent;
    public static final bdyx fopMaxErrorDegreesHighAccuracy;
    public static final bdyx fopMaxErrorDegreesLowAccuracy;
    public static final bdyx fopMaxErrorDegreesMediumAccuracy;
    public static final bdyx fopMinChangeErrorDegreesForLevelUpdate;
    public static final bdyx fopRequestLogSamplingRate;
    public static final bdyx fopSensorSamplingPeriodMilliseconds;
    public static final bdyx fopUseInertialAnchor;

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
        fopEnableInertialAnchorOrientationEngineV2 = bdyx.m91610a(a, "fop_enable_inertial_anchor_orientation_engine_v2", false);
        fopEventLogsSetClientFixEnable = bdyx.m91610a(a, "fop_event_logs_set_client_fix_enable", false);
        fopInertialAnchorConfigurationIndex = bdyx.m91607a(a, "fop_inertial_anchor_configuration_index", 3L);
        fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex = bdyx.m91607a(a, "fop_inertial_anchor_empirical_heading_uncertainty_model_config_index", 0L);
        fopInertialAnchorUseDeclinationBugfix119882623 = bdyx.m91610a(a, "fop_inertial_anchor_use_declination_bugfix_119882623", false);
        fopInertialAnchorUseHeadingUncertaintyModelConfig = bdyx.m91610a(a, "fop_inertial_anchor_use_heading_uncertainty_model_config", false);
        fopInertialAnchorUseNanBugfix120491249 = bdyx.m91610a(a, "fop_inertial_anchor_use_nan_bugfix_120491249", false);
        fopInertialAnchorUseStatefulLogging = bdyx.m91610a(a, "fop_inertial_anchor_use_stateful_logging", false);
        fopLogCollectionPeriodMs = bdyx.m91607a(a, "fop_log_collection_period_ms", 86400000L);
        fopLogSamplingRate = bdyx.m91605a(a, "fop_log_sampling_rate", 0.0d);
        fopLogsCheckConsent = bdyx.m91610a(a, "fop_logs_check_consent", false);
        fopMaxErrorDegreesHighAccuracy = bdyx.m91607a(a, "fop_max_error_degrees_high_accuracy", 45L);
        fopMaxErrorDegreesLowAccuracy = bdyx.m91607a(a, "fop_max_error_degrees_low_accuracy", 90L);
        fopMaxErrorDegreesMediumAccuracy = bdyx.m91607a(a, "fop_max_error_degrees_medium_accuracy", 60L);
        fopMinChangeErrorDegreesForLevelUpdate = bdyx.m91607a(a, "fop_min_change_error_degrees_for_level_update", 10L);
        fopRequestLogSamplingRate = bdyx.m91605a(a, "fop_request_log_sampling_rate", 1.0d);
        fopSensorSamplingPeriodMilliseconds = bdyx.m91607a(a, "fop_sensor_sampling_period_milliseconds", 20L);
        fopUseInertialAnchor = bdyx.m91610a(a, "fop_use_inertial_anchor", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean fopEnableInertialAnchorOrientationEngineV2() {
        return ((Boolean) fopEnableInertialAnchorOrientationEngineV2.mo58455c()).booleanValue();
    }

    public boolean fopEventLogsSetClientFixEnable() {
        return ((Boolean) fopEventLogsSetClientFixEnable.mo58455c()).booleanValue();
    }

    public long fopInertialAnchorConfigurationIndex() {
        return ((Long) fopInertialAnchorConfigurationIndex.mo58455c()).longValue();
    }

    public long fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex() {
        return ((Long) fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex.mo58455c()).longValue();
    }

    public boolean fopInertialAnchorUseDeclinationBugfix119882623() {
        return ((Boolean) fopInertialAnchorUseDeclinationBugfix119882623.mo58455c()).booleanValue();
    }

    public boolean fopInertialAnchorUseHeadingUncertaintyModelConfig() {
        return ((Boolean) fopInertialAnchorUseHeadingUncertaintyModelConfig.mo58455c()).booleanValue();
    }

    public boolean fopInertialAnchorUseNanBugfix120491249() {
        return ((Boolean) fopInertialAnchorUseNanBugfix120491249.mo58455c()).booleanValue();
    }

    public boolean fopInertialAnchorUseStatefulLogging() {
        return ((Boolean) fopInertialAnchorUseStatefulLogging.mo58455c()).booleanValue();
    }

    public long fopLogCollectionPeriodMs() {
        return ((Long) fopLogCollectionPeriodMs.mo58455c()).longValue();
    }

    public double fopLogSamplingRate() {
        return ((Double) fopLogSamplingRate.mo58455c()).doubleValue();
    }

    public boolean fopLogsCheckConsent() {
        return ((Boolean) fopLogsCheckConsent.mo58455c()).booleanValue();
    }

    public long fopMaxErrorDegreesHighAccuracy() {
        return ((Long) fopMaxErrorDegreesHighAccuracy.mo58455c()).longValue();
    }

    public long fopMaxErrorDegreesLowAccuracy() {
        return ((Long) fopMaxErrorDegreesLowAccuracy.mo58455c()).longValue();
    }

    public long fopMaxErrorDegreesMediumAccuracy() {
        return ((Long) fopMaxErrorDegreesMediumAccuracy.mo58455c()).longValue();
    }

    public long fopMinChangeErrorDegreesForLevelUpdate() {
        return ((Long) fopMinChangeErrorDegreesForLevelUpdate.mo58455c()).longValue();
    }

    public double fopRequestLogSamplingRate() {
        return ((Double) fopRequestLogSamplingRate.mo58455c()).doubleValue();
    }

    public long fopSensorSamplingPeriodMilliseconds() {
        return ((Long) fopSensorSamplingPeriodMilliseconds.mo58455c()).longValue();
    }

    public boolean fopUseInertialAnchor() {
        return ((Boolean) fopUseInertialAnchor.mo58455c()).booleanValue();
    }
}
