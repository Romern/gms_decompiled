package p000;

/* renamed from: cgfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgfk implements cgfj {

    /* renamed from: a */
    public static final bdyx f186722a;

    /* renamed from: b */
    public static final bdyx f186723b;

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
        f186722a = bdyx.m91610a(bdyw, "enable_contiguous_at_place_segments", true);
        f186723b = bdyx.m91610a(bdyw, "enable_signal_aggregation", false);
    }

    /* renamed from: a */
    public final boolean mo83591a() {
        return ((Boolean) f186722a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83592b() {
        return ((Boolean) f186723b.mo58455c()).booleanValue();
    }
}
