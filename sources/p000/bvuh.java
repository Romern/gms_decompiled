package p000;

/* renamed from: bvuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvuh f157688d;

    /* renamed from: e */
    private static volatile bxxk f157689e;

    /* renamed from: a */
    public bxwc f157690a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157691b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f157692c = bxxn.f165040b;

    static {
        bvuh bvuh = new bvuh();
        f157688d = bvuh;
        GeneratedMessageLite.m124024a(bvuh.class, bvuh);
    }

    private bvuh() {
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
            return GeneratedMessageLite.m124022a(f157688d, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001b\u0004\u001b\u0005\u001b", new Object[]{"a", bvmq.class, "b", bvpj.class, "c", bvpf.class});
        } else if (i2 == 3) {
            return new bvuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f157688d);
            }
            if (i2 == 5) {
                return f157688d;
            }
            bxxk bxxk = f157689e;
            if (bxxk == null) {
                synchronized (bvuh.class) {
                    bxxk = f157689e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157688d);
                        f157689e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
