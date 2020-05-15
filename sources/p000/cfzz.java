package p000;

/* renamed from: cfzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfzz implements cfzy {

    /* renamed from: a */
    public static final bdyx f186225a;

    /* renamed from: b */
    public static final bdyx f186226b;

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
        f186225a = bdyx.m91610a(bdyw, "MenagerieIdentityApiLogging__menagerie_get_by_ids_enabled", false);
        f186226b = bdyx.m91605a(bdyw, "MenagerieIdentityApiLogging__menagerie_get_by_ids_sample_rate", 0.01d);
        bdyx.m91610a(bdyw, "MenagerieIdentityApiLogging__menagerie_list_operation_endpoint_logging_enabled", false);
        bdyx.m91605a(bdyw, "MenagerieIdentityApiLogging__menagerie_list_operation_endpoint_logging_sample_rate", 0.01d);
    }

    /* renamed from: a */
    public final boolean mo83176a() {
        return ((Boolean) f186225a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final double mo83177b() {
        return ((Double) f186226b.mo58455c()).doubleValue();
    }
}
