package p000;

/* renamed from: cfgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfgo implements cfgn {

    /* renamed from: a */
    public static final bdyx f183984a;

    /* renamed from: b */
    public static final bdyx f183985b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183984a = bdyx.m91607a(a, "periodic_register_interval", 1296000L);
        f183985b = bdyx.m91607a(a, "matchstick_periodic_token_refresh_interval_jitter", 28800L);
    }

    /* renamed from: a */
    public final long mo81140a() {
        return ((Long) f183984a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo81141b() {
        return ((Long) f183985b.mo58455c()).longValue();
    }
}
