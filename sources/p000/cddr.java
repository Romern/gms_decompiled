package p000;

/* renamed from: cddr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cddr implements cddq {

    /* renamed from: a */
    public static final bdyx f180541a;

    /* renamed from: b */
    public static final bdyx f180542b;

    /* renamed from: c */
    public static final bdyx f180543c;

    /* renamed from: d */
    public static final bdyx f180544d;

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
        bdyw bdyw = new bdyw("direct_boot:com.google.android.gms.playlog.uploader");
        f180541a = bdyx.m91607a(bdyw, "ClearcutFunnel__buffer_size", 40960L);
        f180542b = bdyx.m91610a(bdyw, "ClearcutFunnel__discern_bad_request", false);
        f180543c = bdyx.m91610a(bdyw, "ClearcutFunnel__enabled", false);
        f180544d = bdyx.m91607a(bdyw, "ClearcutFunnel__max_retries", 48L);
    }

    /* renamed from: a */
    public final long mo77297a() {
        return ((Long) f180541a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo77298b() {
        return ((Boolean) f180542b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77299c() {
        return ((Boolean) f180543c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77300d() {
        return ((Long) f180544d.mo58455c()).longValue();
    }
}
