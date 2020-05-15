package p000;

/* renamed from: cesx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cesx {
    double bearingKfMaxBackwardsJumpSec();

    double bearingKfMaxGapBetweenUpdatesSec();

    double bearingKfQSigmaBrgAccRadPerSec2();

    double bearingKfQSigmaBrgRateRadPerSec();

    double bearingKfThresholdVarianceThetaRadSquared();

    boolean blueskyAdditionalClearcutLogging();

    boolean blueskyAllPixelsInBuildingFixB151637861();

    long blueskyBugreportLogExpirationTimeMinutes();

    long blueskyBugreportLogSize();

    boolean blueskyCheckPermissions();

    boolean blueskyChipsetCorrectionTimeOfWeek();

    boolean blueskyComputeProbLosForAllSats();

    boolean blueskyComputeProbLosWithMinigrid();

    boolean blueskyConstructLatLngKfAndBearingKfFromGcl();

    boolean blueskyDisableWhenScreenOff();

    boolean blueskyEnableBugreportLogs();

    boolean blueskyEnableClearcutStats();

    boolean blueskyEnableHardwareListener();

    boolean blueskyEnableMddGeofence();

    boolean blueskyEnabled();

    boolean blueskyExtendGridCoveringFlpGnss();

    long blueskyExtraBoundingRadiusToLoadGeodataMeters();

    long blueskyInVehicleStickinessSec();

    bydh blueskyIscbScaledDbhz();

    boolean blueskyIscbUseGclValue();

    long blueskyMaxGridRadiusMeters();

    double blueskyMinTravelDistanceToComputeCorrectionsMeters();

    long blueskyOnFootStickinessSec();

    double blueskyOpenskyMinCn0DbhzForLos();

    double blueskyOpenskyMinElevationDegForLos();

    long blueskyOpenskyMinNumLosGnssSignals();

    long blueskyOpenskyMinNumLosGpsSignals();

    long blueskyRaytracingCalculationRadiusMeters();

    double blueskyReportedSigmaMultiplier();

    bydi blueskyS2Geofence();

    boolean blueskySatelliteMotionFixB148574152();

    double blueskySatelliteMotionThresholdDeg();

    long blueskyScreenOffDisableTimeoutSec();

    boolean blueskyTileCacheFixB149114011();

    long blueskyTileDiskCacheSize();

    long blueskyTileSize();

    long blueskyTileVersion();

    long blueskyTileZoomLevel();

    boolean blueskyTreatUnknownActivityAsOnfoot();

    boolean blueskyUpdateOnTinyMovement();

    boolean blueskyUseGnssAsGridCenter();

    boolean blueskyUseImmutableLocalRaster();

    boolean blueskyUseLocationCompat();

    boolean blueskyUseRasterAltitudeForChipsetCorrection();

    bydh blueskyUtcSecondsAtLeaps();

    double blueskyWeightToGpsAccuracy();

    double latLngKfBearingAccuracyRad();

    double latLngKfInitVelocityUncertaintyMps();

    double latLngKfMaxBackwardsJumpSec();

    double latLngKfMaxGapBetweenUpdatesSec();

    double latLngKfMeasurementErrorResetThresholdMeters();

    double latLngKfQSigmaAccelWalkMps2();

    double latLngKfSigmaVelThresholdMps();

    double latLngKfSpeedAccuracyMps();

    double minigridMinAllowedHorizontalPositionSigmaMeters();

    long minigridNumberOfPointsInInnerCircle();

    double minigridRadiusOfInnerCircleMeters();
}
