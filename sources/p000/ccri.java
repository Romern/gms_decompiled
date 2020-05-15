package p000;

/* renamed from: ccri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccri implements ccrh {

    /* renamed from: a */
    public static final bdyx f179797a;

    /* renamed from: b */
    public static final bdyx f179798b;

    /* renamed from: c */
    public static final bdyx f179799c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179797a = bdyx.m91610a(bdyw, "morris_support_enabled", false);
        f179798b = bdyx.m91610a(bdyw, "none_behavior_enabled", false);
        f179799c = bdyx.m91610a(bdyw, "show_gearhead_in_frx", false);
    }

    /* renamed from: a */
    public final boolean mo76676a() {
        return ((Boolean) f179797a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76677b() {
        return ((Boolean) f179798b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76678c() {
        return ((Boolean) f179799c.mo58455c()).booleanValue();
    }
}
