package p000;

/* renamed from: bus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bus extends bwz {

    /* renamed from: a */
    public static final byte[] f5697a = {-97, 82};

    /* renamed from: b */
    public static final bzx f5698b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5699c;

    /* renamed from: d */
    public static final int f5700d = 3;

    /* renamed from: e */
    public static final int f5701e = 1;

    /* renamed from: f */
    public static final int f5702f = 1;

    /* renamed from: g */
    public static final int f5703g = 3;

    /* renamed from: h */
    public static final int f5704h = 5;

    /* renamed from: i */
    public static final int f5705i = 5;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Merchant Type Indicator Limits 01";
        bzv.f6287b = "Defines the Authentication Required Limit and\nContactless Per Transaction Limit Merchant for MTI 01";
        bzv.f6293h = f5700d;
        bzv.f6294i = f5701e;
        bzv.f6290e = f5698b;
        bzv.f6289d = 12;
        bzv.f6288c = f5697a;
        bzv.f6295j = f5702f;
        bzv.f6296k = f5703g;
        bzv.f6297l = f5705i;
        bzv.f6298m = f5704h;
        f5699c = bzv.mo3629a();
    }

    public bus(byte[] bArr) {
        super(bArr, true, f5699c);
    }
}
