package p000;

/* renamed from: bvmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvmx f156821d;

    /* renamed from: e */
    private static volatile bxxk f156822e;

    /* renamed from: a */
    public int f156823a;

    /* renamed from: b */
    public bzrv f156824b;

    /* renamed from: c */
    public bvme f156825c;

    static {
        bvmx bvmx = new bvmx();
        f156821d = bvmx;
        GeneratedMessageLite.m124024a(bvmx.class, bvmx);
    }

    private bvmx() {
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
            return GeneratedMessageLite.m124022a(f156821d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f156821d);
            }
            if (i2 == 5) {
                return f156821d;
            }
            bxxk bxxk = f156822e;
            if (bxxk == null) {
                synchronized (bvmx.class) {
                    bxxk = f156822e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156821d);
                        f156822e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
