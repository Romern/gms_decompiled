package p000;

/* renamed from: buf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buf extends bwz {

    /* renamed from: a */
    public static final byte[] f5609a = {-97, 107};

    /* renamed from: b */
    public static final bzx f5610b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5611c;

    /* renamed from: d */
    public static final byte[] f5612d = {0, 0, 0, 0};

    /* renamed from: e */
    public static final int f5613e = 3;

    /* renamed from: f */
    public static final int f5614f = 1;

    /* renamed from: g */
    public static final int f5615g = 2;

    /* renamed from: h */
    public static final int f5616h = 3;

    /* renamed from: i */
    public static final int f5617i = 4;

    /* renamed from: j */
    public static final int f5618j = 5;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "CIAC Denial";
        bzv.f6287b = "The Card Issuer Action Codes are compared to the \"\n            + \"the Card Verification Results to take decisions when the payment \"\n            + \"mode is active.\";";
        bzv.f6293h = f5613e;
        bzv.f6294i = f5614f;
        bzv.f6288c = f5609a;
        bzv.f6290e = f5610b;
        bzv.f6288c = f5609a;
        bzv.f6289d = 4;
        bzv.f6295j = f5615g;
        bzv.f6296k = f5616h;
        bzv.f6297l = f5618j;
        bzv.f6298m = f5617i;
        f5611c = bzv.mo3629a();
    }

    public buf(byte[] bArr) {
        super(bArr, f5611c);
    }

    /* renamed from: a */
    public final boolean mo3503a(buj buj) {
        return !new cbj(buj.mo3563i()).mo3650a(new cbj(mo3563i())).equals(new cbj(f5612d));
    }
}
