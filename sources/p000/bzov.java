package p000;

/* renamed from: bzov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzov extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzov f170876b;

    /* renamed from: c */
    private static volatile bxxk f170877c;

    /* renamed from: a */
    public bxwc f170878a = bxxn.f165040b;

    static {
        bzov bzov = new bzov();
        f170876b = bzov;
        bxvk.m124024a(bzov.class, bzov);
    }

    private bzov() {
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
            return bxvk.m124022a(f170876b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzrj.class});
        } else if (i2 == 3) {
            return new bzov();
        } else {
            if (i2 == 4) {
                return new bxvd(f170876b);
            }
            if (i2 == 5) {
                return f170876b;
            }
            bxxk bxxk = f170877c;
            if (bxxk == null) {
                synchronized (bzov.class) {
                    bxxk = f170877c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170876b);
                        f170877c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
