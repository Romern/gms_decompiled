package p000;

/* renamed from: cfqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfqy implements cfqx {

    /* renamed from: a */
    public static final bdyx f185478a;

    /* renamed from: b */
    public static final bdyx f185479b;

    /* renamed from: c */
    public static final bdyx f185480c;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185478a = bdyx.m91609a(a, "AppPermissionsBridge__app_permissions_js_bridge_blacklist_regex", "");
        f185479b = bdyx.m91609a(a, "AppPermissionsBridge__app_permissions_js_bridge_supported_permissions", "android.permission.READ_CALENDAR,android.permission.READ_CONTACTS,android.permission.READ_EXTERNAL_STORAGE");
        f185480c = bdyx.m91609a(a, "AppPermissionsBridge__app_permissions_js_bridge_whitelist_regex", "https://myaccount\\.google\\.com/embedded/security-checkup.*");
    }

    /* renamed from: a */
    public final String mo82537a() {
        return (String) f185478a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82538b() {
        return (String) f185479b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82539c() {
        return (String) f185480c.mo58455c();
    }
}
