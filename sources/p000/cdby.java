package p000;

/* renamed from: cdby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdby implements cdbx {

    /* renamed from: a */
    public static final bdyx f180440a;

    /* renamed from: b */
    public static final bdyx f180441b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.checkin"));
        f180440a = bdyx.m91607a(bdyw, "mininimum_scheduling_delay_ms", 10000L);
        f180441b = bdyx.m91607a(bdyw, "scheduling_delay_buffer", 1000L);
    }

    /* renamed from: a */
    public final long mo77211a() {
        return ((Long) f180440a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77212b() {
        return ((Long) f180441b.mo58455c()).longValue();
    }
}
