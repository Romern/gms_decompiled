package p000;

/* renamed from: bxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxz extends bwz {

    /* renamed from: a */
    public static final byte[] f6075a = {-97, 39};

    /* renamed from: b */
    public static final bzx f6076b = bzx.CHIP;

    /* renamed from: c */
    public static final bzu f6077c;

    /* renamed from: d */
    public static final int f6078d = 3;

    /* renamed from: e */
    public static final int f6079e = 1;

    /* renamed from: f */
    public static final int f6080f = 2;

    /* renamed from: g */
    public static final int f6081g = 6;

    /* renamed from: h */
    public static final int f6082h = 5;

    /* renamed from: i */
    public static final int f6083i = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Cryptogram Information Data";
        bzv.f6287b = "Indicates the type of cryptogram (TC, ARQC, or AAC) returned by the card and the actions to be performed by the reader.";
        bzv.f6293h = f6078d;
        bzv.f6294i = f6079e;
        bzv.f6290e = f6076b;
        bzv.f6289d = 1;
        bzv.f6288c = f6075a;
        bzv.f6295j = f6080f;
        bzv.f6296k = f6081g;
        bzv.f6297l = f6083i;
        bzv.f6298m = f6082h;
        f6077c = bzv.mo3629a();
    }

    public bxz(byte b) {
        this(new byte[]{b});
    }

    public bxz(byte[] bArr) {
        super(bArr, false, f6077c);
    }
}
