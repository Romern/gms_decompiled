package p000;

/* renamed from: bpyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpyp f139906e;

    /* renamed from: f */
    private static volatile bxxk f139907f;

    /* renamed from: a */
    public int f139908a;

    /* renamed from: b */
    public int f139909b;

    /* renamed from: c */
    public bxwc f139910c = bxxn.f165040b;

    /* renamed from: d */
    public int f139911d;

    static {
        bpyp bpyp = new bpyp();
        f139906e = bpyp;
        bxvk.m124024a(bpyp.class, bpyp);
    }

    private bpyp() {
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
            return bxvk.m124022a(f139906e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001a\u0003င\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpyp();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139906e;
            }
            bxxk bxxk = f139907f;
            if (bxxk == null) {
                synchronized (bpyp.class) {
                    bxxk = f139907f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139906e);
                        f139907f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
