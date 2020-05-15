package p000;

/* renamed from: cdbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdbp implements cdbo {

    /* renamed from: a */
    public static final bdyx f180429a;

    /* renamed from: b */
    public static final bdyx f180430b;

    /* renamed from: c */
    public static final bdyx f180431c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180429a = bdyx.m91607a(a, "remote_display:bg_check_interval_ms", 200L);
        f180430b = bdyx.m91607a(a, "remote_display:bg_check_refresh_count", 10L);
        f180431c = bdyx.m91609a(a, "remote_display:bg_package_name_whitelist", "com.google.vr.vrcore");
    }

    /* renamed from: a */
    public final long mo77203a() {
        return ((Long) f180429a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77204b() {
        return ((Long) f180430b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo77205c() {
        return (String) f180431c.mo58455c();
    }
}
