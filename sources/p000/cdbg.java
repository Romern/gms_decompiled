package p000;

/* renamed from: cdbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdbg implements cdbf {

    /* renamed from: a */
    public static final bdyx f180418a;

    /* renamed from: b */
    public static final bdyx f180419b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180418a = bdyx.m91607a(a, "receiver_control_channel:launch_request_timeout_ms", 65000L);
        f180419b = bdyx.m91607a(a, "receiver_control_channel:request_timeout_ms", 20000L);
    }

    /* renamed from: a */
    public final long mo77195a() {
        return ((Long) f180418a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77196b() {
        return ((Long) f180419b.mo58455c()).longValue();
    }
}
