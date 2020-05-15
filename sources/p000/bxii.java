package p000;

/* renamed from: bxii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxii extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxii f163526b;

    /* renamed from: d */
    private static volatile bxxk f163527d;

    /* renamed from: a */
    public int f163528a;

    /* renamed from: c */
    private int f163529c;

    static {
        bxii bxii = new bxii();
        f163526b = bxii;
        bxvk.m124024a(bxii.class, bxii);
    }

    private bxii() {
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
            return bxvk.m124022a(f163526b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxii();
        } else {
            if (i2 == 4) {
                return new bxvd(f163526b);
            }
            if (i2 == 5) {
                return f163526b;
            }
            bxxk bxxk = f163527d;
            if (bxxk == null) {
                synchronized (bxii.class) {
                    bxxk = f163527d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163526b);
                        f163527d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
