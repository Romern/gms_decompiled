package p000;

/* renamed from: cfai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfai implements cfah {
    public static final bdyx flpLocationStalenessThresholdMillis;
    public static final bdyx flpMinimumScreenOnLocationRequestTimeDeltaMillis;
    public static final bdyx flpScreenOnLocationEnabled;

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
        flpLocationStalenessThresholdMillis = bdyx.m91607a(a, "flp_location_staleness_threshold_millis", 600000L);
        flpMinimumScreenOnLocationRequestTimeDeltaMillis = bdyx.m91607a(a, "flp_minimum_screen_on_location_request_time_delta_millis", 60000L);
        flpScreenOnLocationEnabled = bdyx.m91610a(a, "flp_screen_on_location_enabled", false);
    }

    public boolean compiled() {
        return true;
    }

    public long flpLocationStalenessThresholdMillis() {
        return ((Long) flpLocationStalenessThresholdMillis.mo58455c()).longValue();
    }

    public long flpMinimumScreenOnLocationRequestTimeDeltaMillis() {
        return ((Long) flpMinimumScreenOnLocationRequestTimeDeltaMillis.mo58455c()).longValue();
    }

    public boolean flpScreenOnLocationEnabled() {
        return ((Boolean) flpScreenOnLocationEnabled.mo58455c()).booleanValue();
    }
}
