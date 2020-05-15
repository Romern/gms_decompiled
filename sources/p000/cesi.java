package p000;

/* renamed from: cesi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cesi {
    boolean arDeepStillTransitioningEnabled();

    boolean arReportTransitionOnClientAdded();

    boolean arTransitionApplyPersonalConfidenceFilter();

    boolean arTransitionBikingWifiFilteringEnabled();

    boolean arTransitionEventLogging();

    boolean arTransitionFastVehicleexitOnfootEnabled();

    boolean arTransitionFilteringEnabled();

    boolean arTransitionHardwareSoftwareSwitchEnabled();

    boolean arTransitionVehicleBluetoothFilteringEnabled();

    boolean arTransitionVehicleBluetoothTimeoutOptimizations();

    boolean arTransitionWifiFilteringEnabled();

    long bikeHighConfidenceThreshold();

    boolean enableActivityTransitionDetection();

    boolean enableAdaptiveWifiSampling();

    long footHighConfidenceThreshold();

    boolean hardwareTransitionFilteringEnabled();

    long inRailVehicleConfidenceThreshold();

    long inVehicleConfidenceThreshold();

    long maxTimeVehicleExitWithConnectedBluetoothMillis();

    long maxTimeWithoutInCarDetectionMillis();

    long maxTimeWithoutInVehicleDetectionMillis();

    long minArThrottlingIntervalInMillis();

    long minBikeContinuousDetectionCount();

    long minContinuousTimeIntervalWithConnectedWifi();

    long minFootContinuousDetectionCount();

    long minInRailVehicleContinuousDetectionCount();

    long minInVehicleContinuousDetectionCount();

    double minInVehicleSpeed();

    long minOnfootConfidenceForChreResultsBikeRelabeling();

    long minOnfootCountForChreResultsBikeRelabeling();

    long minPersonalInVehicleConfidence();

    long minStillContinuousDetectionCount();

    long minStillForTransitionFromFoot();

    long minStillHighConfidenceContinuousDetectionCount();

    long minVehicleConfidenceForChreResultsBikeRelabeling();

    long minVehicleCountForChreResultsBikeRelabeling();

    boolean softwareActivityRecognitionTransitionEnabledV2();

    long stillHighConfidenceThreshold();
}
