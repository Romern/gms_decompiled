package p000;

/* renamed from: ccqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqw implements ccqv {

    /* renamed from: a */
    public static final bdyx f179775a;

    /* renamed from: b */
    public static final bdyx f179776b;

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
        f179775a = bdyx.m91610a(bdyw, "CrashReporting__disable_binder_death_crash_reporting", true);
        f179776b = bdyx.m91610a(bdyw, "CrashReporting__enable_feedback_experiment_tokens", true);
    }

    /* renamed from: a */
    public final boolean mo76658a() {
        return ((Boolean) f179775a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76659b() {
        return ((Boolean) f179776b.mo58455c()).booleanValue();
    }
}
