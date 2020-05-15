package p000;

/* renamed from: cbwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbwc implements cbwb {

    /* renamed from: a */
    public static final bdyx f178440a;

    /* renamed from: b */
    public static final bdyx f178441b;

    /* renamed from: c */
    public static final bdyx f178442c;

    /* renamed from: d */
    public static final bdyx f178443d;

    /* renamed from: e */
    public static final bdyx f178444e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.appinvite")).mo58445a("gms:appinvite:");
        f178440a = bdyx.m91610a(a, "AppinviteBugFixFeature__enable_catch_shared_preferences_exception", true);
        f178441b = bdyx.m91610a(a, "AppinviteBugFixFeature__enable_exclude_non_gaia_contacts", false);
        f178442c = bdyx.m91610a(a, "AppinviteBugFixFeature__enable_hide_icon_via_method_types_api", false);
        f178443d = bdyx.m91610a(a, "AppinviteBugFixFeature__enable_toolbar_fix", true);
        f178444e = bdyx.m91610a(a, "AppinviteBugFixFeature__enable_utm_content_and_term_logging", false);
    }

    /* renamed from: a */
    public final boolean mo75513a() {
        return ((Boolean) f178440a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75514b() {
        return ((Boolean) f178441b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75515c() {
        return ((Boolean) f178442c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75516d() {
        return ((Boolean) f178443d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75517e() {
        return ((Boolean) f178444e.mo58455c()).booleanValue();
    }
}
