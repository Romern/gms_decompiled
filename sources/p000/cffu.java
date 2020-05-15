package p000;

/* renamed from: cffu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cffu implements cfft {

    /* renamed from: a */
    public static final bdyx f183948a;

    /* renamed from: b */
    public static final bdyx f183949b;

    /* renamed from: c */
    public static final bdyx f183950c;

    /* renamed from: d */
    public static final bdyx f183951d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        bdyx.m91610a(a, "TachystickModularization__route_api_calls_to_duo", true);
        f183948a = bdyx.m91610a(a, "TachystickModularization__selective_disable_tachystick", false);
        bdyx.m91610a(a, "TachystickModularization__show_duo_upgrade_prompts", true);
        f183949b = bdyx.m91610a(a, "TachystickModularization__trigger_register_refresh_on_cap_change", false);
        f183950c = bdyx.m91607a(a, "TachystickModularization__update_caps_execution_window_secs", 86400L);
        f183951d = bdyx.m91610a(a, "TachystickModularization__update_caps_on_activate", false);
    }

    /* renamed from: a */
    public final boolean mo81129a() {
        return ((Boolean) f183948a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81130b() {
        return ((Boolean) f183949b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo81131c() {
        return ((Long) f183950c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo81132d() {
        return ((Boolean) f183951d.mo58455c()).booleanValue();
    }
}
