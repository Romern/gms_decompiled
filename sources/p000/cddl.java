package p000;

/* renamed from: cddl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cddl implements cddk {

    /* renamed from: a */
    public static final bdyx f180529a;

    /* renamed from: b */
    public static final bdyx f180530b;

    /* renamed from: c */
    public static final bdyx f180531c;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:apitimeout:");
        f180529a = bdyx.m91607a(a, "ApiTimeOut__boot_count_api_timeout_ms", 250L);
        f180530b = bdyx.m91607a(a, "ApiTimeOut__phenotype_api_timeout_ms", 250L);
        f180531c = bdyx.m91607a(a, "ApiTimeOut__pseudonymous_id_api_timeout_ms", 250L);
    }

    /* renamed from: a */
    public final long mo77287a() {
        return ((Long) f180529a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77288b() {
        return ((Long) f180530b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo77289c() {
        return ((Long) f180531c.mo58455c()).longValue();
    }
}
