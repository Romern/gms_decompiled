package p000;

/* renamed from: bug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bug extends bwz {

    /* renamed from: a */
    public static final byte[] f5619a = {-97, 109};

    /* renamed from: b */
    public static final bzx f5620b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f5621c;

    /* renamed from: d */
    public static final byte[] f5622d = {0, 0, 0, 0};

    /* renamed from: e */
    public static final int f5623e = 3;

    /* renamed from: f */
    public static final int f5624f = 1;

    /* renamed from: g */
    public static final int f5625g = 2;

    /* renamed from: h */
    public static final int f5626h = 3;

    /* renamed from: i */
    public static final int f5627i = 4;

    /* renamed from: j */
    public static final int f5628j = 5;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "CIAC Online";
        bzv.f6287b = "Card Issuer Action Code Online";
        bzv.f6293h = f5623e;
        bzv.f6294i = f5624f;
        bzv.f6288c = f5619a;
        bzv.f6290e = f5620b;
        bzv.f6288c = f5619a;
        bzv.f6289d = 4;
        bzv.f6295j = f5625g;
        bzv.f6296k = f5626h;
        bzv.f6297l = f5628j;
        bzv.f6298m = f5627i;
        f5621c = bzv.mo3629a();
    }

    public bug(byte[] bArr) {
        super(bArr, f5621c);
    }

    /* renamed from: a */
    public final boolean mo3504a(buj buj) {
        return !new cbj(buj.mo3563i()).mo3650a(new cbj(mo3563i())).equals(new cbj(f5622d));
    }
}
