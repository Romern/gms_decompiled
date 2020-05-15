package p000;

/* renamed from: cbuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbuw implements cbuv {

    /* renamed from: a */
    public static final bdyx f178320a;

    /* renamed from: b */
    public static final bdyx f178321b;

    /* renamed from: c */
    public static final bdyx f178322c;

    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178320a = bdyx.m91609a(bdyw, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
        f178321b = bdyx.m91609a(bdyw, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");
        f178322c = bdyx.m91609a(bdyw, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");
    }

    /* renamed from: a */
    public final String mo75404a() {
        return (String) f178320a.mo58455c();
    }

    /* renamed from: b */
    public final String mo75405b() {
        return (String) f178321b.mo58455c();
    }

    /* renamed from: c */
    public final String mo75406c() {
        return (String) f178322c.mo58455c();
    }
}
