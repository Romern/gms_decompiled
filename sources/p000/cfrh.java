package p000;

/* renamed from: cfrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrh implements cfrg {

    /* renamed from: a */
    public static final bdyx f185504a;

    /* renamed from: b */
    public static final bdyx f185505b;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185504a = bdyx.m91609a(a, "Fido2Bridge__blacklist_regex", "");
        f185505b = bdyx.m91609a(a, "Fido2Bridge__whitelist_regex", "https://(accounts\\.google\\.com/.*|myaccount\\.google\\.com/embedded/.*|passwords\\.google\\.com/embedded/.*)");
    }

    /* renamed from: a */
    public final String mo82560a() {
        return (String) f185504a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82561b() {
        return (String) f185505b.mo58455c();
    }
}
