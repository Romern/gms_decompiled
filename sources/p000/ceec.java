package p000;

/* renamed from: ceec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceec implements ceeb {

    /* renamed from: a */
    public static final bdyx f182430a;

    /* renamed from: b */
    public static final bdyx f182431b;

    /* renamed from: c */
    public static final bdyx f182432c;

    /* renamed from: d */
    public static final bdyx f182433d;

    /* renamed from: e */
    public static final bdyx f182434e;

    /* renamed from: f */
    public static final bdyx f182435f;

    /* renamed from: g */
    public static final bdyx f182436g;

    /* renamed from: h */
    public static final bdyx f182437h;

    /* renamed from: i */
    public static final bdyx f182438i;

    /* renamed from: j */
    public static final bdyx f182439j;

    /* renamed from: k */
    public static final bdyx f182440k;

    /* renamed from: l */
    public static final bdyx f182441l;

    /* renamed from: m */
    public static final bdyx f182442m;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        bdyx.m91610a(bdyw, "nts.enable_doze_light_restrictions", true);
        f182430a = bdyx.m91610a(bdyw, "nts.enable_dynamic_network_observer_registration", false);
        f182431b = bdyx.m91610a(bdyw, "nts.enable_network_callback_observer", false);
        bdyx.m91610a(bdyw, "nts.enable_network_validation", false);
        f182432c = bdyx.m91610a(bdyw, "nts.enable_power_saver_restrictions", true);
        f182433d = bdyx.m91610a(bdyw, "nts.enable_skipping_standalone_prewakeup_capacity_check", false);
        f182434e = bdyx.m91610a(bdyw, "nts.enable_wakeup_rate_limiting", false);
        f182435f = bdyx.m91607a(bdyw, "nts.max_gmscore_tasks_per_user", -1L);
        f182436g = bdyx.m91607a(bdyw, "nts.max_gmscore_tasks_per_user_busy", -1L);
        f182437h = bdyx.m91607a(bdyw, "nts.max_tasks_per_1p_package", 200L);
        f182438i = bdyx.m91607a(bdyw, "nts.max_tasks_per_package", 100L);
        f182439j = bdyx.m91607a(bdyw, "nts.max_tasks_per_user", 2L);
        f182440k = bdyx.m91607a(bdyw, "nts.max_tasks_per_user_busy", 2L);
        f182441l = bdyx.m91610a(bdyw, "nts.scheduler_active", true);
        bdyx.m91610a(bdyw, "nts.strip_3p_details_from_clearcut", true);
        f182442m = bdyx.m91607a(bdyw, "nts.wakeup_rate_limiting_min_delay_secs", 5L);
    }

    /* renamed from: a */
    public final boolean mo78916a() {
        return ((Boolean) f182430a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78917b() {
        return ((Boolean) f182431b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78918c() {
        return ((Boolean) f182432c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78919d() {
        return ((Boolean) f182433d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78920e() {
        return ((Boolean) f182434e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo78921f() {
        return ((Long) f182435f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo78922g() {
        return ((Long) f182436g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo78923h() {
        return ((Long) f182437h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo78924i() {
        return ((Long) f182438i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo78925j() {
        return ((Long) f182439j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo78926k() {
        return ((Long) f182440k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo78927l() {
        return ((Boolean) f182441l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final long mo78928m() {
        return ((Long) f182442m.mo58455c()).longValue();
    }
}
