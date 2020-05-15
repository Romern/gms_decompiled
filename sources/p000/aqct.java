package p000;

/* renamed from: aqct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqct extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aqct f85704b;

    /* renamed from: c */
    private static volatile bxxk f85705c;

    /* renamed from: a */
    public bxvt f85706a = bxvm.f164965b;

    static {
        aqct aqct = new aqct();
        f85704b = aqct;
        bxvk.m124024a(aqct.class, aqct);
    }

    private aqct() {
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
            return bxvk.m124022a(f85704b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new aqct();
        } else {
            if (i2 == 4) {
                return new bxvd(f85704b);
            }
            if (i2 == 5) {
                return f85704b;
            }
            bxxk bxxk = f85705c;
            if (bxxk == null) {
                synchronized (aqct.class) {
                    bxxk = f85705c;
                    if (bxxk == null) {
                        bxxk = new bxve(f85704b);
                        f85705c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
