package p000;

/* renamed from: cgyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgyv implements cgyu {

    /* renamed from: a */
    public static final bdyx f188091a;

    /* renamed from: b */
    public static final bdyx f188092b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tron.metrics"));
        f188091a = bdyx.m91607a(bdyw, "connectionless_timeout_seconds", 15L);
        bdyx.m91610a(bdyw, "disable_create_gac", false);
        f188092b = bdyx.m91610a(bdyw, "drop_api_failures", true);
        bdyx.m91610a(bdyw, "use_connectionless", false);
    }

    /* renamed from: a */
    public final long mo84783a() {
        return ((Long) f188091a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84784b() {
        return ((Boolean) f188092b.mo58455c()).booleanValue();
    }
}
