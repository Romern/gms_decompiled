package p000;

/* renamed from: cbrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrz implements cbry {

    /* renamed from: a */
    public static final bdyx f178199a;

    /* renamed from: b */
    public static final bdyx f178200b;

    /* renamed from: c */
    public static final bdyx f178201c;

    /* renamed from: d */
    public static final bdyx f178202d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178199a = bdyx.m91610a(bdyw, "gads:afs:csa_send_tcf_data", true);
        f178200b = bdyx.m91609a(bdyw, "gads:afs:csa_tcf_data_to_collect", "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
        f178201c = bdyx.m91609a(bdyw, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
        f178202d = bdyx.m91609a(bdyw, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    }

    /* renamed from: a */
    public final boolean mo75308a() {
        return ((Boolean) f178199a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo75309b() {
        return (String) f178200b.mo58455c();
    }

    /* renamed from: c */
    public final String mo75310c() {
        return (String) f178201c.mo58455c();
    }

    /* renamed from: d */
    public final String mo75311d() {
        return (String) f178202d.mo58455c();
    }
}
