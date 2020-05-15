package p000;

/* renamed from: cfsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfsl implements cfsk {

    /* renamed from: a */
    public static final bdyx f185631a;

    /* renamed from: b */
    public static final bdyx f185632b;

    /* renamed from: c */
    public static final bdyx f185633c;

    /* renamed from: d */
    public static final bdyx f185634d;

    /* renamed from: e */
    public static final bdyx f185635e;

    /* renamed from: f */
    public static final bdyx f185636f;

    /* renamed from: g */
    public static final bdyx f185637g;

    /* renamed from: h */
    public static final bdyx f185638h;

    /* renamed from: i */
    public static final bdyx f185639i;

    /* renamed from: j */
    public static final bdyx f185640j;

    /* renamed from: k */
    public static final bdyx f185641k;

    /* renamed from: l */
    public static final bdyx f185642l;

    /* renamed from: m */
    public static final bdyx f185643m;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58445a("update_installation_").mo58450b();
        f185631a = bdyx.m91610a(b, "allow_pause_automatic_reboot_for_phone_call", false);
        f185632b = bdyx.m91610a(b, "allow_pause_in_post_installation", false);
        f185633c = bdyx.m91607a(b, "installation_approval_check_frequency", 604800000L);
        f185634d = bdyx.m91609a(b, "auto_reboot_device_encryption_types", "unencrypted");
        f185635e = bdyx.m91607a(b, "device_charger_only_period", 0L);
        f185636f = bdyx.m91607a(b, "device_idle_extension", 1800000L);
        f185637g = bdyx.m91607a(b, "device_idle_maintenance_battery_threshold_period", 0L);
        f185638h = bdyx.m91607a(b, "device_idle_only_check_frequency", 21600000L);
        f185639i = bdyx.m91607a(b, "device_idle_only_period", 0L);
        f185640j = bdyx.m91609a(b, "install_tonight_window", "2300-0500");
        f185641k = bdyx.m91607a(b, "low_battery_delay", 3600000L);
        f185642l = bdyx.m91607a(b, "installation_paused_by_user_check_frequency", 86400000L);
        f185643m = bdyx.m91607a(b, "phone_call_in_progress_delay", 3600000L);
    }

    /* renamed from: a */
    public final boolean mo82656a() {
        return ((Boolean) f185631a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82657b() {
        return ((Boolean) f185632b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo82658c() {
        return ((Long) f185633c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo82659d() {
        return (String) f185634d.mo58455c();
    }

    /* renamed from: e */
    public final long mo82660e() {
        return ((Long) f185635e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo82661f() {
        return ((Long) f185636f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo82662g() {
        return ((Long) f185637g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo82663h() {
        return ((Long) f185638h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo82664i() {
        return ((Long) f185639i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final String mo82665j() {
        return (String) f185640j.mo58455c();
    }

    /* renamed from: k */
    public final long mo82666k() {
        return ((Long) f185641k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo82667l() {
        return ((Long) f185642l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo82668m() {
        return ((Long) f185643m.mo58455c()).longValue();
    }
}
