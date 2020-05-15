package p000;

/* renamed from: cbsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbsf implements cbse {

    /* renamed from: a */
    public static final bdyx f178209a;

    /* renamed from: b */
    public static final bdyx f178210b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178209a = bdyx.m91610a(bdyw, "gads:auto_location_by_dynamite", false);
        f178210b = bdyx.m91610a(bdyw, "gads:auto_location_by_gmscore", true);
    }

    /* renamed from: a */
    public final boolean mo75316a() {
        return ((Boolean) f178209a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75317b() {
        return ((Boolean) f178210b.mo58455c()).booleanValue();
    }
}
