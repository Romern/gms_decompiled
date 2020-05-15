package p000;

/* renamed from: cfrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrt implements cfrs {

    /* renamed from: a */
    public static final bdyx f185528a;

    /* renamed from: b */
    public static final bdyx f185529b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.update"));
        f185528a = bdyx.m91610a(bdyw, "enable_aggresive_space_allocation_for_all_updates", false);
        f185529b = bdyx.m91610a(bdyw, "enable_aggressive_allocation_for_security_updates", true);
    }

    /* renamed from: a */
    public final boolean mo82580a() {
        return ((Boolean) f185528a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82581b() {
        return ((Boolean) f185529b.mo58455c()).booleanValue();
    }
}
