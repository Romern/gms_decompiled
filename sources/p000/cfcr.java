package p000;

/* renamed from: cfcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfcr implements cfcq {

    /* renamed from: a */
    public static final bdyx f183633a;

    /* renamed from: b */
    public static final bdyx f183634b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.magictether")).mo58445a("gms:magictether:");
        f183633a = bdyx.m91607a(a, "QTetherApi__tether_timeout_sec", 90L);
        f183634b = bdyx.m91610a(a, "QTetherApi__use_android_q_tether_api", false);
    }

    /* renamed from: a */
    public final long mo80841a() {
        return ((Long) f183633a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo80842b() {
        return ((Boolean) f183634b.mo58455c()).booleanValue();
    }
}
