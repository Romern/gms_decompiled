package p000;

/* renamed from: cbxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbxn implements cbxm {

    /* renamed from: a */
    public static final bdyx f178519a;

    /* renamed from: b */
    public static final bdyx f178520b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178519a = bdyx.m91610a(a, "CachedLoaders__use_cache_result_for_pre_add_account", true);
        f178520b = bdyx.m91610a(a, "CachedLoaders__use_cache_result_for_token_activity", true);
    }

    /* renamed from: a */
    public final boolean mo75579a() {
        return ((Boolean) f178519a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75580b() {
        return ((Boolean) f178520b.mo58455c()).booleanValue();
    }
}
