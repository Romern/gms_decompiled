package p000;

/* renamed from: bfyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bfyd f115657e;

    /* renamed from: f */
    private static volatile bxxk f115658f;

    /* renamed from: a */
    public int f115659a;

    /* renamed from: b */
    public long f115660b;

    /* renamed from: c */
    public bxwc f115661c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f115662d = bxxn.f165040b;

    static {
        bfyd bfyd = new bfyd();
        f115657e = bfyd;
        bxvk.m124024a(bfyd.class, bfyd);
    }

    private bfyd() {
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
            return bxvk.m124022a(f115657e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", bgoq.class, "d", bfyc.class});
        } else if (i2 == 3) {
            return new bfyd();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f115657e;
            }
            bxxk bxxk = f115658f;
            if (bxxk == null) {
                synchronized (bfyd.class) {
                    bxxk = f115658f;
                    if (bxxk == null) {
                        bxxk = new bxve(f115657e);
                        f115658f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
