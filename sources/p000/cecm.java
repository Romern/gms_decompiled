package p000;

/* renamed from: cecm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cecm implements cecl {

    /* renamed from: a */
    public static final bdyx f182256a;

    /* renamed from: b */
    public static final bdyx f182257b;

    /* renamed from: c */
    public static final bdyx f182258c;

    /* renamed from: d */
    public static final bdyx f182259d;

    /* renamed from: e */
    public static final bdyx f182260e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182256a = bdyx.m91610a(bdyw, "gcm_check_user_unlocked_throws_exception", true);
        f182257b = bdyx.m91610a(bdyw, "DirectBoot__dont_unregister_in_direct_boot", true);
        f182258c = bdyx.m91610a(bdyw, "gcm_allow_direct_boot_mode", true);
        f182259d = bdyx.m91610a(bdyw, "gcm_direct_boot_feature", true);
        f182260e = bdyx.m91610a(bdyw, "DirectBoot__retry_token_registration", true);
    }

    /* renamed from: a */
    public final boolean mo78756a() {
        return ((Boolean) f182256a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78757b() {
        return ((Boolean) f182257b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78758c() {
        return ((Boolean) f182258c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78759d() {
        return ((Boolean) f182259d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78760e() {
        return ((Boolean) f182260e.mo58455c()).booleanValue();
    }
}
