package p000;

/* renamed from: bpsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpsr f139002c;

    /* renamed from: d */
    private static volatile bxxk f139003d;

    /* renamed from: a */
    public int f139004a;

    /* renamed from: b */
    public long f139005b;

    static {
        bpsr bpsr = new bpsr();
        f139002c = bpsr;
        bxvk.m124024a(bpsr.class, bpsr);
    }

    private bpsr() {
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
            return bxvk.m124022a(f139002c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f139002c);
            }
            if (i2 == 5) {
                return f139002c;
            }
            bxxk bxxk = f139003d;
            if (bxxk == null) {
                synchronized (bpsr.class) {
                    bxxk = f139003d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139002c);
                        f139003d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
