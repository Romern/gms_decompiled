package p000;

/* renamed from: cfij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfij implements cfii {

    /* renamed from: a */
    public static final bdyx f184173a;

    /* renamed from: b */
    public static final bdyx f184174b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.measurement"));
        f184173a = bdyx.m91610a(bdyw, "measurement.sdk.dynamite.allow_remote_dynamite", false);
        bdyx.m91610a(bdyw, "measurement.collection.init_params_control_enabled", true);
        f184174b = bdyx.m91610a(bdyw, "measurement.sdk.dynamite.use_dynamite3", false);
        bdyx.m91607a(bdyw, "measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    /* renamed from: a */
    public final boolean mo81312a() {
        return ((Boolean) f184173a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81313b() {
        return ((Boolean) f184174b.mo58455c()).booleanValue();
    }
}
