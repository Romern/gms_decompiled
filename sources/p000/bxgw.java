package p000;

/* renamed from: bxgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxgw f163317b;

    /* renamed from: c */
    private static volatile bxxk f163318c;

    /* renamed from: a */
    public bxwc f163319a = bxxn.f165040b;

    static {
        bxgw bxgw = new bxgw();
        f163317b = bxgw;
        bxvk.m124024a(bxgw.class, bxgw);
    }

    private bxgw() {
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
            return bxvk.m124022a(f163317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxgv.class});
        } else if (i2 == 3) {
            return new bxgw();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f163317b;
            }
            bxxk bxxk = f163318c;
            if (bxxk == null) {
                synchronized (bxgw.class) {
                    bxxk = f163318c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163317b);
                        f163318c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
