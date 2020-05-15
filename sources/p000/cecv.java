package p000;

/* renamed from: cecv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cecv implements cecu {

    /* renamed from: a */
    public static final bdyx f182270a;

    /* renamed from: b */
    public static final bdyx f182271b;

    /* renamed from: c */
    public static final bdyx f182272c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182270a = bdyx.m91609a(bdyw, "gtalk_fallback_mobile_hostports", "alt1-mtalk.google.com:5228,alt2-mtalk.google.com:5228,alt3-mtalk.google.com:5228,alt4-mtalk.google.com:5228,alt5-mtalk.google.com:5228,alt6-mtalk.google.com:5228,alt7-mtalk.google.com:5228,alt8-mtalk.google.com:5228");
        f182271b = bdyx.m91609a(bdyw, "gtalk_fallback_wifi_hostports", "alt1-mtalk.google.com:443,alt2-mtalk.google.com:443,alt3-mtalk.google.com:443,alt4-mtalk.google.com:443,alt5-mtalk.google.com:5228,alt6-mtalk.google.com:5228,alt7-mtalk.google.com:5228,alt8-mtalk.google.com:5228");
        f182272c = bdyx.m91610a(bdyw, "gcm_fallback_reconnect_on_mobile", true);
    }

    /* renamed from: a */
    public final String mo78767a() {
        return (String) f182270a.mo58455c();
    }

    /* renamed from: b */
    public final String mo78768b() {
        return (String) f182271b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo78769c() {
        return ((Boolean) f182272c.mo58455c()).booleanValue();
    }
}
