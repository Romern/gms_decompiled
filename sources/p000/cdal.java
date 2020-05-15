package p000;

/* renamed from: cdal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdal implements cdak {

    /* renamed from: a */
    public static final bdyx f180381a;

    /* renamed from: b */
    public static final bdyx f180382b;

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
        f180381a = bdyx.m91607a(a, "multicast:broadcast_port", 32344L);
        f180382b = bdyx.m91607a(a, "multicast:wrapped_sender_key_request_timeout_in_ms", 2000L);
    }

    /* renamed from: a */
    public final long mo77166a() {
        return ((Long) f180381a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77167b() {
        return ((Long) f180382b.mo58455c()).longValue();
    }
}
