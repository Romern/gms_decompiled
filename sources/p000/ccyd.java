package p000;

/* renamed from: ccyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccyd implements ccyc {

    /* renamed from: a */
    public static final bdyx f180251a;

    /* renamed from: b */
    public static final bdyx f180252b;

    /* renamed from: c */
    public static final bdyx f180253c;

    /* renamed from: d */
    public static final bdyx f180254d;

    /* renamed from: e */
    public static final bdyx f180255e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180251a = bdyx.m91609a(a, "CastSdkService__cast_sdk_service_grpc_host", "homecloudcastsdk-pa.googleapis.com");
        f180252b = bdyx.m91607a(a, "CastSdkService__cast_sdk_service_grpc_port", 443L);
        f180253c = bdyx.m91609a(a, "CastSdkService__cast_sdk_service_grpc_scope", "https://www.googleapis.com/auth/castsdk");
        f180254d = bdyx.m91607a(a, "CastSdkService__cast_sdk_service_grpc_timeout_ms", 10000L);
        f180255e = bdyx.m91607a(a, "CastSdkService__grpc_thread_pool_size", 2L);
    }

    /* renamed from: a */
    public final String mo77058a() {
        return (String) f180251a.mo58455c();
    }

    /* renamed from: b */
    public final long mo77059b() {
        return ((Long) f180252b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo77060c() {
        return (String) f180253c.mo58455c();
    }

    /* renamed from: d */
    public final long mo77061d() {
        return ((Long) f180254d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo77062e() {
        return ((Long) f180255e.mo58455c()).longValue();
    }
}
