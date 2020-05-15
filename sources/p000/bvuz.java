package p000;

/* renamed from: bvuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuz extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvuz f157762j;

    /* renamed from: k */
    private static volatile bxxk f157763k;

    /* renamed from: a */
    public int f157764a;

    /* renamed from: b */
    public int f157765b;

    /* renamed from: c */
    public int f157766c;

    /* renamed from: d */
    public int f157767d;

    /* renamed from: e */
    public bvuw f157768e;

    /* renamed from: f */
    public String f157769f = "";

    /* renamed from: g */
    public bxwc f157770g = bxxn.f165040b;

    /* renamed from: h */
    public bvuv f157771h;

    /* renamed from: i */
    public ByteString f157772i = ByteString.f164797b;

    static {
        bvuz bvuz = new bvuz();
        f157762j = bvuz;
        GeneratedMessageLite.m124024a(bvuz.class, bvuz);
    }

    private bvuz() {
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
            return GeneratedMessageLite.m124022a(f157762j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0003\u0003\u001b\u0004င\u0001\u0005ဌ\u0002\u0006ဉ\u0005\u0007ည\u0006\bဈ\u0004", new Object[]{"a", "b", bvuy.f157761a, "e", "g", bvux.class, "c", "d", bvut.f157740a, "h", "i", "f"});
        } else if (i2 == 3) {
            return new bvuz();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f157762j;
            }
            bxxk bxxk = f157763k;
            if (bxxk == null) {
                synchronized (bvuz.class) {
                    bxxk = f157763k;
                    if (bxxk == null) {
                        bxxk = new bxve(f157762j);
                        f157763k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
