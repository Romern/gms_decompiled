package p000;

/* renamed from: cggf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggf implements cgge {

    /* renamed from: a */
    public static final bdyx f186818a;

    /* renamed from: b */
    public static final bdyx f186819b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186818a = bdyx.m91607a(bdyw, "place_index_l1_memory_max_entries", 10L);
        f186819b = bdyx.m91607a(bdyw, "place_index_l2_memory_max_entries", 40L);
    }

    /* renamed from: a */
    public final long mo83680a() {
        return ((Long) f186818a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83681b() {
        return ((Long) f186819b.mo58455c()).longValue();
    }
}
