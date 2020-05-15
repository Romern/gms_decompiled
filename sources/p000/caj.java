package p000;

/* renamed from: caj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caj extends bwz {

    /* renamed from: a */
    public static final byte[] f6358a = {-97, 55};

    /* renamed from: b */
    public static final bzx f6359b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6360c;

    /* renamed from: d */
    public static final int f6361d = 3;

    /* renamed from: e */
    public static final int f6362e = 2;

    /* renamed from: f */
    public static final int f6363f = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Unpredictable Number";
        bzv.f6287b = "Value to provide variability and uniqueness to the generation of the application cryptogram.";
        bzv.f6293h = f6361d;
        bzv.f6294i = f6362e;
        bzv.f6290e = f6359b;
        bzv.f6288c = f6358a;
        bzv.f6291f = 4;
        bzv.f6295j = f6363f;
        f6360c = bzv.mo3629a();
    }

    public caj(byte[] bArr) {
        super(bArr, f6360c);
    }
}
