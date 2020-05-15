package p000;

/* renamed from: bvmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvmq f156775b;

    /* renamed from: d */
    private static volatile bxxk f156776d;

    /* renamed from: a */
    public bvmr f156777a;

    /* renamed from: c */
    private int f156778c;

    static {
        bvmq bvmq = new bvmq();
        f156775b = bvmq;
        GeneratedMessageLite.m124024a(bvmq.class, bvmq);
    }

    private bvmq() {
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
            return GeneratedMessageLite.m124022a(f156775b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f156775b);
            }
            if (i2 == 5) {
                return f156775b;
            }
            bxxk bxxk = f156776d;
            if (bxxk == null) {
                synchronized (bvmq.class) {
                    bxxk = f156776d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156775b);
                        f156776d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
