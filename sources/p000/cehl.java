package p000;

/* renamed from: cehl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cehl implements cehk {

    /* renamed from: a */
    public static final bdyx f182673a;

    /* renamed from: b */
    public static final bdyx f182674b;

    /* renamed from: c */
    public static final bdyx f182675c;

    /* renamed from: d */
    public static final bdyx f182676d;

    /* renamed from: e */
    public static final bdyx f182677e;

    /* renamed from: f */
    public static final bdyx f182678f;

    /* renamed from: g */
    public static final bdyx f182679g;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        f182673a = bdyx.m91609a(a, "AndroidGoogleHelp__ocarina_redirect_app_package_name_blacklist", "com.google.android.apps.enterprise.cpanel");
        f182674b = bdyx.m91609a(a, "AndroidGoogleHelp__ocarina_redirect_app_package_name_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
        f182675c = bdyx.m91610a(a, "AndroidGoogleHelp__enable_ocarina_redirect", true);
        bdyx.m91610a(a, "AndroidGoogleHelp__include_ocarina_specific_metrics", true);
        f182676d = bdyx.m91607a(a, "AndroidGoogleHelp__ocarina_redirect_max_bytes_in_intent", 300000L);
        f182677e = bdyx.m91607a(a, "AndroidGoogleHelp__ocarina_redirect_min_helprtc_version", 605L);
        f182678f = bdyx.m91609a(a, "AndroidGoogleHelp__ocarina_app_package_name", "com.google.android.apps.helprtc");
        f182679g = bdyx.m91609a(a, "AndroidGoogleHelp__ocarina_launch_class_name", "com.google.android.apps.helprtc.help.activities.HelpActivity");
    }

    /* renamed from: a */
    public final String mo79130a() {
        return (String) f182673a.mo58455c();
    }

    /* renamed from: b */
    public final String mo79131b() {
        return (String) f182674b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo79132c() {
        return ((Boolean) f182675c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79133d() {
        return ((Long) f182676d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo79134e() {
        return ((Long) f182677e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo79135f() {
        return (String) f182678f.mo58455c();
    }

    /* renamed from: g */
    public final String mo79136g() {
        return (String) f182679g.mo58455c();
    }
}
