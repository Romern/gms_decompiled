package p000;

/* renamed from: cfmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfmf implements cfme {

    /* renamed from: a */
    public static final bdyx f184341a;

    /* renamed from: b */
    public static final bdyx f184342b;

    /* renamed from: c */
    public static final bdyx f184343c;

    /* renamed from: d */
    public static final bdyx f184344d;

    /* renamed from: e */
    public static final bdyx f184345e;

    /* renamed from: f */
    public static final bdyx f184346f;

    /* renamed from: g */
    public static final bdyx f184347g;

    /* renamed from: h */
    public static final bdyx f184348h;

    /* renamed from: i */
    public static final bdyx f184349i;

    /* renamed from: j */
    public static final bdyx f184350j;

    /* renamed from: k */
    public static final bdyx f184351k;

    /* renamed from: l */
    public static final bdyx f184352l;

    /* renamed from: m */
    public static final bdyx f184353m;

    /* renamed from: n */
    public static final bdyx f184354n;

    /* renamed from: o */
    public static final bdyx f184355o;

    /* renamed from: p */
    public static final bdyx f184356p;

    /* renamed from: q */
    public static final bdyx f184357q;

    /* renamed from: r */
    public static final bdyx f184358r;

    /* renamed from: s */
    public static final bdyx f184359s;

    /* renamed from: t */
    public static final bdyx f184360t;

    /* renamed from: u */
    public static final bdyx f184361u;

    /* renamed from: v */
    public static final bdyx f184362v;

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
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184341a = bdyx.m91610a(bdyw, "CachingImprovements__bypass_cpid_cache_for_g1", true);
        f184342b = bdyx.m91610a(bdyw, "CachingImprovements__cache_gcm_plan_statuses", false);
        f184343c = bdyx.m91610a(bdyw, "CachingImprovements__cache_mcc_mnc", true);
        f184344d = bdyx.m91607a(bdyw, "CachingImprovements__cached_plan_expiration_seconds", 259200L);
        f184345e = bdyx.m91607a(bdyw, "CachingImprovements__consent_outdated_time", 2592000L);
        f184346f = bdyx.m91607a(bdyw, "CachingImprovements__cpid_cache_refresh_min_ttl_in_seconds", 604800L);
        f184347g = bdyx.m91610a(bdyw, "CachingImprovements__enable_background_consent_fetch", false);
        f184348h = bdyx.m91610a(bdyw, "CachingImprovements__enable_hidden_gcm_messages", false);
        f184349i = bdyx.m91610a(bdyw, "CachingImprovements__extend_cache_expiration_on_update", true);
        f184350j = bdyx.m91610a(bdyw, "CachingImprovements__filter_module_init_refreshes", true);
        f184351k = bdyx.m91610a(bdyw, "CachingImprovements__ignore_expired_cpids", true);
        f184352l = bdyx.m91610a(bdyw, "CachingImprovements__include_mcc_mnc_in_gcore_reg", false);
        f184353m = bdyx.m91610a(bdyw, "CachingImprovements__invalidate_carrier_logo_cache", false);
        f184354n = bdyx.m91610a(bdyw, "CachingImprovements__invalidate_cpid_cache", false);
        f184355o = bdyx.m91607a(bdyw, "CachingImprovements__new_consent_task_flex_time", 3600L);
        f184356p = bdyx.m91607a(bdyw, "CachingImprovements__new_consent_task_interval", 8640000L);
        f184357q = bdyx.m91610a(bdyw, "CachingImprovements__save_cpid_endpoints_before_get_cpid", true);
        f184358r = bdyx.m91610a(bdyw, "CachingImprovements__save_old_proto_when_storing_cpid_response", true);
        f184359s = bdyx.m91610a(bdyw, "CachingImprovements__show_cached_plan_statuses", false);
        f184360t = bdyx.m91607a(bdyw, "CachingImprovements__update_consent_task_flex_time", 86400L);
        f184361u = bdyx.m91607a(bdyw, "CachingImprovements__update_consent_task_interval", 8640000L);
        f184362v = bdyx.m91610a(bdyw, "CachingImprovements__use_cached_cpid_endpoint", true);
    }

    /* renamed from: a */
    public final boolean mo81449a() {
        return ((Boolean) f184341a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81450b() {
        return ((Boolean) f184342b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81451c() {
        return ((Boolean) f184343c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo81452d() {
        return ((Long) f184344d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo81453e() {
        return ((Long) f184345e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo81454f() {
        return ((Long) f184346f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo81455g() {
        return ((Boolean) f184347g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo81456h() {
        return ((Boolean) f184348h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81457i() {
        return ((Boolean) f184349i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo81458j() {
        return ((Boolean) f184350j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo81459k() {
        return ((Boolean) f184351k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo81460l() {
        return ((Boolean) f184352l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo81461m() {
        return ((Boolean) f184353m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo81462n() {
        return ((Boolean) f184354n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final long mo81463o() {
        return ((Long) f184355o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo81464p() {
        return ((Long) f184356p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final boolean mo81465q() {
        return ((Boolean) f184357q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo81466r() {
        return ((Boolean) f184358r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo81467s() {
        return ((Boolean) f184359s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final long mo81468t() {
        return ((Long) f184360t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo81469u() {
        return ((Long) f184361u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final boolean mo81470v() {
        return ((Boolean) f184362v.mo58455c()).booleanValue();
    }
}
