package p000;

/* renamed from: cbge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbge extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbge f177021b;

    /* renamed from: c */
    private static volatile bxxk f177022c;

    /* renamed from: a */
    public int f177023a;

    static {
        cbge cbge = new cbge();
        f177021b = cbge;
        GeneratedMessageLite.m124024a(cbge.class, cbge);
    }

    private cbge() {
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
            return GeneratedMessageLite.m124022a(f177021b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbge();
        } else {
            if (i2 == 4) {
                return new bxvd(f177021b);
            }
            if (i2 == 5) {
                return f177021b;
            }
            bxxk bxxk = f177022c;
            if (bxxk == null) {
                synchronized (cbge.class) {
                    bxxk = f177022c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177021b);
                        f177022c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
