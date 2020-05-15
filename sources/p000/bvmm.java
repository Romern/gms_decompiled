package p000;

/* renamed from: bvmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvmm f156758d;

    /* renamed from: e */
    private static volatile bxxk f156759e;

    /* renamed from: a */
    public bxwc f156760a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f156761b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f156762c = bxxn.f165040b;

    static {
        bvmm bvmm = new bvmm();
        f156758d = bvmm;
        GeneratedMessageLite.m124024a(bvmm.class, bvmm);
    }

    private bvmm() {
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
            return GeneratedMessageLite.m124022a(f156758d, "\u0001\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", bvmq.class, "b", bvpj.class, "c", bvpf.class});
        } else if (i2 == 3) {
            return new bvmm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f156758d;
            }
            bxxk bxxk = f156759e;
            if (bxxk == null) {
                synchronized (bvmm.class) {
                    bxxk = f156759e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156758d);
                        f156759e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
