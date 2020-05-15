package p000;

/* renamed from: cghd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cghd implements cghc {

    /* renamed from: a */
    public static final bdyx f186924a;

    /* renamed from: b */
    public static final bdyx f186925b;

    /* renamed from: c */
    public static final bdyx f186926c;

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
        f186924a = bdyx.m91610a(bdyw, "disable_sending_for_place_updates", false);
        f186925b = bdyx.m91607a(bdyw, "location_request_minimum_interval_millis", 30000L);
        f186926c = bdyx.m91610a(bdyw, "should_ignore_signals_for_place_inference", false);
    }

    /* renamed from: a */
    public final boolean mo83778a() {
        return ((Boolean) f186924a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo83779b() {
        return ((Long) f186925b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo83780c() {
        return ((Boolean) f186926c.mo58455c()).booleanValue();
    }
}
