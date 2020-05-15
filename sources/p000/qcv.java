package p000;

/* renamed from: qcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final qcv f40941d;

    /* renamed from: f */
    private static volatile bxxk f40942f;

    /* renamed from: a */
    public int f40943a;

    /* renamed from: b */
    public qdo f40944b;

    /* renamed from: c */
    public bxwc f40945c = bxxn.f165040b;

    /* renamed from: e */
    private byte f40946e = 2;

    static {
        qcv qcv = new qcv();
        f40941d = qcv;
        bxvk.m124024a(qcv.class, qcv);
    }

    private qcv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f40946e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f40946e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f40941d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", bpsu.class});
        } else if (i2 == 3) {
            return new qcv();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f40941d;
            }
            bxxk bxxk = f40942f;
            if (bxxk == null) {
                synchronized (qcv.class) {
                    bxxk = f40942f;
                    if (bxxk == null) {
                        bxxk = new bxve(f40941d);
                        f40942f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
