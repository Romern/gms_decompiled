package p000;

/* renamed from: cgqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgqk implements cgqj {

    /* renamed from: a */
    public static final bdyx f187510a;

    /* renamed from: b */
    public static final bdyx f187511b;

    /* renamed from: c */
    public static final bdyx f187512c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187510a = bdyx.m91610a(bdyw, "is_magic_wand_enabled", false);
        f187511b = bdyx.m91609a(bdyw, "magic_wand_host", "cryptauthpublicchallenge-pa.googleapis.com");
        f187512c = bdyx.m91610a(bdyw, "use_risk_signals_v2", false);
    }

    /* renamed from: a */
    public final boolean mo84277a() {
        return ((Boolean) f187510a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo84278b() {
        return (String) f187511b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo84279c() {
        return ((Boolean) f187512c.mo58455c()).booleanValue();
    }
}
