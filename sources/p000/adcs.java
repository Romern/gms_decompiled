package p000;

/* renamed from: adcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adcs implements bxvp {
    DEFAULT_GOOGLE_SIGN_IN_FLOW_STEP(0),
    RETRIEVE_ACCOUNT_LIST(1),
    REAUTH_ACCOUNT(2),
    DISPLAY_CONSENT_SCREEN(3),
    RECORD_CONSENT_GRANT(4),
    UPDATE_DEFAULT_GOOGLE_ACCOUNT(5);
    

    /* renamed from: g */
    public final int f61410g;

    private adcs(int i) {
        this.f61410g = i;
    }

    /* renamed from: a */
    public static adcs m50176a(int i) {
        if (i == 0) {
            return DEFAULT_GOOGLE_SIGN_IN_FLOW_STEP;
        }
        if (i == 1) {
            return RETRIEVE_ACCOUNT_LIST;
        }
        if (i == 2) {
            return REAUTH_ACCOUNT;
        }
        if (i == 3) {
            return DISPLAY_CONSENT_SCREEN;
        }
        if (i == 4) {
            return RECORD_CONSENT_GRANT;
        }
        if (i != 5) {
            return null;
        }
        return UPDATE_DEFAULT_GOOGLE_ACCOUNT;
    }

    /* renamed from: b */
    public static bxvr m50177b() {
        return adcr.f61402a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61410g;
    }

    public final String toString() {
        return Integer.toString(this.f61410g);
    }
}
