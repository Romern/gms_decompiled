package p000;

/* renamed from: chbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chbd implements chbc {

    /* renamed from: a */
    public static final bdyx f188229a;

    /* renamed from: b */
    public static final bdyx f188230b;

    /* renamed from: c */
    public static final bdyx f188231c;

    /* renamed from: d */
    public static final bdyx f188232d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.udc")).mo58445a("gms.udc.");
        f188229a = bdyx.m91610a(a, "FacsClientFeature__dasu_logging_enabled", false);
        f188230b = bdyx.m91607a(a, "FacsClientFeature__dasu_logging_sampling_interval", 1000L);
        f188231c = bdyx.m91610a(a, "FacsClientFeature__event_logging_enabled", false);
        f188232d = bdyx.m91607a(a, "FacsClientFeature__event_logging_sampling_interval", 1000L);
    }

    /* renamed from: a */
    public final boolean mo84900a() {
        return ((Boolean) f188229a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo84901b() {
        return ((Long) f188230b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo84902c() {
        return ((Boolean) f188231c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo84903d() {
        return ((Long) f188232d.mo58455c()).longValue();
    }
}
