package p000;

/* renamed from: cgoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgoq implements cgop {

    /* renamed from: a */
    public static final bdyx f187403a;

    /* renamed from: b */
    public static final bdyx f187404b;

    /* renamed from: c */
    public static final bdyx f187405c;

    /* renamed from: d */
    public static final bdyx f187406d;

    /* renamed from: e */
    public static final bdyx f187407e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.smart_profile")).mo58443a();
        f187403a = bdyx.m91610a(a, "SmartProfile__allow_client_to_hide_cards_with_local_data", true);
        bdyx.m91610a(a, "SmartProfile__enable_cards_fragment_startup_fix", true);
        f187404b = bdyx.m91610a(a, "SmartProfile__hide_quick_actions_for_voice", true);
        bdyx.m91610a(a, "SmartProfile__is_launch_test_feature_enabled", false);
        bdyx.m91610a(a, "SmartProfile__legacy_bugfix_to_avoid_duplicate_generic_cards", true);
        f187405c = bdyx.m91610a(a, "SmartProfile__merge_card", true);
        f187406d = bdyx.m91610a(a, "SmartProfile__reporting_chain_card", true);
        f187407e = bdyx.m91610a(a, "SmartProfile__use_generic_card_bugfix", true);
        bdyx.m91610a(a, "SmartProfile__v2", true);
    }

    /* renamed from: a */
    public final boolean mo84186a() {
        return ((Boolean) f187403a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84187b() {
        return ((Boolean) f187404b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84188c() {
        return ((Boolean) f187405c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84189d() {
        return ((Boolean) f187406d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo84190e() {
        return ((Boolean) f187407e.mo58455c()).booleanValue();
    }
}
