package p000;

/* renamed from: bqlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqlm f141116d;

    /* renamed from: e */
    private static volatile bxxk f141117e;

    /* renamed from: a */
    public bxwc f141118a = bxxn.f165040b;

    /* renamed from: b */
    public ByteString f141119b = ByteString.f164797b;

    /* renamed from: c */
    public bqlh f141120c;

    static {
        bqlm bqlm = new bqlm();
        f141116d = bqlm;
        GeneratedMessageLite.m124024a(bqlm.class, bqlm);
    }

    private bqlm() {
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
            return GeneratedMessageLite.m124022a(f141116d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\n\u0003\t", new Object[]{"a", bqld.class, "b", "c"});
        } else if (i2 == 3) {
            return new bqlm();
        } else {
            if (i2 == 4) {
                return new bxvd(f141116d);
            }
            if (i2 == 5) {
                return f141116d;
            }
            bxxk bxxk = f141117e;
            if (bxxk == null) {
                synchronized (bqlm.class) {
                    bxxk = f141117e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141116d);
                        f141117e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
