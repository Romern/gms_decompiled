package p000;

/* renamed from: bwly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwly implements bxvp {
    UNKNOWN_FEATURE(0),
    ANDROID_LEANBACK(1),
    CAMERA_DOCUMENT_CAPTURE(2),
    ANDROID_WEAR(3),
    ANDROID_VIRTUAL_REALITY_SETUP(4),
    ANDROID_VIRTUAL_REALITY(5),
    ANDROID_FINGERPRINT(6);
    

    /* renamed from: h */
    public final int f160194h;

    private bwly(int i) {
        this.f160194h = i;
    }

    /* renamed from: a */
    public static bwly m122090a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FEATURE;
            case 1:
                return ANDROID_LEANBACK;
            case 2:
                return CAMERA_DOCUMENT_CAPTURE;
            case 3:
                return ANDROID_WEAR;
            case 4:
                return ANDROID_VIRTUAL_REALITY_SETUP;
            case 5:
                return ANDROID_VIRTUAL_REALITY;
            case 6:
                return ANDROID_FINGERPRINT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122091b() {
        return bwlx.f160185a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f160194h;
    }

    public final String toString() {
        return Integer.toString(this.f160194h);
    }
}
