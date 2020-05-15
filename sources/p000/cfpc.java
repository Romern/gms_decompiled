package p000;

/* renamed from: cfpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfpc implements cfpb {

    /* renamed from: a */
    public static final bdyx f185329a;

    /* renamed from: b */
    public static final bdyx f185330b;

    /* renamed from: c */
    public static final bdyx f185331c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.netrec"));
        f185329a = bdyx.m91610a(bdyw, "Module__enable_notification", false);
        f185330b = bdyx.m91610a(bdyw, "Module__enable_silent_feedback", true);
        f185331c = bdyx.m91605a(bdyw, "Module__silent_feedback_rate", 0.1d);
    }

    /* renamed from: a */
    public final boolean mo82404a() {
        return ((Boolean) f185329a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82405b() {
        return ((Boolean) f185330b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo82406c() {
        return ((Double) f185331c.mo58455c()).doubleValue();
    }
}
