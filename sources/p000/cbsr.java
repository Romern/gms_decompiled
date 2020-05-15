package p000;

/* renamed from: cbsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbsr implements cbsq {

    /* renamed from: a */
    public static final bdyx f178227a;

    /* renamed from: b */
    public static final bdyx f178228b;

    /* renamed from: c */
    public static final bdyx f178229c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
        f178227a = bdyx.m91605a(bdyw, "gads:csi_reporting_ratio", 0.05d);
        f178228b = bdyx.m91609a(bdyw, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        f178229c = bdyx.m91610a(bdyw, "gads:enabled_sdk_csi", false);
    }

    /* renamed from: a */
    public final double mo75330a() {
        return ((Double) f178227a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final String mo75331b() {
        return (String) f178228b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo75332c() {
        return ((Boolean) f178229c.mo58455c()).booleanValue();
    }
}
