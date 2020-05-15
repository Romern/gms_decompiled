package p000;

/* renamed from: cbun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbun implements cbum {

    /* renamed from: a */
    public static final bdyx f178303a;

    /* renamed from: b */
    public static final bdyx f178304b;

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
        f178303a = bdyx.m91610a(bdyw, "gads:rewarded_sku:enabled", true);
        f178304b = bdyx.m91610a(bdyw, "gads:rewarded_sku:override_test:enabled", false);
    }

    /* renamed from: a */
    public final boolean mo75390a() {
        return ((Boolean) f178303a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75391b() {
        return ((Boolean) f178304b.mo58455c()).booleanValue();
    }
}
