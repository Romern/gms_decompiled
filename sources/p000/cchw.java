package p000;

/* renamed from: cchw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchw implements cchv {

    /* renamed from: a */
    public static final bdyx f179014a;

    /* renamed from: b */
    public static final bdyx f179015b;

    /* renamed from: c */
    public static final bdyx f179016c;

    /* renamed from: d */
    public static final bdyx f179017d;

    /* renamed from: e */
    public static final bdyx f179018e;

    /* renamed from: f */
    public static final bdyx f179019f;

    /* renamed from: g */
    public static final bdyx f179020g;

    /* renamed from: h */
    public static final bdyx f179021h;

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
        f179014a = bdyx.m91610a(a, "DeviceSyncV2__backfill_from_v1", true);
        f179015b = bdyx.m91607a(a, "DeviceSyncV2__device_sync_key_fetch_timeout", 15L);
        f179016c = bdyx.m91610a(a, "DeviceSyncV2__disable_v1_sync", false);
        f179017d = bdyx.m91610a(a, "DeviceSyncV2__enroll_key", false);
        f179018e = bdyx.m91610a(a, "DeviceSyncV2__read_from_cryptauth", false);
        f179019f = bdyx.m91610a(a, "DeviceSyncV2__register", false);
        f179020g = bdyx.m91607a(a, "DeviceSyncV2__sync_timeout_sec", 45L);
        f179021h = bdyx.m91610a(a, "DeviceSyncV2__use_v2_beacon_seeds", false);
    }

    /* renamed from: a */
    public final boolean mo75981a() {
        return ((Boolean) f179014a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75982b() {
        return ((Long) f179015b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo75983c() {
        return ((Boolean) f179016c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75984d() {
        return ((Boolean) f179017d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75985e() {
        return ((Boolean) f179018e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75986f() {
        return ((Boolean) f179019f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo75987g() {
        return ((Long) f179020g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo75988h() {
        return ((Boolean) f179021h.mo58455c()).booleanValue();
    }
}
