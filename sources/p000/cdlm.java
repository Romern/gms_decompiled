package p000;

/* renamed from: cdlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdlm implements cdll {

    /* renamed from: a */
    public static final bdyx f181196a;

    /* renamed from: b */
    public static final bdyx f181197b;

    /* renamed from: c */
    public static final bdyx f181198c;

    /* renamed from: d */
    public static final bdyx f181199d;

    /* renamed from: e */
    public static final bdyx f181200e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58443a();
        f181196a = bdyx.m91610a(a, "GoogleSettings__disable_legacy_maps_settings", true);
        f181197b = bdyx.m91610a(a, "GoogleSettings__enable_category_headers_fix", true);
        f181198c = bdyx.m91610a(a, "GoogleSettings__enable_debug_menu", false);
        f181199d = bdyx.m91610a(a, "GoogleSettings__enable_subcategories", false);
        f181200e = bdyx.m91610a(a, "GoogleSettings__override_up_action_behavior", true);
    }

    /* renamed from: a */
    public final boolean mo77859a() {
        return ((Boolean) f181196a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77860b() {
        return ((Boolean) f181197b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77861c() {
        return ((Boolean) f181198c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77862d() {
        return ((Boolean) f181199d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77863e() {
        return ((Boolean) f181200e.mo58455c()).booleanValue();
    }
}
