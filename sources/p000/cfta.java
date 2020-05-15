package p000;

/* renamed from: cfta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfta implements cfsz {

    /* renamed from: a */
    public static final bdyx f185669a;

    /* renamed from: b */
    public static final bdyx f185670b;

    /* renamed from: c */
    public static final bdyx f185671c;

    /* renamed from: d */
    public static final bdyx f185672d;

    /* renamed from: e */
    public static final bdyx f185673e;

    /* renamed from: f */
    public static final bdyx f185674f;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58450b();
        f185669a = bdyx.m91610a(b, "update_install_enable_resume_on_reboot", false);
        f185670b = bdyx.m91610a(b, "update_installation_disable_sim_lock_check", true);
        f185671c = bdyx.m91610a(b, "update_installation_enable_encryption_bypass_for_no_lock_screen_legacy_device", false);
        f185672d = bdyx.m91610a(b, "update_installation_enable_restart_later_lock_screen_prompt", false);
        f185673e = bdyx.m91610a(b, "update_installation_enable_restart_now_lock_screen_prompt", false);
        f185674f = bdyx.m91610a(b, "update_ui_enable_lskf_state_ux", true);
    }

    /* renamed from: a */
    public final boolean mo82689a() {
        return ((Boolean) f185669a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82690b() {
        return ((Boolean) f185670b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82691c() {
        return ((Boolean) f185671c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo82692d() {
        return ((Boolean) f185672d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82693e() {
        return ((Boolean) f185673e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo82694f() {
        return ((Boolean) f185674f.mo58455c()).booleanValue();
    }
}
