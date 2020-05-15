package p000;

/* renamed from: ccrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccrf implements ccre {

    /* renamed from: a */
    public static final bdyx f179785a;

    /* renamed from: b */
    public static final bdyx f179786b;

    /* renamed from: c */
    public static final bdyx f179787c;

    /* renamed from: d */
    public static final bdyx f179788d;

    /* renamed from: e */
    public static final bdyx f179789e;

    /* renamed from: f */
    public static final bdyx f179790f;

    /* renamed from: g */
    public static final bdyx f179791g;

    /* renamed from: h */
    public static final bdyx f179792h;

    /* renamed from: i */
    public static final bdyx f179793i;

    /* renamed from: j */
    public static final bdyx f179794j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179785a = bdyx.m91610a(bdyw, "always_route_dnd_rule_to_driving_mode", false);
        bdyx.m91610a(bdyw, "copy_driving_mode_settings", false);
        f179786b = bdyx.m91610a(bdyw, "driving_mode_activity_transition_allow_test_events", false);
        f179787c = bdyx.m91609a(bdyw, "driving_mode_activity_transition_allowed_behaviors", "car_pref_key_driving_mode_behavior_dnd_preference");
        f179788d = bdyx.m91610a(bdyw, "driving_mode_activity_transition_auto_launch", false);
        f179789e = bdyx.m91610a(bdyw, "driving_mode_client_api_enabled", false);
        f179790f = bdyx.m91610a(bdyw, "driving_mode_setting_enabled", false);
        f179791g = bdyx.m91609a(bdyw, "driving_mode_toggle_whitelist", "com.google.android.gms,com.google.android.projection.gearhead");
        bdyx.m91610a(bdyw, "enable_driving_mode_exit_with_audio_fusion", false);
        f179792h = bdyx.m91610a(bdyw, "enable_driving_mode_with_audio_fusion", false);
        f179793i = bdyx.m91610a(bdyw, "force_driving_mode_frx_rerun", false);
        f179794j = bdyx.m91610a(bdyw, "only_rely_on_audio_based_activity_recognition", false);
    }

    /* renamed from: a */
    public final boolean mo76665a() {
        return ((Boolean) f179785a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76666b() {
        return ((Boolean) f179786b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo76667c() {
        return (String) f179787c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo76668d() {
        return ((Boolean) f179788d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76669e() {
        return ((Boolean) f179789e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76670f() {
        return ((Boolean) f179790f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final String mo76671g() {
        return (String) f179791g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo76672h() {
        return ((Boolean) f179792h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo76673i() {
        return ((Boolean) f179793i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo76674j() {
        return ((Boolean) f179794j.mo58455c()).booleanValue();
    }
}
