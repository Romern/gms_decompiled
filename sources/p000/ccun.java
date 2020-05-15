package p000;

/* renamed from: ccun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccun implements ccum {

    /* renamed from: a */
    public static final bdyx f179986a;

    /* renamed from: b */
    public static final bdyx f179987b;

    /* renamed from: c */
    public static final bdyx f179988c;

    /* renamed from: d */
    public static final bdyx f179989d;

    /* renamed from: e */
    public static final bdyx f179990e;

    /* renamed from: f */
    public static final bdyx f179991f;

    /* renamed from: g */
    public static final bdyx f179992g;

    /* renamed from: h */
    public static final bdyx f179993h;

    /* renamed from: i */
    public static final bdyx f179994i;

    /* renamed from: j */
    public static final bdyx f179995j;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.car")).mo58445a("gearhead:");
        f179986a = bdyx.m91609a(a, "bt_autolaunch_allowed_devices", "PROF=[],MAJ=400;PROF=[],MAJ=500;PROF*=110b;PROF*=111e;PROF*=1108");
        f179987b = bdyx.m91607a(a, "delayed_autostart_timeout", 180000L);
        f179988c = bdyx.m91609a(a, "driving_mode_behavior_whitelist", "com.google.android.projection.bumblebee,com.google.android.gms");
        bdyx.m91607a(a, "driving_mode_config_copier_delay_ms", 30000L);
        f179989d = bdyx.m91610a(a, "driving_mode_ignore_non_bonded_devices", true);
        f179990e = bdyx.m91607a(a, "driving_mode_launch_notification_cancel_delay_ms", 1800000L);
        f179991f = bdyx.m91607a(a, "driving_mode_launch_notification_countdown_ms", 15000L);
        f179992g = bdyx.m91607a(a, "driving_mode_launch_notification_snooze_duration_ms", 60000L);
        f179993h = bdyx.m91610a(a, "driving_mode_prompt_enabled", true);
        f179994i = bdyx.m91607a(a, "drivingmode_gearhead_version", 31000000L);
        f179995j = bdyx.m91610a(a, "enable_vehicle_exit_transition_on_foot", true);
    }

    /* renamed from: a */
    public final String mo76836a() {
        return (String) f179986a.mo58455c();
    }

    /* renamed from: b */
    public final long mo76837b() {
        return ((Long) f179987b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo76838c() {
        return (String) f179988c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo76839d() {
        return ((Boolean) f179989d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo76840e() {
        return ((Long) f179990e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76841f() {
        return ((Long) f179991f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo76842g() {
        return ((Long) f179992g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo76843h() {
        return ((Boolean) f179993h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo76844i() {
        return ((Long) f179994i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo76845j() {
        return ((Boolean) f179995j.mo58455c()).booleanValue();
    }
}
