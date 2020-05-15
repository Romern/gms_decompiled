package p000;

/* renamed from: aqdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqdw f85807d;

    /* renamed from: e */
    private static volatile bxxk f85808e;

    /* renamed from: a */
    public int f85809a;

    /* renamed from: b */
    public ByteString f85810b = ByteString.f164797b;

    /* renamed from: c */
    public long f85811c;

    static {
        aqdw aqdw = new aqdw();
        f85807d = aqdw;
        GeneratedMessageLite.m124024a(aqdw.class, aqdw);
    }

    private aqdw() {
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
            return GeneratedMessageLite.m124022a(f85807d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f85807d);
            }
            if (i2 == 5) {
                return f85807d;
            }
            bxxk bxxk = f85808e;
            if (bxxk == null) {
                synchronized (aqdw.class) {
                    bxxk = f85808e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85807d);
                        f85808e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
