package p000;

/* renamed from: ammw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ammw f75402c;

    /* renamed from: d */
    private static volatile bxxk f75403d;

    /* renamed from: a */
    public int f75404a;

    /* renamed from: b */
    public int f75405b;

    static {
        ammw ammw = new ammw();
        f75402c = ammw;
        GeneratedMessageLite.m124024a(ammw.class, ammw);
    }

    private ammw() {
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
            return GeneratedMessageLite.m124022a(f75402c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", amiz.f74976a});
        } else if (i2 == 3) {
            return new ammw();
        } else {
            if (i2 == 4) {
                return new bxvd(f75402c);
            }
            if (i2 == 5) {
                return f75402c;
            }
            bxxk bxxk = f75403d;
            if (bxxk == null) {
                synchronized (ammw.class) {
                    bxxk = f75403d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75402c);
                        f75403d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
