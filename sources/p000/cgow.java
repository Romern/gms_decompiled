package p000;

/* renamed from: cgow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgow implements cgov {

    /* renamed from: a */
    public static final bdyx f187417a;

    /* renamed from: b */
    public static final bdyx f187418b;

    /* renamed from: c */
    public static final bdyx f187419c;

    /* renamed from: d */
    public static final bdyx f187420d;

    /* renamed from: e */
    public static final bdyx f187421e;

    /* renamed from: f */
    public static final bdyx f187422f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187417a = bdyx.m91610a(bdyw, "AutoSupport__add_account_button", false);
        f187418b = bdyx.m91610a(bdyw, "AutoSupport__forbid_unsupported_accounts_from_transferring", false);
        f187419c = bdyx.m91610a(bdyw, "AutoSupport__show_lock_screen_without_prompt", true);
        f187420d = bdyx.m91610a(bdyw, "AutoSupport__source_custom_screens", false);
        f187421e = bdyx.m91607a(bdyw, "AutoSupport__unsupported_accounts_lookup_timeout_ms", 3000L);
        f187422f = bdyx.m91610a(bdyw, "AutoSupport__use_advertisement_options", true);
    }

    /* renamed from: a */
    public final boolean mo84198a() {
        return ((Boolean) f187417a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84199b() {
        return ((Boolean) f187418b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84200c() {
        return ((Boolean) f187419c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84201d() {
        return ((Boolean) f187420d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo84202e() {
        return ((Long) f187421e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo84203f() {
        return ((Boolean) f187422f.mo58455c()).booleanValue();
    }
}
