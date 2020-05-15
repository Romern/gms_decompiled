package p000;

/* renamed from: cdyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdyz implements cdyy {

    /* renamed from: a */
    public static final bdyx f181993a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        bdyx.m91610a(a, "enable_pluggable_strategy_sample_collector", false);
        f181993a = bdyx.m91610a(a, "keep_wakelock_during_sample_collection", true);
    }

    /* renamed from: a */
    public final boolean mo78524a() {
        return ((Boolean) f181993a.mo58455c()).booleanValue();
    }
}
