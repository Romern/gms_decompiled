package p000;

/* renamed from: blwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blwt implements bxvp {
    DEVICE_BASED_INPUT_TYPE_UNKNOWN(0),
    DEVICE_BASED_INPUT_TYPE_CARD_OCR(1),
    DEVICE_BASED_INPUT_TYPE_NFC(2);
    

    /* renamed from: d */
    public final int f127975d;

    private blwt(int i) {
        this.f127975d = i;
    }

    /* renamed from: a */
    public static blwt m107729a(int i) {
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
    public static bxvr m107730b() {
        return blws.f127970a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127975d;
    }

    public final String toString() {
        return Integer.toString(this.f127975d);
    }
}
