package p000;

/* renamed from: bpvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpvs f139413d;

    /* renamed from: e */
    private static volatile bxxk f139414e;

    /* renamed from: a */
    public int f139415a;

    /* renamed from: b */
    public String f139416b = "";

    /* renamed from: c */
    public int f139417c;

    static {
        bpvs bpvs = new bpvs();
        f139413d = bpvs;
        bxvk.m124024a(bpvs.class, bpvs);
    }

    private bpvs() {
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
            return bxvk.m124022a(f139413d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpvs();
        } else {
            if (i2 == 4) {
                return new bxvd(f139413d);
            }
            if (i2 == 5) {
                return f139413d;
            }
            bxxk bxxk = f139414e;
            if (bxxk == null) {
                synchronized (bpvs.class) {
                    bxxk = f139414e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139413d);
                        f139414e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
