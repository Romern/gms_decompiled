package p000;

/* renamed from: chmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chmz implements chmy {

    /* renamed from: a */
    public static final bdyx f188798a;

    /* renamed from: b */
    public static final bdyx f188799b;

    /* renamed from: c */
    public static final bdyx f188800c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.wearable")).mo58445a("gms:wearable:service:");
        f188798a = bdyx.m91610a(a, "disable_gcm_over_proxy", false);
        f188799b = bdyx.m91610a(a, "enable_gcm_controller", true);
        f188800c = bdyx.m91610a(a, "enable_gcm_on_charger", true);
    }

    /* renamed from: a */
    public final boolean mo85363a() {
        return ((Boolean) f188798a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85364b() {
        return ((Boolean) f188799b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85365c() {
        return ((Boolean) f188800c.mo58455c()).booleanValue();
    }
}
