package p000;

/* renamed from: ccat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccat implements ccas {

    /* renamed from: a */
    public static final bdyx f178697a;

    /* renamed from: b */
    public static final bdyx f178698b;

    /* renamed from: c */
    public static final bdyx f178699c;

    /* renamed from: d */
    public static final bdyx f178700d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178697a = bdyx.m91610a(a, "Pubsub__account_state_broadcast_receiver_enabled", false);
        f178698b = bdyx.m91610a(a, "Pubsub__credential_state_broadcast_receiver_enabled", false);
        f178699c = bdyx.m91605a(a, "Pubsub__log_sample_percentage", 0.0d);
        f178700d = bdyx.m91607a(a, "Pubsub__oneoff_task_execution_window_size_seconds", 5L);
    }

    /* renamed from: a */
    public final boolean mo75727a() {
        return ((Boolean) f178697a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75728b() {
        return ((Boolean) f178698b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo75729c() {
        return ((Double) f178699c.mo58455c()).doubleValue();
    }

    /* renamed from: d */
    public final long mo75730d() {
        return ((Long) f178700d.mo58455c()).longValue();
    }
}
