package p000;

/* renamed from: bsri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsri extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsri f146764c;

    /* renamed from: d */
    private static volatile bxxk f146765d;

    /* renamed from: a */
    public int f146766a;

    /* renamed from: b */
    public int f146767b;

    static {
        bsri bsri = new bsri();
        f146764c = bsri;
        GeneratedMessageLite.m124024a(bsri.class, bsri);
    }

    private bsri() {
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
            return GeneratedMessageLite.m124022a(f146764c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bsrh.f146763a});
        } else if (i2 == 3) {
            return new bsri();
        } else {
            if (i2 == 4) {
                return new bxvd(f146764c);
            }
            if (i2 == 5) {
                return f146764c;
            }
            bxxk bxxk = f146765d;
            if (bxxk == null) {
                synchronized (bsri.class) {
                    bxxk = f146765d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146764c);
                        f146765d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
