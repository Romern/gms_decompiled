package p000;

/* renamed from: bxbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbd extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxbd f161778h;

    /* renamed from: i */
    private static volatile bxxk f161779i;

    /* renamed from: a */
    public int f161780a;

    /* renamed from: b */
    public int f161781b;

    /* renamed from: c */
    public int f161782c;

    /* renamed from: d */
    public ByteString f161783d = ByteString.f164797b;

    /* renamed from: e */
    public long f161784e;

    /* renamed from: f */
    public long f161785f;

    /* renamed from: g */
    public bwfr f161786g;

    static {
        bxbd bxbd = new bxbd();
        f161778h = bxbd;
        GeneratedMessageLite.m124024a(bxbd.class, bxbd);
    }

    private bxbd() {
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
            return GeneratedMessageLite.m124022a(f161778h, "\u0001\u0006\u0000\u0001\u0001;\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0004င\u0001\u0006ည\u0002\fဂ\u0003\rဂ\u0004;ဉ\u0005", new Object[]{"a", "b", bxbc.f161777a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bxbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f161778h);
            }
            if (i2 == 5) {
                return f161778h;
            }
            bxxk bxxk = f161779i;
            if (bxxk == null) {
                synchronized (bxbd.class) {
                    bxxk = f161779i;
                    if (bxxk == null) {
                        bxxk = new bxve(f161778h);
                        f161779i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
