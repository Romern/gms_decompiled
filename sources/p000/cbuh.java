package p000;

/* renamed from: cbuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbuh implements cbug {

    /* renamed from: a */
    public static final bdyx f178294a;

    /* renamed from: b */
    public static final bdyx f178295b;

    /* renamed from: c */
    public static final bdyx f178296c;

    /* renamed from: d */
    public static final bdyx f178297d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178294a = bdyx.m91610a(bdyw, "gads:adapter_initialization:red_button", false);
        f178295b = bdyx.m91610a(bdyw, "gads:ad_serving:enabled", true);
        f178296c = bdyx.m91610a(bdyw, "gads:adaptive_banner:fail_invalid_ad_size", true);
        f178297d = bdyx.m91610a(bdyw, "gads:sdk_use_dynamic_module", true);
    }

    /* renamed from: a */
    public final boolean mo75383a() {
        return ((Boolean) f178294a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75384b() {
        return ((Boolean) f178295b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75385c() {
        return ((Boolean) f178296c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75386d() {
        return ((Boolean) f178297d.mo58455c()).booleanValue();
    }
}
