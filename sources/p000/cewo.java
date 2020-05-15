package p000;

/* renamed from: cewo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cewo implements cewn {
    public static final bdyx geocoderCacheCellLevel;
    public static final bdyx geocoderCacheMaxEntries;
    public static final bdyx geocoderCacheMaxTtlSecs;
    public static final bdyx geocoderCacheMinManagementTtlSecs;
    public static final bdyx geocoderLogCacheStats;
    public static final bdyx geocoderLogCacheStatsIntervalSecs;
    public static final bdyx geocoderLogErrorStats;
    public static final bdyx geocoderLogErrorStatsIntervalSecs;
    public static final bdyx geocoderRpcTimeout;
    public static final bdyx geocoderServerName;
    public static final bdyx geocoderTraceRequests;

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
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        geocoderCacheCellLevel = bdyx.m91607a(a, "geocoder_cache_cell_level", 21L);
        geocoderCacheMaxEntries = bdyx.m91607a(a, "geocoder_cache_max_entries", 100L);
        geocoderCacheMaxTtlSecs = bdyx.m91607a(a, "geocoder_cache_max_ttl_secs", 259200L);
        geocoderCacheMinManagementTtlSecs = bdyx.m91607a(a, "geocoder_cache_min_mgmt_secs", 43200L);
        geocoderLogCacheStats = bdyx.m91610a(a, "geocoder_log_cache_stats", true);
        geocoderLogCacheStatsIntervalSecs = bdyx.m91607a(a, "geocoder_log_cache_stats_secs", 86400L);
        geocoderLogErrorStats = bdyx.m91610a(a, "geocoder_log_error_stats", true);
        geocoderLogErrorStatsIntervalSecs = bdyx.m91607a(a, "geocoder_log_error_stats_secs", 86400L);
        geocoderRpcTimeout = bdyx.m91607a(a, "geocoder_rpc_timeout_ms", 5000L);
        geocoderServerName = bdyx.m91609a(a, "geocoder_server_name", "geomobileservices-pa.googleapis.com");
        geocoderTraceRequests = bdyx.m91610a(a, "geofencer_trace_requests", false);
    }

    public boolean compiled() {
        return true;
    }

    public long geocoderCacheCellLevel() {
        return ((Long) geocoderCacheCellLevel.mo58455c()).longValue();
    }

    public long geocoderCacheMaxEntries() {
        return ((Long) geocoderCacheMaxEntries.mo58455c()).longValue();
    }

    public long geocoderCacheMaxTtlSecs() {
        return ((Long) geocoderCacheMaxTtlSecs.mo58455c()).longValue();
    }

    public long geocoderCacheMinManagementTtlSecs() {
        return ((Long) geocoderCacheMinManagementTtlSecs.mo58455c()).longValue();
    }

    public boolean geocoderLogCacheStats() {
        return ((Boolean) geocoderLogCacheStats.mo58455c()).booleanValue();
    }

    public long geocoderLogCacheStatsIntervalSecs() {
        return ((Long) geocoderLogCacheStatsIntervalSecs.mo58455c()).longValue();
    }

    public boolean geocoderLogErrorStats() {
        return ((Boolean) geocoderLogErrorStats.mo58455c()).booleanValue();
    }

    public long geocoderLogErrorStatsIntervalSecs() {
        return ((Long) geocoderLogErrorStatsIntervalSecs.mo58455c()).longValue();
    }

    public long geocoderRpcTimeout() {
        return ((Long) geocoderRpcTimeout.mo58455c()).longValue();
    }

    public String geocoderServerName() {
        return (String) geocoderServerName.mo58455c();
    }

    public boolean geocoderTraceRequests() {
        return ((Boolean) geocoderTraceRequests.mo58455c()).booleanValue();
    }
}
