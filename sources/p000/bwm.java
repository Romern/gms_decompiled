package p000;

/* renamed from: bwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwm extends bwz {

    /* renamed from: a */
    public static final byte[] f5905a = {-97, 90};

    /* renamed from: b */
    public static final bzx f5906b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5907c;

    /* renamed from: d */
    public static final int f5908d = 3;

    /* renamed from: e */
    public static final int f5909e = 2;

    /* renamed from: f */
    public static final int f5910f = 2;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Terminal Transaction Type";
        bzv.f6287b = "Used to identify transaction type requested by terminal";
        bzv.f6293h = f5908d;
        bzv.f6289d = 1;
        bzv.f6294i = f5909e;
        bzv.f6288c = f5905a;
        bzv.f6290e = f5906b;
        bzv.f6295j = f5910f;
        f5907c = bzv.mo3629a();
    }

    public bwm(byte[] bArr) {
        super(bArr, f5907c);
    }

    /* renamed from: b */
    public final boolean mo3454b() {
        return mo3555a(0, 0);
    }
}
