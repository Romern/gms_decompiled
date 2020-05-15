package p000;

/* renamed from: cfig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfig implements cfif {

    /* renamed from: a */
    public static final bdyx f184169a;

    /* renamed from: b */
    public static final bdyx f184170b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.measurement"));
        f184169a = bdyx.m91610a(bdyw, "measurement.service.configurable_service_limits", false);
        f184170b = bdyx.m91610a(bdyw, "measurement.client.configurable_service_limits", false);
    }

    /* renamed from: a */
    public final boolean mo81308a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo81309b() {
        return ((Boolean) f184169a.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81310c() {
        return ((Boolean) f184170b.mo58455c()).booleanValue();
    }
}
