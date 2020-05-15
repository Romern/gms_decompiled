package p000;

/* renamed from: cgvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgvh implements cgvg {

    /* renamed from: a */
    public static final bdyx f187807a;

    /* renamed from: b */
    public static final bdyx f187808b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.subscribedfeeds"));
        f187807a = bdyx.m91607a(bdyw, "subscribedfeeds_certs_gsf", 1L);
        f187808b = bdyx.m91610a(bdyw, "subscribedfeeds_bundled_certs", true);
        bdyx.m91610a(bdyw, "subscribedfeeds_device_certs", true);
        bdyx.m91610a(bdyw, "subscribedfeeds_update_certs_frequently", false);
    }

    /* renamed from: a */
    public final long mo84531a() {
        return ((Long) f187807a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84532b() {
        return ((Boolean) f187808b.mo58455c()).booleanValue();
    }
}
