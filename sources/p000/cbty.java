package p000;

/* renamed from: cbty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbty implements cbtx {

    /* renamed from: a */
    public static final bdyx f178284a;

    /* renamed from: b */
    public static final bdyx f178285b;

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
        f178284a = bdyx.m91610a(bdyw, "gads:ad_key_enabled", false);
        f178285b = bdyx.m91610a(bdyw, "gads:adshield:enable_adshield_instrumentation", false);
    }

    /* renamed from: a */
    public final boolean mo75376a() {
        return ((Boolean) f178284a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75377b() {
        return ((Boolean) f178285b.mo58455c()).booleanValue();
    }
}
