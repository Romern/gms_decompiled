package p000;

/* renamed from: ccgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccgd implements ccgc {

    /* renamed from: a */
    public static final bdyx f178931a;

    /* renamed from: b */
    public static final bdyx f178932b;

    /* renamed from: c */
    public static final bdyx f178933c;

    /* renamed from: d */
    public static final bdyx f178934d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_folsom")).mo58445a("auth_folsom_");
        f178931a = bdyx.m91609a(a, "ZuulMvp__android_key_retrieval_url", "https://accounts.google.com/encryption/unlock/android");
        f178932b = bdyx.m91610a(a, "ZuulMvp__enable_silent_key_generation", false);
        f178933c = bdyx.m91610a(a, "ZuulMvp__enable_zuul_api", false);
        f178934d = bdyx.m91610a(a, "ZuulMvp__support_zuul_keys_in_key_sync_controller", false);
    }

    /* renamed from: a */
    public final String mo75913a() {
        return (String) f178931a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75914b() {
        return ((Boolean) f178932b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75915c() {
        return ((Boolean) f178933c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75916d() {
        return ((Boolean) f178934d.mo58455c()).booleanValue();
    }
}
