package p000;

/* renamed from: cdpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpe implements cdpd {

    /* renamed from: a */
    public static final bdyx f181506a;

    /* renamed from: b */
    public static final bdyx f181507b;

    /* renamed from: c */
    public static final bdyx f181508c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:app:");
        bdyx.m91610a(a, "disable_google_help_register_toggle_for_test", false);
        f181506a = bdyx.m91610a(a, "enable_network_usage_activity_advanced", false);
        f181507b = bdyx.m91610a(a, "enable_settings_search_indexing", true);
        f181508c = bdyx.m91610a(a, "enable_usage_reporting", true);
    }

    /* renamed from: a */
    public final boolean mo78135a() {
        return ((Boolean) f181506a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78136b() {
        return ((Boolean) f181507b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78137c() {
        return ((Boolean) f181508c.mo58455c()).booleanValue();
    }
}
