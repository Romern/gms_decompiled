package p000;

/* renamed from: bpxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxl f139729c;

    /* renamed from: e */
    private static volatile bxxk f139730e;

    /* renamed from: a */
    public int f139731a;

    /* renamed from: b */
    public int f139732b;

    /* renamed from: d */
    private int f139733d;

    static {
        bpxl bpxl = new bpxl();
        f139729c = bpxl;
        bxvk.m124024a(bpxl.class, bpxl);
    }

    private bpxl() {
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
            return bxvk.m124022a(f139729c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", bpzv.f140115a, "b", bpzv.f140115a});
        } else if (i2 == 3) {
            return new bpxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f139729c);
            }
            if (i2 == 5) {
                return f139729c;
            }
            bxxk bxxk = f139730e;
            if (bxxk == null) {
                synchronized (bpxl.class) {
                    bxxk = f139730e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139729c);
                        f139730e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
