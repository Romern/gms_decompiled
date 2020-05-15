package p000;

/* renamed from: ccht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccht implements cchs {

    /* renamed from: a */
    public static final bdyx f179001a;

    /* renamed from: b */
    public static final bdyx f179002b;

    /* renamed from: c */
    public static final bdyx f179003c;

    /* renamed from: d */
    public static final bdyx f179004d;

    /* renamed from: e */
    public static final bdyx f179005e;

    /* renamed from: f */
    public static final bdyx f179006f;

    /* renamed from: g */
    public static final bdyx f179007g;

    /* renamed from: h */
    public static final bdyx f179008h;

    /* renamed from: i */
    public static final bdyx f179009i;

    /* renamed from: j */
    public static final bdyx f179010j;

    /* renamed from: k */
    public static final bdyx f179011k;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f179001a = bdyx.m91610a(a, "ProximityAuth__cryptauth_v2_enrollment_from_proximity_auth", true);
        f179002b = bdyx.m91610a(a, "ProximityAuth__device_sync_from_proximity_auth", true);
        f179003c = bdyx.m91610a(a, "DeviceSyncFromProximityauth__disable_authzen_periodic_sync", false);
        f179004d = bdyx.m91610a(a, "DeviceSyncFromProximityauth__enable_force_sync_operation", true);
        bdyx.m91610a(a, "DeviceSyncFromProximityauth__force_sync_using_external_device_info_db", false);
        f179005e = bdyx.m91607a(a, "DeviceSyncFromProximityauth__initial_retry_backoff_interval", 3600L);
        f179006f = bdyx.m91607a(a, "DeviceSyncFromProximityauth__max_external_devices_per_account", 50L);
        f179007g = bdyx.m91607a(a, "DeviceSyncFromProximityauth__max_retry_backoff_interval", 259200L);
        f179008h = bdyx.m91607a(a, "DeviceSyncFromProximityauth__periodic_sync_flex", 1800L);
        f179009i = bdyx.m91607a(a, "DeviceSyncFromProximityauth__periodic_sync_frequency", 2592000L);
        f179010j = bdyx.m91610a(a, "DeviceSyncFromProximityauth__periodic_sync_from_proximity_auth", false);
        f179011k = bdyx.m91610a(a, "ProximityAuth__read_from_external_device_info_db", true);
    }

    /* renamed from: a */
    public final boolean mo75969a() {
        return ((Boolean) f179001a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75970b() {
        return ((Boolean) f179002b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75971c() {
        return ((Boolean) f179003c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75972d() {
        return ((Boolean) f179004d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo75973e() {
        return ((Long) f179005e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo75974f() {
        return ((Long) f179006f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo75975g() {
        return ((Long) f179007g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo75976h() {
        return ((Long) f179008h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo75977i() {
        return ((Long) f179009i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo75978j() {
        return ((Boolean) f179010j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo75979k() {
        return ((Boolean) f179011k.mo58455c()).booleanValue();
    }
}
