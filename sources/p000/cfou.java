package p000;

/* renamed from: cfou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfou implements cfot {

    /* renamed from: a */
    public static final bdyx f185170a;

    /* renamed from: b */
    public static final bdyx f185171b;

    /* renamed from: c */
    public static final bdyx f185172c;

    /* renamed from: d */
    public static final bdyx f185173d;

    /* renamed from: e */
    public static final bdyx f185174e;

    /* renamed from: f */
    public static final bdyx f185175f;

    /* renamed from: g */
    public static final bdyx f185176g;

    /* renamed from: h */
    public static final bdyx f185177h;

    /* renamed from: i */
    public static final bdyx f185178i;

    /* renamed from: j */
    public static final bdyx f185179j;

    /* renamed from: k */
    public static final bdyx f185180k;

    /* renamed from: l */
    public static final bdyx f185181l;

    /* renamed from: m */
    public static final bdyx f185182m;

    /* renamed from: n */
    public static final bdyx f185183n;

    /* renamed from: o */
    public static final bdyx f185184o;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.nearby")).mo58445a("nearby:");
        f185170a = bdyx.m91610a(a, "ble_scan_always_available", true);
        f185171b = bdyx.m91610a(a, "common_ble_scan_always_available", false);
        f185172c = bdyx.m91610a(a, "common_enable_analytics_debug_log", false);
        bdyx.m91610a(a, "common_enable_counters", true);
        f185173d = bdyx.m91609a(a, "common_first_party_whitelist", "com.google.android.apps.testing.devicewhisperer.deviceagents.copresence:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.apps.testing.devicewhisperer.deviceagents.nearby:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.libraries.testing.devicewhisperer.codesnippets.audiomodem:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.location.nearby.apps.debug:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.apps.jamkiosk:E6A1A1EF628816E3F2BBF49BD36A0A255B5D7B54,com.google.android.apps.jamkiosk:527024372B122A89A9F09F07D1851C2CC3E7EDFB,com.google.android.gms.nearby.sample.backgroundsubscriber:61ED377E85D386A8DFEE6B864BD85B0BFAA5AF81");
        f185174e = bdyx.m91610a(a, "common_first_party_whitelist_bypass", false);
        bdyx.m91610a(a, "common_log_hashed_salted_bluetooth_address", true);
        f185175f = bdyx.m91610a(a, "common_reset_salt_time_if_invalid_period", true);
        f185176g = bdyx.m91609a(a, "common_second_party_whitelist", "");
        bdyx.m91610a(a, "direct_lazily_initialize_fast_pair_scanner", true);
        f185177h = bdyx.m91610a(a, "nearby_dont_synchronize_cancelable_alarm", true);
        f185178i = bdyx.m91610a(a, "eventloop_check_thread", true);
        f185179j = bdyx.m91610a(a, "log_hashed_device_address", true);
        f185180k = bdyx.m91607a(a, "salt_last_used_time_millis", 7200000L);
        f185181l = bdyx.m91607a(a, "salt_preference_update_threshold_millis", 300000L);
        f185182m = bdyx.m91607a(a, "salt_ttl_millis", 86400000L);
        f185183n = bdyx.m91610a(a, "use_unified_app_whitelist", true);
        f185184o = bdyx.m91609a(a, "common_user_type", "prod");
    }

    /* renamed from: a */
    public final boolean mo82249a() {
        return ((Boolean) f185170a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82250b() {
        return ((Boolean) f185171b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82251c() {
        return ((Boolean) f185172c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo82252d() {
        return (String) f185173d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo82253e() {
        return ((Boolean) f185174e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo82254f() {
        return ((Boolean) f185175f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final String mo82255g() {
        return (String) f185176g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo82256h() {
        return ((Boolean) f185177h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo82257i() {
        return ((Boolean) f185178i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo82258j() {
        return ((Boolean) f185179j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo82259k() {
        return ((Long) f185180k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo82260l() {
        return ((Long) f185181l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo82261m() {
        return ((Long) f185182m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final boolean mo82262n() {
        return ((Boolean) f185183n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final String mo82263o() {
        return (String) f185184o.mo58455c();
    }
}
