package p000;

/* renamed from: bqkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqkg f140983b;

    /* renamed from: c */
    private static volatile bxxk f140984c;

    /* renamed from: a */
    public bxwc f140985a = bxxn.f165040b;

    static {
        bqkg bqkg = new bqkg();
        f140983b = bqkg;
        bxvk.m124024a(bqkg.class, bqkg);
    }

    private bqkg() {
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
            return bxvk.m124022a(f140983b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqkf.class});
        } else if (i2 == 3) {
            return new bqkg();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f140983b;
            }
            bxxk bxxk = f140984c;
            if (bxxk == null) {
                synchronized (bqkg.class) {
                    bxxk = f140984c;
                    if (bxxk == null) {
                        bxxk = new bxve(f140983b);
                        f140984c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
