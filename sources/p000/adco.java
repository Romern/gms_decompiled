package p000;

/* renamed from: adco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adco implements bxvp {
    DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP(0),
    FETCH_CREDENTIALS(1),
    CHOOSE_MULTI_CREDENTIAL(2),
    FETCH_TOS_AND_PP(3),
    CHOOSE_SINGLE_CREDENTIAL(4),
    COMPLETE_SIGN_IN_AND_START_CONFIRMATION(5),
    EXTEND_CONFIRMATION(6),
    RECORD_GRANTS(7),
    UPDATE_DEFAULT_ACCOUNT(8);
    

    /* renamed from: j */
    public final int f61387j;

    private adco(int i) {
        this.f61387j = i;
    }

    /* renamed from: a */
    public static adco m50168a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP;
            case 1:
                return FETCH_CREDENTIALS;
            case 2:
                return CHOOSE_MULTI_CREDENTIAL;
            case 3:
                return FETCH_TOS_AND_PP;
            case 4:
                return CHOOSE_SINGLE_CREDENTIAL;
            case 5:
                return COMPLETE_SIGN_IN_AND_START_CONFIRMATION;
            case 6:
                return EXTEND_CONFIRMATION;
            case 7:
                return RECORD_GRANTS;
            case 8:
                return UPDATE_DEFAULT_ACCOUNT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m50169b() {
        return adcn.f61376a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61387j;
    }

    public final String toString() {
        return Integer.toString(this.f61387j);
    }
}
