package p000;

/* renamed from: cczl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cczl implements cczk {

    /* renamed from: a */
    public static final bdyx f180306a;

    /* renamed from: b */
    public static final bdyx f180307b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180306a = bdyx.m91610a(a, "e2e_tests:always_log_discovery_start_event", false);
        f180307b = bdyx.m91610a(a, "e2e_tests:use_fake_wifi_network_id", false);
    }

    /* renamed from: a */
    public final boolean mo77101a() {
        return ((Boolean) f180306a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77102b() {
        return ((Boolean) f180307b.mo58455c()).booleanValue();
    }
}
