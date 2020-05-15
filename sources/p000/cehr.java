package p000;

/* renamed from: cehr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cehr implements cehq {

    /* renamed from: a */
    public static final bdyx f182685a;

    /* renamed from: b */
    public static final bdyx f182686b;

    /* renamed from: c */
    public static final bdyx f182687c;

    /* renamed from: d */
    public static final bdyx f182688d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        bdyx.m91610a(a, "AndroidGoogleHelp__clear_help_config_ongoing_session_article_data", false);
        f182685a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_browse_all_articles_view", false);
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_promoted_content_v2_view", false);
        f182686b = bdyx.m91610a(a, "AndroidGoogleHelp__enable_unified_rendering_api_for_content_url", true);
        f182687c = bdyx.m91610a(a, "AndroidGoogleHelp__fix_toolbar_scroll_flags_npe", false);
        bdyx.m91610a(a, "AndroidGoogleHelp__ignore_empty_psd_value", false);
        f182688d = bdyx.m91610a(a, "AndroidGoogleHelp__refactor_smart_journey_to_use_in_article_webview", true);
    }

    /* renamed from: a */
    public final boolean mo79140a() {
        return ((Boolean) f182685a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79141b() {
        return ((Boolean) f182686b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79142c() {
        return ((Boolean) f182687c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79143d() {
        return ((Boolean) f182688d.mo58455c()).booleanValue();
    }
}
