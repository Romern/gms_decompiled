package p000;

/* renamed from: bqlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqlk f141108a;

    /* renamed from: b */
    private static volatile bxxk f141109b;

    static {
        bqlk bqlk = new bqlk();
        f141108a = bqlk;
        GeneratedMessageLite.m124024a(bqlk.class, bqlk);
    }

    private bqlk() {
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
            return GeneratedMessageLite.m124022a(f141108a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqlk();
        }
        if (i2 == 4) {
            return new bxvd(f141108a);
        }
        if (i2 == 5) {
            return f141108a;
        }
        bxxk bxxk = f141109b;
        if (bxxk == null) {
            synchronized (bqlk.class) {
                bxxk = f141109b;
                if (bxxk == null) {
                    bxxk = new bxve(f141108a);
                    f141109b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
