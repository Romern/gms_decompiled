package p000;

/* renamed from: bzvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzvo f171536b;

    /* renamed from: c */
    private static volatile bxxk f171537c;

    /* renamed from: a */
    public bxwc f171538a = bxxn.f165040b;

    static {
        bzvo bzvo = new bzvo();
        f171536b = bzvo;
        bxvk.m124024a(bzvo.class, bzvo);
    }

    private bzvo() {
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
            return bxvk.m124022a(f171536b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzvn.class});
        } else if (i2 == 3) {
            return new bzvo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171536b);
            }
            if (i2 == 5) {
                return f171536b;
            }
            bxxk bxxk = f171537c;
            if (bxxk == null) {
                synchronized (bzvo.class) {
                    bxxk = f171537c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171536b);
                        f171537c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
