package p000;

/* renamed from: chio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chio implements chin {

    /* renamed from: a */
    public static final bdyx f188657a;

    /* renamed from: b */
    public static final bdyx f188658b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188657a = bdyx.m91607a(bdyw, "PaymentsCallbackSettings__payments_callback_minimum_latency_millis", 500L);
        f188658b = bdyx.m91607a(bdyw, "PaymentsCallbackSettings__payments_callback_timeout", 10000L);
    }

    /* renamed from: a */
    public final long mo85261a() {
        return ((Long) f188657a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo85262b() {
        return ((Long) f188658b.mo58455c()).longValue();
    }
}
