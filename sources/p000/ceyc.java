package p000;

/* renamed from: ceyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyc implements ceya {
    public static final bdyx clearcutLogPeriodMs;
    public static final bdyx clearcutLogSamplingRate;
    public static final bdyx configuration;
    public static final bdyx forceStopSensorBugfix140052055;
    public static final bdyx useCarryBearingTracker;
    public static final bdyx useClearcutLogging;
    public static final bdyx useConfigurationFlag;
    public static final bdyx useDeclinationInitBugfix137541510;
    public static final bdyx useEfficientQuaternionRateUpdate;
    public static final bdyx useImuCal;
    public static final bdyx useInitWithoutMagUpdates;
    public static final bdyx useMagFieldTracker;
    public static final bdyx useMeasurementThrottler;
    public static final bdyx useNisDiversityConsistencyCheck;
    public static final bdyx usePendingMeasurementSizeCheck;
    public static final bdyx useStackOptimizedMatrixMultiply;
    public static final bdyx useSynchronizerMaxQueueSize;
    public static final bdyx useSystemTimestampForPoseOnKitkat;
    public static final bdyx useTimestampChecker;

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
        clearcutLogPeriodMs = bdyx.m91607a(a, "InertialAnchor__clearcut_log_period_ms", 86400000L);
        clearcutLogSamplingRate = bdyx.m91605a(a, "InertialAnchor__clearcut_log_sampling_rate", 0.0d);
        try {
            configuration = bdyx.m91608a(a, "InertialAnchor__configuration", (btvy) GeneratedMessageLite.m124014a(btvy.f152660f, new byte[]{10, -72, 3, 8, 2, 16, 1, 24, 2, 32, 2, 40, 1, 50, -111, 3, 10, -111, 1, 9, -102, -103, -103, -103, -103, -103, -71, 63, 17, -102, -103, -103, -103, -103, -103, -71, 63, 25, -102, -103, -103, -103, -103, -103, -71, 63, 33, -102, -103, -103, -103, -103, -103, -71, 63, 41, -102, -103, -103, -103, -103, -103, -71, 63, 49, -102, -103, -103, -103, -103, -103, -71, 63, 57, 69, -40, -16, -12, 74, 89, -74, 63, 65, 69, -40, -16, -12, 74, 89, -74, 63, 73, 69, -40, -16, -12, 74, 89, -74, 63, 81, 122, 52, 16, -61, 84, 114, 117, 63, 89, 122, 52, 16, -61, 84, 114, 117, 63, 97, 122, 52, 16, -61, 84, 114, 117, 63, 105, 69, -40, -16, -12, 74, 89, -74, 63, 113, 86, 2, 49, 34, -76, -110, -28, 62, 121, 86, 2, 49, 34, -76, -110, -28, 62, -127, 1, 86, 2, 49, 34, -76, -110, -28, 62, 18, 63, 57, -116, 124, -11, 49, 90, -32, 38, 63, 65, -116, 124, -11, 49, 90, -32, 38, 63, 73, -116, 124, -11, 49, 90, -32, 38, 63, 81, -93, 99, -60, -12, 20, 77, -14, 62, 89, -93, 99, -60, -12, 20, 77, -14, 62, 97, -93, 99, -60, -12, 20, 77, -14, 62, 105, -116, 124, -11, 49, 90, -32, 38, 63, 26, 20, 13, -61, -11, 28, 65, 21, 0, 0, 16, 65, 29, -51, -52, -52, 61, 45, 0, 0, 112, 66, 34, 10, 13, -102, -103, 25, 63, 21, -51, -52, 76, 63, 42, 21, 8, 10, 16, 10, 24, Byte.MIN_VALUE, -124, -81, 95, 32, 5, 61, 0, 0, 112, 66, 69, 0, 0, 112, 66, 50, 33, 10, 13, 8, 2, 16, 10, 25, 0, 0, 0, 0, 0, 0, -16, 63, 18, 7, 8, 3, 21, 0, 0, 64, 64, 18, 7, 8, 1, 21, 0, 0, 64, 64, 58, 50, 13, 0, 0, 0, 63, 18, 9, 10, 7, 8, 3, 21, 0, 0, -96, 64, 26, 20, 13, 0, 0, -96, 64, 21, 0, 0, Byte.MIN_VALUE, 64, 29, -51, -52, -52, 62, 37, 0, 0, 0, 63, 34, 10, 13, 0, 0, Byte.MIN_VALUE, 63, 21, -51, -52, -52, 61, 66, 5, 13, -113, -62, -11, 60, 74, 18, 10, 4, 8, 2, 16, 1, 10, 4, 8, 1, 16, 2, 10, 4, 8, 3, 16, 2, 82, 15, 13, 49, 120, 28, 67, 21, 112, -114, 11, 66, 29, 0, Byte.MIN_VALUE, -69, 69, 58, 24, 10, 6, 24, 1, 32, 1, 40, 1, 18, 4, 8, 1, 16, 1, 26, 8, 8, 1, 16, 1, 24, 1, 32, 1, 26, 2, 24, 1, 34, 2, 10, 0, 42, 0}), ceyb.f183505a);
            forceStopSensorBugfix140052055 = bdyx.m91610a(a, "InertialAnchor__force_stop_sensor_bugfix_140052055", false);
            useCarryBearingTracker = bdyx.m91610a(a, "InertialAnchor__use_carry_bearing_tracker", false);
            useClearcutLogging = bdyx.m91610a(a, "InertialAnchor__use_clearcut_logging", false);
            useConfigurationFlag = bdyx.m91610a(a, "InertialAnchor__use_configuration_flag", false);
            useDeclinationInitBugfix137541510 = bdyx.m91610a(a, "InertialAnchor__use_declination_init_bugfix_137541510", false);
            useEfficientQuaternionRateUpdate = bdyx.m91610a(a, "InertialAnchor__use_efficient_quaternion_rate_update", false);
            useImuCal = bdyx.m91610a(a, "InertialAnchor__use_imu_cal", true);
            useInitWithoutMagUpdates = bdyx.m91610a(a, "InertialAnchor__use_init_without_mag_updates", false);
            useMagFieldTracker = bdyx.m91610a(a, "InertialAnchor__use_mag_field_tracker", false);
            useMeasurementThrottler = bdyx.m91610a(a, "InertialAnchor__use_measurement_throttler", false);
            useNisDiversityConsistencyCheck = bdyx.m91610a(a, "InertialAnchor__use_nis_diversity_consistency_check", false);
            usePendingMeasurementSizeCheck = bdyx.m91610a(a, "InertialAnchor__use_pending_measurement_size_check", false);
            useStackOptimizedMatrixMultiply = bdyx.m91610a(a, "InertialAnchor__use_stack_optimized_matrix_multiply", false);
            useSynchronizerMaxQueueSize = bdyx.m91610a(a, "InertialAnchor__use_synchronizer_max_queue_size", false);
            useSystemTimestampForPoseOnKitkat = bdyx.m91610a(a, "InertialAnchor__use_system_timestamp_for_pose_on_kitkat", false);
            useTimestampChecker = bdyx.m91610a(a, "InertialAnchor__use_timestamp_checker", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"InertialAnchor__configuration\"");
        }
    }

    public long clearcutLogPeriodMs() {
        return ((Long) clearcutLogPeriodMs.mo58455c()).longValue();
    }

    public double clearcutLogSamplingRate() {
        return ((Double) clearcutLogSamplingRate.mo58455c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public btvy configuration() {
        return (btvy) configuration.mo58455c();
    }

    public boolean forceStopSensorBugfix140052055() {
        return ((Boolean) forceStopSensorBugfix140052055.mo58455c()).booleanValue();
    }

    public boolean useCarryBearingTracker() {
        return ((Boolean) useCarryBearingTracker.mo58455c()).booleanValue();
    }

    public boolean useClearcutLogging() {
        return ((Boolean) useClearcutLogging.mo58455c()).booleanValue();
    }

    public boolean useConfigurationFlag() {
        return ((Boolean) useConfigurationFlag.mo58455c()).booleanValue();
    }

    public boolean useDeclinationInitBugfix137541510() {
        return ((Boolean) useDeclinationInitBugfix137541510.mo58455c()).booleanValue();
    }

    public boolean useEfficientQuaternionRateUpdate() {
        return ((Boolean) useEfficientQuaternionRateUpdate.mo58455c()).booleanValue();
    }

    public boolean useImuCal() {
        return ((Boolean) useImuCal.mo58455c()).booleanValue();
    }

    public boolean useInitWithoutMagUpdates() {
        return ((Boolean) useInitWithoutMagUpdates.mo58455c()).booleanValue();
    }

    public boolean useMagFieldTracker() {
        return ((Boolean) useMagFieldTracker.mo58455c()).booleanValue();
    }

    public boolean useMeasurementThrottler() {
        return ((Boolean) useMeasurementThrottler.mo58455c()).booleanValue();
    }

    public boolean useNisDiversityConsistencyCheck() {
        return ((Boolean) useNisDiversityConsistencyCheck.mo58455c()).booleanValue();
    }

    public boolean usePendingMeasurementSizeCheck() {
        return ((Boolean) usePendingMeasurementSizeCheck.mo58455c()).booleanValue();
    }

    public boolean useStackOptimizedMatrixMultiply() {
        return ((Boolean) useStackOptimizedMatrixMultiply.mo58455c()).booleanValue();
    }

    public boolean useSynchronizerMaxQueueSize() {
        return ((Boolean) useSynchronizerMaxQueueSize.mo58455c()).booleanValue();
    }

    public boolean useSystemTimestampForPoseOnKitkat() {
        return ((Boolean) useSystemTimestampForPoseOnKitkat.mo58455c()).booleanValue();
    }

    public boolean useTimestampChecker() {
        return ((Boolean) useTimestampChecker.mo58455c()).booleanValue();
    }
}
