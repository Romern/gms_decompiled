package p000;

/* renamed from: cchn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchn implements cchm {

    /* renamed from: a */
    public static final bdyx f178993a;

    /* renamed from: b */
    public static final bdyx f178994b;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f178993a = bdyx.m91609a(a, "CryptauthServer__authzen_cryptauth_scope", "https://www.googleapis.com/auth/cryptauth");
        f178994b = bdyx.m91609a(a, "CryptauthServer__authzen_cryptauth_server_url", "https://www.googleapis.com/");
    }

    /* renamed from: a */
    public final String mo75963a() {
        return (String) f178993a.mo58455c();
    }

    /* renamed from: b */
    public final String mo75964b() {
        return (String) f178994b.mo58455c();
    }
}
