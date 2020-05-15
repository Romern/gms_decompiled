package p000;

/* renamed from: cdge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdge implements cdgd {

    /* renamed from: a */
    public static final bdyx f180747a;

    /* renamed from: b */
    public static final bdyx f180748b;

    /* renamed from: c */
    public static final bdyx f180749c;

    /* renamed from: d */
    public static final bdyx f180750d;

    /* renamed from: e */
    public static final bdyx f180751e;

    /* renamed from: f */
    public static final bdyx f180752f;

    /* renamed from: g */
    public static final bdyx f180753g;

    /* renamed from: h */
    public static final bdyx f180754h;

    /* renamed from: i */
    public static final bdyx f180755i;

    /* renamed from: j */
    public static final bdyx f180756j;

    /* renamed from: k */
    public static final bdyx f180757k;

    /* renamed from: l */
    public static final bdyx f180758l;

    /* renamed from: m */
    public static final bdyx f180759m;

    /* renamed from: n */
    public static final bdyx f180760n;

    /* renamed from: o */
    public static final bdyx f180761o;

    /* renamed from: p */
    public static final bdyx f180762p;

    /* renamed from: q */
    public static final bdyx f180763q;

    /* renamed from: r */
    public static final bdyx f180764r;

    /* renamed from: s */
    public static final bdyx f180765s;

    /* renamed from: t */
    public static final bdyx f180766t;

    /* renamed from: u */
    public static final bdyx f180767u;

    /* renamed from: v */
    public static final bdyx f180768v;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180747a = bdyx.m91607a(a, "VerificationSettings__a2p_hours_before_time_window_end", 0L);
        f180748b = bdyx.m91607a(a, "VerificationSettings__a2p_sms_signal_granularity_hrs", 1L);
        f180749c = bdyx.m91607a(a, "VerificationSettings__a2p_upload_message_count", 5L);
        bdyx.m91609a(a, "VerificationSettings__a2p_url_pattern_matcher", "(?:(?:https?|ftp)://)?[w/-?=%]+\\\\.[w/-?=%]+");
        f180750d = bdyx.m91610a(a, "VerificationSettings__a2p_use_week_time_window", false);
        f180751e = bdyx.m91607a(a, "VerificationSettings__carrier_id_max_verification_attempt_count", 2L);
        f180752f = bdyx.m91609a(a, "VerificationSettings__default_policy_id", "");
        f180753g = bdyx.m91607a(a, "VerificationSettings__flash_call_expect_call_timeout_millis", 60000L);
        f180754h = bdyx.m91607a(a, "VerificationSettings__flash_call_expect_fail_timeout_millis", 200L);
        f180755i = bdyx.m91610a(a, "VerificationSettings__is_1tv_param_in_verify_phone_number_api_allowed", true);
        f180756j = bdyx.m91610a(a, "VerificationSettings__is_a2p_enabled", false);
        f180757k = bdyx.m91610a(a, "VerificationSettings__is_carrier_id_enabled_for_multi_sim", false);
        f180758l = bdyx.m91610a(a, "VerificationSettings__is_flash_call_enabled", false);
        f180759m = bdyx.m91610a(a, "VerificationSettings__is_flash_call_enabled_for_multi_sim", false);
        f180760n = bdyx.m91610a(a, "VerificationSettings__is_non_persistent_mo_enabled", false);
        f180761o = bdyx.m91610a(a, "VerificationSettings__is_one_time_verification_enabled", true);
        f180762p = bdyx.m91610a(a, "VerificationSettings__is_silent_mt_enabled", false);
        f180763q = bdyx.m91610a(a, "VerificationSettings__is_silent_mt_enabled_for_multi_sim", false);
        f180764r = bdyx.m91610a(a, "VerificationSettings__is_verify_phone_number_api_v2_enabled", false);
        f180765s = bdyx.m91607a(a, "VerificationSettings__max_verification_attempt_count", 3L);
        f180766t = bdyx.m91609a(a, "VerificationSettings__mo_ping_intervals_millis", "5000,5000,20000,30000,60000,240000,600000,300000");
        f180767u = bdyx.m91607a(a, "VerificationSettings__mt_verification_timeout_secs", 1800L);
        f180768v = bdyx.m91607a(a, "VerificationSettings__preferred_verification_method", 0L);
    }

    /* renamed from: a */
    public final long mo77479a() {
        return ((Long) f180747a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77480b() {
        return ((Long) f180748b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo77481c() {
        return ((Long) f180749c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo77482d() {
        return ((Boolean) f180750d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo77483e() {
        return ((Long) f180751e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo77484f() {
        return (String) f180752f.mo58455c();
    }

    /* renamed from: g */
    public final long mo77485g() {
        return ((Long) f180753g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo77486h() {
        return ((Long) f180754h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final boolean mo77487i() {
        return ((Boolean) f180755i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo77488j() {
        return ((Boolean) f180756j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo77489k() {
        return ((Boolean) f180757k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo77490l() {
        return ((Boolean) f180758l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo77491m() {
        return ((Boolean) f180759m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo77492n() {
        return ((Boolean) f180760n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo77493o() {
        return ((Boolean) f180761o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo77494p() {
        return ((Boolean) f180762p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo77495q() {
        return ((Boolean) f180763q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo77496r() {
        return ((Boolean) f180764r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final long mo77497s() {
        return ((Long) f180765s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final String mo77498t() {
        return (String) f180766t.mo58455c();
    }

    /* renamed from: u */
    public final long mo77499u() {
        return ((Long) f180767u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final long mo77500v() {
        return ((Long) f180768v.mo58455c()).longValue();
    }
}
