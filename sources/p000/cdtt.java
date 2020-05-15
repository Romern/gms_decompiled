package p000;

/* renamed from: cdtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtt implements cdts {

    /* renamed from: A */
    public static final bdyx f181717A;

    /* renamed from: B */
    public static final bdyx f181718B;

    /* renamed from: C */
    public static final bdyx f181719C;

    /* renamed from: D */
    public static final bdyx f181720D;

    /* renamed from: E */
    public static final bdyx f181721E;

    /* renamed from: F */
    public static final bdyx f181722F;

    /* renamed from: G */
    public static final bdyx f181723G;

    /* renamed from: H */
    public static final bdyx f181724H;

    /* renamed from: a */
    public static final bdyx f181725a;

    /* renamed from: b */
    public static final bdyx f181726b;

    /* renamed from: c */
    public static final bdyx f181727c;

    /* renamed from: d */
    public static final bdyx f181728d;

    /* renamed from: e */
    public static final bdyx f181729e;

    /* renamed from: f */
    public static final bdyx f181730f;

    /* renamed from: g */
    public static final bdyx f181731g;

    /* renamed from: h */
    public static final bdyx f181732h;

    /* renamed from: i */
    public static final bdyx f181733i;

    /* renamed from: j */
    public static final bdyx f181734j;

    /* renamed from: k */
    public static final bdyx f181735k;

    /* renamed from: l */
    public static final bdyx f181736l;

    /* renamed from: m */
    public static final bdyx f181737m;

    /* renamed from: n */
    public static final bdyx f181738n;

    /* renamed from: o */
    public static final bdyx f181739o;

    /* renamed from: p */
    public static final bdyx f181740p;

    /* renamed from: q */
    public static final bdyx f181741q;

    /* renamed from: r */
    public static final bdyx f181742r;

    /* renamed from: s */
    public static final bdyx f181743s;

    /* renamed from: t */
    public static final bdyx f181744t;

    /* renamed from: u */
    public static final bdyx f181745u;

    /* renamed from: v */
    public static final bdyx f181746v;

    /* renamed from: w */
    public static final bdyx f181747w;

    /* renamed from: x */
    public static final bdyx f181748x;

    /* renamed from: y */
    public static final bdyx f181749y;

    /* renamed from: z */
    public static final bdyx f181750z;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.feedback")).mo58443a();
        f181725a = bdyx.m91610a(a, "AndroidFeedback__allow_annotate", true);
        bdyx.m91610a(a, "AndroidFeedback__b111308012_feedback_submission_metrics", false);
        bdyx.m91610a(a, "AndroidFeedback__b111308012_suggestion_help_request_metrics", false);
        f181726b = bdyx.m91607a(a, "AndroidFeedback__bitmap_compression_ratio", 70L);
        f181727c = bdyx.m91609a(a, "AndroidFeedback__blacklisted_category_tags", "");
        f181728d = bdyx.m91609a(a, "AndroidFeedback__blacklisted_submitting_package_names", "");
        f181729e = bdyx.m91607a(a, "AndroidFeedback__blackout_alpha", 255L);
        f181730f = bdyx.m91607a(a, "AndroidFeedback__blackout_color", -16777216L);
        f181731g = bdyx.m91609a(a, "AndroidFeedback__collect_package_version", "com.google.android.webview,");
        f181732h = bdyx.m91610a(a, "AndroidFeedback__collect_restricted_profile_username", false);
        f181733i = bdyx.m91610a(a, "AndroidFeedback__enable_suggestions", true);
        f181734j = bdyx.m91609a(a, "AndroidFeedback__flow", "feedback.android");
        f181735k = bdyx.m91607a(a, "AndroidFeedback__get_async_psd_or_psbd_retry_interval_ms", 300L);
        f181736l = bdyx.m91607a(a, "AndroidFeedback__get_async_psd_or_psbd_timeout_ms", 5000L);
        f181737m = bdyx.m91607a(a, "AndroidFeedback__highlightAlphaValue", 135L);
        f181738n = bdyx.m91607a(a, "AndroidFeedback__highlight_color", -256L);
        f181739o = bdyx.m91607a(a, "AndroidFeedback__instruction_display_time_ms", 5000L);
        f181740p = bdyx.m91609a(a, "AndroidFeedback__legal_request_url", "https://support.google.com/legal/answer/3110420");
        f181741q = bdyx.m91607a(a, "AndroidFeedback__log_line_limit", 10000L);
        f181742r = bdyx.m91607a(a, "AndroidFeedback__max_anr_file_size", 102400L);
        f181743s = bdyx.m91607a(a, "AndroidFeedback__num_days_to_store_offline_reports", 4L);
        f181744t = bdyx.m91607a(a, "AndroidFeedback__num_reports_stored_offline", 50L);
        bdyx.m91609a(a, "AndroidFeedback__oauth_token_type", "oauth2:https://www.googleapis.com/auth/supportcontent");
        f181745u = bdyx.m91607a(a, "AndroidFeedback__offline_send_report_task_timeout_seconds", 160L);
        f181746v = bdyx.m91609a(a, "AndroidFeedback__privacy_policy_url", "https://www.google.com/policies/privacy/");
        bdyx.m91609a(a, "AndroidFeedback__redirect_header", "Location");
        f181747w = bdyx.m91607a(a, "AndroidFeedback__save_screenshot_timeout_millis", 500L);
        f181748x = bdyx.m91610a(a, "AndroidFeedback__send_reports_during_charging", false);
        f181749y = bdyx.m91607a(a, "AndroidFeedback__serve_suggestion_timeout_millis", 5000L);
        f181750z = bdyx.m91609a(a, "AndroidFeedback__silent_feedback_submission_url", "https://www.google.com/tools/feedback/android/__silent-submit");
        f181717A = bdyx.m91607a(a, "AndroidFeedback__submission_network_timeout_seconds", 20L);
        f181718B = bdyx.m91609a(a, "AndroidFeedback__submission_url", "https://www.google.com/tools/feedback/android/__submit");
        f181719C = bdyx.m91609a(a, "AndroidFeedback__suggestion_whitelist_package_names", "com.android.vending,com.google.android.play.games,com.google.android.gm,com.google.android.googlequicksearchbox,com.google.android.apps.maps,com.google.android.apps.plus,com.google.android.calendar,com.google.android.talk,com.google.android.youtube,com.google.android.videos,com.google.android.music,com.android.chrome,com.android.settings,com.google.android.apps.books,com.google.android.apps.inbox,com.google.android.apps.photos,com.google.android.apps.docs,com.google.android.apps.youtube.music,com.google.android.apps.youtube.gaming,com.google.android.apps.tycho,com.google.android.apps.walletnfcrel");
        f181720D = bdyx.m91609a(a, "AndroidFeedback__suggestions_proto_url", "https://www.google.com/tools/feedback/mobile/feedback-suggestion");
        f181721E = bdyx.m91609a(a, "AndroidFeedback__tos_url", "https://www.google.com/policies/terms/");
        f181722F = bdyx.m91607a(a, "AndroidFeedback__touch_tolerance", 2L);
        f181723G = bdyx.m91609a(a, "AndroidFeedback__upgradeDialogWhitelistMap", "com.google.android.googlequicksearchbox:9.5.0,");
        f181724H = bdyx.m91609a(a, "AndroidFeedback__whitelist_report_types_for_support", "11");
    }

    /* renamed from: A */
    public final long mo78294A() {
        return ((Long) f181717A.mo58455c()).longValue();
    }

    /* renamed from: B */
    public final String mo78295B() {
        return (String) f181718B.mo58455c();
    }

    /* renamed from: C */
    public final String mo78296C() {
        return (String) f181719C.mo58455c();
    }

    /* renamed from: D */
    public final String mo78297D() {
        return (String) f181720D.mo58455c();
    }

    /* renamed from: E */
    public final String mo78298E() {
        return (String) f181721E.mo58455c();
    }

    /* renamed from: F */
    public final long mo78299F() {
        return ((Long) f181722F.mo58455c()).longValue();
    }

    /* renamed from: G */
    public final String mo78300G() {
        return (String) f181723G.mo58455c();
    }

    /* renamed from: H */
    public final String mo78301H() {
        return (String) f181724H.mo58455c();
    }

    /* renamed from: a */
    public final boolean mo78302a() {
        return ((Boolean) f181725a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo78303b() {
        return ((Long) f181726b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo78304c() {
        return (String) f181727c.mo58455c();
    }

    /* renamed from: d */
    public final String mo78305d() {
        return (String) f181728d.mo58455c();
    }

    /* renamed from: e */
    public final long mo78306e() {
        return ((Long) f181729e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo78307f() {
        return ((Long) f181730f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo78308g() {
        return (String) f181731g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo78309h() {
        return ((Boolean) f181732h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo78310i() {
        return ((Boolean) f181733i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final String mo78311j() {
        return (String) f181734j.mo58455c();
    }

    /* renamed from: k */
    public final long mo78312k() {
        return ((Long) f181735k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo78313l() {
        return ((Long) f181736l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo78314m() {
        return ((Long) f181737m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo78315n() {
        return ((Long) f181738n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo78316o() {
        return ((Long) f181739o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final String mo78317p() {
        return (String) f181740p.mo58455c();
    }

    /* renamed from: q */
    public final long mo78318q() {
        return ((Long) f181741q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo78319r() {
        return ((Long) f181742r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo78320s() {
        return ((Long) f181743s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo78321t() {
        return ((Long) f181744t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo78322u() {
        return ((Long) f181745u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final String mo78323v() {
        return (String) f181746v.mo58455c();
    }

    /* renamed from: w */
    public final long mo78324w() {
        return ((Long) f181747w.mo58455c()).longValue();
    }

    /* renamed from: x */
    public final boolean mo78325x() {
        return ((Boolean) f181748x.mo58455c()).booleanValue();
    }

    /* renamed from: y */
    public final long mo78326y() {
        return ((Long) f181749y.mo58455c()).longValue();
    }

    /* renamed from: z */
    public final String mo78327z() {
        return (String) f181750z.mo58455c();
    }
}
