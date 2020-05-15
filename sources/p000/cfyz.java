package p000;

/* renamed from: cfyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfyz implements cfyy {

    /* renamed from: a */
    public static final bdyx f186186a;

    /* renamed from: b */
    public static final bdyx f186187b;

    /* renamed from: c */
    public static final bdyx f186188c;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186186a = bdyx.m91610a(bdyw, "MenagerieBasePeopleApisLogging__menagerie_base_people_api_status_logging_enabled", false);
        f186187b = bdyx.m91610a(bdyw, "MenagerieBasePeopleApisLogging__menagerie_base_people_logging_enabled", false);
        f186188c = bdyx.m91605a(bdyw, "MenagerieBasePeopleApisLogging__menagerie_base_people_logging_sample_rate", 0.01d);
    }

    /* renamed from: a */
    public final boolean mo83149a() {
        return ((Boolean) f186186a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83150b() {
        return ((Boolean) f186187b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo83151c() {
        return ((Double) f186188c.mo58455c()).doubleValue();
    }
}
