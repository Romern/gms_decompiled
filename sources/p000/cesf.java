package p000;

/* renamed from: cesf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cesf {
    boolean activityLowPowerModeEnabled();

    long activityPowerSaveModeMinIntervalMillis();

    boolean allowInstantAlarm();

    boolean arBatchingApiLatencyFixRollback();

    boolean arDisallowActivityDetectionDisable();

    boolean arWakeupAlignToMinute();

    boolean collectBluetoothInVehicleDeviceClassification();

    long downSampleArIntervalMs();

    boolean emulateHardwareActivityRecognitionFlush();

    boolean enableActivityRecognitionClearcutLogging();

    boolean enableActivityRecognitionThrottling();

    boolean enableAppImportanceListener();

    boolean enableBluetoothInVehicle();

    boolean enableBluetoothInVehicleLowLatency();

    boolean enableGmmBluetoothMetrics();

    boolean enableGmmHistoryTracker();

    long minArIntervalMs();

    String mockActivityType();

    boolean motionClearsDeepStillState();

    boolean registerPowerConnectionBroadcasts();

    boolean relabelActivityWhenWifiConnected();

    boolean sensorBatchingEnabled();

    long sensorBatchingFlushTimeoutMillis();

    long sensorBatchingNonwearableMaxPeriodMillis();

    boolean sensorBatchingOnWatchEnabled();

    double sensorBatchingProbDelayConst();

    double sensorBatchingProbMin();

    boolean significantMotionEnabled();

    double trackActivityPowerModeTimeProb();

    String userDomain();

    boolean wakeUpTiltDetectorEnabled();

    boolean wristTiltEnabled();
}
