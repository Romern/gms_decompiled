package p000;

/* renamed from: chbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chbw implements chbv {

    /* renamed from: a */
    public static final bdyx f188310a;

    /* renamed from: b */
    public static final bdyx f188311b;

    /* renamed from: c */
    public static final bdyx f188312c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.ulr"));
        f188310a = bdyx.m91610a(bdyw, "Ulr__enable_personalized_place_inference_reporting", false);
        f188311b = bdyx.m91610a(bdyw, "Ulr__enable_place_inference_reporting", false);
        f188312c = bdyx.m91607a(bdyw, "Ulr__place_inference_reporting_priority", 105L);
    }

    /* renamed from: a */
    public final boolean mo84974a() {
        return ((Boolean) f188310a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84975b() {
        return ((Boolean) f188311b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo84976c() {
        return ((Long) f188312c.mo58455c()).longValue();
    }
}
