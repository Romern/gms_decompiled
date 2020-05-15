package p000;

/* renamed from: cffi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cffi implements cffh {

    /* renamed from: a */
    public static final bdyx f183929a;

    /* renamed from: b */
    public static final bdyx f183930b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183929a = bdyx.m91610a(a, "enable_app_custom_settings", false);
        f183930b = bdyx.m91610a(a, "enable_app_settings", false);
    }

    /* renamed from: a */
    public final boolean mo81114a() {
        return ((Boolean) f183929a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81115b() {
        return ((Boolean) f183930b.mo58455c()).booleanValue();
    }
}
