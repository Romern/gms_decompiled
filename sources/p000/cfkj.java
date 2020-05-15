package p000;

/* renamed from: cfkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfkj implements cfki {

    /* renamed from: a */
    public static final bdyx f184235a;

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
        bdyx.m91607a(bdyw, "measurement.id.max_bundles_per_iteration", 0L);
        f184235a = bdyx.m91607a(bdyw, "measurement.max_bundles_per_iteration", 1L);
    }

    /* renamed from: a */
    public final boolean mo81359a() {
        return true;
    }

    /* renamed from: b */
    public final long mo81360b() {
        return ((Long) f184235a.mo58455c()).longValue();
    }
}
