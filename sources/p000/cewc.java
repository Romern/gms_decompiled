package p000;

/* renamed from: cewc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cewc implements cewb {
    public static final bdyx enabled;
    public static final bdyx maxNetworkLocationAccuracy;
    public static final bdyx timeoutMs;

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
        enabled = bdyx.m91610a(a, "FlpLocationDeliveryThrottle__enabled", false);
        maxNetworkLocationAccuracy = bdyx.m91607a(a, "FlpLocationDeliveryThrottle__max_network_location_accuracy", 100L);
        timeoutMs = bdyx.m91607a(a, "FlpLocationDeliveryThrottle__timeout_ms", 15000L);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enabled() {
        return ((Boolean) enabled.mo58455c()).booleanValue();
    }

    public long maxNetworkLocationAccuracy() {
        return ((Long) maxNetworkLocationAccuracy.mo58455c()).longValue();
    }

    public long timeoutMs() {
        return ((Long) timeoutMs.mo58455c()).longValue();
    }
}
