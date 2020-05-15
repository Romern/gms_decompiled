package p000;

/* renamed from: cgfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgfq implements cgfp {

    /* renamed from: a */
    public static final bdyx f186743a;

    /* renamed from: b */
    public static final bdyx f186744b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186743a = bdyx.m91610a(bdyw, "enable_using_memory_mapping", false);
        f186744b = bdyx.m91610a(bdyw, "use_mdd_to_download_model_weights", false);
    }

    /* renamed from: a */
    public final boolean mo83610a() {
        return ((Boolean) f186743a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83611b() {
        return ((Boolean) f186744b.mo58455c()).booleanValue();
    }
}
