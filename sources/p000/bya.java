package p000;

/* renamed from: bya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bya extends bwz {

    /* renamed from: a */
    public static final byte[] f6084a = {-33, 33};

    /* renamed from: b */
    public static final bzx f6085b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6086c;

    /* renamed from: d */
    public static final int f6087d = 3;

    /* renamed from: e */
    public static final int f6088e = 1;

    /* renamed from: f */
    public static final int f6089f = 2;

    /* renamed from: g */
    public static final int f6090g = 3;

    /* renamed from: h */
    public static final int f6091h = 5;

    /* renamed from: i */
    public static final int f6092i = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Cryptogram Version Number";
        bzv.f6287b = "Visa proprietary data element indicating the version of the Application Cryptogram algorithm used by the application. Transmitted in the Issuer Application Data.";
        bzv.f6293h = f6087d;
        bzv.f6294i = f6088e;
        bzv.f6290e = f6085b;
        bzv.f6289d = 1;
        bzv.f6288c = f6084a;
        bzv.f6295j = f6089f;
        bzv.f6296k = f6090g;
        bzv.f6297l = f6092i;
        bzv.f6298m = f6091h;
        f6086c = bzv.mo3629a();
    }

    public bya() {
        this(new byte[]{-127}, false);
    }

    public bya(byte[] bArr, boolean z) {
        super(bArr, z, f6086c);
    }
}
