package p000;

/* renamed from: cghj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cghj implements cghi {

    /* renamed from: a */
    public static final bdyx f186932a;

    /* renamed from: b */
    public static final bdyx f186933b;

    /* renamed from: c */
    public static final bdyx f186934c;

    /* renamed from: d */
    public static final bdyx f186935d;

    /* renamed from: e */
    public static final bdyx f186936e;

    /* renamed from: f */
    public static final bdyx f186937f;

    /* renamed from: g */
    public static final bdyx f186938g;

    /* renamed from: h */
    public static final bdyx f186939h;

    /* renamed from: i */
    public static final bdyx f186940i;

    /* renamed from: j */
    public static final bdyx f186941j;

    /* renamed from: k */
    public static final bdyx f186942k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186932a = bdyx.m91609a(bdyw, "sls_auth_scope", "https://www.googleapis.com/auth/semanticlocation.readonly");
        f186933b = bdyx.m91609a(bdyw, "sls_server_url", "semanticlocation-pa.googleapis.com");
        f186934c = bdyx.m91607a(bdyw, "sls_timeout_ms", 10000L);
        f186935d = bdyx.m91610a(bdyw, "use_sls_for_get_place_by_lat_lng_operation", false);
        f186936e = bdyx.m91610a(bdyw, "use_sls_for_get_user_places_operation", false);
        f186937f = bdyx.m91610a(bdyw, "use_sls_for_nearby_alert_data_by_id", false);
        f186938g = bdyx.m91610a(bdyw, "use_sls_for_place_index", false);
        f186939h = bdyx.m91610a(bdyw, "use_sls_for_place_inference_model", false);
        f186940i = bdyx.m91610a(bdyw, "use_sls_for_search_by_beacon", false);
        f186941j = bdyx.m91610a(bdyw, "use_sls_for_search_by_chain", false);
        f186942k = bdyx.m91610a(bdyw, "use_sls_for_standard_alias_operation", false);
    }

    /* renamed from: a */
    public final String mo83784a() {
        return (String) f186932a.mo58455c();
    }

    /* renamed from: b */
    public final String mo83785b() {
        return (String) f186933b.mo58455c();
    }

    /* renamed from: c */
    public final long mo83786c() {
        return ((Long) f186934c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo83787d() {
        return ((Boolean) f186935d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83788e() {
        return ((Boolean) f186936e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83789f() {
        return ((Boolean) f186937f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo83790g() {
        return ((Boolean) f186938g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo83791h() {
        return ((Boolean) f186939h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo83792i() {
        return ((Boolean) f186940i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo83793j() {
        return ((Boolean) f186941j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo83794k() {
        return ((Boolean) f186942k.mo58455c()).booleanValue();
    }
}
