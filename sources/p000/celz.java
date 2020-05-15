package p000;

/* renamed from: celz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class celz implements cely {

    /* renamed from: a */
    public static final bdyx f182930a;

    /* renamed from: b */
    public static final bdyx f182931b;

    /* renamed from: c */
    public static final bdyx f182932c;

    /* renamed from: d */
    public static final bdyx f182933d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        f182930a = bdyx.m91610a(bdyw, "gms_icing_enable_sherlog", false);
        f182931b = bdyx.m91610a(bdyw, "gms_icing_enable_task_tracker", false);
        f182932c = bdyx.m91610a(bdyw, "gms_icing_enable_wake_lock_watchdog", false);
        f182933d = bdyx.m91610a(bdyw, "gms_icing_show_1p_features_in_debug_ui", false);
    }

    /* renamed from: a */
    public final boolean mo79294a() {
        return ((Boolean) f182930a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79295b() {
        return ((Boolean) f182931b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79296c() {
        return ((Boolean) f182932c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79297d() {
        return ((Boolean) f182933d.mo58455c()).booleanValue();
    }
}
