package p000;

/* renamed from: qul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qul extends bxvk implements bxxd {

    /* renamed from: b */
    public static final qul f42159b;

    /* renamed from: c */
    private static volatile bxxk f42160c;

    /* renamed from: a */
    public bxwc f42161a = bxxn.f165040b;

    static {
        qul qul = new qul();
        f42159b = qul;
        bxvk.m124024a(qul.class, qul);
    }

    private qul() {
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
            return bxvk.m124022a(f42159b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", quk.class});
        } else if (i2 == 3) {
            return new qul();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f42159b;
            }
            bxxk bxxk = f42160c;
            if (bxxk == null) {
                synchronized (qul.class) {
                    bxxk = f42160c;
                    if (bxxk == null) {
                        bxxk = new bxve(f42159b);
                        f42160c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
