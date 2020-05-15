package p000;

/* renamed from: byco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byco extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byco f165674b;

    /* renamed from: c */
    private static volatile bxxk f165675c;

    /* renamed from: a */
    public bxww f165676a = bxww.f165013b;

    static {
        byco byco = new byco();
        f165674b = byco;
        GeneratedMessageLite.m124024a(byco.class, byco);
    }

    private byco() {
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
            return GeneratedMessageLite.m124022a(f165674b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bycn.f165673a});
        } else if (i2 == 3) {
            return new byco();
        } else {
            if (i2 == 4) {
                return new bxvd(f165674b);
            }
            if (i2 == 5) {
                return f165674b;
            }
            bxxk bxxk = f165675c;
            if (bxxk == null) {
                synchronized (byco.class) {
                    bxxk = f165675c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165674b);
                        f165675c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
