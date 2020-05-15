package p000;

/* renamed from: bops */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bops extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bops f134177c;

    /* renamed from: d */
    private static volatile bxxk f134178d;

    /* renamed from: a */
    public int f134179a;

    /* renamed from: b */
    public int f134180b;

    static {
        bops bops = new bops();
        f134177c = bops;
        bxvk.m124024a(bops.class, bops);
    }

    private bops() {
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
            return bxvk.m124022a(f134177c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bops();
        } else {
            if (i2 == 4) {
                return new bxvd(f134177c);
            }
            if (i2 == 5) {
                return f134177c;
            }
            bxxk bxxk = f134178d;
            if (bxxk == null) {
                synchronized (bops.class) {
                    bxxk = f134178d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134177c);
                        f134178d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
