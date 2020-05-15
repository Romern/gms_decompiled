package p000;

/* renamed from: blzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blzp implements bxvp {
    UNKNOWN_PAYMENT_METHOD(0),
    PAYMENT_METHOD_CARD(1),
    PAYMENT_METHOD_TOKENIZED_CARD(2);
    

    /* renamed from: d */
    public final int f128362d;

    private blzp(int i) {
        this.f128362d = i;
    }

    /* renamed from: a */
    public static blzp m107812a(int i) {
        if (i == 0) {
            return UNKNOWN_PAYMENT_METHOD;
        }
        if (i == 1) {
            return PAYMENT_METHOD_CARD;
        }
        if (i != 2) {
            return null;
        }
        return PAYMENT_METHOD_TOKENIZED_CARD;
    }

    /* renamed from: b */
    public static bxvr m107813b() {
        return blzo.f128357a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128362d;
    }

    public final String toString() {
        return Integer.toString(this.f128362d);
    }
}
