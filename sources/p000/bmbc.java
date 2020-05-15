package p000;

/* renamed from: bmbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmbc implements bxvp {
    UNKNOWN(0),
    ACCOUNT_NAME(1),
    ACCOUNT_ICON(2),
    RADIO_BUTTON(3);
    

    /* renamed from: e */
    private final int f128523e;

    private bmbc(int i) {
        this.f128523e = i;
    }

    /* renamed from: a */
    public static bmbc m107855a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACCOUNT_NAME;
        }
        if (i == 2) {
            return ACCOUNT_ICON;
        }
        if (i != 3) {
            return null;
        }
        return RADIO_BUTTON;
    }

    /* renamed from: b */
    public static bxvr m107856b() {
        return bmbb.f128517a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128523e;
    }

    public final String toString() {
        return Integer.toString(this.f128523e);
    }
}
