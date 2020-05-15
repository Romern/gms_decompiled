package p000;

/* renamed from: cfgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfgx implements cfgw {

    /* renamed from: a */
    public static final bdyx f184060a;

    /* renamed from: b */
    public static final bdyx f184061b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.mdisync")).mo58443a();
        f184060a = bdyx.m91610a(a, "CommonFeature__enable_dasu_logging_with_google_time_zone", false);
        f184061b = bdyx.m91610a(a, "CommonFeature__enable_dasu_logging_with_stable_scenario", false);
    }

    /* renamed from: a */
    public final boolean mo81213a() {
        return ((Boolean) f184060a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81214b() {
        return ((Boolean) f184061b.mo58455c()).booleanValue();
    }
}
