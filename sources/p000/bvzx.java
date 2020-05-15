package p000;

/* renamed from: bvzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvzx f158586e;

    /* renamed from: f */
    private static volatile bxxk f158587f;

    /* renamed from: a */
    public int f158588a;

    /* renamed from: b */
    public int f158589b;

    /* renamed from: c */
    public int f158590c;

    /* renamed from: d */
    public int f158591d;

    static {
        bvzx bvzx = new bvzx();
        f158586e = bvzx;
        GeneratedMessageLite.m124024a(bvzx.class, bvzx);
    }

    private bvzx() {
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
            return GeneratedMessageLite.m124022a(f158586e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bvzw.f158585a, "c", bvzv.f158584a, "d", apux.f84962a});
        } else if (i2 == 3) {
            return new bvzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f158586e);
            }
            if (i2 == 5) {
                return f158586e;
            }
            bxxk bxxk = f158587f;
            if (bxxk == null) {
                synchronized (bvzx.class) {
                    bxxk = f158587f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158586e);
                        f158587f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
