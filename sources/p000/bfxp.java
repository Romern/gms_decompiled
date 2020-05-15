package p000;

/* renamed from: bfxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bfxp f115598c;

    /* renamed from: d */
    private static volatile bxxk f115599d;

    /* renamed from: a */
    public bfxr f115600a;

    /* renamed from: b */
    public bgow f115601b;

    static {
        bfxp bfxp = new bfxp();
        f115598c = bfxp;
        bxvk.m124024a(bfxp.class, bfxp);
    }

    private bfxp() {
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
            return bxvk.m124022a(f115598c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfxp();
        } else {
            if (i2 == 4) {
                return new bxvd(f115598c);
            }
            if (i2 == 5) {
                return f115598c;
            }
            bxxk bxxk = f115599d;
            if (bxxk == null) {
                synchronized (bfxp.class) {
                    bxxk = f115599d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115598c);
                        f115599d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
