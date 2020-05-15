package p000;

/* renamed from: bxns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxns extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxns f164079b;

    /* renamed from: d */
    private static volatile bxxk f164080d;

    /* renamed from: a */
    public int f164081a;

    /* renamed from: c */
    private int f164082c;

    static {
        bxns bxns = new bxns();
        f164079b = bxns;
        GeneratedMessageLite.m124024a(bxns.class, bxns);
    }

    private bxns() {
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
            return GeneratedMessageLite.m124022a(f164079b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxnq.f164078a});
        } else if (i2 == 3) {
            return new bxns();
        } else {
            if (i2 == 4) {
                return new bxvd(f164079b);
            }
            if (i2 == 5) {
                return f164079b;
            }
            bxxk bxxk = f164080d;
            if (bxxk == null) {
                synchronized (bxns.class) {
                    bxxk = f164080d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164079b);
                        f164080d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
