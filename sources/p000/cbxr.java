package p000;

/* renamed from: cbxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbxr implements cbxp {

    /* renamed from: a */
    public static final bdyx f178524a;

    /* renamed from: b */
    public static final bdyx f178525b;

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
        bdyx.m91610a(a, "CarSignInFlow__enable_android_signin_option", true);
        bdyx.m91610a(a, "CarSignInFlow__enable_iPhone_signin_option", true);
        bdyx.m91610a(a, "CarSignInFlow__enable_multi_signin_options", true);
        bdyx.m91609a(a, "CarSignInFlow__magic_wand_url", "https://accounts.google.com/embedded/seconddevice/androidauto");
        bdyx.m91610a(a, "CarSignInFlow__no_fast_pair_instructions_on_single_ble_advertiser", true);
        try {
            f178524a = bdyx.m91608a(a, "CarSignInFlow__no_history_for_minute_maid", (bqzq) GeneratedMessageLite.m124014a(bqzq.f142077c, new byte[]{10, 2, 8, 0, 18, 2, 8, 1}), cbxq.f178523a);
            bdyx.m91610a(a, "CarSignInFlow__only_allow_one_account", true);
            bdyx.m91610a(a, "CarSignInFlow__pass_setup_wizard_state_to_signed_in_activity", true);
            bdyx.m91610a(a, "CarSignInFlow__pre_generate_deeplink_pairing_code", true);
            bdyx.m91610a(a, "CarSignInFlow__skip_pre_add_account_activity", true);
            f178525b = bdyx.m91610a(a, "CarSignInFlow__use_auto_auth_delegate", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"CarSignInFlow__no_history_for_minute_maid\"");
        }
    }

    /* renamed from: a */
    public final bqzq mo75582a() {
        return (bqzq) f178524a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75583b() {
        return ((Boolean) f178525b.mo58455c()).booleanValue();
    }
}
