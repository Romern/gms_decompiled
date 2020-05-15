package p000;

/* renamed from: bfxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bfxs f115613d;

    /* renamed from: e */
    private static volatile bxxk f115614e;

    /* renamed from: a */
    public bxwc f115615a = bxxn.f165040b;

    /* renamed from: b */
    public bfyj f115616b;

    /* renamed from: c */
    public bxvt f115617c = bxvm.f164965b;

    static {
        bfxs bfxs = new bfxs();
        f115613d = bfxs;
        bxvk.m124024a(bfxs.class, bfxs);
    }

    private bfxs() {
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
            return bxvk.m124022a(f115613d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\t\u0003'", new Object[]{"a", bfxw.class, "b", "c"});
        } else if (i2 == 3) {
            return new bfxs();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f115613d;
            }
            bxxk bxxk = f115614e;
            if (bxxk == null) {
                synchronized (bfxs.class) {
                    bxxk = f115614e;
                    if (bxxk == null) {
                        bxxk = new bxve(f115613d);
                        f115614e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
