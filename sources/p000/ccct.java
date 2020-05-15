package p000;

/* renamed from: ccct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccct implements cccs {

    /* renamed from: a */
    public static final bdyx f178763a;

    /* renamed from: b */
    public static final bdyx f178764b;

    /* renamed from: c */
    public static final bdyx f178765c;

    /* renamed from: d */
    public static final bdyx f178766d;

    /* renamed from: e */
    public static final bdyx f178767e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth.api.credentials"));
        f178763a = bdyx.m91607a(bdyw, "GisAssistedSigninUiSettings__maximum_peek_height_percentage", 70L);
        f178764b = bdyx.m91607a(bdyw, "GisAssistedSigninUiSettings__maximum_wait_before_showing_loading_page_ms", 350L);
        f178765c = bdyx.m91607a(bdyw, "GisAssistedSigninUiSettings__minimum_duration_for_showing_loading_page_ms", 1000L);
        f178766d = bdyx.m91610a(bdyw, "GisAssistedSigninUiSettings__skip_password_confirmation_after_account_chooser", true);
        f178767e = bdyx.m91607a(bdyw, "GisAssistedSigninUiSettings__transition_duration_ms", 150L);
    }

    /* renamed from: a */
    public final long mo75775a() {
        return ((Long) f178763a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75776b() {
        return ((Long) f178764b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75777c() {
        return ((Long) f178765c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo75778d() {
        return ((Boolean) f178766d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo75779e() {
        return ((Long) f178767e.mo58455c()).longValue();
    }
}
