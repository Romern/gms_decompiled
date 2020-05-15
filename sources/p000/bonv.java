package p000;

/* renamed from: bonv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bonv f133861c;

    /* renamed from: d */
    private static volatile bxxk f133862d;

    /* renamed from: a */
    public int f133863a;

    /* renamed from: b */
    public bxwc f133864b = bxxn.f165040b;

    static {
        bonv bonv = new bonv();
        f133861c = bonv;
        bxvk.m124024a(bonv.class, bonv);
    }

    private bonv() {
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
            return bxvk.m124022a(f133861c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"a", "b", bonu.class});
        } else if (i2 == 3) {
            return new bonv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f133861c;
            }
            bxxk bxxk = f133862d;
            if (bxxk == null) {
                synchronized (bonv.class) {
                    bxxk = f133862d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133861c);
                        f133862d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
