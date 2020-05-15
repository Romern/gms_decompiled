package p000;

/* renamed from: cdkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdkc implements cdkb {

    /* renamed from: a */
    public static final bdyx f181088a;

    /* renamed from: b */
    public static final bdyx f181089b;

    /* renamed from: c */
    public static final bdyx f181090c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:common:analytics:");
        f181088a = bdyx.m91610a(a, "CommonAnalytics__system_health_log_post_chimera_update_enabled", true);
        f181089b = bdyx.m91610a(a, "CommonAnalytics__system_health_log_post_gms_core_update_enabled", true);
        f181090c = bdyx.m91610a(a, "CommonAnalytics__system_health_log_post_gservice_update_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo77769a() {
        return ((Boolean) f181088a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77770b() {
        return ((Boolean) f181089b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77771c() {
        return ((Boolean) f181090c.mo58455c()).booleanValue();
    }
}
