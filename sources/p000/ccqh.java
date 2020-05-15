package p000;

/* renamed from: ccqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqh implements ccqg {

    /* renamed from: a */
    public static final bdyx f179751a;

    /* renamed from: b */
    public static final bdyx f179752b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179751a = bdyx.m91607a(bdyw, "CarModeNewApiFeature__car_mode_priority", 100L);
        f179752b = bdyx.m91610a(bdyw, "CarModeNewApiFeature__use_car_mode_prioritized", false);
    }

    /* renamed from: a */
    public final long mo76639a() {
        return ((Long) f179751a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76640b() {
        return ((Boolean) f179752b.mo58455c()).booleanValue();
    }
}
