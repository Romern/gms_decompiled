package p000;

/* renamed from: aseh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aseh {

    /* renamed from: a */
    public static final bdyx f88762a = bdyx.m91609a(f88770i, "server_hostname", "digitalassetlinks.googleapis.com");

    /* renamed from: b */
    public static final bdyx f88763b = bdyx.m91606a(f88770i, "server_port", 443);

    /* renamed from: c */
    public static final bdyx f88764c = bdyx.m91606a(f88770i, "maximum_lookups_per_verification", 500);

    /* renamed from: d */
    public static final bdyx f88765d = bdyx.m91606a(f88770i, "thread_pool_keep_alive_ms", 20000);

    /* renamed from: e */
    public static final bdyx f88766e = bdyx.m91606a(f88770i, "total_timeout_ms", 180000);

    /* renamed from: f */
    public static final bdyx f88767f = bdyx.m91606a(f88770i, "individual_timeout_ms", 8000);

    /* renamed from: g */
    public static final bdyx f88768g = bdyx.m91606a(f88770i, "backoff_after_failure_ms", 4000);

    /* renamed from: h */
    public static final bdyx f88769h = bdyx.m91606a(f88770i, "retries", 3);

    /* renamed from: i */
    private static final bdyw f88770i;

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
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.statementservice")).mo58445a("gms.statementservice.");
        f88770i = a;
        bdyx.m91610a(a, "conscrypt_enabled", false);
    }
}
