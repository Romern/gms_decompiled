package p000;

/* renamed from: cdph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdph implements cdpg {

    /* renamed from: a */
    public static final bdyx f181511a;

    /* renamed from: b */
    public static final bdyx f181512b;

    /* renamed from: c */
    public static final bdyx f181513c;

    /* renamed from: d */
    public static final bdyx f181514d;

    /* renamed from: e */
    public static final bdyx f181515e;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:");
        f181511a = bdyx.m91610a(a, "enable_uncertified_device_check", true);
        f181512b = bdyx.m91610a(a, "UncertifiedDevice__generate_notification_in_preprocessor", false);
        f181513c = bdyx.m91609a(a, "uncertified_exceptions_whitelist", "130,151");
        f181514d = bdyx.m91609a(a, "uncertified_feature_exceptions_whitelist", "googlecertificates");
        f181515e = bdyx.m91605a(a, "uncertified_logging_sample_percentage", 0.01d);
    }

    /* renamed from: a */
    public final boolean mo78139a() {
        return ((Boolean) f181511a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78140b() {
        return ((Boolean) f181512b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo78141c() {
        return (String) f181513c.mo58455c();
    }

    /* renamed from: d */
    public final String mo78142d() {
        return (String) f181514d.mo58455c();
    }

    /* renamed from: e */
    public final double mo78143e() {
        return ((Double) f181515e.mo58455c()).doubleValue();
    }
}
