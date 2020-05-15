package p000;

/* renamed from: bfxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bfxz f115640c;

    /* renamed from: d */
    private static volatile bxxk f115641d;

    /* renamed from: a */
    public bfyf f115642a;

    /* renamed from: b */
    public int f115643b;

    static {
        bfxz bfxz = new bfxz();
        f115640c = bfxz;
        bxvk.m124024a(bfxz.class, bfxz);
    }

    private bfxz() {
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
            return bxvk.m124022a(f115640c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f115640c);
            }
            if (i2 == 5) {
                return f115640c;
            }
            bxxk bxxk = f115641d;
            if (bxxk == null) {
                synchronized (bfxz.class) {
                    bxxk = f115641d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115640c);
                        f115641d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
