package p000;

/* renamed from: cgqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgqr implements cgqp {

    /* renamed from: a */
    public static final bdyx f187522a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187522a = bdyx.m91610a(bdyw, "allow_post_setup_pair", false);
        bdyx.m91610a(bdyw, "use_fake_post_setup_helper_in_debug_build", false);
        bdyx.m91610a(bdyw, "verify_post_setup_caller", false);
        try {
            bdyx.m91608a(bdyw, "whitelist_third_party_clients", (bydj) bxvk.m124014a(bydj.f165795b, new byte[0]), cgqq.f187521a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"whitelist_third_party_clients\"");
        }
    }

    /* renamed from: a */
    public final boolean mo84286a() {
        return ((Boolean) f187522a.mo58455c()).booleanValue();
    }
}
