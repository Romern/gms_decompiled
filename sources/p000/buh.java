package p000;

/* renamed from: buh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buh extends bwz {

    /* renamed from: a */
    public static final byte[] f5629a = {-97, 97};

    /* renamed from: b */
    public static final bzx f5630b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5631c;

    /* renamed from: d */
    public static final int f5632d = 3;

    /* renamed from: e */
    public static final int f5633e = 1;

    /* renamed from: f */
    public static final int f5634f = 2;

    /* renamed from: g */
    public static final int f5635g = 3;

    /* renamed from: h */
    public static final int f5636h = 4;

    /* renamed from: i */
    public static final int f5637i = 5;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Card Option Status";
        bzv.f6287b = "This data element was originally defined in [DI ICC Spec]. Some of the bit settings have been\nreused by cMDA";
        bzv.f6293h = f5632d;
        bzv.f6294i = f5633e;
        bzv.f6288c = f5629a;
        bzv.f6290e = f5630b;
        bzv.f6288c = f5629a;
        bzv.f6289d = 2;
        bzv.f6295j = f5634f;
        bzv.f6296k = f5635g;
        bzv.f6297l = f5637i;
        bzv.f6298m = f5636h;
        f5631c = bzv.mo3629a();
    }

    public buh(byte[] bArr) {
        super(bArr, f5631c);
    }

    /* renamed from: a */
    public final boolean mo3505a() {
        return mo3555a(0, 1) && !mo3555a(0, 0);
    }
}
