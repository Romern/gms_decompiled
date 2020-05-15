package p000;

/* renamed from: bpax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpax implements bxvp {
    UNKNOWN(0),
    HCE_SUPPORTED(1),
    NFC_ENABLED(2),
    DEFAULT_PAYMENT_SERVICE(3),
    ATTESTATION_PASS(4),
    TOKENIZED_FOP(5),
    DEVICE_LOCK(6);
    

    /* renamed from: h */
    public final int f135564h;

    private bpax(int i) {
        this.f135564h = i;
    }

    /* renamed from: a */
    public static bpax m111735a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return HCE_SUPPORTED;
            case 2:
                return NFC_ENABLED;
            case 3:
                return DEFAULT_PAYMENT_SERVICE;
            case 4:
                return ATTESTATION_PASS;
            case 5:
                return TOKENIZED_FOP;
            case 6:
                return DEVICE_LOCK;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111736b() {
        return bpaw.f135555a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135564h;
    }

    public final String toString() {
        return Integer.toString(this.f135564h);
    }
}
