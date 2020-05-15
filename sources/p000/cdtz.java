package p000;

/* renamed from: cdtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtz implements cdty {

    /* renamed from: a */
    public static final bdyx f181758a;

    /* renamed from: b */
    public static final bdyx f181759b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.feedback")).mo58443a();
        f181758a = bdyx.m91610a(a, "AndroidFeedback__enable_experiment_token_collection", true);
        f181759b = bdyx.m91607a(a, "AndroidFeedback__token_retrieval_timeout", 10000L);
    }

    /* renamed from: a */
    public final boolean mo78333a() {
        return ((Boolean) f181758a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo78334b() {
        return ((Long) f181759b.mo58455c()).longValue();
    }
}
