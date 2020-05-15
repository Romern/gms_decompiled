package p000;

/* renamed from: cfzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfzf implements cfze {

    /* renamed from: a */
    public static final bdyx f186194a;

    /* renamed from: b */
    public static final bdyx f186195b;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186194a = bdyx.m91610a(bdyw, "MenagerieDatabaseOperation__catch_cant_open_database_exception", true);
        f186195b = bdyx.m91610a(bdyw, "MenagerieDatabaseOperation__cleanup_stale_pages", true);
        bdyx.m91610a(bdyw, "MenagerieDatabaseOperation__log_cache_vs_account_manager_diff", false);
        bdyx.m91605a(bdyw, "MenagerieDatabaseOperation__log_cache_vs_account_manager_diff_sample_rate", 0.01d);
    }

    /* renamed from: a */
    public final boolean mo83155a() {
        return ((Boolean) f186194a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83156b() {
        return ((Boolean) f186195b.mo58455c()).booleanValue();
    }
}
