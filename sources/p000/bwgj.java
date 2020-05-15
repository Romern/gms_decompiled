package p000;

/* renamed from: bwgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwgj f159209b;

    /* renamed from: c */
    private static volatile bxxk f159210c;

    /* renamed from: a */
    public bxwc f159211a = bxxn.f165040b;

    static {
        bwgj bwgj = new bwgj();
        f159209b = bwgj;
        bxvk.m124024a(bwgj.class, bwgj);
    }

    private bwgj() {
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
            return bxvk.m124022a(f159209b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwgi.class});
        } else if (i2 == 3) {
            return new bwgj();
        } else {
            if (i2 == 4) {
                return new bxvd(f159209b);
            }
            if (i2 == 5) {
                return f159209b;
            }
            bxxk bxxk = f159210c;
            if (bxxk == null) {
                synchronized (bwgj.class) {
                    bxxk = f159210c;
                    if (bxxk == null) {
                        bxxk = new bxve(f159209b);
                        f159210c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
