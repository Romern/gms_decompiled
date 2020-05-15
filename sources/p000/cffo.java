package p000;

/* renamed from: cffo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cffo implements cffn {

    /* renamed from: a */
    public static final bdyx f183937a;

    /* renamed from: b */
    public static final bdyx f183938b;

    /* renamed from: c */
    public static final bdyx f183939c;

    /* renamed from: d */
    public static final bdyx f183940d;

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
        bdyx.m91610a(a, "TachystickFeature__allow_live_reachability_with_sync_off", false);
        bdyx.m91610a(a, "TachystickFeature__disable_network_monitor", false);
        f183937a = bdyx.m91607a(a, "duo_min_version_code_for_open_action", 2696317L);
        f183938b = bdyx.m91610a(a, "enable_tachystick_call", true);
        bdyx.m91610a(a, "enable_tachystick_clips_capability", false);
        f183939c = bdyx.m91610a(a, "enable_gaia_reachable_calls", false);
        bdyx.m91610a(a, "tachystick_enable_outgoing_knock_knock", false);
        f183940d = bdyx.m91610a(a, "enable_receive_calls_from_gaia", false);
        bdyx.m91610a(a, "enable_receive_clips_from_gaia", false);
        bdyx.m91607a(a, "tachystick_transport_policy_override", 0L);
        bdyx.m91609a(a, "TachystickFeature__tachystick_video_codec", "Auto");
    }

    /* renamed from: a */
    public final long mo81120a() {
        return ((Long) f183937a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo81121b() {
        return ((Boolean) f183938b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81122c() {
        return ((Boolean) f183939c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo81123d() {
        return ((Boolean) f183940d.mo58455c()).booleanValue();
    }
}
