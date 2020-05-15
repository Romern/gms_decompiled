package p000;

/* renamed from: bxgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxgg f163244c;

    /* renamed from: d */
    private static volatile bxxk f163245d;

    /* renamed from: a */
    public int f163246a;

    /* renamed from: b */
    public bxgf f163247b;

    static {
        bxgg bxgg = new bxgg();
        f163244c = bxgg;
        GeneratedMessageLite.m124024a(bxgg.class, bxgg);
    }

    private bxgg() {
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
            return GeneratedMessageLite.m124022a(f163244c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxgg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163244c);
            }
            if (i2 == 5) {
                return f163244c;
            }
            bxxk bxxk = f163245d;
            if (bxxk == null) {
                synchronized (bxgg.class) {
                    bxxk = f163245d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163244c);
                        f163245d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
