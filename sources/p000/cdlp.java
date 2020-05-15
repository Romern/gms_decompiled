package p000;

/* renamed from: cdlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdlp implements cdlo {

    /* renamed from: a */
    public static final bdyx f181203a;

    /* renamed from: b */
    public static final bdyx f181204b;

    /* renamed from: c */
    public static final bdyx f181205c;

    /* renamed from: d */
    public static final bdyx f181206d;

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
        f181203a = bdyx.m91610a(bdyw, "Grpc__enable_android_channel_builder", false);
        f181204b = bdyx.m91610a(bdyw, "Grpc__enable_android_channel_network_monitoring", false);
        f181205c = bdyx.m91610a(bdyw, "Grpc__enable_clear_thread_stats_after_execute", false);
        f181206d = bdyx.m91607a(bdyw, "Grpc__grpc_idle_timeout_ms", 1800000L);
    }

    /* renamed from: a */
    public final boolean mo77865a() {
        return ((Boolean) f181203a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77866b() {
        return ((Boolean) f181204b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77867c() {
        return ((Boolean) f181205c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77868d() {
        return ((Long) f181206d.mo58455c()).longValue();
    }
}
