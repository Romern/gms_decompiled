package p000;

/* renamed from: bwbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwbz f158798d;

    /* renamed from: e */
    private static volatile bxxk f158799e;

    /* renamed from: a */
    public btbm f158800a;

    /* renamed from: b */
    public bxyk f158801b;

    /* renamed from: c */
    public bwbt f158802c;

    static {
        bwbz bwbz = new bwbz();
        f158798d = bwbz;
        GeneratedMessageLite.m124024a(bwbz.class, bwbz);
    }

    private bwbz() {
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
            return GeneratedMessageLite.m124022a(f158798d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwbz();
        } else {
            if (i2 == 4) {
                return new bxvd(f158798d);
            }
            if (i2 == 5) {
                return f158798d;
            }
            bxxk bxxk = f158799e;
            if (bxxk == null) {
                synchronized (bwbz.class) {
                    bxxk = f158799e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158798d);
                        f158799e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
