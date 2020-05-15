package p000;

/* renamed from: cfqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfqs implements cfqr {

    /* renamed from: a */
    public static final bdyx f185470a;

    /* renamed from: b */
    public static final bdyx f185471b;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185470a = bdyx.m91609a(a, "AdvertisingIdBridge__blacklist_regex", "");
        f185471b = bdyx.m91609a(a, "AdvertisingIdBridge__whitelist_regex", "https://adssettings\\.google\\.com/embedded/authenticated.*");
    }

    /* renamed from: a */
    public final String mo82531a() {
        return (String) f185470a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82532b() {
        return (String) f185471b.mo58455c();
    }
}
