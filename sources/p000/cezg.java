package p000;

/* renamed from: cezg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezg implements cezf {
    public static final bdyx collectNlpApiUsage;
    public static final bdyx eliminateAlarmsForCacheUpdater;
    public static final bdyx enableNewCollectionGlsClient;
    public static final bdyx enableNewPieWifirttmanagerApi;
    public static final bdyx enableNlpQcmBug78491466Workaround;
    public static final bdyx enableQTelephonyApis;
    public static final bdyx enableQTelephonyExceptions;
    public static final bdyx enableRttForNlpLocations;
    public static final bdyx enableTelephonyOnError;
    public static final bdyx enableTestLogSensorIds;
    public static final bdyx enableTestingFeatures;
    public static final bdyx enableWifiScanBroadcasts;
    public static final bdyx enforceThreadAffinity;
    public static final bdyx fiveGMode;
    public static final bdyx flpNlpUsageAuditLogEnabled;
    public static final bdyx forcePendingIntentOperationsToNlpHandler;
    public static final bdyx generatePlatformKeyLocally;
    public static final bdyx googleLocationServer;
    public static final bdyx logSuccessMetrics;
    public static final bdyx moveClientRegisterToNlpThread;
    public static final bdyx nlpClientStatsLog;
    public static final bdyx nlpClientStatsOmitAppend;
    public static final bdyx nlpSilentFeedbackEnabled;
    public static final bdyx nlpSilentFeedbackIntervalMillis;
    public static final bdyx nlpSilentFeedbackUseConnectionlessClient;
    public static final bdyx omitWifiLockInNougat;
    public static final bdyx reportSystemWideSettings;
    public static final bdyx requirePackageManagerTelephonyCapability;
    public static final bdyx rttHistoryRangeTimeToLiveSeconds;
    public static final bdyx rttLocationModes;
    public static final bdyx supplyRttLocations;
    public static final bdyx uploadNlpDailyStats;
    public static final bdyx useIntentOperationStartNlp;
    public static final bdyx useNanoHubForGlsQueries;
    public static final bdyx useWifiBatchingForLocation;
    public static final bdyx useWifiRtt;
    public static final bdyx verifyGlocStatus;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        collectNlpApiUsage = bdyx.m91605a(a, "stats_collect_nlp_api", 1.0E-7d);
        eliminateAlarmsForCacheUpdater = bdyx.m91610a(a, "nlp_cu_e", false);
        enableNewCollectionGlsClient = bdyx.m91610a(a, "newgls", false);
        enableNewPieWifirttmanagerApi = bdyx.m91610a(a, "nlp_rtt_p", false);
        enableNlpQcmBug78491466Workaround = bdyx.m91610a(a, "Nlp__enable_nlp_qcm_bug_78491466_workaround", true);
        enableQTelephonyApis = bdyx.m91610a(a, "tp_q_api", true);
        enableQTelephonyExceptions = bdyx.m91610a(a, "tp_q_ex", false);
        enableRttForNlpLocations = bdyx.m91610a(a, "nlp_req_rtt", false);
        enableTelephonyOnError = bdyx.m91610a(a, "tp_err", false);
        enableTestLogSensorIds = bdyx.m91610a(a, "Nlp__enable_test_log_sensor_ids", false);
        enableTestingFeatures = bdyx.m91610a(a, "enable_testing_features", false);
        enableWifiScanBroadcasts = bdyx.m91610a(a, "Nlp__enable_wifi_scan_broadcasts", false);
        enforceThreadAffinity = bdyx.m91610a(a, "Nlp__enforce_thread_affinity", true);
        fiveGMode = bdyx.m91610a(a, "q_nr", true);
        flpNlpUsageAuditLogEnabled = bdyx.m91610a(a, "flp_nlp_usage_audit_log_enabled", false);
        forcePendingIntentOperationsToNlpHandler = bdyx.m91610a(a, "nlp_pi_rx", false);
        generatePlatformKeyLocally = bdyx.m91610a(a, "nlp_pk", false);
        googleLocationServer = bdyx.m91609a(a, "google_location_server", "");
        logSuccessMetrics = bdyx.m91610a(a, "Nlp__log_success_metrics", false);
        moveClientRegisterToNlpThread = bdyx.m91610a(a, "st_c_t", true);
        nlpClientStatsLog = bdyx.m91610a(a, "nlp_stats_log", false);
        nlpClientStatsOmitAppend = bdyx.m91610a(a, "nlp_stats_omit_append", false);
        nlpSilentFeedbackEnabled = bdyx.m91610a(a, "nlp_sf_enabled", true);
        nlpSilentFeedbackIntervalMillis = bdyx.m91607a(a, "nlp_sf_intrvl", 60000L);
        nlpSilentFeedbackUseConnectionlessClient = bdyx.m91610a(a, "nlp_cl_f", true);
        omitWifiLockInNougat = bdyx.m91610a(a, "wf_wl_n", true);
        reportSystemWideSettings = bdyx.m91605a(a, "stats_collect_nlp_enabled", 0.01d);
        requirePackageManagerTelephonyCapability = bdyx.m91610a(a, "tp_rq_pm", false);
        rttHistoryRangeTimeToLiveSeconds = bdyx.m91605a(a, "Nlp__rtt_history_range_time_to_live_seconds", 4.5d);
        rttLocationModes = bdyx.m91607a(a, "nlp_rtt_m", 4294967295L);
        supplyRttLocations = bdyx.m91609a(a, "rttl", "");
        uploadNlpDailyStats = bdyx.m91610a(a, "upload_nlp_daily_stats", false);
        useIntentOperationStartNlp = bdyx.m91610a(a, "Nlp__use_intent_operation_start_nlp", true);
        useNanoHubForGlsQueries = bdyx.m91610a(a, "nano_gls_server", true);
        useWifiBatchingForLocation = bdyx.m91607a(a, "use_wifi_batching", 20L);
        useWifiRtt = bdyx.m91610a(a, "use_wifi_rtt", true);
        verifyGlocStatus = bdyx.m91610a(a, "clb_v_null", false);
    }

    public double collectNlpApiUsage() {
        return ((Double) collectNlpApiUsage.mo58455c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean eliminateAlarmsForCacheUpdater() {
        return ((Boolean) eliminateAlarmsForCacheUpdater.mo58455c()).booleanValue();
    }

    public boolean enableNewCollectionGlsClient() {
        return ((Boolean) enableNewCollectionGlsClient.mo58455c()).booleanValue();
    }

    public boolean enableNewPieWifirttmanagerApi() {
        return ((Boolean) enableNewPieWifirttmanagerApi.mo58455c()).booleanValue();
    }

    public boolean enableNlpQcmBug78491466Workaround() {
        return ((Boolean) enableNlpQcmBug78491466Workaround.mo58455c()).booleanValue();
    }

    public boolean enableQTelephonyApis() {
        return ((Boolean) enableQTelephonyApis.mo58455c()).booleanValue();
    }

    public boolean enableQTelephonyExceptions() {
        return ((Boolean) enableQTelephonyExceptions.mo58455c()).booleanValue();
    }

    public boolean enableRttForNlpLocations() {
        return ((Boolean) enableRttForNlpLocations.mo58455c()).booleanValue();
    }

    public boolean enableTelephonyOnError() {
        return ((Boolean) enableTelephonyOnError.mo58455c()).booleanValue();
    }

    public boolean enableTestLogSensorIds() {
        return ((Boolean) enableTestLogSensorIds.mo58455c()).booleanValue();
    }

    public boolean enableTestingFeatures() {
        return ((Boolean) enableTestingFeatures.mo58455c()).booleanValue();
    }

    public boolean enableWifiScanBroadcasts() {
        return ((Boolean) enableWifiScanBroadcasts.mo58455c()).booleanValue();
    }

    public boolean enforceThreadAffinity() {
        return ((Boolean) enforceThreadAffinity.mo58455c()).booleanValue();
    }

    public boolean fiveGMode() {
        return ((Boolean) fiveGMode.mo58455c()).booleanValue();
    }

    public boolean flpNlpUsageAuditLogEnabled() {
        return ((Boolean) flpNlpUsageAuditLogEnabled.mo58455c()).booleanValue();
    }

    public boolean forcePendingIntentOperationsToNlpHandler() {
        return ((Boolean) forcePendingIntentOperationsToNlpHandler.mo58455c()).booleanValue();
    }

    public boolean generatePlatformKeyLocally() {
        return ((Boolean) generatePlatformKeyLocally.mo58455c()).booleanValue();
    }

    public String googleLocationServer() {
        return (String) googleLocationServer.mo58455c();
    }

    public boolean logSuccessMetrics() {
        return ((Boolean) logSuccessMetrics.mo58455c()).booleanValue();
    }

    public boolean moveClientRegisterToNlpThread() {
        return ((Boolean) moveClientRegisterToNlpThread.mo58455c()).booleanValue();
    }

    public boolean nlpClientStatsLog() {
        return ((Boolean) nlpClientStatsLog.mo58455c()).booleanValue();
    }

    public boolean nlpClientStatsOmitAppend() {
        return ((Boolean) nlpClientStatsOmitAppend.mo58455c()).booleanValue();
    }

    public boolean nlpSilentFeedbackEnabled() {
        return ((Boolean) nlpSilentFeedbackEnabled.mo58455c()).booleanValue();
    }

    public long nlpSilentFeedbackIntervalMillis() {
        return ((Long) nlpSilentFeedbackIntervalMillis.mo58455c()).longValue();
    }

    public boolean nlpSilentFeedbackUseConnectionlessClient() {
        return ((Boolean) nlpSilentFeedbackUseConnectionlessClient.mo58455c()).booleanValue();
    }

    public boolean omitWifiLockInNougat() {
        return ((Boolean) omitWifiLockInNougat.mo58455c()).booleanValue();
    }

    public double reportSystemWideSettings() {
        return ((Double) reportSystemWideSettings.mo58455c()).doubleValue();
    }

    public boolean requirePackageManagerTelephonyCapability() {
        return ((Boolean) requirePackageManagerTelephonyCapability.mo58455c()).booleanValue();
    }

    public double rttHistoryRangeTimeToLiveSeconds() {
        return ((Double) rttHistoryRangeTimeToLiveSeconds.mo58455c()).doubleValue();
    }

    public long rttLocationModes() {
        return ((Long) rttLocationModes.mo58455c()).longValue();
    }

    public String supplyRttLocations() {
        return (String) supplyRttLocations.mo58455c();
    }

    public boolean uploadNlpDailyStats() {
        return ((Boolean) uploadNlpDailyStats.mo58455c()).booleanValue();
    }

    public boolean useIntentOperationStartNlp() {
        return ((Boolean) useIntentOperationStartNlp.mo58455c()).booleanValue();
    }

    public boolean useNanoHubForGlsQueries() {
        return ((Boolean) useNanoHubForGlsQueries.mo58455c()).booleanValue();
    }

    public long useWifiBatchingForLocation() {
        return ((Long) useWifiBatchingForLocation.mo58455c()).longValue();
    }

    public boolean useWifiRtt() {
        return ((Boolean) useWifiRtt.mo58455c()).booleanValue();
    }

    public boolean verifyGlocStatus() {
        return ((Boolean) verifyGlocStatus.mo58455c()).booleanValue();
    }
}
