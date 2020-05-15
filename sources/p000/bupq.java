package p000;

/* renamed from: bupq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bupq f154667b;

    /* renamed from: c */
    private static volatile bxxk f154668c;

    /* renamed from: a */
    public bxwc f154669a = bxxn.f165040b;

    static {
        bupq bupq = new bupq();
        f154667b = bupq;
        bxvk.m124024a(bupq.class, bupq);
    }

    private bupq() {
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
            return bxvk.m124022a(f154667b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", bupo.class});
        } else if (i2 == 3) {
            return new bupq();
        } else {
            if (i2 == 4) {
                return new bxvd(f154667b);
            }
            if (i2 == 5) {
                return f154667b;
            }
            bxxk bxxk = f154668c;
            if (bxxk == null) {
                synchronized (bupq.class) {
                    bxxk = f154668c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154667b);
                        f154668c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
