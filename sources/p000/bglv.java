package p000;

/* renamed from: bglv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bglv f116801d;

    /* renamed from: e */
    private static volatile bxxk f116802e;

    /* renamed from: a */
    public bxwc f116803a = bxxn.f165040b;

    /* renamed from: b */
    public bxvt f116804b = bxvm.f164965b;

    /* renamed from: c */
    public bxwc f116805c = bxxn.f165040b;

    static {
        bglv bglv = new bglv();
        f116801d = bglv;
        bxvk.m124024a(bglv.class, bglv);
    }

    private bglv() {
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
            return bxvk.m124022a(f116801d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bglv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f116801d;
            }
            bxxk bxxk = f116802e;
            if (bxxk == null) {
                synchronized (bglv.class) {
                    bxxk = f116802e;
                    if (bxxk == null) {
                        bxxk = new bxve(f116801d);
                        f116802e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
