package p000;

/* renamed from: bwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwj extends bwz {

    /* renamed from: a */
    public static final byte[] f5887a = {-126};

    /* renamed from: b */
    public static final bzu f5888b;

    /* renamed from: c */
    public static final int f5889c = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Transaction ID";
        bzv.f6287b = "For ‘3D Secure Payment’ Transaction:\n=SHA-256(DPAN | Remote Payment Cryptogram)\nData for ‘Full EMV Payment’ Transaction:\n=SHA-256(DPAN | ATC | Application Cryptogram)\n";
        bzv.f6293h = f5889c;
        bzv.f6288c = f5887a;
        f5888b = bzv.mo3629a();
    }

    public bwj(byte[] bArr) {
        super(bArr, f5888b);
    }
}
