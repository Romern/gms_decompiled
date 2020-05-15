package p000;

/* renamed from: cdfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfm implements cdfl {

    /* renamed from: a */
    public static final bdyx f180653a;

    /* renamed from: b */
    public static final bdyx f180654b;

    /* renamed from: c */
    public static final bdyx f180655c;

    /* renamed from: d */
    public static final bdyx f180656d;

    /* renamed from: e */
    public static final bdyx f180657e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180653a = bdyx.m91610a(a, "ExternalConsentActivity__is_enabled", false);
        f180654b = bdyx.m91610a(a, "ExternalConsentActivity__is_hard_to_reject", false);
        f180655c = bdyx.m91609a(a, "ExternalConsentActivity__packages_allowed_to_call", "com.samsung.android.messaging");
        f180656d = bdyx.m91607a(a, "ExternalConsentActivity__timeout_secs", 5L);
        f180657e = bdyx.m91609a(a, "ExternalConsentActivity__tos_url", "https://www.gstatic.com/jibe/consent/g0t/jibe-consent.html");
    }

    /* renamed from: a */
    public final boolean mo77391a() {
        return ((Boolean) f180653a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77392b() {
        return ((Boolean) f180654b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo77393c() {
        return (String) f180655c.mo58455c();
    }

    /* renamed from: d */
    public final long mo77394d() {
        return ((Long) f180656d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo77395e() {
        return (String) f180657e.mo58455c();
    }
}
