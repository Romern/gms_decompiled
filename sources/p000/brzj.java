package p000;

/* renamed from: brzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brzj f143745b;

    /* renamed from: c */
    private static volatile bxxk f143746c;

    /* renamed from: a */
    public bxwc f143747a = bxxn.f165040b;

    static {
        brzj brzj = new brzj();
        f143745b = brzj;
        bxvk.m124024a(brzj.class, brzj);
    }

    private brzj() {
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
            return bxvk.m124022a(f143745b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", brzi.class});
        } else if (i2 == 3) {
            return new brzj();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f143745b;
            }
            bxxk bxxk = f143746c;
            if (bxxk == null) {
                synchronized (brzj.class) {
                    bxxk = f143746c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143745b);
                        f143746c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
