package p000;

/* renamed from: blyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blyh f128202d;

    /* renamed from: e */
    private static volatile bxxk f128203e;

    /* renamed from: a */
    public bxwc f128204a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f128205b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f128206c = bxxn.f165040b;

    static {
        blyh blyh = new blyh();
        f128202d = blyh;
        bxvk.m124024a(blyh.class, blyh);
    }

    private blyh() {
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
            return bxvk.m124022a(f128202d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", blyb.class, "b", blyg.class, "c", blyh.class});
        } else if (i2 == 3) {
            return new blyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f128202d);
            }
            if (i2 == 5) {
                return f128202d;
            }
            bxxk bxxk = f128203e;
            if (bxxk == null) {
                synchronized (blyh.class) {
                    bxxk = f128203e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128202d);
                        f128203e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
