package p000;

/* renamed from: cgvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgvb implements cgva {

    /* renamed from: a */
    public static final bdyx f187796a;

    /* renamed from: b */
    public static final bdyx f187797b;

    /* renamed from: c */
    public static final bdyx f187798c;

    /* renamed from: d */
    public static final bdyx f187799d;

    /* renamed from: e */
    public static final bdyx f187800e;

    /* renamed from: f */
    public static final bdyx f187801f;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        bdyx.m91607a(a, "client_connect_timeout_millis", 5000L);
        f187796a = bdyx.m91610a(a, "collect_empty_content", true);
        f187797b = bdyx.m91610a(a, "collect_ulr", true);
        f187798c = bdyx.m91607a(a, "default_qos", 0L);
        f187799d = bdyx.m91610a(a, "lockbox_logging", true);
        f187800e = bdyx.m91607a(a, "max_collection_exception_length", 20480L);
        bdyx.m91607a(a, "phenotype_register_timeout_millis", 5000L);
        f187801f = bdyx.m91610a(a, "upload_collection_exception_to_clearcut", false);
    }

    /* renamed from: a */
    public final boolean mo84522a() {
        return ((Boolean) f187796a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84523b() {
        return ((Boolean) f187797b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo84524c() {
        return ((Long) f187798c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo84525d() {
        return ((Boolean) f187799d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo84526e() {
        return ((Long) f187800e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo84527f() {
        return ((Boolean) f187801f.mo58455c()).booleanValue();
    }
}
