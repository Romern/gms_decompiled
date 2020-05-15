package p000;

/* renamed from: cdmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdmd implements cdmc {

    /* renamed from: a */
    public static final bdyx f181222a;

    /* renamed from: b */
    public static final bdyx f181223b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        f181222a = bdyx.m91607a(bdyw, "PaymentsRelease__overall_experiment_id", 0L);
        f181223b = bdyx.m91607a(bdyw, "PaymentsRelease__partition_experiment_id", 0L);
    }

    /* renamed from: a */
    public final long mo77879a() {
        return ((Long) f181222a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77880b() {
        return ((Long) f181223b.mo58455c()).longValue();
    }
}
