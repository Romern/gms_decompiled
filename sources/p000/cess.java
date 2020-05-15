package p000;

/* renamed from: cess */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cess implements cesr {
    public static final bdyx minBatchIntervalMs;
    public static final bdyx minIntervalMs;
    public static final bdyx minPriority;

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
        minBatchIntervalMs = bdyx.m91607a(a, "flp_low_power_mode_min_batch_interval_ms", 300000L);
        minIntervalMs = bdyx.m91607a(a, "flp_low_power_mode_min_interval_ms", 300000L);
        minPriority = bdyx.m91607a(a, "flp_low_power_mode_min_priority", 102L);
    }

    public boolean compiled() {
        return true;
    }

    public long minBatchIntervalMs() {
        return ((Long) minBatchIntervalMs.mo58455c()).longValue();
    }

    public long minIntervalMs() {
        return ((Long) minIntervalMs.mo58455c()).longValue();
    }

    public long minPriority() {
        return ((Long) minPriority.mo58455c()).longValue();
    }
}
