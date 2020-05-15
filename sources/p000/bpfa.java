package p000;

/* renamed from: bpfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfa implements bxvp {
    KEY_EXCHANGE_UNKNOWN(0),
    KEY_EXCHANGE_SUCCEEDED(1),
    KEY_EXCHANGE_FAILED(2);
    

    /* renamed from: d */
    public final int f137372d;

    private bpfa(int i) {
        this.f137372d = i;
    }

    /* renamed from: a */
    public static bpfa m111855a(int i) {
        if (i == 0) {
            return KEY_EXCHANGE_UNKNOWN;
        }
        if (i == 1) {
            return KEY_EXCHANGE_SUCCEEDED;
        }
        if (i != 2) {
            return null;
        }
        return KEY_EXCHANGE_FAILED;
    }

    /* renamed from: b */
    public static bxvr m111856b() {
        return bpez.f137367a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137372d;
    }

    public final String toString() {
        return Integer.toString(this.f137372d);
    }
}
