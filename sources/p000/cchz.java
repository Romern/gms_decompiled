package p000;

/* renamed from: cchz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchz implements cchy {

    /* renamed from: a */
    public static final bdyx f179024a;

    /* renamed from: b */
    public static final bdyx f179025b;

    /* renamed from: c */
    public static final bdyx f179026c;

    /* renamed from: d */
    public static final bdyx f179027d;

    /* renamed from: e */
    public static final bdyx f179028e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f179024a = bdyx.m91607a(a, "Gcm__create_subscription_max_retries", 2L);
        f179025b = bdyx.m91607a(a, "Gcm__gcm_upstream_ttl_seconds", 30L);
        f179026c = bdyx.m91607a(a, "Gcm__heartbeat_period_seconds", 30L);
        f179027d = bdyx.m91609a(a, "Gcm__module_gcm_sender_id", "340207974841");
        f179028e = bdyx.m91609a(a, "Gcm__per_user_topics_base_url", "https://firebaseperusertopics-pa.googleapis.com/v1/perusertopics/");
    }

    /* renamed from: a */
    public final long mo75990a() {
        return ((Long) f179024a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75991b() {
        return ((Long) f179025b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75992c() {
        return ((Long) f179026c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo75993d() {
        return (String) f179027d.mo58455c();
    }

    /* renamed from: e */
    public final String mo75994e() {
        return (String) f179028e.mo58455c();
    }
}
