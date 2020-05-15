package p000;

@Deprecated
/* renamed from: yag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum yag {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");
    

    /* renamed from: c */
    public final String f53526c;

    private yag(String str) {
        this.f53526c = str;
    }

    /* renamed from: a */
    public static yag m43720a(yad yad) {
        int ordinal = yad.ordinal();
        if (ordinal == 0) {
            return REGISTER;
        }
        if (ordinal == 1) {
            return SIGN;
        }
        throw new yac(yad.f53516c);
    }

    public final String toString() {
        return this.f53526c;
    }
}
