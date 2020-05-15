package p000;

/* renamed from: bomk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bomk f133666a;

    /* renamed from: b */
    private static volatile bxxk f133667b;

    static {
        bomk bomk = new bomk();
        f133666a = bomk;
        GeneratedMessageLite.m124024a(bomk.class, bomk);
    }

    private bomk() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f133666a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bomk();
        }
        if (i2 == 4) {
            return new bxvd(f133666a);
        }
        if (i2 == 5) {
            return f133666a;
        }
        bxxk bxxk = f133667b;
        if (bxxk == null) {
            synchronized (bomk.class) {
                bxxk = f133667b;
                if (bxxk == null) {
                    bxxk = new bxve(f133666a);
                    f133667b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
