package p000;

/* renamed from: cdfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfv implements cdfu {

    /* renamed from: a */
    public static final bdyx f180705a;

    /* renamed from: b */
    public static final bdyx f180706b;

    /* renamed from: c */
    public static final bdyx f180707c;

    /* renamed from: d */
    public static final bdyx f180708d;

    /* renamed from: e */
    public static final bdyx f180709e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180705a = bdyx.m91610a(a, "TelephonySettings__include_imei", false);
        f180706b = bdyx.m91610a(a, "TelephonySettings__include_partial_sim_info", false);
        f180707c = bdyx.m91610a(a, "TelephonySettings__include_service_state", true);
        f180708d = bdyx.m91610a(a, "TelephonySettings__include_whether_sim_embedded", false);
        f180709e = bdyx.m91610a(a, "TelephonySettings__is_single_sim_behavior_enforced", false);
    }

    /* renamed from: a */
    public final boolean mo77440a() {
        return ((Boolean) f180705a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77441b() {
        return ((Boolean) f180706b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77442c() {
        return ((Boolean) f180707c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77443d() {
        return ((Boolean) f180708d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77444e() {
        return ((Boolean) f180709e.mo58455c()).booleanValue();
    }
}
