package p000;

/* renamed from: btwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btwi f152705a;

    /* renamed from: b */
    private static volatile bxxk f152706b;

    static {
        btwi btwi = new btwi();
        f152705a = btwi;
        GeneratedMessageLite.m124024a(btwi.class, btwi);
    }

    private btwi() {
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
            return GeneratedMessageLite.m124022a(f152705a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwi();
        }
        if (i2 == 4) {
            return new bxvd(f152705a);
        }
        if (i2 == 5) {
            return f152705a;
        }
        bxxk bxxk = f152706b;
        if (bxxk == null) {
            synchronized (btwi.class) {
                bxxk = f152706b;
                if (bxxk == null) {
                    bxxk = new bxve(f152705a);
                    f152706b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
