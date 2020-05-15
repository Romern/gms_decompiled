package p000;

/* renamed from: cgrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgrs implements cgrr {

    /* renamed from: a */
    public static final bdyx f187604a;

    /* renamed from: b */
    public static final bdyx f187605b;

    /* renamed from: c */
    public static final bdyx f187606c;

    /* renamed from: d */
    public static final bdyx f187607d;

    /* renamed from: e */
    public static final bdyx f187608e;

    /* renamed from: f */
    public static final bdyx f187609f;

    /* renamed from: g */
    public static final bdyx f187610g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187604a = bdyx.m91610a(bdyw, "enable_minute_maid_flow", false);
        f187605b = bdyx.m91609a(bdyw, "WifiD2d__google_restore_uri", "intent:#Intent;action=com.google.android.gms.backup.ACTION_WIFI_D2D;package=com.google.android.gms;end");
        f187606c = bdyx.m91610a(bdyw, "WifiD2d__is_oem_restore_enabled_on_source", false);
        f187607d = bdyx.m91610a(bdyw, "WifiD2d__resolve_package_name", false);
        f187608e = bdyx.m91610a(bdyw, "WifiD2d__set_post_transfer_action_for_wifi_d2d_only", true);
        f187609f = bdyx.m91610a(bdyw, "WifiD2d__target_set_module_version_in_bootstrap_options", true);
        f187610g = bdyx.m91610a(bdyw, "WifiD2d__use_new_d2d_copying_accounts_title", true);
    }

    /* renamed from: a */
    public final boolean mo84359a() {
        return ((Boolean) f187604a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo84360b() {
        return (String) f187605b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo84361c() {
        return ((Boolean) f187606c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84362d() {
        return ((Boolean) f187607d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo84363e() {
        return ((Boolean) f187608e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo84364f() {
        return ((Boolean) f187609f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo84365g() {
        return ((Boolean) f187610g.mo58455c()).booleanValue();
    }
}
