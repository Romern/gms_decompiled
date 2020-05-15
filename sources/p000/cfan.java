package p000;

/* renamed from: cfan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface cfan {
    boolean allowMissingWindowsDetection();

    boolean bedtimeFirstPartyWhitelistedAppEnabled();

    boolean chreSleepAudioEnabled();

    boolean chreSleepDetectionEnabled();

    boolean gmsSleepClassificationEventLoggingEnabled();

    long hsmmStoreBackupIntervalEpochs();

    boolean logSleepApiStats();

    long minAwakeCountBeforeSegment();

    long minAwakeHsmmParam();

    long minBedtimeSupportedGmscoreVersion();

    long minSegmentedSleepHours();

    long minSleepHsmmParam();

    long minTotalEpochsBeforeSegment();

    String preferredSleepTimeWhitelist();

    boolean segmentSleepBeforeWindowEnds();

    long segmentSleepEndHour();

    long segmentSleepStartHour();

    boolean sendSleepSegmentUponRegister();

    boolean setAllowIdleAlarmForSleep();

    double sleepAccelFeatureFromMotion();

    long sleepActivityDetectionIdleIntervalMillis();

    long sleepActivityDetectionIntervalMillis();

    boolean sleepAlarmRingBugFix();

    String sleepApiWhitelist();

    long sleepClockAlarmConfidenceOverwriteMinutes();

    long sleepConfidenceFromMotion();

    boolean sleepDetectionAlarmAllowIdle();

    boolean sleepDetectionFirstPartyOnly();

    long sleepHighConfidenceAwakeThreshold();

    long sleepMissingDataMaxGapEpochs();

    boolean sleepSegmentDetectionEnabled();

    boolean sleepWindowEpochCalculationBugFix();

    boolean storePreviousSleepInSharedPreference();

    boolean truncateSleepInUserWindow();

    long writeSleepClassifyIntervalMinutes();
}
