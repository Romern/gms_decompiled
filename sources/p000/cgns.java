package p000;

/* renamed from: cgns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgns implements cgnr {

    /* renamed from: a */
    public static final bdyx f187376a;

    /* renamed from: b */
    public static final bdyx f187377b;

    /* renamed from: c */
    public static final bdyx f187378c;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.smart_profile")).mo58443a();
        f187376a = bdyx.m91609a(a, "ConfigFlags__default_account_avatar_url", "https://lh3.googleusercontent.com/-XdUIqdMkCWA/AAAAAAAAAAI/AAAAAAAAAAA/dS9ff5TYSlA/c/photo.jpg");
        f187377b = bdyx.m91609a(a, "ConfigFlags__proto_server_api_path", "/v1");
        f187378c = bdyx.m91609a(a, "ConfigFlags__proto_server_url", "https://datamixer-pa.googleapis.com");
    }

    /* renamed from: a */
    public final String mo84167a() {
        return (String) f187376a.mo58455c();
    }

    /* renamed from: b */
    public final String mo84168b() {
        return (String) f187377b.mo58455c();
    }

    /* renamed from: c */
    public final String mo84169c() {
        return (String) f187378c.mo58455c();
    }
}
