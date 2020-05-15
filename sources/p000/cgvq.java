package p000;

/* renamed from: cgvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgvq implements cgvp {

    /* renamed from: a */
    public static final bdyx f187826a;

    /* renamed from: b */
    public static final bdyx f187827b;

    /* renamed from: c */
    public static final bdyx f187828c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187826a = bdyx.m91610a(bdyw, "BugFix__clear_phenotype_flag_cache", true);
        f187827b = bdyx.m91610a(bdyw, "BugFix__disable_widget_click_logging", true);
        f187828c = bdyx.m91610a(bdyw, "BugFix__enable_jp_tsp_ten_card_limit_handling", false);
    }

    /* renamed from: a */
    public final boolean mo84547a() {
        return ((Boolean) f187826a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84548b() {
        return ((Boolean) f187827b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84549c() {
        return ((Boolean) f187828c.mo58455c()).booleanValue();
    }
}
