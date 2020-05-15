package p000;

/* renamed from: cewl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cewl implements cewk {
    public static final bdyx elevationApNormalDistributionSigmaExponent;
    public static final bdyx elevationApNormalDistributionSigmaMultiplier;
    public static final bdyx elevationApNormalDistributionWeightDivisor;
    public static final bdyx elevationApNormalDistributionWeightExponent;
    public static final bdyx elevationDeltaPhoneFromFloorM;
    public static final bdyx elevationFromWifiEnabled;
    public static final bdyx elevationFromWifiMinRssiDbm;
    public static final bdyx elevationFromWifiOutlierThresholdM;
    public static final bdyx elevationLocalizerUseWeightedLikelihoods;
    public static final bdyx elevationMaxVerticalAccuracyMeters;
    public static final bdyx enableFrewleFloorEstimator;
    public static final bdyx enableGlocRequestReducedDownloadThreshold;
    public static final bdyx enableRnnFrewleEngine;
    public static final bdyx fixFrewleSizeStats;
    public static final bdyx frewleBuildingIdsCacheMaxSize;
    public static final bdyx frewleDefaultMaxNumApEntriesForDownload;
    public static final bdyx frewleFloorModelsCacheMaxSize;
    public static final bdyx frewleMacEntryLruCacheMaxSize;
    public static final bdyx frewleSeenMacAddressLruCacheMaxSize;
    public static final bdyx overwriteRttZAxisInfoWithFrewle;
    public static final bdyx proksConfig;
    public static final bdyx throwIllegalArgExceptionOnUnsupportedEncoding;
    public static final bdyx useFrewleTileCacheManagerV2;
    public static final bdyx usePartialGlsFix142179343;

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
        elevationApNormalDistributionSigmaExponent = bdyx.m91605a(a, "elevation_ap_normal_distribution_sigma_exponent", 1.86d);
        elevationApNormalDistributionSigmaMultiplier = bdyx.m91605a(a, "Frewle__elevation_ap_normal_distribution_sigma_multiplier", 2463.0d);
        elevationApNormalDistributionWeightDivisor = bdyx.m91605a(a, "elevation_ap_normal_distribution_weight_divisor", 164.0d);
        elevationApNormalDistributionWeightExponent = bdyx.m91605a(a, "elevation_ap_normal_distribution_weight_exponent", -1.14d);
        elevationDeltaPhoneFromFloorM = bdyx.m91605a(a, "elevation_delta_phone_from_floor_m", 1.1d);
        elevationFromWifiEnabled = bdyx.m91610a(a, "elevation_from_wifi_enabled", true);
        elevationFromWifiMinRssiDbm = bdyx.m91607a(a, "elevation_from_wifi_min_rssi_dbm", -86L);
        elevationFromWifiOutlierThresholdM = bdyx.m91605a(a, "elevation_from_wifi_outlier_threshold_m", 55.0d);
        elevationLocalizerUseWeightedLikelihoods = bdyx.m91610a(a, "elevation_localizer_use_weighted_likelihoods", false);
        elevationMaxVerticalAccuracyMeters = bdyx.m91605a(a, "elevation_max_vertical_accuracy_meters", 200.0d);
        enableFrewleFloorEstimator = bdyx.m91610a(a, "enable_frewle_floor_estimator", false);
        enableGlocRequestReducedDownloadThreshold = bdyx.m91610a(a, "enable_gloc_request_reduced_download_threshold", true);
        enableRnnFrewleEngine = bdyx.m91610a(a, "enable_rnn_frewle_engine", false);
        fixFrewleSizeStats = bdyx.m91610a(a, "fix_frewle_size_stats", true);
        frewleBuildingIdsCacheMaxSize = bdyx.m91607a(a, "frewle_building_ids_cache_max_size", 200L);
        frewleDefaultMaxNumApEntriesForDownload = bdyx.m91607a(a, "frewle_default_max_num_ap_entries_for_download", 6L);
        frewleFloorModelsCacheMaxSize = bdyx.m91607a(a, "frewle_floor_models_cache_max_size", 1000L);
        frewleMacEntryLruCacheMaxSize = bdyx.m91607a(a, "frewle_mac_entry_lru_cache_max_size", 10000L);
        frewleSeenMacAddressLruCacheMaxSize = bdyx.m91607a(a, "frewle_seen_mac_address_lru_cache_max_size", 10000L);
        overwriteRttZAxisInfoWithFrewle = bdyx.m91610a(a, "overwrite_rtt_z_axis_info_with_frewle", true);
        proksConfig = bdyx.m91607a(a, "proks_config", 0L);
        throwIllegalArgExceptionOnUnsupportedEncoding = bdyx.m91610a(a, "throw_illegal_arg_exception_on_unsupported_encoding", true);
        useFrewleTileCacheManagerV2 = bdyx.m91610a(a, "use_frewle_tile_cache_manager_v2", false);
        usePartialGlsFix142179343 = bdyx.m91610a(a, "Frewle__use_partial_gls_fix_142179343", false);
    }

    public boolean compiled() {
        return true;
    }

    public double elevationApNormalDistributionSigmaExponent() {
        return ((Double) elevationApNormalDistributionSigmaExponent.mo58455c()).doubleValue();
    }

    public double elevationApNormalDistributionSigmaMultiplier() {
        return ((Double) elevationApNormalDistributionSigmaMultiplier.mo58455c()).doubleValue();
    }

    public double elevationApNormalDistributionWeightDivisor() {
        return ((Double) elevationApNormalDistributionWeightDivisor.mo58455c()).doubleValue();
    }

    public double elevationApNormalDistributionWeightExponent() {
        return ((Double) elevationApNormalDistributionWeightExponent.mo58455c()).doubleValue();
    }

    public double elevationDeltaPhoneFromFloorM() {
        return ((Double) elevationDeltaPhoneFromFloorM.mo58455c()).doubleValue();
    }

    public boolean elevationFromWifiEnabled() {
        return ((Boolean) elevationFromWifiEnabled.mo58455c()).booleanValue();
    }

    public long elevationFromWifiMinRssiDbm() {
        return ((Long) elevationFromWifiMinRssiDbm.mo58455c()).longValue();
    }

    public double elevationFromWifiOutlierThresholdM() {
        return ((Double) elevationFromWifiOutlierThresholdM.mo58455c()).doubleValue();
    }

    public boolean elevationLocalizerUseWeightedLikelihoods() {
        return ((Boolean) elevationLocalizerUseWeightedLikelihoods.mo58455c()).booleanValue();
    }

    public double elevationMaxVerticalAccuracyMeters() {
        return ((Double) elevationMaxVerticalAccuracyMeters.mo58455c()).doubleValue();
    }

    public boolean enableFrewleFloorEstimator() {
        return ((Boolean) enableFrewleFloorEstimator.mo58455c()).booleanValue();
    }

    public boolean enableGlocRequestReducedDownloadThreshold() {
        return ((Boolean) enableGlocRequestReducedDownloadThreshold.mo58455c()).booleanValue();
    }

    public boolean enableRnnFrewleEngine() {
        return ((Boolean) enableRnnFrewleEngine.mo58455c()).booleanValue();
    }

    public boolean fixFrewleSizeStats() {
        return ((Boolean) fixFrewleSizeStats.mo58455c()).booleanValue();
    }

    public long frewleBuildingIdsCacheMaxSize() {
        return ((Long) frewleBuildingIdsCacheMaxSize.mo58455c()).longValue();
    }

    public long frewleDefaultMaxNumApEntriesForDownload() {
        return ((Long) frewleDefaultMaxNumApEntriesForDownload.mo58455c()).longValue();
    }

    public long frewleFloorModelsCacheMaxSize() {
        return ((Long) frewleFloorModelsCacheMaxSize.mo58455c()).longValue();
    }

    public long frewleMacEntryLruCacheMaxSize() {
        return ((Long) frewleMacEntryLruCacheMaxSize.mo58455c()).longValue();
    }

    public long frewleSeenMacAddressLruCacheMaxSize() {
        return ((Long) frewleSeenMacAddressLruCacheMaxSize.mo58455c()).longValue();
    }

    public boolean overwriteRttZAxisInfoWithFrewle() {
        return ((Boolean) overwriteRttZAxisInfoWithFrewle.mo58455c()).booleanValue();
    }

    public long proksConfig() {
        return ((Long) proksConfig.mo58455c()).longValue();
    }

    public boolean throwIllegalArgExceptionOnUnsupportedEncoding() {
        return ((Boolean) throwIllegalArgExceptionOnUnsupportedEncoding.mo58455c()).booleanValue();
    }

    public boolean useFrewleTileCacheManagerV2() {
        return ((Boolean) useFrewleTileCacheManagerV2.mo58455c()).booleanValue();
    }

    public boolean usePartialGlsFix142179343() {
        return ((Boolean) usePartialGlsFix142179343.mo58455c()).booleanValue();
    }
}
