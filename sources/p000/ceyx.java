package p000;

/* renamed from: ceyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyx implements ceyw {
    public static final bdyx backoffGrowthFactor;
    public static final bdyx enabled;
    public static final bdyx logSamplingRate;
    public static final bdyx lowdExpId;
    public static final bdyx maxBackoffMs;
    public static final bdyx minBackoffMs;
    public static final bdyx minBatteryLevelPct;

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
        backoffGrowthFactor = bdyx.m91607a(a, "lowd_backoff_growth_factor", 2L);
        enabled = bdyx.m91610a(a, "enable_location_off_warning_dialog", true);
        logSamplingRate = bdyx.m91605a(a, "lowd_clearcut_sampling_rate", 0.1d);
        lowdExpId = bdyx.m91609a(a, "lowd_exp_id", "");
        maxBackoffMs = bdyx.m91607a(a, "lowd_max_backoff_millis", 2592000000L);
        minBackoffMs = bdyx.m91607a(a, "lowd_min_backoff_millis", 86400000L);
        minBatteryLevelPct = bdyx.m91605a(a, "lowd_min_battery_level_pct", 0.3d);
    }

    public long backoffGrowthFactor() {
        return ((Long) backoffGrowthFactor.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enabled() {
        return ((Boolean) enabled.mo58455c()).booleanValue();
    }

    public double logSamplingRate() {
        return ((Double) logSamplingRate.mo58455c()).doubleValue();
    }

    public String lowdExpId() {
        return (String) lowdExpId.mo58455c();
    }

    public long maxBackoffMs() {
        return ((Long) maxBackoffMs.mo58455c()).longValue();
    }

    public long minBackoffMs() {
        return ((Long) minBackoffMs.mo58455c()).longValue();
    }

    public double minBatteryLevelPct() {
        return ((Double) minBatteryLevelPct.mo58455c()).doubleValue();
    }
}
