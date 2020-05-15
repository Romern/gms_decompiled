package p000;

/* renamed from: blwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blwy implements bxvp {
    UNKNOWN_FEATURE(0),
    ANDROID_LEANBACK(1),
    CAMERA_DOCUMENT_CAPTURE(2),
    ANDROID_WEAR(3),
    ANDROID_VIRTUAL_REALITY_SETUP(4),
    ANDROID_VIRTUAL_REALITY(5);
    

    /* renamed from: g */
    public final int f127986g;

    private blwy(int i) {
        this.f127986g = i;
    }

    /* renamed from: a */
    public static blwy m107736a(int i) {
        if (i == 0) {
            return UNKNOWN_FEATURE;
        }
        if (i == 1) {
            return ANDROID_LEANBACK;
        }
        if (i == 2) {
            return CAMERA_DOCUMENT_CAPTURE;
        }
        if (i == 3) {
            return ANDROID_WEAR;
        }
        if (i == 4) {
            return ANDROID_VIRTUAL_REALITY_SETUP;
        }
        if (i != 5) {
            return null;
        }
        return ANDROID_VIRTUAL_REALITY;
    }

    /* renamed from: b */
    public static bxvr m107737b() {
        return blwx.f127978a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127986g;
    }

    public final String toString() {
        return Integer.toString(this.f127986g);
    }
}
