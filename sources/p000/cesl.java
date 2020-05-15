package p000;

/* renamed from: cesl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cesl {
    boolean chreArAudioDiagnosticsLog();

    boolean chreArAudioEnableAudioBasedCarExit();

    boolean chreArAudioEnableAudioFusion();

    double chreArAudioMinAudioCarClassificationConfidence();

    double chreArAudioMinAudioNoncarClassificationConfidence();

    long chreArAudioMinBufferedMotionClassificationsCar();

    long chreArAudioMinBufferedMotionClassificationsOnfoot();

    long chreArAudioMinBufferedMotionClassificationsStill();

    long chreArAudioMinContinuousAudioClassificationsCar();

    long chreArAudioMinContinuousAudioClassificationsNoncar();

    long chreArAudioMinContinuousMotionClassificationsBicycle();

    long chreArAudioMinContinuousMotionClassificationsCar();

    long chreArAudioMinContinuousMotionClassificationsOnfoot();

    long chreArAudioMinContinuousMotionClassificationsStill();

    double chreArAudioMinMotionBicycleClassificationConfidence();

    double chreArAudioMinMotionCarClassificationConfidence();

    double chreArAudioMinMotionOnfootClassificationConfidence();

    double chreArAudioMinMotionStillClassificationConfidence();

    double chreArAudioMinPressurePeakSpikeBackDelta();

    double chreArAudioMinPressurePeakSpikeThreshold();

    long chreArAudioTimeIntervalThresholdForPressurePeakMillis();

    boolean chreArAudioVerbose();

    long chreArDeepStillIntervalExitMillis();

    boolean chreArEnableMultimodalModelBasedExitTransition();

    long chreArMaxLastVehicleDetectionIntervalForAllStillMillis();

    long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis();

    long chreArOnfootRecencyTimeIntervalMillis();

    boolean enableAudioChreWifiFiltering();

    boolean enableCarExitOnIdle();

    boolean enableConnectedWifiFilterAudioFusion();

    boolean enableDrivingDndExitWithAudioFusion();

    boolean enableDrivingDndWithAudioFusion();

    boolean enableDrivingDndWithRoadRail();

    String firstPartyAudioEnabledPackageWhitelist();

    long flexAudioFusion();

    boolean onlyRelyOnCarTransitionStateMachine();

    String zeroPartyAudioEnabledTagWhitelist();
}
