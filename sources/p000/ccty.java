package p000;

/* renamed from: ccty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccty implements cctw {

    /* renamed from: a */
    public static final bdyx f179914a;

    /* renamed from: b */
    public static final bdyx f179915b;

    /* renamed from: c */
    public static final bdyx f179916c;

    /* renamed from: d */
    public static final bdyx f179917d;

    /* renamed from: e */
    public static final bdyx f179918e;

    /* renamed from: f */
    public static final bdyx f179919f;

    /* renamed from: g */
    public static final bdyx f179920g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        bdyx.m91607a(bdyw, "GearheadCarServiceFeature__consecutive_delegate_reacquisition_failure_limit", 0L);
        bdyx.m91607a(bdyw, "GearheadCarServiceFeature__delegate_setting_timeout_ms", 5000L);
        f179914a = bdyx.m91610a(bdyw, "GearheadCarServiceFeature__enable_telemetry_logging_on_thread_stuck", true);
        bdyx.m91610a(bdyw, "GearheadCarServiceFeature__fast_fail_on_dead_remote_car_service", true);
        bdyx.m91610a(bdyw, "GearheadCarServiceFeature__get_delegate_via_cxless", false);
        f179915b = bdyx.m91610a(bdyw, "GearheadCarServiceFeature__initialize_features_earlier_enabled", false);
        f179916c = bdyx.m91610a(bdyw, "GearheadCarServiceFeature__initialize_features_in_complete_startup_enabled", true);
        bdyx.m91609a(bdyw, "GearheadCarServiceFeature__minversions_met", "");
        f179917d = bdyx.m91607a(bdyw, "GearheadCarServiceFeature__settings_migration_iteration", 0L);
        f179918e = bdyx.m91610a(bdyw, "GearheadCarServiceFeature__should_initiate_settings_migration", false);
        try {
            f179919f = bdyx.m91608a(bdyw, "GearheadCarServiceFeature__startup_service_allowed_callers", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 38, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 111, 106, 101, 99, 116, 105, 111, 110, 46, 103, 101, 97, 114, 104, 101, 97, 100}), cctx.f179913a);
            f179920g = bdyx.m91610a(bdyw, "GearheadCarServiceFeature__use_gearhead_for_projection", false);
            bdyx.m91610a(bdyw, "GearheadCarServiceFeature__use_settings_from_gearhead", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"GearheadCarServiceFeature__startup_service_allowed_callers\"");
        }
    }

    /* renamed from: a */
    public final boolean mo76769a() {
        return ((Boolean) f179914a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76770b() {
        return ((Boolean) f179915b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76771c() {
        return ((Boolean) f179916c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76772d() {
        return ((Long) f179917d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo76773e() {
        return ((Boolean) f179918e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final bydj mo76774f() {
        return (bydj) f179919f.mo58455c();
    }

    /* renamed from: g */
    public final boolean mo76775g() {
        return ((Boolean) f179920g.mo58455c()).booleanValue();
    }
}
