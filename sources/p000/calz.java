package p000;

/* renamed from: calz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final calz f175227a;

    /* renamed from: b */
    private static volatile bxxk f175228b;

    static {
        calz calz = new calz();
        f175227a = calz;
        GeneratedMessageLite.m124024a(calz.class, calz);
    }

    private calz() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f175227a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new calz();
        }
        if (i2 == 4) {
            return new bxvd(f175227a);
        }
        if (i2 == 5) {
            return f175227a;
        }
        bxxk bxxk = f175228b;
        if (bxxk == null) {
            synchronized (calz.class) {
                bxxk = f175228b;
                if (bxxk == null) {
                    bxxk = new bxve(f175227a);
                    f175228b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
