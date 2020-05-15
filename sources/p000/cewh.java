package p000;

/* renamed from: cewh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cewh {
    boolean fopEnableInertialAnchorOrientationEngineV2();

    boolean fopEventLogsSetClientFixEnable();

    long fopInertialAnchorConfigurationIndex();

    long fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex();

    boolean fopInertialAnchorUseHeadingUncertaintyModelConfig();

    boolean fopInertialAnchorUseNanBugfix120491249();

    boolean fopInertialAnchorUseStatefulLogging();

    long fopLogCollectionPeriodMs();

    double fopLogSamplingRate();

    boolean fopLogsCheckConsent();

    long fopMaxErrorDegreesHighAccuracy();

    long fopMaxErrorDegreesLowAccuracy();

    long fopMaxErrorDegreesMediumAccuracy();

    long fopMinChangeErrorDegreesForLevelUpdate();

    double fopRequestLogSamplingRate();

    long fopSensorSamplingPeriodMilliseconds();

    boolean fopUseInertialAnchor();
}
