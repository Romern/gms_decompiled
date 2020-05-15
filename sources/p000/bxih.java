package p000;

/* renamed from: bxih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxih extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxih f163522c;

    /* renamed from: d */
    private static volatile bxxk f163523d;

    /* renamed from: a */
    public int f163524a;

    /* renamed from: b */
    public int f163525b;

    static {
        bxih bxih = new bxih();
        f163522c = bxih;
        GeneratedMessageLite.m124024a(bxih.class, bxih);
    }

    private bxih() {
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
            return GeneratedMessageLite.m124022a(f163522c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxig.m122742b()});
        } else if (i2 == 3) {
            return new bxih();
        } else {
            if (i2 == 4) {
                return new bxvd(f163522c);
            }
            if (i2 == 5) {
                return f163522c;
            }
            bxxk bxxk = f163523d;
            if (bxxk == null) {
                synchronized (bxih.class) {
                    bxxk = f163523d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163522c);
                        f163523d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
