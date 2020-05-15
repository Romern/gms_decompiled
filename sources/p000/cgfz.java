package p000;

/* renamed from: cgfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgfz implements cgfy {

    /* renamed from: a */
    public static final bdyx f186798a;

    /* renamed from: b */
    public static final bdyx f186799b;

    /* renamed from: c */
    public static final bdyx f186800c;

    /* renamed from: d */
    public static final bdyx f186801d;

    /* renamed from: e */
    public static final bdyx f186802e;

    /* renamed from: f */
    public static final bdyx f186803f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186798a = bdyx.m91610a(bdyw, "mdh_disable_requires_charging", false);
        f186799b = bdyx.m91610a(bdyw, "mdh_disable_requires_unmetered", false);
        f186800c = bdyx.m91607a(bdyw, "mdh_push_policy_id", 1L);
        f186801d = bdyx.m91607a(bdyw, "mdh_read_throttling_seconds", 86400L);
        bdyx.m91610a(bdyw, "use_mdh_broadcast_client", false);
        f186802e = bdyx.m91610a(bdyw, "use_mdh_personal_place_info_source", false);
        f186803f = bdyx.m91610a(bdyw, "use_mdh_push_notifications", false);
    }

    /* renamed from: a */
    public final boolean mo83662a() {
        return ((Boolean) f186798a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83663b() {
        return ((Boolean) f186799b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83664c() {
        return ((Long) f186800c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83665d() {
        return ((Long) f186801d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo83666e() {
        return ((Boolean) f186802e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83667f() {
        return ((Boolean) f186803f.mo58455c()).booleanValue();
    }
}
