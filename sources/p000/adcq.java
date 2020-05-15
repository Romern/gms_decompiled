package p000;

/* renamed from: adcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adcq implements bxvp {
    DEFAULT_AUTHORIZATION_STEP(0),
    RESOLVE_ACCOUNT(1),
    EXTERNAL_ACCOUNT_CHOOSER(2),
    EXTERNAL_REAUTH_ACCOUNT(3),
    AUTH_ACCOUNT(4),
    CONSENT_GET_COOKIES(5),
    CONSENT_SHOW_REMOTE_UI(6),
    EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY(7),
    CONSENT_RECORD_GRANTS(8),
    SET_DEFAULT_ACCOUNT(9),
    BUILD_GOOGLE_SIGN_IN_ACCOUNT(10);
    

    /* renamed from: l */
    public final int f61401l;

    private adcq(int i) {
        this.f61401l = i;
    }

    /* renamed from: a */
    public static adcq m50172a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_AUTHORIZATION_STEP;
            case 1:
                return RESOLVE_ACCOUNT;
            case 2:
                return EXTERNAL_ACCOUNT_CHOOSER;
            case 3:
                return EXTERNAL_REAUTH_ACCOUNT;
            case 4:
                return AUTH_ACCOUNT;
            case 5:
                return CONSENT_GET_COOKIES;
            case 6:
                return CONSENT_SHOW_REMOTE_UI;
            case 7:
                return EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY;
            case 8:
                return CONSENT_RECORD_GRANTS;
            case 9:
                return SET_DEFAULT_ACCOUNT;
            case 10:
                return BUILD_GOOGLE_SIGN_IN_ACCOUNT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m50173b() {
        return adcp.f61388a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61401l;
    }

    public final String toString() {
        return Integer.toString(this.f61401l);
    }
}
