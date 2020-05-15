package p000;

/* renamed from: bptm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bptm f139143e;

    /* renamed from: f */
    private static volatile bxxk f139144f;

    /* renamed from: a */
    public int f139145a;

    /* renamed from: b */
    public bxwc f139146b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f139147c = bxxn.f165040b;

    /* renamed from: d */
    public bptp f139148d;

    static {
        bptm bptm = new bptm();
        f139143e = bptm;
        GeneratedMessageLite.m124024a(bptm.class, bptm);
    }

    private bptm() {
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
            return GeneratedMessageLite.m124022a(f139143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", bptq.class, "c", bptb.class, "d"});
        } else if (i2 == 3) {
            return new bptm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f139143e;
            }
            bxxk bxxk = f139144f;
            if (bxxk == null) {
                synchronized (bptm.class) {
                    bxxk = f139144f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139143e);
                        f139144f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
