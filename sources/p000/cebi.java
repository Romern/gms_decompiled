package p000;

/* renamed from: cebi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cebi implements cebh {

    /* renamed from: a */
    public static final bdyx f182214a;

    /* renamed from: b */
    public static final bdyx f182215b;

    /* renamed from: c */
    public static final bdyx f182216c;

    /* renamed from: d */
    public static final bdyx f182217d;

    /* renamed from: e */
    public static final bdyx f182218e;

    /* renamed from: f */
    public static final bdyx f182219f;

    /* renamed from: g */
    public static final bdyx f182220g;

    /* renamed from: h */
    public static final bdyx f182221h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.gass")).mo58443a();
        f182214a = bdyx.m91609a(a, "Gass__gp_dgad_uri", "https://www.googleapis.com/androidantiabuse/v1/x/create_lite?alt=PROTO&key=AIzaSyBofcZsgLSS7BOnBjZPEkk4rYwzOIz-lTI");
        f182215b = bdyx.m91610a(a, "Gass__gp_enable", false);
        f182216c = bdyx.m91607a(a, "Gass__gp_fs", 86400L);
        bdyx.m91607a(a, "Gass__gp_fscrv_secs", 86400L);
        f182217d = bdyx.m91607a(a, "Gass__gp_ps", 86400L);
        f182218e = bdyx.m91607a(a, "Gass__gp_dt_backoff_secs", 1800L);
        f182219f = bdyx.m91607a(a, "Gass__gp_dt_max_backoff_secs", 28800L);
        bdyx.m91607a(a, "Gass__gp_pvs_secs", 86400L);
        f182220g = bdyx.m91610a(a, "Gass__gp_rc", true);
        f182221h = bdyx.m91610a(a, "Gass__gp_wifi", true);
    }

    /* renamed from: a */
    public final String mo78724a() {
        return (String) f182214a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78725b() {
        return ((Boolean) f182215b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo78726c() {
        return ((Long) f182216c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78727d() {
        return ((Long) f182217d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo78728e() {
        return ((Long) f182218e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo78729f() {
        return ((Long) f182219f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo78730g() {
        return ((Boolean) f182220g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo78731h() {
        return ((Boolean) f182221h.mo58455c()).booleanValue();
    }
}
