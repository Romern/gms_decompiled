package p000;

/* renamed from: cdbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdbj implements cdbi {

    /* renamed from: a */
    public static final bdyx f180422a;

    /* renamed from: b */
    public static final bdyx f180423b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180422a = bdyx.m91610a(a, "RelayCasting__enabled", false);
        f180423b = bdyx.m91607a(a, "RelayCasting__relay_access_token_refresh_interval_ms", 259200000L);
    }

    /* renamed from: a */
    public final boolean mo77198a() {
        return ((Boolean) f180422a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo77199b() {
        return ((Long) f180423b.mo58455c()).longValue();
    }
}
