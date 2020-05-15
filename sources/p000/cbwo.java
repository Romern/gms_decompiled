package p000;

/* renamed from: cbwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbwo implements cbwn {

    /* renamed from: a */
    public static final bdyx f178477a;

    /* renamed from: b */
    public static final bdyx f178478b;

    /* renamed from: c */
    public static final bdyx f178479c;

    /* renamed from: d */
    public static final bdyx f178480d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.audit")).mo58443a();
        f178477a = bdyx.m91607a(a, "ConfigFeature__audit_record_maximum_size", 4096L);
        f178478b = bdyx.m91607a(a, "ConfigFeature__cache_audit_record_maximum_count", 512L);
        bdyx.m91610a(a, "Config__catch_null_pointer_exception_only", true);
        f178479c = bdyx.m91610a(a, "Config__error_on_empty_requests_b137768454", true);
        f178480d = bdyx.m91610a(a, "Config__error_on_null_records_b137768454", false);
    }

    /* renamed from: a */
    public final long mo75546a() {
        return ((Long) f178477a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75547b() {
        return ((Long) f178478b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo75548c() {
        return ((Boolean) f178479c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75549d() {
        return ((Boolean) f178480d.mo58455c()).booleanValue();
    }
}
