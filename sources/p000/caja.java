package p000;

/* renamed from: caja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caja extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final caja f174791j;

    /* renamed from: k */
    private static volatile bxxk f174792k;

    /* renamed from: a */
    public int f174793a;

    /* renamed from: b */
    public int f174794b;

    /* renamed from: c */
    public ByteString f174795c = ByteString.f164797b;

    /* renamed from: d */
    public cair f174796d;

    /* renamed from: e */
    public String f174797e = "";

    /* renamed from: f */
    public int f174798f;

    /* renamed from: g */
    public boolean f174799g;

    /* renamed from: h */
    public cajo f174800h;

    /* renamed from: i */
    public int f174801i;

    static {
        caja caja = new caja();
        f174791j = caja;
        GeneratedMessageLite.m124024a(caja.class, caja);
    }

    private caja() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f174791j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဌ\u0000\u0005ည\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဌ\u0007\tဇ\b\u000bဉ\n\fင\u000b", new Object[]{"a", "b", caiz.f174790a, "c", "d", "e", "f", caiy.f174789a, "g", "h", "i"});
        } else if (i2 == 3) {
            return new caja();
        } else {
            if (i2 == 4) {
                return new bxvd(f174791j);
            }
            if (i2 == 5) {
                return f174791j;
            }
            bxxk bxxk = f174792k;
            if (bxxk == null) {
                synchronized (caja.class) {
                    bxxk = f174792k;
                    if (bxxk == null) {
                        bxxk = new bxve(f174791j);
                        f174792k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
