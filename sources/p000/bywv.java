package p000;

/* renamed from: bywv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bywv f168671c;

    /* renamed from: d */
    private static volatile bxxk f168672d;

    /* renamed from: a */
    public bxwc f168673a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f168674b = bxxn.f165040b;

    static {
        bywv bywv = new bywv();
        f168671c = bywv;
        bxvk.m124024a(bywv.class, bywv);
    }

    private bywv() {
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
            return bxvk.m124022a(f168671c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", byxc.class, "b"});
        } else if (i2 == 3) {
            return new bywv();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168671c;
            }
            bxxk bxxk = f168672d;
            if (bxxk == null) {
                synchronized (bywv.class) {
                    bxxk = f168672d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168671c);
                        f168672d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
