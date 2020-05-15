package p000;

/* renamed from: xka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xka {
    ANDROID_KEYSTORE((byte) 1),
    SOFTWARE_KEY((byte) 2),
    STRONGBOX_KEY((byte) 3);
    

    /* renamed from: d */
    public final byte f52489d;

    private xka(byte b) {
        this.f52489d = b;
    }

    /* renamed from: a */
    static xka m43078a(byte b) {
        xka xka = ANDROID_KEYSTORE;
        if (b != xka.f52489d) {
            xka = SOFTWARE_KEY;
            if (b != xka.f52489d) {
                xka xka2 = STRONGBOX_KEY;
                if (b == xka2.f52489d) {
                    return xka2;
                }
                throw new IllegalArgumentException("Value is not a known key type.");
            }
        }
        return xka;
    }
}
