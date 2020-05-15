package p000;

/* renamed from: blsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blsy f127650c;

    /* renamed from: d */
    private static volatile bxxk f127651d;

    /* renamed from: a */
    public int f127652a;

    /* renamed from: b */
    public boolean f127653b = true;

    static {
        blsy blsy = new blsy();
        f127650c = blsy;
        bxvk.m124024a(blsy.class, blsy);
    }

    private blsy() {
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
            return bxvk.m124022a(f127650c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f127650c);
            }
            if (i2 == 5) {
                return f127650c;
            }
            bxxk bxxk = f127651d;
            if (bxxk == null) {
                synchronized (blsy.class) {
                    bxxk = f127651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127650c);
                        f127651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
