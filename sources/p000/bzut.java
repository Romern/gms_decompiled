package p000;

/* renamed from: bzut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzut extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzut f171463b;

    /* renamed from: c */
    private static volatile bxxk f171464c;

    /* renamed from: a */
    public bzti f171465a;

    static {
        bzut bzut = new bzut();
        f171463b = bzut;
        bxvk.m124024a(bzut.class, bzut);
    }

    private bzut() {
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
            return bxvk.m124022a(f171463b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzut();
        } else {
            if (i2 == 4) {
                return new bxvd(f171463b);
            }
            if (i2 == 5) {
                return f171463b;
            }
            bxxk bxxk = f171464c;
            if (bxxk == null) {
                synchronized (bzut.class) {
                    bxxk = f171464c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171463b);
                        f171464c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
