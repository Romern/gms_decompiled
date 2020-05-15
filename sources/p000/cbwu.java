package p000;

/* renamed from: cbwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbwu implements cbwt {

    /* renamed from: a */
    public static final bdyx f178486a;

    /* renamed from: b */
    public static final bdyx f178487b;

    /* renamed from: c */
    public static final bdyx f178488c;

    /* renamed from: d */
    public static final bdyx f178489d;

    /* renamed from: e */
    public static final bdyx f178490e;

    /* renamed from: f */
    public static final bdyx f178491f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.audit")).mo58443a();
        f178486a = bdyx.m91610a(a, "ConfigFeature__log_audit_records_events", true);
        f178487b = bdyx.m91610a(a, "Log__log_cache_event_database_corrupted", true);
        f178488c = bdyx.m91610a(a, "Log__log_cache_event_delete_corrupt_entry", true);
        f178489d = bdyx.m91610a(a, "ConfigFeature__log_cache_events", true);
        f178490e = bdyx.m91610a(a, "ConfigFeature__log_cache_stats", true);
        f178491f = bdyx.m91610a(a, "ConfigFeature__log_upload_events", true);
    }

    /* renamed from: a */
    public final boolean mo75553a() {
        return ((Boolean) f178486a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75554b() {
        return ((Boolean) f178487b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75555c() {
        return ((Boolean) f178488c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75556d() {
        return ((Boolean) f178489d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75557e() {
        return ((Boolean) f178490e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75558f() {
        return ((Boolean) f178491f.mo58455c()).booleanValue();
    }
}
