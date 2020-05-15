package p000;

/* renamed from: cfqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfqv implements cfqu {

    /* renamed from: a */
    public static final bdyx f185474a;

    /* renamed from: b */
    public static final bdyx f185475b;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185474a = bdyx.m91609a(a, "AndroidIdBridge__blacklist_regex", "");
        f185475b = bdyx.m91609a(a, "AndroidIdBridge__whitelist_regex", "https://myaccount\\.google\\.com/embedded/signinoptions/recovery-options-collection.*");
    }

    /* renamed from: a */
    public final String mo82534a() {
        return (String) f185474a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82535b() {
        return (String) f185475b.mo58455c();
    }
}
