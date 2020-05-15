package p000;

/* renamed from: ceyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyr implements ceyq {
    public static final bdyx addAggregateFlpStatsToDumpsys;
    public static final bdyx disableLoggingTtffInTheAggregateLog;
    public static final bdyx disablePositiveNumberCheckForS2CellId;
    public static final bdyx enableLoggingGnssStatus;
    public static final bdyx enableLoggingTtffInLatencyLogSample;
    public static final bdyx fixTimeSinceLocationEnabledForOldVersion;
    public static final bdyx gnssStatusStatsMaxSatelliteCount;
    public static final bdyx gnssStatusStatsSamplingRate;
    public static final bdyx locationLocationAvailabilitySamplingRate;
    public static final bdyx locationQualityBatteryUsageLogsSamplingRate;
    public static final bdyx locationQualityFlpSampleLogsSamplingRate;
    public static final bdyx locationQualityFlpStatsCollectionPeriodMs;
    public static final bdyx locationQualityFlpStatsSamplingRate;
    public static final bdyx locationQualityFlpTtffSampleLogsSamplingRate;
    public static final bdyx locationQualityJumpSpeedThreshold;
    public static final bdyx locationQualitySampleLogsMaxPerPeriod;
    public static final bdyx removeAvailabilityLogging;

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
        addAggregateFlpStatsToDumpsys = bdyx.m91610a(a, "add_aggregate_flp_stats_to_dumpsys", false);
        disableLoggingTtffInTheAggregateLog = bdyx.m91610a(a, "LocationLogs__disable_logging_ttff_in_the_aggregate_log", false);
        disablePositiveNumberCheckForS2CellId = bdyx.m91610a(a, "LocationLogs__disable_positive_number_check_for_s2_cell_id", false);
        enableLoggingGnssStatus = bdyx.m91610a(a, "LocationLogs__enable_logging_gnss_status", false);
        enableLoggingTtffInLatencyLogSample = bdyx.m91610a(a, "LocationLogs__enable_logging_ttff_in_latency_log_sample", true);
        fixTimeSinceLocationEnabledForOldVersion = bdyx.m91610a(a, "LocationLogs__fix_time_since_location_enabled_for_old_version", true);
        gnssStatusStatsMaxSatelliteCount = bdyx.m91607a(a, "LocationLogs__gnss_status_stats_max_satellite_count", 200L);
        gnssStatusStatsSamplingRate = bdyx.m91605a(a, "LocationLogs__gnss_status_stats_sampling_rate", 0.001d);
        locationLocationAvailabilitySamplingRate = bdyx.m91605a(a, "location_quality_availability_sampling_rate", 0.01d);
        locationQualityBatteryUsageLogsSamplingRate = bdyx.m91605a(a, "location_quality_battery_usage_logs_sampling_rate", 0.1d);
        locationQualityFlpSampleLogsSamplingRate = bdyx.m91605a(a, "location_quality_flp_sample_logs_sampling_rate", 0.001d);
        locationQualityFlpStatsCollectionPeriodMs = bdyx.m91607a(a, "location_quality_flp_stats_collection_period_ms", 86400000L);
        locationQualityFlpStatsSamplingRate = bdyx.m91605a(a, "location_quality_flp_stats_sampling_rate", 0.1d);
        locationQualityFlpTtffSampleLogsSamplingRate = bdyx.m91605a(a, "location_quality_flp_ttff_sample_logs_sampling_rate", 1.0d);
        locationQualityJumpSpeedThreshold = bdyx.m91607a(a, "location_quality_flp_jump_speed_threshold", 40L);
        locationQualitySampleLogsMaxPerPeriod = bdyx.m91607a(a, "location_quality_flp_sample_logs_max_per_period", 15L);
        removeAvailabilityLogging = bdyx.m91610a(a, "LocationLogs__remove_availability_logging", true);
    }

    public boolean addAggregateFlpStatsToDumpsys() {
        return ((Boolean) addAggregateFlpStatsToDumpsys.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean disableLoggingTtffInTheAggregateLog() {
        return ((Boolean) disableLoggingTtffInTheAggregateLog.mo58455c()).booleanValue();
    }

    public boolean disablePositiveNumberCheckForS2CellId() {
        return ((Boolean) disablePositiveNumberCheckForS2CellId.mo58455c()).booleanValue();
    }

    public boolean enableLoggingGnssStatus() {
        return ((Boolean) enableLoggingGnssStatus.mo58455c()).booleanValue();
    }

    public boolean enableLoggingTtffInLatencyLogSample() {
        return ((Boolean) enableLoggingTtffInLatencyLogSample.mo58455c()).booleanValue();
    }

    public boolean fixTimeSinceLocationEnabledForOldVersion() {
        return ((Boolean) fixTimeSinceLocationEnabledForOldVersion.mo58455c()).booleanValue();
    }

    public long gnssStatusStatsMaxSatelliteCount() {
        return ((Long) gnssStatusStatsMaxSatelliteCount.mo58455c()).longValue();
    }

    public double gnssStatusStatsSamplingRate() {
        return ((Double) gnssStatusStatsSamplingRate.mo58455c()).doubleValue();
    }

    public double locationLocationAvailabilitySamplingRate() {
        return ((Double) locationLocationAvailabilitySamplingRate.mo58455c()).doubleValue();
    }

    public double locationQualityBatteryUsageLogsSamplingRate() {
        return ((Double) locationQualityBatteryUsageLogsSamplingRate.mo58455c()).doubleValue();
    }

    public double locationQualityFlpSampleLogsSamplingRate() {
        return ((Double) locationQualityFlpSampleLogsSamplingRate.mo58455c()).doubleValue();
    }

    public long locationQualityFlpStatsCollectionPeriodMs() {
        return ((Long) locationQualityFlpStatsCollectionPeriodMs.mo58455c()).longValue();
    }

    public double locationQualityFlpStatsSamplingRate() {
        return ((Double) locationQualityFlpStatsSamplingRate.mo58455c()).doubleValue();
    }

    public double locationQualityFlpTtffSampleLogsSamplingRate() {
        return ((Double) locationQualityFlpTtffSampleLogsSamplingRate.mo58455c()).doubleValue();
    }

    public long locationQualityJumpSpeedThreshold() {
        return ((Long) locationQualityJumpSpeedThreshold.mo58455c()).longValue();
    }

    public long locationQualitySampleLogsMaxPerPeriod() {
        return ((Long) locationQualitySampleLogsMaxPerPeriod.mo58455c()).longValue();
    }

    public boolean removeAvailabilityLogging() {
        return ((Boolean) removeAvailabilityLogging.mo58455c()).booleanValue();
    }
}
