package p000;

/* renamed from: cfao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfao implements cfan {
    public static final bdyx allowMissingWindowsDetection;
    public static final bdyx bedtimeFirstPartyWhitelistedAppEnabled;
    public static final bdyx chreSleepAudioEnabled;
    public static final bdyx chreSleepDetectionEnabled;
    public static final bdyx extendSleepUsingSupplementalFeatures;
    public static final bdyx gmsSleepClassificationEventLoggingEnabled;
    public static final bdyx hsmmStoreBackupIntervalEpochs;
    public static final bdyx logSleepApiStats;
    public static final bdyx maxSleepHours;
    public static final bdyx maxSleepSegmentCount;
    public static final bdyx minAwakeCountBeforeSegment;
    public static final bdyx minAwakeHsmmParam;
    public static final bdyx minBedtimeSupportedGmscoreVersion;
    public static final bdyx minSegmentedSleepHours;
    public static final bdyx minSleepHsmmParam;
    public static final bdyx minTotalEpochsBeforeSegment;
    public static final bdyx preferredSleepTimeWhitelist;
    public static final bdyx segmentSleepBeforeWindowEnds;
    public static final bdyx segmentSleepEndHour;
    public static final bdyx segmentSleepStartHour;
    public static final bdyx sendSleepSegmentUponRegister;
    public static final bdyx setAllowIdleAlarmForSleep;
    public static final bdyx sleepAccelFeatureFromMotion;
    public static final bdyx sleepActivityDetectionIdleIntervalMillis;
    public static final bdyx sleepActivityDetectionIntervalMillis;
    public static final bdyx sleepAlarmRingBugFix;
    public static final bdyx sleepApiWhitelist;
    public static final bdyx sleepClockAlarmConfidenceOverwriteMinutes;
    public static final bdyx sleepConfidenceFromMotion;
    public static final bdyx sleepDetectionAlarmAllowIdle;
    public static final bdyx sleepDetectionFirstPartyOnly;
    public static final bdyx sleepHighConfidenceAwakeThreshold;
    public static final bdyx sleepMissingDataMaxGapEpochs;
    public static final bdyx sleepSegmentDetectionEnabled;
    public static final bdyx sleepWindowEpochCalculationBugFix;
    public static final bdyx storePreviousSleepInSharedPreference;
    public static final bdyx truncateSleepInUserWindow;
    public static final bdyx writeSleepClassifyIntervalMinutes;

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
        allowMissingWindowsDetection = bdyx.m91610a(a, "allow_missing_windows_detection", true);
        bedtimeFirstPartyWhitelistedAppEnabled = bdyx.m91610a(a, "bedtime_first_party_whitelisted_app_enabled", true);
        chreSleepAudioEnabled = bdyx.m91610a(a, "chre_sleep_audio_enabled", false);
        chreSleepDetectionEnabled = bdyx.m91610a(a, "chre_sleep_detection_enabled", false);
        extendSleepUsingSupplementalFeatures = bdyx.m91610a(a, "extend_sleep_using_supplemental_features", true);
        gmsSleepClassificationEventLoggingEnabled = bdyx.m91610a(a, "gms_sleep_classification_event_logging_enabled", true);
        hsmmStoreBackupIntervalEpochs = bdyx.m91607a(a, "hsmm_store_backup_interval_epochs", 2L);
        logSleepApiStats = bdyx.m91610a(a, "log_sleep_api_stats", true);
        maxSleepHours = bdyx.m91607a(a, "max_sleep_hours", 12L);
        maxSleepSegmentCount = bdyx.m91607a(a, "max_sleep_segment_count", 1L);
        minAwakeCountBeforeSegment = bdyx.m91607a(a, "min_awake_count_before_segment", 1L);
        minAwakeHsmmParam = bdyx.m91607a(a, "min_awake_hsmm_param", 30L);
        minBedtimeSupportedGmscoreVersion = bdyx.m91607a(a, "min_bedtime_supported_gmscore_version", 200900000L);
        minSegmentedSleepHours = bdyx.m91607a(a, "min_segmented_sleep_hours", 4L);
        minSleepHsmmParam = bdyx.m91607a(a, "min_sleep_hsmm_param", 40L);
        minTotalEpochsBeforeSegment = bdyx.m91607a(a, "min_total_epochs_before_segment", 60L);
        preferredSleepTimeWhitelist = bdyx.m91609a(a, "preferred_sleep_time_whitelist", "com.google.android.apps.wellbeing,com.google.android.apps.location.context.activity.sleep,");
        segmentSleepBeforeWindowEnds = bdyx.m91610a(a, "segment_sleep_before_window_ends", true);
        segmentSleepEndHour = bdyx.m91607a(a, "segment_sleep_end_hour", 13L);
        segmentSleepStartHour = bdyx.m91607a(a, "segment_sleep_start_hour", 6L);
        sendSleepSegmentUponRegister = bdyx.m91610a(a, "send_sleep_segment_upon_register", true);
        setAllowIdleAlarmForSleep = bdyx.m91610a(a, "set_allow_idle_alarm_for_sleep", true);
        sleepAccelFeatureFromMotion = bdyx.m91605a(a, "sleep_accel_feature_from_motion", 1.0d);
        sleepActivityDetectionIdleIntervalMillis = bdyx.m91607a(a, "sleep_activity_detection_idle_interval_millis", 570000L);
        sleepActivityDetectionIntervalMillis = bdyx.m91607a(a, "sleep_activity_detection_interval_millis", 360000L);
        sleepAlarmRingBugFix = bdyx.m91610a(a, "sleep_alarm_ring_bug_fix", true);
        sleepApiWhitelist = bdyx.m91609a(a, "sleep_api_whitelist", "com.google.android.apps.fitness,com.google.android.apps.location.context.activity.sleep,com.google.android.apps.dreamliner,com.verily.myalo.scaleit,com.google.android.apps.wellbeing,com.google.android.apps.cerebra.dunlin,");
        sleepClockAlarmConfidenceOverwriteMinutes = bdyx.m91607a(a, "sleep_clock_alarm_confidence_overwrite_minutes", 12L);
        sleepConfidenceFromMotion = bdyx.m91607a(a, "sleep_confidence_from_motion", 1L);
        sleepDetectionAlarmAllowIdle = bdyx.m91610a(a, "sleep_detection_alarm_allow_idle", true);
        sleepDetectionFirstPartyOnly = bdyx.m91610a(a, "sleep_detection_first_party_only", false);
        sleepHighConfidenceAwakeThreshold = bdyx.m91607a(a, "sleep_high_confidence_awake_threshold", 20L);
        sleepMissingDataMaxGapEpochs = bdyx.m91607a(a, "sleep_missing_data_max_gap_epochs", 4L);
        sleepSegmentDetectionEnabled = bdyx.m91610a(a, "sleep_segment_detection_enabled", false);
        sleepWindowEpochCalculationBugFix = bdyx.m91610a(a, "sleep_window_epoch_calculation_bug_fix", true);
        storePreviousSleepInSharedPreference = bdyx.m91610a(a, "store_previous_sleep_in_shared_preference", true);
        truncateSleepInUserWindow = bdyx.m91610a(a, "truncate_sleep_in_user_window", true);
        writeSleepClassifyIntervalMinutes = bdyx.m91607a(a, "write_sleep_classify_interval_minutes", 5L);
    }

    public boolean allowMissingWindowsDetection() {
        return ((Boolean) allowMissingWindowsDetection.mo58455c()).booleanValue();
    }

    public boolean bedtimeFirstPartyWhitelistedAppEnabled() {
        return ((Boolean) bedtimeFirstPartyWhitelistedAppEnabled.mo58455c()).booleanValue();
    }

    public boolean chreSleepAudioEnabled() {
        return ((Boolean) chreSleepAudioEnabled.mo58455c()).booleanValue();
    }

    public boolean chreSleepDetectionEnabled() {
        return ((Boolean) chreSleepDetectionEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean extendSleepUsingSupplementalFeatures() {
        return ((Boolean) extendSleepUsingSupplementalFeatures.mo58455c()).booleanValue();
    }

    public boolean gmsSleepClassificationEventLoggingEnabled() {
        return ((Boolean) gmsSleepClassificationEventLoggingEnabled.mo58455c()).booleanValue();
    }

    public long hsmmStoreBackupIntervalEpochs() {
        return ((Long) hsmmStoreBackupIntervalEpochs.mo58455c()).longValue();
    }

    public boolean logSleepApiStats() {
        return ((Boolean) logSleepApiStats.mo58455c()).booleanValue();
    }

    public long maxSleepHours() {
        return ((Long) maxSleepHours.mo58455c()).longValue();
    }

    public long maxSleepSegmentCount() {
        return ((Long) maxSleepSegmentCount.mo58455c()).longValue();
    }

    public long minAwakeCountBeforeSegment() {
        return ((Long) minAwakeCountBeforeSegment.mo58455c()).longValue();
    }

    public long minAwakeHsmmParam() {
        return ((Long) minAwakeHsmmParam.mo58455c()).longValue();
    }

    public long minBedtimeSupportedGmscoreVersion() {
        return ((Long) minBedtimeSupportedGmscoreVersion.mo58455c()).longValue();
    }

    public long minSegmentedSleepHours() {
        return ((Long) minSegmentedSleepHours.mo58455c()).longValue();
    }

    public long minSleepHsmmParam() {
        return ((Long) minSleepHsmmParam.mo58455c()).longValue();
    }

    public long minTotalEpochsBeforeSegment() {
        return ((Long) minTotalEpochsBeforeSegment.mo58455c()).longValue();
    }

    public String preferredSleepTimeWhitelist() {
        return (String) preferredSleepTimeWhitelist.mo58455c();
    }

    public boolean segmentSleepBeforeWindowEnds() {
        return ((Boolean) segmentSleepBeforeWindowEnds.mo58455c()).booleanValue();
    }

    public long segmentSleepEndHour() {
        return ((Long) segmentSleepEndHour.mo58455c()).longValue();
    }

    public long segmentSleepStartHour() {
        return ((Long) segmentSleepStartHour.mo58455c()).longValue();
    }

    public boolean sendSleepSegmentUponRegister() {
        return ((Boolean) sendSleepSegmentUponRegister.mo58455c()).booleanValue();
    }

    public boolean setAllowIdleAlarmForSleep() {
        return ((Boolean) setAllowIdleAlarmForSleep.mo58455c()).booleanValue();
    }

    public double sleepAccelFeatureFromMotion() {
        return ((Double) sleepAccelFeatureFromMotion.mo58455c()).doubleValue();
    }

    public long sleepActivityDetectionIdleIntervalMillis() {
        return ((Long) sleepActivityDetectionIdleIntervalMillis.mo58455c()).longValue();
    }

    public long sleepActivityDetectionIntervalMillis() {
        return ((Long) sleepActivityDetectionIntervalMillis.mo58455c()).longValue();
    }

    public boolean sleepAlarmRingBugFix() {
        return ((Boolean) sleepAlarmRingBugFix.mo58455c()).booleanValue();
    }

    public String sleepApiWhitelist() {
        return (String) sleepApiWhitelist.mo58455c();
    }

    public long sleepClockAlarmConfidenceOverwriteMinutes() {
        return ((Long) sleepClockAlarmConfidenceOverwriteMinutes.mo58455c()).longValue();
    }

    public long sleepConfidenceFromMotion() {
        return ((Long) sleepConfidenceFromMotion.mo58455c()).longValue();
    }

    public boolean sleepDetectionAlarmAllowIdle() {
        return ((Boolean) sleepDetectionAlarmAllowIdle.mo58455c()).booleanValue();
    }

    public boolean sleepDetectionFirstPartyOnly() {
        return ((Boolean) sleepDetectionFirstPartyOnly.mo58455c()).booleanValue();
    }

    public long sleepHighConfidenceAwakeThreshold() {
        return ((Long) sleepHighConfidenceAwakeThreshold.mo58455c()).longValue();
    }

    public long sleepMissingDataMaxGapEpochs() {
        return ((Long) sleepMissingDataMaxGapEpochs.mo58455c()).longValue();
    }

    public boolean sleepSegmentDetectionEnabled() {
        return ((Boolean) sleepSegmentDetectionEnabled.mo58455c()).booleanValue();
    }

    public boolean sleepWindowEpochCalculationBugFix() {
        return ((Boolean) sleepWindowEpochCalculationBugFix.mo58455c()).booleanValue();
    }

    public boolean storePreviousSleepInSharedPreference() {
        return ((Boolean) storePreviousSleepInSharedPreference.mo58455c()).booleanValue();
    }

    public boolean truncateSleepInUserWindow() {
        return ((Boolean) truncateSleepInUserWindow.mo58455c()).booleanValue();
    }

    public long writeSleepClassifyIntervalMinutes() {
        return ((Long) writeSleepClassifyIntervalMinutes.mo58455c()).longValue();
    }
}
