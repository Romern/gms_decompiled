package p000;

/* renamed from: bzju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzju extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzju f170349a;

    /* renamed from: b */
    private static volatile bxxk f170350b;

    static {
        bzju bzju = new bzju();
        f170349a = bzju;
        bxvk.m124024a(bzju.class, bzju);
    }

    private bzju() {
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
            return bxvk.m124022a(f170349a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzju();
        }
        if (i2 == 4) {
            return new bxvd(f170349a);
        }
        if (i2 == 5) {
            return f170349a;
        }
        bxxk bxxk = f170350b;
        if (bxxk == null) {
            synchronized (bzju.class) {
                bxxk = f170350b;
                if (bxxk == null) {
                    bxxk = new bxve(f170349a);
                    f170350b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
