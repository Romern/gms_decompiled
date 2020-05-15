package p000;

/* renamed from: brp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brp extends bwz {

    /* renamed from: a */
    public static final byte[] f5487a = {0, 0};

    /* renamed from: b */
    public static final byte[] f5488b = {-57};

    /* renamed from: c */
    public static final bzx f5489c = bzx.CHIP;

    /* renamed from: d */
    public static final bzu f5490d;

    /* renamed from: e */
    public static final int f5491e = 3;

    /* renamed from: f */
    public static final int f5492f = 1;

    /* renamed from: g */
    public static final int f5493g = 2;

    /* renamed from: h */
    public static final int f5494h = 3;

    /* renamed from: i */
    public static final int f5495i = 1;

    /* renamed from: j */
    public static final int f5496j = 2;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Previous Transaction History";
        bzv.f6287b = "Previous Transaction History";
        bzv.f6293h = f5491e;
        bzv.f6294i = f5492f;
        bzv.f6290e = f5489c;
        bzv.f6289d = 2;
        bzv.f6288c = f5488b;
        bzv.f6295j = f5493g;
        bzv.f6296k = f5494h;
        bzv.f6297l = f5496j;
        bzv.f6298m = f5495i;
        f5490d = bzv.mo3629a();
    }

    public brp() {
        super(f5487a, f5490d);
    }

    /* renamed from: a */
    public final boolean mo3465a() {
        return (((long) this.f5930l[0]) & 16) != 0;
    }

    public brp(byte[] bArr) {
        super(bArr, f5490d);
    }
}
