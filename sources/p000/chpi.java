package p000;

/* renamed from: chpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chpi implements chph {

    /* renamed from: a */
    public static final bdyx f188940a;

    /* renamed from: b */
    public static final bdyx f188941b;

    /* renamed from: c */
    public static final bdyx f188942c;

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
        bdyw a = new bdyw("com.google.android.westworld").mo58445a("gms:westworld:");
        f188940a = bdyx.m91607a(a, "data_poll_period_millis", 14400000L);
        f188941b = bdyx.m91607a(a, "init_delay_millis", 3600000L);
        f188942c = bdyx.m91607a(a, "metadata_poll_period_millis", 14400000L);
    }

    /* renamed from: a */
    public final long mo85484a() {
        return ((Long) f188940a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo85485b() {
        return ((Long) f188941b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo85486c() {
        return ((Long) f188942c.mo58455c()).longValue();
    }
}
