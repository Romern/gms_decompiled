package p000;

/* renamed from: bosi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bosi f134593c;

    /* renamed from: d */
    private static volatile bxxk f134594d;

    /* renamed from: a */
    public bxwc f134595a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f134596b = bxxn.f165040b;

    static {
        bosi bosi = new bosi();
        f134593c = bosi;
        bxvk.m124024a(bosi.class, bosi);
    }

    private bosi() {
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
            return bxvk.m124022a(f134593c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bosg.class, "b", bosh.class});
        } else if (i2 == 3) {
            return new bosi();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f134593c;
            }
            bxxk bxxk = f134594d;
            if (bxxk == null) {
                synchronized (bosi.class) {
                    bxxk = f134594d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134593c);
                        f134594d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
