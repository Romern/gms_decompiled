package p000;

/* renamed from: ceyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ceyq {
    boolean addAggregateFlpStatsToDumpsys();

    boolean disableLoggingTtffInTheAggregateLog();

    boolean disablePositiveNumberCheckForS2CellId();

    boolean enableLoggingGnssStatus();

    boolean enableLoggingTtffInLatencyLogSample();

    boolean fixTimeSinceLocationEnabledForOldVersion();

    long gnssStatusStatsMaxSatelliteCount();

    double gnssStatusStatsSamplingRate();

    double locationLocationAvailabilitySamplingRate();

    double locationQualityBatteryUsageLogsSamplingRate();

    double locationQualityFlpSampleLogsSamplingRate();

    long locationQualityFlpStatsCollectionPeriodMs();

    double locationQualityFlpStatsSamplingRate();

    double locationQualityFlpTtffSampleLogsSamplingRate();

    long locationQualityJumpSpeedThreshold();

    long locationQualitySampleLogsMaxPerPeriod();

    boolean removeAvailabilityLogging();
}
