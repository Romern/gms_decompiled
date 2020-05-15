package p000;

/* renamed from: chon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chon implements chol {

    /* renamed from: a */
    public static final bdyx f188918a;

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
        bdyw bdyw = new bdyw("com.google.android.westworld");
        f188918a = bdyx.m91610a(bdyw, "awp_enabled", false);
        try {
            bdyx.m91608a(bdyw, "westworld_config_591770101420044721", (bky) GeneratedMessageLite.m124014a(bky.f5051v, new byte[0]), chom.f188917a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"westworld_config_591770101420044721\"");
        }
    }

    /* renamed from: a */
    public final boolean mo85469a() {
        return ((Boolean) f188918a.mo58455c()).booleanValue();
    }
}
