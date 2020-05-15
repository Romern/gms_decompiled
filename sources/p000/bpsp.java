package p000;

/* renamed from: bpsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpsp f138994c;

    /* renamed from: d */
    private static volatile bxxk f138995d;

    /* renamed from: a */
    public int f138996a;

    /* renamed from: b */
    public bpsk f138997b;

    static {
        bpsp bpsp = new bpsp();
        f138994c = bpsp;
        bxvk.m124024a(bpsp.class, bpsp);
    }

    private bpsp() {
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
            return bxvk.m124022a(f138994c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f138994c);
            }
            if (i2 == 5) {
                return f138994c;
            }
            bxxk bxxk = f138995d;
            if (bxxk == null) {
                synchronized (bpsp.class) {
                    bxxk = f138995d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138994c);
                        f138995d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
