package p000;

/* renamed from: cexg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cexg implements cexf {
    public static final bdyx enableClearCutLogs;
    public static final bdyx geofencerEventsPerDeviceSamplingRate;
    public static final bdyx geofencerEventsSamplingRate;
    public static final bdyx geofencerMaximumEventsPerPeriod;
    public static final bdyx geofencerStatsCollectionPeriodMillis;
    public static final bdyx geofencerStatsSamplingRate;

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
        enableClearCutLogs = bdyx.m91610a(a, "GeofencerClearCutLogs__enable_clear_cut_logs", false);
        geofencerEventsPerDeviceSamplingRate = bdyx.m91605a(a, "GeofencerClearCutLogs__geofencer_events_per_device_sampling_rate", 0.01d);
        geofencerEventsSamplingRate = bdyx.m91605a(a, "GeofencerClearCutLogs__geofencer_events_sampling_rate", 0.001d);
        geofencerMaximumEventsPerPeriod = bdyx.m91607a(a, "GeofencerClearCutLogs__geofencer_maximum_events_per_period", 20L);
        geofencerStatsCollectionPeriodMillis = bdyx.m91607a(a, "GeofencerClearCutLogs__geofencer_stats_collection_period_millis", 86400000L);
        geofencerStatsSamplingRate = bdyx.m91605a(a, "GeofencerClearCutLogs__geofencer_stats_sampling_rate", 0.001d);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableClearCutLogs() {
        return ((Boolean) enableClearCutLogs.mo58455c()).booleanValue();
    }

    public double geofencerEventsPerDeviceSamplingRate() {
        return ((Double) geofencerEventsPerDeviceSamplingRate.mo58455c()).doubleValue();
    }

    public double geofencerEventsSamplingRate() {
        return ((Double) geofencerEventsSamplingRate.mo58455c()).doubleValue();
    }

    public long geofencerMaximumEventsPerPeriod() {
        return ((Long) geofencerMaximumEventsPerPeriod.mo58455c()).longValue();
    }

    public long geofencerStatsCollectionPeriodMillis() {
        return ((Long) geofencerStatsCollectionPeriodMillis.mo58455c()).longValue();
    }

    public double geofencerStatsSamplingRate() {
        return ((Double) geofencerStatsSamplingRate.mo58455c()).doubleValue();
    }
}
