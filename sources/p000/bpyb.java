package p000;

/* renamed from: bpyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpyb f139818e;

    /* renamed from: f */
    private static volatile bxxk f139819f;

    /* renamed from: a */
    public int f139820a;

    /* renamed from: b */
    public int f139821b;

    /* renamed from: c */
    public int f139822c;

    /* renamed from: d */
    public int f139823d;

    static {
        bpyb bpyb = new bpyb();
        f139818e = bpyb;
        bxvk.m124024a(bpyb.class, bpyb);
    }

    private bpyb() {
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
            return bxvk.m124022a(f139818e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f139818e);
            }
            if (i2 == 5) {
                return f139818e;
            }
            bxxk bxxk = f139819f;
            if (bxxk == null) {
                synchronized (bpyb.class) {
                    bxxk = f139819f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139818e);
                        f139819f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
