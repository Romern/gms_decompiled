package p000;

/* renamed from: cipb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cipb f191175d;

    /* renamed from: e */
    private static volatile bxxk f191176e;

    /* renamed from: a */
    public ByteString f191177a = ByteString.f164797b;

    /* renamed from: b */
    public bxwc f191178b = bxxn.f165040b;

    /* renamed from: c */
    public long f191179c;

    static {
        cipb cipb = new cipb();
        f191175d = cipb;
        GeneratedMessageLite.m124024a(cipb.class, cipb);
    }

    private cipb() {
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
            return GeneratedMessageLite.m124022a(f191175d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003\u0002", new Object[]{"a", "b", cipf.class, "c"});
        } else if (i2 == 3) {
            return new cipb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f191175d;
            }
            bxxk bxxk = f191176e;
            if (bxxk == null) {
                synchronized (cipb.class) {
                    bxxk = f191176e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191175d);
                        f191176e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
