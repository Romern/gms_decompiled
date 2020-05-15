package p000;

/* renamed from: cgkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgkk implements cgkj {

    /* renamed from: a */
    public static final bdyx f187163a;

    /* renamed from: b */
    public static final bdyx f187164b;

    /* renamed from: c */
    public static final bdyx f187165c;

    /* renamed from: d */
    public static final bdyx f187166d;

    /* renamed from: e */
    public static final bdyx f187167e;

    /* renamed from: f */
    public static final bdyx f187168f;

    /* renamed from: g */
    public static final bdyx f187169g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.security"));
        bdyx.m91610a(bdyw, "FmdFeature__disable_rmp_for_unsupported_devices", false);
        f187163a = bdyx.m91610a(bdyw, "find_my_device_master_switch_enabled", true);
        bdyx.m91610a(bdyw, "get_serial_number", true);
        bdyx.m91610a(bdyw, "get_signal_strength", true);
        bdyx.m91610a(bdyw, "FmdFeature__handle_total_silence", true);
        f187164b = bdyx.m91610a(bdyw, "killswitch_allow_only_latin_ascii_for_passwords", false);
        f187165c = bdyx.m91610a(bdyw, "killswitch_disable_nfc_on_lock", false);
        f187166d = bdyx.m91610a(bdyw, "locate_optimization_enabled", true);
        f187167e = bdyx.m91610a(bdyw, "", true);
        f187168f = bdyx.m91610a(bdyw, "secure_nfc_on_lock_enabled", true);
        bdyx.m91610a(bdyw, "support_unpair", true);
        f187169g = bdyx.m91607a(bdyw, "unpair_timeout_ms", 30000L);
    }

    /* renamed from: a */
    public final boolean mo83983a() {
        return ((Boolean) f187163a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83984b() {
        return ((Boolean) f187164b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83985c() {
        return ((Boolean) f187165c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83986d() {
        return ((Boolean) f187166d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83987e() {
        return ((Boolean) f187167e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83988f() {
        return ((Boolean) f187168f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo83989g() {
        return ((Long) f187169g.mo58455c()).longValue();
    }
}
