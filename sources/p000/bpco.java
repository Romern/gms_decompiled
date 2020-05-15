package p000;

/* renamed from: bpco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpco extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpco f135808c;

    /* renamed from: d */
    private static volatile bxxk f135809d;

    /* renamed from: a */
    public int f135810a;

    /* renamed from: b */
    public int f135811b;

    static {
        bpco bpco = new bpco();
        f135808c = bpco;
        GeneratedMessageLite.m124024a(bpco.class, bpco);
    }

    private bpco() {
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
            return GeneratedMessageLite.m124022a(f135808c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpco();
        } else {
            if (i2 == 4) {
                return new bxvd(f135808c);
            }
            if (i2 == 5) {
                return f135808c;
            }
            bxxk bxxk = f135809d;
            if (bxxk == null) {
                synchronized (bpco.class) {
                    bxxk = f135809d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135808c);
                        f135809d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
