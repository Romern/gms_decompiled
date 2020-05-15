package p000;

/* renamed from: amol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amol extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final amol f75626b;

    /* renamed from: c */
    private static volatile bxxk f75627c;

    /* renamed from: a */
    public bxwc f75628a = bxxn.f165040b;

    static {
        amol amol = new amol();
        f75626b = amol;
        GeneratedMessageLite.m124024a(amol.class, amol);
    }

    private amol() {
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
            return GeneratedMessageLite.m124022a(f75626b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new amol();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f75626b;
            }
            bxxk bxxk = f75627c;
            if (bxxk == null) {
                synchronized (amol.class) {
                    bxxk = f75627c;
                    if (bxxk == null) {
                        bxxk = new bxve(f75626b);
                        f75627c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
