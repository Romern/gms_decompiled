package p000;

/* renamed from: chic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chic implements chhz {

    /* renamed from: a */
    public static final bdyx f188638a;

    /* renamed from: b */
    public static final bdyx f188639b;

    /* renamed from: c */
    public static final bdyx f188640c;

    /* renamed from: d */
    public static final bdyx f188641d;

    /* renamed from: e */
    public static final bdyx f188642e;

    /* renamed from: f */
    public static final bdyx f188643f;

    /* renamed from: g */
    public static final bdyx f188644g;

    /* renamed from: h */
    public static final bdyx f188645h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188638a = bdyx.m91610a(bdyw, "InstantbuyFeatures__convert_legacy_instantbuy_request_to_json", false);
        f188639b = bdyx.m91610a(bdyw, "InstantbuyFeatures__disable_redirect_to_bender3_if_multi_account", true);
        bdyx.m91610a(bdyw, "androidpay.enable_buy_flow_template_prefetch", true);
        bdyx.m91610a(bdyw, "androidpay.use_preferred_account_from_json_params", false);
        try {
            f188640c = bdyx.m91608a(bdyw, "InstantbuyFeatures__integrators_redirect_to_bender3", (bydj) bxvk.m124014a(bydj.f165795b, new byte[0]), chia.f188636a);
            try {
                f188641d = bdyx.m91608a(bdyw, "InstantbuyFeatures__integrators_redirect_to_bender3_from_ib_service", (bydj) bxvk.m124014a(bydj.f165795b, new byte[0]), chib.f188637a);
                f188642e = bdyx.m91610a(bdyw, "InstantbuyFeatures__populate_transaction_info_from_cart", false);
                f188643f = bdyx.m91610a(bdyw, "InstantbuyFeatures__redirect_to_bender3", false);
                f188644g = bdyx.m91610a(bdyw, "InstantbuyFeatures__redirect_to_bender3_from_ib_service", false);
                f188645h = bdyx.m91610a(bdyw, "InstantbuyFeatures__use_guess_based_template_for_v1_web", false);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"InstantbuyFeatures__integrators_redirect_to_bender3_from_ib_service\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"InstantbuyFeatures__integrators_redirect_to_bender3\"");
        }
    }

    /* renamed from: a */
    public final boolean mo85246a() {
        return ((Boolean) f188638a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85247b() {
        return ((Boolean) f188639b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final bydj mo85248c() {
        return (bydj) f188640c.mo58455c();
    }

    /* renamed from: d */
    public final bydj mo85249d() {
        return (bydj) f188641d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo85250e() {
        return ((Boolean) f188642e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo85251f() {
        return ((Boolean) f188643f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo85252g() {
        return ((Boolean) f188644g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo85253h() {
        return ((Boolean) f188645h.mo58455c()).booleanValue();
    }
}
