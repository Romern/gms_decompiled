package p000;

/* renamed from: bprj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bprj f138858b;

    /* renamed from: c */
    private static volatile bxxk f138859c;

    /* renamed from: a */
    public bxwc f138860a = bxxn.f165040b;

    static {
        bprj bprj = new bprj();
        f138858b = bprj;
        bxvk.m124024a(bprj.class, bprj);
    }

    private bprj() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f138858b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bpov.class});
        } else if (i2 == 3) {
            return new bprj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138858b;
            }
            bxxk bxxk = f138859c;
            if (bxxk == null) {
                synchronized (bprj.class) {
                    bxxk = f138859c;
                    if (bxxk == null) {
                        bxxk = new bxve(f138858b);
                        f138859c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
