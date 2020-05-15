package p000;

/* renamed from: bwuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwuc f161016b;

    /* renamed from: c */
    private static volatile bxxk f161017c;

    /* renamed from: a */
    public bxvt f161018a = bxvm.f164965b;

    static {
        bwuc bwuc = new bwuc();
        f161016b = bwuc;
        GeneratedMessageLite.m124024a(bwuc.class, bwuc);
    }

    private bwuc() {
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
            return GeneratedMessageLite.m124022a(f161016b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f161016b);
            }
            if (i2 == 5) {
                return f161016b;
            }
            bxxk bxxk = f161017c;
            if (bxxk == null) {
                synchronized (bwuc.class) {
                    bxxk = f161017c;
                    if (bxxk == null) {
                        bxxk = new bxve(f161016b);
                        f161017c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
