package p000;

/* renamed from: cdeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdeu implements cdet {

    /* renamed from: a */
    public static final bdyx f180620a;

    /* renamed from: b */
    public static final bdyx f180621b;

    /* renamed from: c */
    public static final bdyx f180622c;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:uploader:");
        f180620a = bdyx.m91610a(a, "batch_oversize_logs", true);
        f180621b = bdyx.m91610a(a, "batch_qos_tiers", false);
        f180622c = bdyx.m91607a(a, "max_log_requests_batched", 100L);
        bdyx.m91610a(a, "use_batched_log_request", true);
    }

    /* renamed from: a */
    public final boolean mo77364a() {
        return ((Boolean) f180620a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77365b() {
        return ((Boolean) f180621b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo77366c() {
        return ((Long) f180622c.mo58455c()).longValue();
    }
}
