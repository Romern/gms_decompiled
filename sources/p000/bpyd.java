package p000;

/* renamed from: bpyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpyd f139829b;

    /* renamed from: c */
    private static volatile bxxk f139830c;

    /* renamed from: a */
    public bxwc f139831a = bxxn.f165040b;

    static {
        bpyd bpyd = new bpyd();
        f139829b = bpyd;
        GeneratedMessageLite.m124024a(bpyd.class, bpyd);
    }

    private bpyd() {
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
            return GeneratedMessageLite.m124022a(f139829b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpyc.class});
        } else if (i2 == 3) {
            return new bpyd();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139829b;
            }
            bxxk bxxk = f139830c;
            if (bxxk == null) {
                synchronized (bpyd.class) {
                    bxxk = f139830c;
                    if (bxxk == null) {
                        bxxk = new bxve(f139829b);
                        f139830c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
