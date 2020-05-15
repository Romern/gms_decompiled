package p000;

/* renamed from: aqac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqac extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aqac f85350c;

    /* renamed from: d */
    private static volatile bxxk f85351d;

    /* renamed from: a */
    public int f85352a;

    /* renamed from: b */
    public int f85353b;

    static {
        aqac aqac = new aqac();
        f85350c = aqac;
        bxvk.m124024a(aqac.class, aqac);
    }

    private aqac() {
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
            return bxvk.m124022a(f85350c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqac();
        } else {
            if (i2 == 4) {
                return new bxvd(f85350c);
            }
            if (i2 == 5) {
                return f85350c;
            }
            bxxk bxxk = f85351d;
            if (bxxk == null) {
                synchronized (aqac.class) {
                    bxxk = f85351d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85350c);
                        f85351d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
