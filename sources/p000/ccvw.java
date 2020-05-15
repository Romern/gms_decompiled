package p000;

/* renamed from: ccvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccvw implements ccvv {

    /* renamed from: a */
    public static final bdyx f180048a;

    /* renamed from: b */
    public static final bdyx f180049b;

    /* renamed from: c */
    public static final bdyx f180050c;

    /* renamed from: d */
    public static final bdyx f180051d;

    /* renamed from: e */
    public static final bdyx f180052e;

    /* renamed from: f */
    public static final bdyx f180053f;

    /* renamed from: g */
    public static final bdyx f180054g;

    /* renamed from: h */
    public static final bdyx f180055h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180048a = bdyx.m91610a(bdyw, "force_touchpad_ui_navigation", false);
        f180049b = bdyx.m91607a(bdyw, "TouchpadUiNavigationFeature__touchpad_base_fraction", 6L);
        f180050c = bdyx.m91607a(bdyw, "touchpad_focus_navigation_history_max_age_ms", 4000L);
        f180051d = bdyx.m91607a(bdyw, "touchpad_focus_navigation_history_max_size", 30L);
        f180052e = bdyx.m91607a(bdyw, "TouchpadUiNavigationFeature__touchpad_min_size_mm", 4L);
        f180053f = bdyx.m91607a(bdyw, "TouchpadUiNavigationFeature__touchpad_multimove_penalty_mm", 4L);
        f180054g = bdyx.m91609a(bdyw, "touchpad_sensitivity_override_car_list", "");
        f180055h = bdyx.m91610a(bdyw, "touchpad_tuning_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76887a() {
        return ((Boolean) f180048a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76888b() {
        return ((Long) f180049b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo76889c() {
        return ((Long) f180050c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo76890d() {
        return ((Long) f180051d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76891e() {
        return ((Long) f180052e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76892f() {
        return ((Long) f180053f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo76893g() {
        return (String) f180054g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo76894h() {
        return ((Boolean) f180055h.mo58455c()).booleanValue();
    }
}
