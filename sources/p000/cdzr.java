package p000;

/* renamed from: cdzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdzr implements cdzq {

    /* renamed from: a */
    public static final bdyx f182098a;

    /* renamed from: b */
    public static final bdyx f182099b;

    /* renamed from: c */
    public static final bdyx f182100c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f182098a = bdyx.m91610a(a, "Privacy__always_use_heart_rate_scope_for_heart_rate", false);
        f182099b = bdyx.m91610a(a, "Privacy__clean_up_location_data_on_session_deletion", false);
        f182100c = bdyx.m91609a(a, "Privacy__heart_rate_scope_min_client_sdk", "100.0.0");
    }

    /* renamed from: a */
    public final boolean mo78623a() {
        return ((Boolean) f182098a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78624b() {
        return ((Boolean) f182099b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo78625c() {
        return (String) f182100c.mo58455c();
    }
}
