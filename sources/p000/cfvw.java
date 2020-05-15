package p000;

/* renamed from: cfvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfvw implements cfvv {

    /* renamed from: a */
    public static final bdyx f185807a;

    /* renamed from: b */
    public static final bdyx f185808b;

    /* renamed from: c */
    public static final bdyx f185809c;

    /* renamed from: d */
    public static final bdyx f185810d;

    /* renamed from: e */
    public static final bdyx f185811e;

    /* renamed from: f */
    public static final bdyx f185812f;

    /* renamed from: g */
    public static final bdyx f185813g;

    /* renamed from: h */
    public static final bdyx f185814h;

    /* renamed from: i */
    public static final bdyx f185815i;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f185807a = bdyx.m91610a(bdyw, "FsaBatteryFeature__contacts_sync_on_charging_event_logging_enabled", true);
        f185808b = bdyx.m91610a(bdyw, "FsaBatteryFeature__disallow_trigger_sync_on_charging_when_full_synced_recently", true);
        f185809c = bdyx.m91610a(bdyw, "FsaBatteryFeature__log_battery_state_enabled", true);
        f185810d = bdyx.m91607a(bdyw, "FsaBatteryFeature__request_full_sync_on_charging_interval_seconds", 604800L);
        f185811e = bdyx.m91607a(bdyw, "FsaBatteryFeature__request_sync_on_charging_interval_seconds", 86400L);
        f185812f = bdyx.m91610a(bdyw, "FsaBatteryFeature__require_wifi_to_trigger_sync_on_charging", true);
        f185813g = bdyx.m91610a(bdyw, "FsaBatteryFeature__skip_sync_on_battery_if_triggered_by_charging", true);
        f185814h = bdyx.m91610a(bdyw, "FsaBatteryFeature__skip_sync_on_charging_logging_enabled", true);
        f185815i = bdyx.m91607a(bdyw, "FsaBatteryFeature__skip_sync_on_charging_max_logging_frequency_in_seconds", 300L);
    }

    /* renamed from: a */
    public final boolean mo82799a() {
        return ((Boolean) f185807a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82800b() {
        return ((Boolean) f185808b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82801c() {
        return ((Boolean) f185809c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo82802d() {
        return ((Long) f185810d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo82803e() {
        return ((Long) f185811e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo82804f() {
        return ((Boolean) f185812f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo82805g() {
        return ((Boolean) f185813g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo82806h() {
        return ((Boolean) f185814h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo82807i() {
        return ((Long) f185815i.mo58455c()).longValue();
    }
}
