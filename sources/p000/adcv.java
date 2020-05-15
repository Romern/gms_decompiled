package p000;

/* renamed from: adcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adcv implements bxvp {
    DEFAULT_SAVE_ACCOUNT_LINKING_TOKEN_FLOW_STEP(0),
    SAVE_ACCOUNT_LINKING_TOKEN_ACCOUNT_CHOOSER(1),
    SAVE_ACCOUNT_LINKING_TOKEN_REAUTH_ACCOUNT(2),
    SAVE_ACCOUNT_LINKING_TOKEN_EXTERNAL_CONSENT(3),
    SAVE_ACCOUNT_LINKING_TOKEN_SAVE_TOKEN(4);
    

    /* renamed from: f */
    private final int f61425f;

    private adcv(int i) {
        this.f61425f = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61425f;
    }

    public final String toString() {
        return Integer.toString(this.f61425f);
    }
}
