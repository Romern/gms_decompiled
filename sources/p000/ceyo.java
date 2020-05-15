package p000;

/* renamed from: ceyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyo implements ceyn {
    public static final bdyx disableFastestIntervalFactorWhenFastestIntervalExplicitlySet;
    public static final bdyx locationRequestFastestIntervalFactor;
    public static final bdyx noPowerMinFastestIntervalMillis;

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
        disableFastestIntervalFactorWhenFastestIntervalExplicitlySet = bdyx.m91610a(a, "disable_fastest_interval_factor_when_fastest_interval_explicitly_set", false);
        locationRequestFastestIntervalFactor = bdyx.m91605a(a, "location_request_fastest_interval_factor", 0.0d);
        noPowerMinFastestIntervalMillis = bdyx.m91607a(a, "no_power_min_fastest_interval_millis", 0L);
    }

    public boolean compiled() {
        return true;
    }

    public boolean disableFastestIntervalFactorWhenFastestIntervalExplicitlySet() {
        return ((Boolean) disableFastestIntervalFactorWhenFastestIntervalExplicitlySet.mo58455c()).booleanValue();
    }

    public double locationRequestFastestIntervalFactor() {
        return ((Double) locationRequestFastestIntervalFactor.mo58455c()).doubleValue();
    }

    public long noPowerMinFastestIntervalMillis() {
        return ((Long) noPowerMinFastestIntervalMillis.mo58455c()).longValue();
    }
}
