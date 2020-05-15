package p000;

/* renamed from: cfrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrz implements cfry {

    /* renamed from: a */
    public static final bdyx f185537a;

    /* renamed from: b */
    public static final bdyx f185538b;

    /* renamed from: c */
    public static final bdyx f185539c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.update"));
        f185537a = bdyx.m91609a(bdyw, "config_delivery_service_host", "");
        f185538b = bdyx.m91607a(bdyw, "config_delivery_service_port", -1L);
        f185539c = bdyx.m91610a(bdyw, "grpc_config_enabled", false);
    }

    /* renamed from: a */
    public final String mo82587a() {
        return (String) f185537a.mo58455c();
    }

    /* renamed from: b */
    public final long mo82588b() {
        return ((Long) f185538b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo82589c() {
        return ((Boolean) f185539c.mo58455c()).booleanValue();
    }
}
