package p000;

/* renamed from: cezf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cezf {
    double collectNlpApiUsage();

    boolean enableNewCollectionGlsClient();

    boolean enableQTelephonyExceptions();

    boolean enableRttForNlpLocations();

    boolean enableTelephonyOnError();

    boolean enableTestLogSensorIds();

    boolean enableTestingFeatures();

    boolean enableWifiScanBroadcasts();

    boolean enforceThreadAffinity();

    boolean fiveGMode();

    boolean forcePendingIntentOperationsToNlpHandler();

    boolean generatePlatformKeyLocally();

    String googleLocationServer();

    boolean logSuccessMetrics();

    boolean nlpClientStatsLog();

    boolean nlpClientStatsOmitAppend();

    boolean nlpSilentFeedbackEnabled();

    long nlpSilentFeedbackIntervalMillis();

    double reportSystemWideSettings();

    boolean requirePackageManagerTelephonyCapability();

    double rttHistoryRangeTimeToLiveSeconds();

    long rttLocationModes();

    String supplyRttLocations();

    boolean uploadNlpDailyStats();

    boolean useIntentOperationStartNlp();

    boolean useNanoHubForGlsQueries();

    long useWifiBatchingForLocation();

    boolean useWifiRtt();

    boolean verifyGlocStatus();
}
