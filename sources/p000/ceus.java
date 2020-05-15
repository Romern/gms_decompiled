package p000;

/* renamed from: ceus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceus implements ceur {
    public static final bdyx arAccessByteBufferDirectly;
    public static final bdyx arCnnOneShotEnabled;
    public static final bdyx arGruBurstBatchMaxAttemptsList;
    public static final bdyx arGruBurstConfidenceThresholdEarlyExitList;
    public static final bdyx arGruBurstEnabled;
    public static final bdyx arGruBurstNonBatchMaxAttemptsList;
    public static final bdyx arGruBurstNumOneShotsForSensorBatch;
    public static final bdyx arRelabelModeGruBurst;
    public static final bdyx arRelabelModeOneShot;
    public static final bdyx arRoadVehicleClassificationEnabled;
    public static final bdyx arTestingClassifiersEnabled;
    public static final bdyx arVehicleExitOnFootConfidenceThreshold;
    public static final bdyx enable2wheelerDetection;
    public static final bdyx roadVehicleThresholdFor2wheelerDetection;

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
        arAccessByteBufferDirectly = bdyx.m91610a(a, "ar_access_byte_buffer_directly", true);
        arCnnOneShotEnabled = bdyx.m91610a(a, "ar_cnn_one_shot_enabled", false);
        arGruBurstBatchMaxAttemptsList = bdyx.m91609a(a, "ar_gru_burst_batch_max_attempts_list", "9:9:9:9:9:9");
        arGruBurstConfidenceThresholdEarlyExitList = bdyx.m91609a(a, "ar_gru_burst_confidence_threshold_early_exit_list", "0.85:0.85:0.85:0.85:0.85:0.85");
        arGruBurstEnabled = bdyx.m91610a(a, "ar_gru_burst_enabled", false);
        arGruBurstNonBatchMaxAttemptsList = bdyx.m91609a(a, "ar_gru_burst_non_batch_max_attempts_list", "3:3:3:3:3:3");
        arGruBurstNumOneShotsForSensorBatch = bdyx.m91607a(a, "ar_gru_burst_num_one_shots_for_sensor_batch", 9L);
        arRelabelModeGruBurst = bdyx.m91607a(a, "ar_relabel_mode_gru_burst", 2L);
        arRelabelModeOneShot = bdyx.m91607a(a, "ar_relabel_mode_one_shot", 2L);
        arRoadVehicleClassificationEnabled = bdyx.m91610a(a, "ar_road_vehicle_classification_enabled", false);
        arTestingClassifiersEnabled = bdyx.m91610a(a, "ar_testing_classifiers_enabled", false);
        arVehicleExitOnFootConfidenceThreshold = bdyx.m91607a(a, "ar_vehicle_exit_on_foot_confidence_threshold", 60L);
        enable2wheelerDetection = bdyx.m91610a(a, "enable_2wheeler_detection", true);
        roadVehicleThresholdFor2wheelerDetection = bdyx.m91605a(a, "road_vehicle_threshold_for_2wheeler_detection", 0.4d);
    }

    public boolean arAccessByteBufferDirectly() {
        return ((Boolean) arAccessByteBufferDirectly.mo58455c()).booleanValue();
    }

    public boolean arCnnOneShotEnabled() {
        return ((Boolean) arCnnOneShotEnabled.mo58455c()).booleanValue();
    }

    public String arGruBurstBatchMaxAttemptsList() {
        return (String) arGruBurstBatchMaxAttemptsList.mo58455c();
    }

    public String arGruBurstConfidenceThresholdEarlyExitList() {
        return (String) arGruBurstConfidenceThresholdEarlyExitList.mo58455c();
    }

    public boolean arGruBurstEnabled() {
        return ((Boolean) arGruBurstEnabled.mo58455c()).booleanValue();
    }

    public String arGruBurstNonBatchMaxAttemptsList() {
        return (String) arGruBurstNonBatchMaxAttemptsList.mo58455c();
    }

    public long arGruBurstNumOneShotsForSensorBatch() {
        return ((Long) arGruBurstNumOneShotsForSensorBatch.mo58455c()).longValue();
    }

    public long arRelabelModeGruBurst() {
        return ((Long) arRelabelModeGruBurst.mo58455c()).longValue();
    }

    public long arRelabelModeOneShot() {
        return ((Long) arRelabelModeOneShot.mo58455c()).longValue();
    }

    public boolean arRoadVehicleClassificationEnabled() {
        return ((Boolean) arRoadVehicleClassificationEnabled.mo58455c()).booleanValue();
    }

    public boolean arTestingClassifiersEnabled() {
        return ((Boolean) arTestingClassifiersEnabled.mo58455c()).booleanValue();
    }

    public long arVehicleExitOnFootConfidenceThreshold() {
        return ((Long) arVehicleExitOnFootConfidenceThreshold.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enable2wheelerDetection() {
        return ((Boolean) enable2wheelerDetection.mo58455c()).booleanValue();
    }

    public double roadVehicleThresholdFor2wheelerDetection() {
        return ((Double) roadVehicleThresholdFor2wheelerDetection.mo58455c()).doubleValue();
    }
}
