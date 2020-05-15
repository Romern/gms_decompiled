package p000;

/* renamed from: bpyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpyc f139824d;

    /* renamed from: e */
    private static volatile bxxk f139825e;

    /* renamed from: a */
    public int f139826a;

    /* renamed from: b */
    public bpxz f139827b;

    /* renamed from: c */
    public boolean f139828c;

    static {
        bpyc bpyc = new bpyc();
        f139824d = bpyc;
        bxvk.m124024a(bpyc.class, bpyc);
    }

    private bpyc() {
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
            return bxvk.m124022a(f139824d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f139824d);
            }
            if (i2 == 5) {
                return f139824d;
            }
            bxxk bxxk = f139825e;
            if (bxxk == null) {
                synchronized (bpyc.class) {
                    bxxk = f139825e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139824d);
                        f139825e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
