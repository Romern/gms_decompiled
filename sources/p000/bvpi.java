package p000;

/* renamed from: bvpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvpi f157298c;

    /* renamed from: e */
    private static volatile bxxk f157299e;

    /* renamed from: a */
    public String f157300a = "";

    /* renamed from: b */
    public double f157301b;

    /* renamed from: d */
    private int f157302d;

    static {
        bvpi bvpi = new bvpi();
        f157298c = bvpi;
        GeneratedMessageLite.m124024a(bvpi.class, bvpi);
    }

    private bvpi() {
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
            return GeneratedMessageLite.m124022a(f157298c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bvpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f157298c);
            }
            if (i2 == 5) {
                return f157298c;
            }
            bxxk bxxk = f157299e;
            if (bxxk == null) {
                synchronized (bvpi.class) {
                    bxxk = f157299e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157298c);
                        f157299e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
