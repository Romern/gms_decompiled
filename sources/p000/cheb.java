package p000;

/* renamed from: cheb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cheb implements chea {

    /* renamed from: a */
    public static final bdyx f188512a;

    /* renamed from: b */
    public static final bdyx f188513b;

    /* renamed from: c */
    public static final bdyx f188514c;

    /* renamed from: d */
    public static final bdyx f188515d;

    /* renamed from: e */
    public static final bdyx f188516e;

    /* renamed from: f */
    public static final bdyx f188517f;

    /* renamed from: g */
    public static final bdyx f188518g;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.usagereporting")).mo58445a("gms:usagereporting:").mo58450b();
        f188512a = bdyx.m91609a(b, "calling_package_white_list", "");
        f188513b = bdyx.m91609a(b, "cb_from_setup_wizard_package_whitelist", "com.google.android.setupwizard,com.google.android.gms.apitest");
        f188514c = bdyx.m91610a(b, "enable_calling_package_checker", false);
        f188515d = bdyx.m91610a(b, "platform_mnop", false);
        f188516e = bdyx.m91607a(b, "new_checkbox_gms_core_version_bound", 11200000L);
        f188517f = bdyx.m91609a(b, "playpass_opt_in_package_whitelist", "com.android.vending,com.google.android.gms.apitest");
        f188518g = bdyx.m91610a(b, "use_secret_number", false);
    }

    /* renamed from: a */
    public final String mo85157a() {
        return (String) f188512a.mo58455c();
    }

    /* renamed from: b */
    public final String mo85158b() {
        return (String) f188513b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo85159c() {
        return ((Boolean) f188514c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo85160d() {
        return ((Boolean) f188515d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo85161e() {
        return ((Long) f188516e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo85162f() {
        return (String) f188517f.mo58455c();
    }

    /* renamed from: g */
    public final boolean mo85163g() {
        return ((Boolean) f188518g.mo58455c()).booleanValue();
    }
}
