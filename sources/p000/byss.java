package p000;

/* renamed from: byss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byss {
    HMAC_SHA256(1, "HmacSHA256", false),
    ECDSA_P256_SHA256(2, "SHA256withECDSA", true),
    RSA2048_SHA256(3, "SHA256withRSA", true);
    

    /* renamed from: d */
    public final String f167609d;

    /* renamed from: e */
    public final boolean f167610e;

    /* renamed from: f */
    public final int f167611f;

    private byss(int i, String str, boolean z) {
        this.f167611f = i;
        this.f167609d = str;
        this.f167610e = z;
    }
}
