package p000;

/* renamed from: cdzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdzc implements cdzb {

    /* renamed from: a */
    public static final bdyx f181996a;

    /* renamed from: b */
    public static final bdyx f181997b;

    /* renamed from: c */
    public static final bdyx f181998c;

    /* renamed from: d */
    public static final bdyx f181999d;

    /* renamed from: e */
    public static final bdyx f182000e;

    /* renamed from: f */
    public static final bdyx f182001f;

    /* renamed from: g */
    public static final bdyx f182002g;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f181996a = bdyx.m91607a(a, "checkbox_consent_refresh_seconds", 3600L);
        f181997b = bdyx.m91607a(a, "checkbox_consent_timeout_seconds", 10L);
        f181998c = bdyx.m91610a(a, "enable_api_logging", false);
        f181999d = bdyx.m91610a(a, "enable_change_logs_uploaded_by_type_logging", true);
        f182000e = bdyx.m91610a(a, "enable_clearcut", true);
        f182001f = bdyx.m91610a(a, "enable_sensor_event_logging", false);
        f182002g = bdyx.m91607a(a, "max_api_log_messages_per_package_per_day", 10L);
    }

    /* renamed from: a */
    public final long mo78526a() {
        return ((Long) f181996a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78527b() {
        return ((Long) f181997b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo78528c() {
        return ((Boolean) f181998c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78529d() {
        return ((Boolean) f181999d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78530e() {
        return ((Boolean) f182000e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo78531f() {
        return ((Boolean) f182001f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo78532g() {
        return ((Long) f182002g.mo58455c()).longValue();
    }
}
