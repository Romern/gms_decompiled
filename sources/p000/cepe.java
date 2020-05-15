package p000;

/* renamed from: cepe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cepe implements cepd {

    /* renamed from: a */
    public static final bdyx f183175a;

    /* renamed from: b */
    public static final bdyx f183176b;

    /* renamed from: c */
    public static final bdyx f183177c;

    /* renamed from: d */
    public static final bdyx f183178d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        f183175a = bdyx.m91610a(a, "DebugLogging__dump_domain_filter_after_sync", false);
        f183176b = bdyx.m91610a(a, "DebugLogging__dump_domain_filter_before_match_url", false);
        f183177c = bdyx.m91610a(a, "DebugLogging__enable_debug_logging_for_domain_filter", false);
        f183178d = bdyx.m91607a(a, "DebugLogging__max_packages_to_dump", 600L);
    }

    /* renamed from: a */
    public final boolean mo79508a() {
        return ((Boolean) f183175a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79509b() {
        return ((Boolean) f183176b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79510c() {
        return ((Boolean) f183177c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79511d() {
        return ((Long) f183178d.mo58455c()).longValue();
    }
}
