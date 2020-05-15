package p000;

/* renamed from: ccpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccpu implements ccpt {

    /* renamed from: a */
    public static final bdyx f179714a;

    /* renamed from: b */
    public static final bdyx f179715b;

    /* renamed from: c */
    public static final bdyx f179716c;

    /* renamed from: d */
    public static final bdyx f179717d;

    /* renamed from: e */
    public static final bdyx f179718e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179714a = bdyx.m91610a(bdyw, "CakewalkFeature__force_finish_enabled", true);
        bdyx.m91607a(bdyw, "CakewalkFeature__frx_cookie_validation_minutes", 5L);
        f179715b = bdyx.m91610a(bdyw, "CakewalkFeature__phase1_enabled", false);
        f179716c = bdyx.m91610a(bdyw, "CakewalkFeature__phase2_enabled", false);
        f179717d = bdyx.m91610a(bdyw, "CakewalkFeature__usb_reset_enabled", false);
        f179718e = bdyx.m91607a(bdyw, "CakewalkFeature__usb_reset_timeout_ms", 3000L);
    }

    /* renamed from: a */
    public final boolean mo76607a() {
        return ((Boolean) f179714a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76608b() {
        return ((Boolean) f179715b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76609c() {
        return ((Boolean) f179716c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76610d() {
        return ((Boolean) f179717d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo76611e() {
        return ((Long) f179718e.mo58455c()).longValue();
    }
}
