package p000;

/* renamed from: chpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chpy implements chpx {

    /* renamed from: a */
    public static final bdyx f188960a;

    /* renamed from: b */
    public static final bdyx f188961b;

    /* renamed from: c */
    public static final bdyx f188962c;

    /* renamed from: d */
    public static final bdyx f188963d;

    /* renamed from: e */
    public static final bdyx f188964e;

    /* renamed from: f */
    public static final bdyx f188965f;

    /* renamed from: g */
    public static final bdyx f188966g;

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
        bdyw a = new bdyw("com.google.android.westworld").mo58445a("gms:westworld:");
        f188960a = bdyx.m91609a(a, "blacklisted_alarms", "");
        f188961b = bdyx.m91609a(a, "blacklisted_alerts", "");
        f188962c = bdyx.m91609a(a, "blacklisted_metrics", "");
        f188963d = bdyx.m91609a(a, "blacklisted_subscriptions", "");
        f188964e = bdyx.m91607a(a, "config_key", 175713051L);
        f188965f = bdyx.m91609a(a, "config_prefix", "westworld_config_");
        f188966g = bdyx.m91610a(a, "disable_string_hashing", false);
    }

    /* renamed from: a */
    public final String mo85498a() {
        return (String) f188960a.mo58455c();
    }

    /* renamed from: b */
    public final String mo85499b() {
        return (String) f188961b.mo58455c();
    }

    /* renamed from: c */
    public final String mo85500c() {
        return (String) f188962c.mo58455c();
    }

    /* renamed from: d */
    public final String mo85501d() {
        return (String) f188963d.mo58455c();
    }

    /* renamed from: e */
    public final long mo85502e() {
        return ((Long) f188964e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo85503f() {
        return (String) f188965f.mo58455c();
    }

    /* renamed from: g */
    public final boolean mo85504g() {
        return ((Boolean) f188966g.mo58455c()).booleanValue();
    }
}
