package p000;

/* renamed from: bwlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwlv implements bxvp {
    DEVICE_BASED_INPUT_TYPE_UNKNOWN(0),
    DEVICE_BASED_INPUT_TYPE_CARD_OCR(1),
    DEVICE_BASED_INPUT_TYPE_NFC(2);
    

    /* renamed from: d */
    public final int f160183d;

    private bwlv(int i) {
        this.f160183d = i;
    }

    /* renamed from: a */
    public static bwlv m122085a(int i) {
        if (i == 0) {
            return DEVICE_BASED_INPUT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DEVICE_BASED_INPUT_TYPE_CARD_OCR;
        }
        if (i != 2) {
            return null;
        }
        return DEVICE_BASED_INPUT_TYPE_NFC;
    }

    /* renamed from: b */
    public static bxvr m122086b() {
        return bwlu.f160178a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f160183d;
    }

    public final String toString() {
        return Integer.toString(this.f160183d);
    }
}
