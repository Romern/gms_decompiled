package p000;

/* renamed from: bzoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzoc f170793a;

    /* renamed from: b */
    private static volatile bxxk f170794b;

    static {
        bzoc bzoc = new bzoc();
        f170793a = bzoc;
        GeneratedMessageLite.m124024a(bzoc.class, bzoc);
    }

    private bzoc() {
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
            return GeneratedMessageLite.m124022a(f170793a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzoc();
        }
        if (i2 == 4) {
            return new bxvd(f170793a);
        }
        if (i2 == 5) {
            return f170793a;
        }
        bxxk bxxk = f170794b;
        if (bxxk == null) {
            synchronized (bzoc.class) {
                bxxk = f170794b;
                if (bxxk == null) {
                    bxxk = new bxve(f170793a);
                    f170794b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
