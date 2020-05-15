package p000;

/* renamed from: bsns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsns extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsns f146327b;

    /* renamed from: c */
    private static volatile bxxk f146328c;

    /* renamed from: a */
    public long f146329a;

    static {
        bsns bsns = new bsns();
        f146327b = bsns;
        GeneratedMessageLite.m124024a(bsns.class, bsns);
    }

    private bsns() {
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
            return GeneratedMessageLite.m124022a(f146327b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsns();
        } else {
            if (i2 == 4) {
                return new bxvd(f146327b);
            }
            if (i2 == 5) {
                return f146327b;
            }
            bxxk bxxk = f146328c;
            if (bxxk == null) {
                synchronized (bsns.class) {
                    bxxk = f146328c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146327b);
                        f146328c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
