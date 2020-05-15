package p000;

/* renamed from: cfay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfay {
    public static final bdyx batchingEnabled;
    public static final bdyx flpHalEnabled;

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
        batchingEnabled = bdyx.m91610a(a, "wearable_batching_enabled", false);
        flpHalEnabled = bdyx.m91607a(a, "wearable_flp_hal", 1L);
    }

    public boolean batchingEnabled() {
        return ((Boolean) batchingEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long flpHalEnabled() {
        return ((Long) flpHalEnabled.mo58455c()).longValue();
    }
}
