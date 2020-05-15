package p000;

/* renamed from: adcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum adcu implements bxvp {
    DEFAULT_PASSWORD_SAVING_FLOW_STEP(0),
    MATCH_PASSWORDS(1),
    ACCOUNT_SELECTION(2),
    ACCOUNT_CONFIRMATION(3),
    SAVE_PASSWORD(4);
    

    /* renamed from: f */
    public final int f61418f;

    private adcu(int i) {
        this.f61418f = i;
    }

    /* renamed from: a */
    public static adcu m50180a(int i) {
        if (i == 0) {
            return DEFAULT_PASSWORD_SAVING_FLOW_STEP;
        }
        if (i == 1) {
            return MATCH_PASSWORDS;
        }
        if (i == 2) {
            return ACCOUNT_SELECTION;
        }
        if (i == 3) {
            return ACCOUNT_CONFIRMATION;
        }
        if (i != 4) {
            return null;
        }
        return SAVE_PASSWORD;
    }

    /* renamed from: b */
    public static bxvr m50181b() {
        return adct.f61411a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f61418f;
    }

    public final String toString() {
        return Integer.toString(this.f61418f);
    }
}
