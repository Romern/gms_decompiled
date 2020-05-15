package p000;

/* renamed from: cevv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevv implements cevu {
    public static final bdyx accuracyFactor;
    public static final bdyx accuracyOutputFilterMaxAgeInWindowNanos;
    public static final bdyx allowProposingFromGnss;
    public static final bdyx altitudeFilterFloorLabelValidTimeSeconds;
    public static final bdyx altitudeFilterGpsValidTimeSeconds;
    public static final bdyx altitudeFilterRequestBarometer;
    public static final bdyx altitudeFilterWifiValidTimeSeconds;
    public static final bdyx alwaysRunAfterOneStep;
    public static final bdyx blueskyShadowsProbabilityDensityForInvalidGrid;
    public static final bdyx blueskyShadowsProbabilityDeweightingFactor;
    public static final bdyx blueskyUpdateMaxAgeS;
    public static final bdyx blueskyUpdateTimeoutForProposeFromGnssSec;
    public static final bdyx disableParticleFilter;
    public static final bdyx enableAccuracyOutputFilter;
    public static final bdyx enableActivityAwareKalmanFilter;
    public static final bdyx enableArForDriving;
    public static final bdyx enableBearingRangeFix143083454;
    public static final bdyx enableBlueskyShadowLikelihood;
    public static final bdyx enableDifferentialBearingFix140500114;
    public static final bdyx enableIncomingPositionAccuracyScaling;
    public static final bdyx enableInertialAnchorWithoutMagnetometer;
    public static final bdyx enableLogcatLogger;
    public static final bdyx enableOutputFilterTimestampFix;
    public static final bdyx enableOutputKalmanFilter;
    public static final bdyx flpInertialAnchorBugReportBufferSizeBytes;
    public static final bdyx flpInertialAnchorConfigurationIndex;
    public static final bdyx flpInertialAnchorUseStatefulLogging;
    public static final bdyx flpParticleFusionBugReportMaxBufferSize;
    public static final bdyx flpParticleFusionBugReportStoreDataArrayOnly;
    public static final bdyx flpParticleFusionBugReportWindowSec;
    public static final bdyx flpParticleFusionClearcutMaxCarryChangeDeltas;
    public static final bdyx flpParticleFusionClearcutMaxFilterUpDeltas;
    public static final bdyx flpParticleFusionClearcutMaxPositionReInitDeltas;
    public static final bdyx flpParticleFusionClearcutMaxReProjectionDeltas;
    public static final bdyx flpParticleFusionEnableOutputFilter;
    public static final bdyx flpParticleFusionExtendedBugReport;
    public static final bdyx flpParticleFusionRejectionThresholdSigmaMultiplier;
    public static final bdyx flpParticleFusionUseFop;
    public static final bdyx flpParticleFusionUsePositionLikelihoodClipping;
    public static final bdyx flpReportLocationOnStepUpdate;
    public static final bdyx flpUseParticleFusion;
    public static final bdyx globalAccuracyFactor;
    public static final bdyx gnssMaxStdDevM;
    public static final bdyx gnssMinStdDevM;
    public static final bdyx gnssRejectionDistanceM;
    public static final bdyx gnssRejectionPeriodS;
    public static final bdyx gnssStdDevScale;
    public static final bdyx initializationWindowLengthS;
    public static final bdyx maxAccuracyM;
    public static final bdyx maxBearingGapS;
    public static final bdyx maxGnssAgeForNotRequestingWifiScansS;
    public static final bdyx maxGnssEvidenceAgeS;
    public static final bdyx maxGnssWifiDistanceForGnssOnlyM;
    public static final bdyx maxStepEvidenceAgeS;
    public static final bdyx maxWifiEvidenceAgeS;
    public static final bdyx minAccuracyM;
    public static final bdyx nominalSigmaScaleGnss;
    public static final bdyx nominalSigmaScaleWifi;
    public static final bdyx notRequestWifiScansWhenProposingFromGnss;
    public static final bdyx numberOfParticles;
    public static final bdyx outputKalmanFilterEnableReset;
    public static final bdyx outputKalmanFilterResetThresholdM;
    public static final bdyx outputLinearKfProcessNoiseFeetPosM;
    public static final bdyx outputLinearKfProcessNoiseFeetVelMps;
    public static final bdyx outputLinearKfProcessNoiseUnknownPosM;
    public static final bdyx outputLinearKfProcessNoiseUnknownVelMps;
    public static final bdyx outputLinearKfProcessNoiseWheelsPosM;
    public static final bdyx outputLinearKfProcessNoiseWheelsVelMps;
    public static final bdyx positionEmitThresholdS;
    public static final bdyx positionProposalGnssBlueskyMinSpeedThresholdMps;
    public static final bdyx positionProposalGnssMaxAccuracyThresholdM;
    public static final bdyx positionProposalGnssMinSpeedThresholdMps;
    public static final bdyx reInitAccuracyThresholdMultiplierGnss;
    public static final bdyx reInitAccuracyThresholdMultiplierWifi;
    public static final bdyx requiredStepCount;
    public static final bdyx resamplingThreshold;
    public static final bdyx resetLocationAfterReinit;
    public static final bdyx resetLocationAfterReinitV2;
    public static final bdyx speedUpperThresholdMps;
    public static final bdyx stepLengthFactor;
    public static final bdyx stepLengthNoiseSigmaM;
    public static final bdyx stepTimeoutThresholdSeconds;
    public static final bdyx temporalHeadingNoiseSigmaRad;
    public static final bdyx temporalPositionNoiseSigmaM;
    public static final bdyx useAltitudeFilter;
    public static final bdyx useNStepActivationFilter;
    public static final bdyx wifiAccuracyUpperBoundBeforeRejectedMm;
    public static final bdyx wifiMaxStdDevM;
    public static final bdyx wifiMinStdDevM;
    public static final bdyx wifiRejectionDistanceM;
    public static final bdyx wifiRejectionPeriodS;
    public static final bdyx wifiStdDevScale;

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
        accuracyFactor = bdyx.m91605a(a, "Flp18__accuracy_factor", 1.0d);
        accuracyOutputFilterMaxAgeInWindowNanos = bdyx.m91607a(a, "Flp18__accuracy_output_filter_max_age_in_window_nanos", 5000000000L);
        allowProposingFromGnss = bdyx.m91610a(a, "Flp18__allow_proposing_from_gnss", true);
        altitudeFilterFloorLabelValidTimeSeconds = bdyx.m91605a(a, "Flp18__altitude_filter_floor_label_valid_time_seconds", 0.0d);
        altitudeFilterGpsValidTimeSeconds = bdyx.m91605a(a, "Flp18__altitude_filter_gps_valid_time_seconds", 60.0d);
        altitudeFilterRequestBarometer = bdyx.m91610a(a, "Flp18__altitude_filter_request_barometer", false);
        altitudeFilterWifiValidTimeSeconds = bdyx.m91605a(a, "Flp18__altitude_filter_wifi_valid_time_seconds", 60.0d);
        alwaysRunAfterOneStep = bdyx.m91610a(a, "Flp18__always_run_after_one_step", true);
        blueskyShadowsProbabilityDensityForInvalidGrid = bdyx.m91605a(a, "Flp18__bluesky_shadows_probability_density_for_invalid_grid", 1.0E-4d);
        blueskyShadowsProbabilityDeweightingFactor = bdyx.m91605a(a, "Flp18__bluesky_shadows_probability_deweighting_factor", 8.0d);
        blueskyUpdateMaxAgeS = bdyx.m91605a(a, "Flp18__bluesky_update_max_age_s", 0.5d);
        blueskyUpdateTimeoutForProposeFromGnssSec = bdyx.m91605a(a, "Flp18__bluesky_update_timeout_for_propose_from_gnss_sec", -1.0d);
        disableParticleFilter = bdyx.m91610a(a, "Flp18__disable_particle_filter", false);
        enableAccuracyOutputFilter = bdyx.m91610a(a, "Flp18__enable_accuracy_output_filter", true);
        enableActivityAwareKalmanFilter = bdyx.m91610a(a, "Flp18__enable_activity_aware_kalman_filter", true);
        enableArForDriving = bdyx.m91610a(a, "Flp18__enable_ar_for_driving", false);
        enableBearingRangeFix143083454 = bdyx.m91610a(a, "Flp18__enable_bearing_range_fix_143083454", false);
        enableBlueskyShadowLikelihood = bdyx.m91610a(a, "Flp18__enable_bluesky_shadow_likelihood", false);
        enableDifferentialBearingFix140500114 = bdyx.m91610a(a, "Flp18__enable_differential_bearing_fix_140500114", true);
        enableIncomingPositionAccuracyScaling = bdyx.m91610a(a, "Flp18__enable_incoming_position_accuracy_scaling", true);
        enableInertialAnchorWithoutMagnetometer = bdyx.m91610a(a, "Flp18__enable_inertial_anchor_without_magnetometer", false);
        enableLogcatLogger = bdyx.m91610a(a, "Flp18__enable_logcat_logger", false);
        enableOutputFilterTimestampFix = bdyx.m91610a(a, "Flp18__enable_output_filter_timestamp_fix", false);
        enableOutputKalmanFilter = bdyx.m91610a(a, "Flp18__enable_output_kalman_filter", true);
        flpInertialAnchorBugReportBufferSizeBytes = bdyx.m91607a(a, "flp_inertial_anchor_bug_report_buffer_size_bytes", 0L);
        flpInertialAnchorConfigurationIndex = bdyx.m91607a(a, "flp_inertial_anchor_configuration_index", 3L);
        flpInertialAnchorUseStatefulLogging = bdyx.m91610a(a, "flp_inertial_anchor_use_stateful_logging", false);
        flpParticleFusionBugReportMaxBufferSize = bdyx.m91607a(a, "flp_particle_fusion_bug_report_max_buffer_size", 5000L);
        flpParticleFusionBugReportStoreDataArrayOnly = bdyx.m91610a(a, "Flp18__flp_particle_fusion_bug_report_store_data_array_only", true);
        flpParticleFusionBugReportWindowSec = bdyx.m91605a(a, "flp_particle_fusion_bug_report_window_sec", 600.0d);
        flpParticleFusionClearcutMaxCarryChangeDeltas = bdyx.m91607a(a, "flp_particle_fusion_clearcut_max_carry_change_deltas", 1000L);
        flpParticleFusionClearcutMaxFilterUpDeltas = bdyx.m91607a(a, "flp_particle_fusion_clearcut_max_filter_up_deltas", 100L);
        flpParticleFusionClearcutMaxPositionReInitDeltas = bdyx.m91607a(a, "flp_particle_fusion_clearcut_max_position_re_init_deltas", 100L);
        flpParticleFusionClearcutMaxReProjectionDeltas = bdyx.m91607a(a, "flp_particle_fusion_clearcut_max_re_projection_deltas", 100L);
        flpParticleFusionEnableOutputFilter = bdyx.m91610a(a, "flp_particle_fusion_enable_output_filter", false);
        flpParticleFusionExtendedBugReport = bdyx.m91610a(a, "flp_particle_fusion_extended_bug_report", false);
        flpParticleFusionRejectionThresholdSigmaMultiplier = bdyx.m91605a(a, "flp_particle_fusion_rejection_threshold_sigma_multiplier", 4.0d);
        flpParticleFusionUseFop = bdyx.m91610a(a, "flp_particle_fusion_use_fop", false);
        flpParticleFusionUsePositionLikelihoodClipping = bdyx.m91610a(a, "flp_particle_fusion_use_position_likelihood_clipping", true);
        flpReportLocationOnStepUpdate = bdyx.m91610a(a, "flp_report_location_on_step_update", false);
        flpUseParticleFusion = bdyx.m91610a(a, "flp_use_particle_fusion", false);
        globalAccuracyFactor = bdyx.m91605a(a, "Flp18__global_accuracy_factor", 1.0d);
        gnssMaxStdDevM = bdyx.m91605a(a, "Flp18__gnss_max_std_dev_m", 100.0d);
        gnssMinStdDevM = bdyx.m91605a(a, "Flp18__gnss_min_std_dev_m", 5.0d);
        gnssRejectionDistanceM = bdyx.m91605a(a, "Flp18__gnss_rejection_distance_m", 0.5d);
        gnssRejectionPeriodS = bdyx.m91605a(a, "Flp18__gnss_rejection_period_s", 0.5d);
        gnssStdDevScale = bdyx.m91605a(a, "Flp18__gnss_std_dev_scale", 2.5d);
        initializationWindowLengthS = bdyx.m91605a(a, "Flp18__initialization_window_length_s", 6.0d);
        maxAccuracyM = bdyx.m91605a(a, "Flp18__max_accuracy_m", 150.0d);
        maxBearingGapS = bdyx.m91605a(a, "Flp18__max_bearing_gap_s", 2.0d);
        maxGnssAgeForNotRequestingWifiScansS = bdyx.m91605a(a, "Flp18__max_gnss_age_for_not_requesting_wifi_scans_s", 3.0d);
        maxGnssEvidenceAgeS = bdyx.m91605a(a, "Flp18__max_gnss_evidence_age_s", 5.0d);
        maxGnssWifiDistanceForGnssOnlyM = bdyx.m91605a(a, "Flp18__max_gnss_wifi_distance_for_gnss_only_m", 500.0d);
        maxStepEvidenceAgeS = bdyx.m91605a(a, "Flp18__max_step_evidence_age_s", 15.0d);
        maxWifiEvidenceAgeS = bdyx.m91605a(a, "Flp18__max_wifi_evidence_age_s", 10.0d);
        minAccuracyM = bdyx.m91605a(a, "Flp18__min_accuracy_m", 3.0d);
        nominalSigmaScaleGnss = bdyx.m91605a(a, "flp_particle_fusion_nominal_sigma_scale_gnss", 1.716d);
        nominalSigmaScaleWifi = bdyx.m91605a(a, "flp_particle_fusion_nominal_sigma_scale_wifi", 0.84d);
        notRequestWifiScansWhenProposingFromGnss = bdyx.m91610a(a, "Flp18__not_request_wifi_scans_when_proposing_from_gnss", true);
        numberOfParticles = bdyx.m91607a(a, "flp_particle_fusion_number_of_particles", 500L);
        outputKalmanFilterEnableReset = bdyx.m91610a(a, "Flp18__output_kalman_filter_enable_reset", true);
        outputKalmanFilterResetThresholdM = bdyx.m91605a(a, "Flp18__output_kalman_filter_reset_threshold_m", 250.0d);
        outputLinearKfProcessNoiseFeetPosM = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_feet_pos_m", 2.33d);
        outputLinearKfProcessNoiseFeetVelMps = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_feet_vel_mps", 0.17d);
        outputLinearKfProcessNoiseUnknownPosM = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_unknown_pos_m", 5.439d);
        outputLinearKfProcessNoiseUnknownVelMps = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_unknown_vel_mps", 3.63d);
        outputLinearKfProcessNoiseWheelsPosM = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_wheels_pos_m", 5.171d);
        outputLinearKfProcessNoiseWheelsVelMps = bdyx.m91605a(a, "Flp18__output_linear_kf_process_noise_wheels_vel_mps", 6.718d);
        positionEmitThresholdS = bdyx.m91605a(a, "Flp18__position_emit_threshold_s", 0.5d);
        positionProposalGnssBlueskyMinSpeedThresholdMps = bdyx.m91605a(a, "Flp18__position_proposal_gnss_bluesky_min_speed_threshold_mps", 2.25d);
        positionProposalGnssMaxAccuracyThresholdM = bdyx.m91605a(a, "Flp18__position_proposal_gnss_max_accuracy_threshold_m", 18.75d);
        positionProposalGnssMinSpeedThresholdMps = bdyx.m91605a(a, "Flp18__position_proposal_gnss_min_speed_threshold_mps", 1.5d);
        reInitAccuracyThresholdMultiplierGnss = bdyx.m91605a(a, "Flp18__re_init_accuracy_threshold_multiplier_gnss", 2.0d);
        reInitAccuracyThresholdMultiplierWifi = bdyx.m91605a(a, "Flp18__re_init_accuracy_threshold_multiplier_wifi", 3.0d);
        requiredStepCount = bdyx.m91607a(a, "Flp18__required_step_count", 5L);
        resamplingThreshold = bdyx.m91605a(a, "flp_particle_fusion_resampling_threshold", 0.572d);
        resetLocationAfterReinit = bdyx.m91610a(a, "Flp18__reset_location_after_reinit", true);
        resetLocationAfterReinitV2 = bdyx.m91610a(a, "Flp18__reset_location_after_reinit_v2", false);
        speedUpperThresholdMps = bdyx.m91605a(a, "flp_particle_filter_speed_upper_threshold_mps", 5.0d);
        stepLengthFactor = bdyx.m91605a(a, "flp_particle_fusion_step_length_factor", 1.071d);
        stepLengthNoiseSigmaM = bdyx.m91605a(a, "flp_particle_fusion_step_length_noise_sigma_m", 0.729d);
        stepTimeoutThresholdSeconds = bdyx.m91605a(a, "Flp18__step_timeout_threshold_seconds", 22.0d);
        temporalHeadingNoiseSigmaRad = bdyx.m91605a(a, "flp_particle_fusion_temporal_heading_noise_sigma_rad", 0.08d);
        temporalPositionNoiseSigmaM = bdyx.m91605a(a, "flp_particle_fusion_temporal_position_noise_sigma_m", 1.36d);
        useAltitudeFilter = bdyx.m91610a(a, "Flp18__use_altitude_filter", true);
        useNStepActivationFilter = bdyx.m91610a(a, "Flp18__use_n_step_activation_filter", true);
        wifiAccuracyUpperBoundBeforeRejectedMm = bdyx.m91607a(a, "flp_particle_fusion_wifi_accuracy_upper_bound_mm", 80000L);
        wifiMaxStdDevM = bdyx.m91605a(a, "Flp18__wifi_max_std_dev_m", 200.0d);
        wifiMinStdDevM = bdyx.m91605a(a, "Flp18__wifi_min_std_dev_m", 1.0d);
        wifiRejectionDistanceM = bdyx.m91605a(a, "Flp18__wifi_rejection_distance_m", 0.5d);
        wifiRejectionPeriodS = bdyx.m91605a(a, "Flp18__wifi_rejection_period_s", 2.5d);
        wifiStdDevScale = bdyx.m91605a(a, "Flp18__wifi_std_dev_scale", 1.0d);
    }

    public double accuracyFactor() {
        return ((Double) accuracyFactor.mo58455c()).doubleValue();
    }

    public long accuracyOutputFilterMaxAgeInWindowNanos() {
        return ((Long) accuracyOutputFilterMaxAgeInWindowNanos.mo58455c()).longValue();
    }

    public boolean allowProposingFromGnss() {
        return ((Boolean) allowProposingFromGnss.mo58455c()).booleanValue();
    }

    public double altitudeFilterFloorLabelValidTimeSeconds() {
        return ((Double) altitudeFilterFloorLabelValidTimeSeconds.mo58455c()).doubleValue();
    }

    public double altitudeFilterGpsValidTimeSeconds() {
        return ((Double) altitudeFilterGpsValidTimeSeconds.mo58455c()).doubleValue();
    }

    public boolean altitudeFilterRequestBarometer() {
        return ((Boolean) altitudeFilterRequestBarometer.mo58455c()).booleanValue();
    }

    public double altitudeFilterWifiValidTimeSeconds() {
        return ((Double) altitudeFilterWifiValidTimeSeconds.mo58455c()).doubleValue();
    }

    public boolean alwaysRunAfterOneStep() {
        return ((Boolean) alwaysRunAfterOneStep.mo58455c()).booleanValue();
    }

    public double blueskyShadowsProbabilityDensityForInvalidGrid() {
        return ((Double) blueskyShadowsProbabilityDensityForInvalidGrid.mo58455c()).doubleValue();
    }

    public double blueskyShadowsProbabilityDeweightingFactor() {
        return ((Double) blueskyShadowsProbabilityDeweightingFactor.mo58455c()).doubleValue();
    }

    public double blueskyUpdateMaxAgeS() {
        return ((Double) blueskyUpdateMaxAgeS.mo58455c()).doubleValue();
    }

    public double blueskyUpdateTimeoutForProposeFromGnssSec() {
        return ((Double) blueskyUpdateTimeoutForProposeFromGnssSec.mo58455c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean disableParticleFilter() {
        return ((Boolean) disableParticleFilter.mo58455c()).booleanValue();
    }

    public boolean enableAccuracyOutputFilter() {
        return ((Boolean) enableAccuracyOutputFilter.mo58455c()).booleanValue();
    }

    public boolean enableActivityAwareKalmanFilter() {
        return ((Boolean) enableActivityAwareKalmanFilter.mo58455c()).booleanValue();
    }

    public boolean enableArForDriving() {
        return ((Boolean) enableArForDriving.mo58455c()).booleanValue();
    }

    public boolean enableBearingRangeFix143083454() {
        return ((Boolean) enableBearingRangeFix143083454.mo58455c()).booleanValue();
    }

    public boolean enableBlueskyShadowLikelihood() {
        return ((Boolean) enableBlueskyShadowLikelihood.mo58455c()).booleanValue();
    }

    public boolean enableDifferentialBearingFix140500114() {
        return ((Boolean) enableDifferentialBearingFix140500114.mo58455c()).booleanValue();
    }

    public boolean enableIncomingPositionAccuracyScaling() {
        return ((Boolean) enableIncomingPositionAccuracyScaling.mo58455c()).booleanValue();
    }

    public boolean enableInertialAnchorWithoutMagnetometer() {
        return ((Boolean) enableInertialAnchorWithoutMagnetometer.mo58455c()).booleanValue();
    }

    public boolean enableLogcatLogger() {
        return ((Boolean) enableLogcatLogger.mo58455c()).booleanValue();
    }

    public boolean enableOutputFilterTimestampFix() {
        return ((Boolean) enableOutputFilterTimestampFix.mo58455c()).booleanValue();
    }

    public boolean enableOutputKalmanFilter() {
        return ((Boolean) enableOutputKalmanFilter.mo58455c()).booleanValue();
    }

    public long flpInertialAnchorBugReportBufferSizeBytes() {
        return ((Long) flpInertialAnchorBugReportBufferSizeBytes.mo58455c()).longValue();
    }

    public long flpInertialAnchorConfigurationIndex() {
        return ((Long) flpInertialAnchorConfigurationIndex.mo58455c()).longValue();
    }

    public boolean flpInertialAnchorUseStatefulLogging() {
        return ((Boolean) flpInertialAnchorUseStatefulLogging.mo58455c()).booleanValue();
    }

    public long flpParticleFusionBugReportMaxBufferSize() {
        return ((Long) flpParticleFusionBugReportMaxBufferSize.mo58455c()).longValue();
    }

    public boolean flpParticleFusionBugReportStoreDataArrayOnly() {
        return ((Boolean) flpParticleFusionBugReportStoreDataArrayOnly.mo58455c()).booleanValue();
    }

    public double flpParticleFusionBugReportWindowSec() {
        return ((Double) flpParticleFusionBugReportWindowSec.mo58455c()).doubleValue();
    }

    public long flpParticleFusionClearcutMaxCarryChangeDeltas() {
        return ((Long) flpParticleFusionClearcutMaxCarryChangeDeltas.mo58455c()).longValue();
    }

    public long flpParticleFusionClearcutMaxFilterUpDeltas() {
        return ((Long) flpParticleFusionClearcutMaxFilterUpDeltas.mo58455c()).longValue();
    }

    public long flpParticleFusionClearcutMaxPositionReInitDeltas() {
        return ((Long) flpParticleFusionClearcutMaxPositionReInitDeltas.mo58455c()).longValue();
    }

    public long flpParticleFusionClearcutMaxReProjectionDeltas() {
        return ((Long) flpParticleFusionClearcutMaxReProjectionDeltas.mo58455c()).longValue();
    }

    public boolean flpParticleFusionEnableOutputFilter() {
        return ((Boolean) flpParticleFusionEnableOutputFilter.mo58455c()).booleanValue();
    }

    public boolean flpParticleFusionExtendedBugReport() {
        return ((Boolean) flpParticleFusionExtendedBugReport.mo58455c()).booleanValue();
    }

    public double flpParticleFusionRejectionThresholdSigmaMultiplier() {
        return ((Double) flpParticleFusionRejectionThresholdSigmaMultiplier.mo58455c()).doubleValue();
    }

    public boolean flpParticleFusionUseFop() {
        return ((Boolean) flpParticleFusionUseFop.mo58455c()).booleanValue();
    }

    public boolean flpParticleFusionUsePositionLikelihoodClipping() {
        return ((Boolean) flpParticleFusionUsePositionLikelihoodClipping.mo58455c()).booleanValue();
    }

    public boolean flpReportLocationOnStepUpdate() {
        return ((Boolean) flpReportLocationOnStepUpdate.mo58455c()).booleanValue();
    }

    public boolean flpUseParticleFusion() {
        return ((Boolean) flpUseParticleFusion.mo58455c()).booleanValue();
    }

    public double globalAccuracyFactor() {
        return ((Double) globalAccuracyFactor.mo58455c()).doubleValue();
    }

    public double gnssMaxStdDevM() {
        return ((Double) gnssMaxStdDevM.mo58455c()).doubleValue();
    }

    public double gnssMinStdDevM() {
        return ((Double) gnssMinStdDevM.mo58455c()).doubleValue();
    }

    public double gnssRejectionDistanceM() {
        return ((Double) gnssRejectionDistanceM.mo58455c()).doubleValue();
    }

    public double gnssRejectionPeriodS() {
        return ((Double) gnssRejectionPeriodS.mo58455c()).doubleValue();
    }

    public double gnssStdDevScale() {
        return ((Double) gnssStdDevScale.mo58455c()).doubleValue();
    }

    public double initializationWindowLengthS() {
        return ((Double) initializationWindowLengthS.mo58455c()).doubleValue();
    }

    public double maxAccuracyM() {
        return ((Double) maxAccuracyM.mo58455c()).doubleValue();
    }

    public double maxBearingGapS() {
        return ((Double) maxBearingGapS.mo58455c()).doubleValue();
    }

    public double maxGnssAgeForNotRequestingWifiScansS() {
        return ((Double) maxGnssAgeForNotRequestingWifiScansS.mo58455c()).doubleValue();
    }

    public double maxGnssEvidenceAgeS() {
        return ((Double) maxGnssEvidenceAgeS.mo58455c()).doubleValue();
    }

    public double maxGnssWifiDistanceForGnssOnlyM() {
        return ((Double) maxGnssWifiDistanceForGnssOnlyM.mo58455c()).doubleValue();
    }

    public double maxStepEvidenceAgeS() {
        return ((Double) maxStepEvidenceAgeS.mo58455c()).doubleValue();
    }

    public double maxWifiEvidenceAgeS() {
        return ((Double) maxWifiEvidenceAgeS.mo58455c()).doubleValue();
    }

    public double minAccuracyM() {
        return ((Double) minAccuracyM.mo58455c()).doubleValue();
    }

    public double nominalSigmaScaleGnss() {
        return ((Double) nominalSigmaScaleGnss.mo58455c()).doubleValue();
    }

    public double nominalSigmaScaleWifi() {
        return ((Double) nominalSigmaScaleWifi.mo58455c()).doubleValue();
    }

    public boolean notRequestWifiScansWhenProposingFromGnss() {
        return ((Boolean) notRequestWifiScansWhenProposingFromGnss.mo58455c()).booleanValue();
    }

    public long numberOfParticles() {
        return ((Long) numberOfParticles.mo58455c()).longValue();
    }

    public boolean outputKalmanFilterEnableReset() {
        return ((Boolean) outputKalmanFilterEnableReset.mo58455c()).booleanValue();
    }

    public double outputKalmanFilterResetThresholdM() {
        return ((Double) outputKalmanFilterResetThresholdM.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseFeetPosM() {
        return ((Double) outputLinearKfProcessNoiseFeetPosM.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseFeetVelMps() {
        return ((Double) outputLinearKfProcessNoiseFeetVelMps.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseUnknownPosM() {
        return ((Double) outputLinearKfProcessNoiseUnknownPosM.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseUnknownVelMps() {
        return ((Double) outputLinearKfProcessNoiseUnknownVelMps.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseWheelsPosM() {
        return ((Double) outputLinearKfProcessNoiseWheelsPosM.mo58455c()).doubleValue();
    }

    public double outputLinearKfProcessNoiseWheelsVelMps() {
        return ((Double) outputLinearKfProcessNoiseWheelsVelMps.mo58455c()).doubleValue();
    }

    public double positionEmitThresholdS() {
        return ((Double) positionEmitThresholdS.mo58455c()).doubleValue();
    }

    public double positionProposalGnssBlueskyMinSpeedThresholdMps() {
        return ((Double) positionProposalGnssBlueskyMinSpeedThresholdMps.mo58455c()).doubleValue();
    }

    public double positionProposalGnssMaxAccuracyThresholdM() {
        return ((Double) positionProposalGnssMaxAccuracyThresholdM.mo58455c()).doubleValue();
    }

    public double positionProposalGnssMinSpeedThresholdMps() {
        return ((Double) positionProposalGnssMinSpeedThresholdMps.mo58455c()).doubleValue();
    }

    public double reInitAccuracyThresholdMultiplierGnss() {
        return ((Double) reInitAccuracyThresholdMultiplierGnss.mo58455c()).doubleValue();
    }

    public double reInitAccuracyThresholdMultiplierWifi() {
        return ((Double) reInitAccuracyThresholdMultiplierWifi.mo58455c()).doubleValue();
    }

    public long requiredStepCount() {
        return ((Long) requiredStepCount.mo58455c()).longValue();
    }

    public double resamplingThreshold() {
        return ((Double) resamplingThreshold.mo58455c()).doubleValue();
    }

    public boolean resetLocationAfterReinit() {
        return ((Boolean) resetLocationAfterReinit.mo58455c()).booleanValue();
    }

    public boolean resetLocationAfterReinitV2() {
        return ((Boolean) resetLocationAfterReinitV2.mo58455c()).booleanValue();
    }

    public double speedUpperThresholdMps() {
        return ((Double) speedUpperThresholdMps.mo58455c()).doubleValue();
    }

    public double stepLengthFactor() {
        return ((Double) stepLengthFactor.mo58455c()).doubleValue();
    }

    public double stepLengthNoiseSigmaM() {
        return ((Double) stepLengthNoiseSigmaM.mo58455c()).doubleValue();
    }

    public double stepTimeoutThresholdSeconds() {
        return ((Double) stepTimeoutThresholdSeconds.mo58455c()).doubleValue();
    }

    public double temporalHeadingNoiseSigmaRad() {
        return ((Double) temporalHeadingNoiseSigmaRad.mo58455c()).doubleValue();
    }

    public double temporalPositionNoiseSigmaM() {
        return ((Double) temporalPositionNoiseSigmaM.mo58455c()).doubleValue();
    }

    public boolean useAltitudeFilter() {
        return ((Boolean) useAltitudeFilter.mo58455c()).booleanValue();
    }

    public boolean useNStepActivationFilter() {
        return ((Boolean) useNStepActivationFilter.mo58455c()).booleanValue();
    }

    public long wifiAccuracyUpperBoundBeforeRejectedMm() {
        return ((Long) wifiAccuracyUpperBoundBeforeRejectedMm.mo58455c()).longValue();
    }

    public double wifiMaxStdDevM() {
        return ((Double) wifiMaxStdDevM.mo58455c()).doubleValue();
    }

    public double wifiMinStdDevM() {
        return ((Double) wifiMinStdDevM.mo58455c()).doubleValue();
    }

    public double wifiRejectionDistanceM() {
        return ((Double) wifiRejectionDistanceM.mo58455c()).doubleValue();
    }

    public double wifiRejectionPeriodS() {
        return ((Double) wifiRejectionPeriodS.mo58455c()).doubleValue();
    }

    public double wifiStdDevScale() {
        return ((Double) wifiStdDevScale.mo58455c()).doubleValue();
    }
}
