package p000;

/* renamed from: bzuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzuc f171404c;

    /* renamed from: d */
    private static volatile bxxk f171405d;

    /* renamed from: a */
    public int f171406a;

    /* renamed from: b */
    public int f171407b;

    static {
        bzuc bzuc = new bzuc();
        f171404c = bzuc;
        GeneratedMessageLite.m124024a(bzuc.class, bzuc);
    }

    private bzuc() {
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
            return GeneratedMessageLite.m124022a(f171404c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171404c);
            }
            if (i2 == 5) {
                return f171404c;
            }
            bxxk bxxk = f171405d;
            if (bxxk == null) {
                synchronized (bzuc.class) {
                    bxxk = f171405d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171404c);
                        f171405d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
