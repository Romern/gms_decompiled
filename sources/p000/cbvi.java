package p000;

/* renamed from: cbvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbvi implements cbvh {

    /* renamed from: a */
    public static final bdyx f178336a;

    /* renamed from: b */
    public static final bdyx f178337b;

    /* renamed from: c */
    public static final bdyx f178338c;

    /* renamed from: d */
    public static final bdyx f178339d;

    /* renamed from: e */
    public static final bdyx f178340e;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178336a = bdyx.m91609a(bdyw, "gads:expose_token:whitelist:list", ":com.google.ads.testing.signalsdk:");
        f178337b = bdyx.m91610a(bdyw, "gads:expose_token:whitelist:enabled", true);
        f178338c = bdyx.m91610a(bdyw, "gads:expose_token:red_button", true);
        f178339d = bdyx.m91609a(bdyw, "gads:expose_token:override_public_key", "https://pubads.g.doubleclick.net/adsid/integrator.json");
        f178340e = bdyx.m91607a(bdyw, "gads:expose_token:timeout_ms", 10000L);
    }

    /* renamed from: a */
    public final boolean mo75416a() {
        return true;
    }

    /* renamed from: b */
    public final String mo75417b() {
        return (String) f178336a.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo75418c() {
        return ((Boolean) f178337b.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75419d() {
        return ((Boolean) f178338c.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo75420e() {
        return (String) f178339d.mo58455c();
    }

    /* renamed from: f */
    public final long mo75421f() {
        return ((Long) f178340e.mo58455c()).longValue();
    }
}
