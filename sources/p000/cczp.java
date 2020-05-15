package p000;

/* renamed from: cczp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczp implements cczn {

    /* renamed from: a */
    public static final bdyx f180311a;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        try {
            f180311a = bdyx.m91608a(a, "FirstPartyApiConfigs__whitelisted_package_names", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cczo.f180310a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"FirstPartyApiConfigs__whitelisted_package_names\"");
        }
    }

    /* renamed from: a */
    public final bydj mo77104a() {
        return (bydj) f180311a.mo58455c();
    }
}
