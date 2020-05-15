package p000;

/* renamed from: cfff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfff implements cffe {

    /* renamed from: a */
    public static final bdyx f183924a;

    /* renamed from: b */
    public static final bdyx f183925b;

    /* renamed from: c */
    public static final bdyx f183926c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183924a = bdyx.m91609a(a, "client_status_host", "tachyon-playground-autopush-grpc.sandbox.googleapis.com");
        f183925b = bdyx.m91610a(a, "enable_client_status_server", false);
        f183926c = bdyx.m91610a(a, "enable_status_report_rpc_scheduling", false);
    }

    /* renamed from: a */
    public final String mo81110a() {
        return (String) f183924a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo81111b() {
        return ((Boolean) f183925b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81112c() {
        return ((Boolean) f183926c.mo58455c()).booleanValue();
    }
}
