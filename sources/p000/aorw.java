package p000;

/* renamed from: aorw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aorw f78742b;

    /* renamed from: c */
    private static volatile bxxk f78743c;

    /* renamed from: a */
    public bxww f78744a = bxww.f165013b;

    static {
        aorw aorw = new aorw();
        f78742b = aorw;
        bxvk.m124024a(aorw.class, aorw);
    }

    private aorw() {
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
            return bxvk.m124022a(f78742b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", aorv.f78741a});
        } else if (i2 == 3) {
            return new aorw();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f78742b;
            }
            bxxk bxxk = f78743c;
            if (bxxk == null) {
                synchronized (aorw.class) {
                    bxxk = f78743c;
                    if (bxxk == null) {
                        bxxk = new bxve(f78742b);
                        f78743c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
