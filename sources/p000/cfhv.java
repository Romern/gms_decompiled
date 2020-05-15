package p000;

/* renamed from: cfhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfhv implements cfhu {

    /* renamed from: a */
    public static final bdyx f184125a;

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
        f184125a = bdyx.m91610a(bdyw, "measurement.androidId.delete_feature", true);
        bdyx.m91610a(bdyw, "measurement.log_androidId_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo81268a() {
        return ((Boolean) f184125a.mo58455c()).booleanValue();
    }
}
