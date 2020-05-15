package p000;

/* renamed from: cgse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgse implements cgsd {

    /* renamed from: a */
    public static final bdyx f187631a;

    /* renamed from: b */
    public static final bdyx f187632b;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187631a = bdyx.m91607a(a, "connectionless_timeout_seconds", 15L);
        bdyx.m91610a(a, "disable_create_gac", false);
        f187632b = bdyx.m91610a(a, "drop_logs_on_api_failure", false);
        bdyx.m91610a(a, "use_connectionless", true);
    }

    /* renamed from: a */
    public final long mo84382a() {
        return ((Long) f187631a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84383b() {
        return ((Boolean) f187632b.mo58455c()).booleanValue();
    }
}
