package p000;

/* renamed from: bpxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxz f139810c;

    /* renamed from: d */
    private static volatile bxxk f139811d;

    /* renamed from: a */
    public int f139812a = 0;

    /* renamed from: b */
    public Object f139813b;

    static {
        bpxz bpxz = new bpxz();
        f139810c = bpxz;
        bxvk.m124024a(bpxz.class, bpxz);
    }

    private bpxz() {
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
            return bxvk.m124022a(f139810c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bpyb.class, bpyf.class});
        } else if (i2 == 3) {
            return new bpxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f139810c);
            }
            if (i2 == 5) {
                return f139810c;
            }
            bxxk bxxk = f139811d;
            if (bxxk == null) {
                synchronized (bpxz.class) {
                    bxxk = f139811d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139810c);
                        f139811d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
