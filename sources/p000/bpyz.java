package p000;

/* renamed from: bpyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpyz f139966d;

    /* renamed from: e */
    private static volatile bxxk f139967e;

    /* renamed from: a */
    public int f139968a;

    /* renamed from: b */
    public int f139969b;

    /* renamed from: c */
    public String f139970c = "";

    static {
        bpyz bpyz = new bpyz();
        f139966d = bpyz;
        bxvk.m124024a(bpyz.class, bpyz);
    }

    private bpyz() {
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
            return bxvk.m124022a(f139966d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bqbd.m112501b(), "c"});
        } else if (i2 == 3) {
            return new bpyz();
        } else {
            if (i2 == 4) {
                return new bxvd(f139966d);
            }
            if (i2 == 5) {
                return f139966d;
            }
            bxxk bxxk = f139967e;
            if (bxxk == null) {
                synchronized (bpyz.class) {
                    bxxk = f139967e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139966d);
                        f139967e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
