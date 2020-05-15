package p000;

/* renamed from: cfjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfjp implements cfjo {

    /* renamed from: a */
    public static final bdyx f184211a;

    /* renamed from: b */
    public static final bdyx f184212b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.measurement"));
        f184211a = bdyx.m91610a(bdyw, "measurement.collection.efficient_engagement_reporting_enabled_2", false);
        f184212b = bdyx.m91610a(bdyw, "measurement.collection.redundant_engagement_removal_enabled", false);
        bdyx.m91607a(bdyw, "measurement.id.collection.efficient_engagement_reporting_enabled_2", 0L);
    }

    /* renamed from: a */
    public final boolean mo81343a() {
        return ((Boolean) f184211a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81344b() {
        return ((Boolean) f184212b.mo58455c()).booleanValue();
    }
}
