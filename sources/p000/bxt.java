package p000;

/* renamed from: bxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxt extends bwz {

    /* renamed from: a */
    public static final byte[] f6030a = {-97, 38};

    /* renamed from: b */
    public static final bzx f6031b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6032c;

    /* renamed from: d */
    public static final int f6033d = 3;

    /* renamed from: e */
    public static final int f6034e = 1;

    /* renamed from: f */
    public static final int f6035f = 1;

    /* renamed from: g */
    public static final int f6036g = 6;

    /* renamed from: h */
    public static final int f6037h = 5;

    /* renamed from: i */
    public static final int f6038i = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Application Cryptogram";
        bzv.f6287b = "Cryptogram returned by the card in response to the GPO command.";
        bzv.f6293h = f6033d;
        bzv.f6294i = f6034e;
        bzv.f6290e = f6031b;
        bzv.f6288c = f6030a;
        bzv.f6295j = f6035f;
        bzv.f6296k = f6036g;
        bzv.f6297l = f6038i;
        bzv.f6298m = f6037h;
        f6032c = bzv.mo3629a();
    }

    public bxt(byte[] bArr) {
        this(bArr, true);
    }

    public bxt(byte[] bArr, boolean z) {
        super(bArr, z, f6032c);
    }
}
