package p000;

/* renamed from: cdhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdhw implements cdhv {

    /* renamed from: a */
    public static final bdyx f180923a;

    /* renamed from: b */
    public static final bdyx f180924b;

    /* renamed from: c */
    public static final bdyx f180925c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.contextmanager")).mo58443a();
        f180923a = bdyx.m91610a(a, "is_test_user", false);
        f180924b = bdyx.m91609a(a, "server_api_path", "/usercontext/v1/controllerhub/");
        f180925c = bdyx.m91609a(a, "server_url", "https://www.googleapis.com");
    }

    /* renamed from: a */
    public final boolean mo77626a() {
        return ((Boolean) f180923a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo77627b() {
        return (String) f180924b.mo58455c();
    }

    /* renamed from: c */
    public final String mo77628c() {
        return (String) f180925c.mo58455c();
    }
}
