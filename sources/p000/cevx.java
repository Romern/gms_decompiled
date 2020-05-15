package p000;

/* renamed from: cevx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cevx {
    boolean analyticsEnabled();

    String analyticsTrackingId();

    boolean bugfixLsdAlwaysOk();

    boolean bugfixLsdReadProvider();

    boolean bugfixReferenceEscapeInFusionEngine();

    boolean bugfixReleaseClientResource();

    boolean catchSecurityException();

    boolean enablePressureInFusionEngine();

    long eventLogSize();

    boolean fixGlsConsentAtv();

    long flpAllowedDeliveryAgeMs();

    boolean flpEnableDebugLogging();

    boolean flpEnablePdrOnlyWhenScreenIsOn();

    boolean flpEnableSensorfusionLogs();

    long flpFusionGpsRequestTimePeriodSec();

    long flpFusionNearIndoorGpsSnrThreshold();

    long flpFusionWifiRequestTimePeriodSec();

    long flpHighPowerGpsPulseMs();

    long flpMinArScreenOfOrNoHighAccuracyIntervalMs();

    long flpMinArScreenOnHighAccuracyIntervalMs();

    /* renamed from: flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled */
    boolean mo80261x4ecc0320();

    boolean flpScreenOnHighAccuracyModeEnabled();

    boolean flpUsePdr();

    boolean g2kRolloverCorrection();

    boolean logSensorFusionOutputPosition();

    long minSdkForRemovalCallback();

    long pressureRequestMaxDurationMs();

    long pressureRequestMinDurationMs();

    long pressureSamplingIntervalUs();

    boolean removeGacUsage();

    boolean removeIndoorLevelAndFloor();

    boolean sendCallbackOnRemoval();

    long sensorFusionOutputPositionLogMaxBufferSize();

    long sensorFusionOutputPositionLogTimeWindowSec();

    boolean setWearableRequestModuleId();

    boolean supportMaxLocationAge();

    boolean uploadLocationPermission();

    boolean useFullLocationForCoarse();

    boolean useGnssStatus();

    boolean useReflectedSystemApis();
}
