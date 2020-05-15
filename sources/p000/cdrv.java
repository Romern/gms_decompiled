package p000;

/* renamed from: cdrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrv implements cdru {

    /* renamed from: a */
    public static final bdyx f181619a;

    /* renamed from: b */
    public static final bdyx f181620b;

    /* renamed from: c */
    public static final bdyx f181621c;

    /* renamed from: d */
    public static final bdyx f181622d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.dynamiclinks")).mo58445a("gms:firebase_dynamic_links:");
        f181619a = bdyx.m91610a(a, "get_dynamic_link_client_logging.enabled", true);
        f181620b = bdyx.m91610a(a, "get_dynamic_link.filter.scheme.https_only", true);
        f181621c = bdyx.m91610a(a, "shorten_dynamic_link.enabled", true);
        f181622d = bdyx.m91609a(a, "shorten_dynamic_link.format_url", "https://firebasedynamiclinks.googleapis.com/v1/shortLinks?key=%s");
    }

    /* renamed from: a */
    public final boolean mo78225a() {
        return ((Boolean) f181619a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78226b() {
        return ((Boolean) f181620b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78227c() {
        return ((Boolean) f181621c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo78228d() {
        return (String) f181622d.mo58455c();
    }
}
