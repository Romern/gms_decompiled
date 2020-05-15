package p000;

/* renamed from: byk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byk extends bwz {

    /* renamed from: a */
    public static final byte[] f6163a = {95, 40};

    /* renamed from: b */
    public static final bzu f6164b;

    /* renamed from: c */
    public static final int f6165c = 1;

    /* renamed from: d */
    public static final int f6166d = 1;

    /* renamed from: e */
    public static final int f6167e = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Issuer Country Code";
        bzv.f6287b = "Indicates the country of the issuer according to ISO 3166";
        bzv.f6293h = f6165c;
        bzv.f6289d = 2;
        bzv.f6294i = f6166d;
        bzv.f6288c = f6163a;
        bzv.f6295j = f6167e;
        f6164b = bzv.mo3629a();
    }

    public byk(byte[] bArr) {
        super(bArr, f6164b);
    }
}
