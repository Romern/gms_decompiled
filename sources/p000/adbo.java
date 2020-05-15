package p000;

/* renamed from: adbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adbo implements bxvp {
    DEFAULT_SIGNIN_STEP(0),
    FETCH_TOS_AND_PP(1),
    CHOOSE_ACCOUNT(2),
    RECORD_ACCOUNT_CHIP_CONSENT(3),
    PRE_CONSENT(4),
    CONSENT(5),
    SAVE_SELECTED_ACCOUNT(6),
    FALLBACK(7);
    

    /* renamed from: i */
    public final int f61343i;

    private adbo(int i) {
        this.f61343i = i;
    }

    /* renamed from: a */
    public static adbo m50126a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_SIGNIN_STEP;
            case 1:
                return FETCH_TOS_AND_PP;
            case 2:
                return CHOOSE_ACCOUNT;
            case 3:
                return RECORD_ACCOUNT_CHIP_CONSENT;
            case 4:
                return PRE_CONSENT;
            case 5:
                return CONSENT;
            case 6:
                return SAVE_SELECTED_ACCOUNT;
            case 7:
                return FALLBACK;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m50127b() {
        return adbn.f61333a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61343i;
    }

    public final String toString() {
        return Integer.toString(this.f61343i);
    }
}
