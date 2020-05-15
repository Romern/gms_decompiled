package p000;

/* renamed from: cegb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cegb implements cega {

    /* renamed from: a */
    public static final bdyx f182624a;

    /* renamed from: b */
    public static final bdyx f182625b;

    /* renamed from: c */
    public static final bdyx f182626c;

    /* renamed from: d */
    public static final bdyx f182627d;

    /* renamed from: e */
    public static final bdyx f182628e;

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
        f182624a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_minimal_help_response_for_unified_rendering_api_request", true);
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_rendering_api_email_form", false);
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_rendering_api_email_form_whitelist", "");
        f182625b = bdyx.m91610a(a, "AndroidGoogleHelp__enable_rendering_api_search_results", false);
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_rendering_api_search_results_blacklist", "com.google.android.libraries.inapphelp.testapp,com.google.android.apps.subscriptions.red");
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_rendering_api_search_results_whitelist", "");
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_unified_rendering_api_request", true);
        f182626c = bdyx.m91610a(a, "AndroidGoogleHelp__rendering_api_click_to_call_form_enabled", false);
        f182627d = bdyx.m91609a(a, "AndroidGoogleHelp__rendering_api_click_to_call_package_whitelist", "");
        f182628e = bdyx.m91607a(a, "AndroidGoogleHelp__rendering_api_overall_request_timeout_seconds", 40L);
        bdyx.m91609a(a, "AndroidGoogleHelp__rendering_api_search_results_whitelist", "");
    }

    /* renamed from: a */
    public final boolean mo79093a() {
        return ((Boolean) f182624a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79094b() {
        return ((Boolean) f182625b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79095c() {
        return ((Boolean) f182626c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo79096d() {
        return (String) f182627d.mo58455c();
    }

    /* renamed from: e */
    public final long mo79097e() {
        return ((Long) f182628e.mo58455c()).longValue();
    }
}
