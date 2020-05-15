package p000;

/* renamed from: bfxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bfxv f115627b;

    /* renamed from: c */
    private static volatile bxxk f115628c;

    /* renamed from: a */
    public int f115629a;

    static {
        bfxv bfxv = new bfxv();
        f115627b = bfxv;
        GeneratedMessageLite.m124024a(bfxv.class, bfxv);
    }

    private bfxv() {
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
            return GeneratedMessageLite.m124022a(f115627b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bfxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f115627b);
            }
            if (i2 == 5) {
                return f115627b;
            }
            bxxk bxxk = f115628c;
            if (bxxk == null) {
                synchronized (bfxv.class) {
                    bxxk = f115628c;
                    if (bxxk == null) {
                        bxxk = new bxve(f115627b);
                        f115628c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
