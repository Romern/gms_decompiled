package p000;

/* renamed from: apyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final apyq f85174b;

    /* renamed from: c */
    private static volatile bxxk f85175c;

    /* renamed from: a */
    public bxwc f85176a = bxxn.f165040b;

    static {
        apyq apyq = new apyq();
        f85174b = apyq;
        bxvk.m124024a(apyq.class, apyq);
    }

    private apyq() {
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
            return bxvk.m124022a(f85174b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", apyo.class});
        } else if (i2 == 3) {
            return new apyq();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f85174b;
            }
            bxxk bxxk = f85175c;
            if (bxxk == null) {
                synchronized (apyq.class) {
                    bxxk = f85175c;
                    if (bxxk == null) {
                        bxxk = new bxve(f85174b);
                        f85175c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
